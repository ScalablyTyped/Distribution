package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPropertyAdWordsLinksResource extends js.Object {
  /** Deletes a web property-AdWords link. */
  def delete(
    request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns a web property-AdWords link to which the user has access. */
  def get(
    request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
  /** Creates a webProperty-AdWords link. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
  /** Lists webProperty-AdWords links for a given web property. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLinks]
  /** Updates an existing webProperty-AdWords link. This method supports patch semantics. */
  def patch(
    request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
  /** Updates an existing webProperty-AdWords link. */
  def update(
    request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp
  ): gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
}

object WebPropertyAdWordsLinksResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLinks]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrintQuotaUserUserIp, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityAdWordsLink]
    ]
  ): WebPropertyAdWordsLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("patch")(patch)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[WebPropertyAdWordsLinksResource]
  }
}

