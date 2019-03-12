package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new user to the given web property. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
  /** Lists webProperty-user links for a given web property. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given web property. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    insert: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink],
    list: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults => gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks],
    update: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
}

