package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.LinkId
import typings.gapiClientAnalytics.anon.Maxresults
import typings.gapiClientAnalytics.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: LinkId): Request[Unit]
  /** Adds a new user to the given account. */
  def insert(request: Oauthtoken): Request[EntityUserLink]
  /** Lists account-user links for a given account. */
  def list(request: Maxresults): Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given account. */
  def update(request: LinkId): Request[EntityUserLink]
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: LinkId => Request[Unit],
    insert: Oauthtoken => Request[EntityUserLink],
    list: Maxresults => Request[EntityUserLinks],
    update: LinkId => Request[EntityUserLink]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[AccountUserLinksResource]
  }
}

