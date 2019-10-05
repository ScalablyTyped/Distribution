package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[Unit]
  /** Gets a remarketing audience to which the user has access. */
  def get(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[RemarketingAudience]
  /** Creates a new remarketing audience. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[RemarketingAudience]
  /** Lists remarketing audiences to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint): Request[RemarketingAudiences]
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[RemarketingAudience]
  /** Updates an existing remarketing audience. */
  def update(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request[RemarketingAudience]
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request[Unit],
    get: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request[RemarketingAudience],
    insert: Anon_AccountIdAltFieldsKeyOauthtoken => Request[RemarketingAudience],
    list: Anon_AccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint => Request[RemarketingAudiences],
    patch: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request[RemarketingAudience],
    update: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request[RemarketingAudience]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
}

