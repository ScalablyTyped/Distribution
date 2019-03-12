package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Adds a new user to the given account. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFields): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
  /** Lists account-user links for a given account. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given account. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAlt): gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAnalyticsLib.Anon_AccountIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    insert: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFields => gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink],
    list: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLinks],
    update: gapiDotClientDotAnalyticsLib.Anon_AccountIdAlt => gapiDotClientLib.gapiNs.clientNs.Request[EntityUserLink]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountUserLinksResource]
  }
}

