package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import typings.gapiClientAnalytics.anon.WebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: WebPropertyId): Request[Unit]
  /** Adds a new user to the given view (profile). */
  def insert(request: ProfileId): Request[EntityUserLink]
  /** Lists profile-user links for a given view (profile). */
  def list(request: Startindex): Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: WebPropertyId): Request[EntityUserLink]
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: WebPropertyId => Request[Unit],
    insert: ProfileId => Request[EntityUserLink],
    list: Startindex => Request[EntityUserLinks],
    update: WebPropertyId => Request[EntityUserLink]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
}

