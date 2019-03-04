package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemarketingAudienceResource extends js.Object {
  /** Delete a remarketing audience. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a remarketing audience to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
  /** Creates a new remarketing audience. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
  /** Lists remarketing audiences to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudiences]
  /** Updates an existing remarketing audience. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
  /** Updates an existing remarketing audience. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
}

object RemarketingAudienceResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudiences]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUser, 
      gapiDotClientLib.gapiNs.clientNs.Request[RemarketingAudience]
    ]
  ): RemarketingAudienceResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[RemarketingAudienceResource]
  }
}

