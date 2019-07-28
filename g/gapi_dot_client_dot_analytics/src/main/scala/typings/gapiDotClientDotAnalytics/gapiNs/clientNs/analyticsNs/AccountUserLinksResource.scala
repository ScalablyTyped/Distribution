package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAlt
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFields
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: Anon_AccountIdAlt): Request[Unit]
  /** Adds a new user to the given account. */
  def insert(request: Anon_AccountIdAltFields): Request[EntityUserLink]
  /** Lists account-user links for a given account. */
  def list(request: Anon_AccountIdAltFieldsKey): Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given account. */
  def update(request: Anon_AccountIdAlt): Request[EntityUserLink]
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAlt => Request[Unit],
    insert: Anon_AccountIdAltFields => Request[EntityUserLink],
    list: Anon_AccountIdAltFieldsKey => Request[EntityUserLinks],
    update: Anon_AccountIdAlt => Request[EntityUserLink]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountUserLinksResource]
  }
}

