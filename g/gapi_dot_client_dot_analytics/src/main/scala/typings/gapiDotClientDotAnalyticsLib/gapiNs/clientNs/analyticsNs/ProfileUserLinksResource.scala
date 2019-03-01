package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new user to the given view (profile). */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
  /** Lists profile-user links for a given view (profile). */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId, 
      gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
    ]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(delete)
    __obj.updateDynamic("insert")(insert)
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
}

