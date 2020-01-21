package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[Unit]
  /** Gets a remarketing audience to which the user has access. */
  def get(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[RemarketingAudience]
  /** Creates a new remarketing audience. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[RemarketingAudience]
  /** Lists remarketing audiences to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint): Request_[RemarketingAudiences]
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[RemarketingAudience]
  /** Updates an existing remarketing audience. */
  def update(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): Request_[RemarketingAudience]
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request_[Unit],
    get: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request_[RemarketingAudience],
    insert: AnonAccountIdAltFieldsKeyOauthtoken => Request_[RemarketingAudience],
    list: AnonAccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint => Request_[RemarketingAudiences],
    patch: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request_[RemarketingAudience],
    update: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser => Request_[RemarketingAudience]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
}

