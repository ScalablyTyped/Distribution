package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonLinkId
import typings.gapiClientAnalytics.AnonMaxresults
import typings.gapiClientAnalytics.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: AnonLinkId): Request_[Unit]
  /** Adds a new user to the given account. */
  def insert(request: AnonOauthtoken): Request_[EntityUserLink]
  /** Lists account-user links for a given account. */
  def list(request: AnonMaxresults): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given account. */
  def update(request: AnonLinkId): Request_[EntityUserLink]
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonLinkId => Request_[Unit],
    insert: AnonOauthtoken => Request_[EntityUserLink],
    list: AnonMaxresults => Request_[EntityUserLinks],
    update: AnonLinkId => Request_[EntityUserLink]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountUserLinksResource]
  }
}

