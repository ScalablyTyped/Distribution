package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonProfileId
import typings.gapiClientAnalytics.AnonStartindex
import typings.gapiClientAnalytics.AnonWebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: AnonWebPropertyId): Request_[Unit]
  /** Adds a new user to the given view (profile). */
  def insert(request: AnonProfileId): Request_[EntityUserLink]
  /** Lists profile-user links for a given view (profile). */
  def list(request: AnonStartindex): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: AnonWebPropertyId): Request_[EntityUserLink]
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyId => Request_[Unit],
    insert: AnonProfileId => Request_[EntityUserLink],
    list: AnonStartindex => Request_[EntityUserLinks],
    update: AnonWebPropertyId => Request_[EntityUserLink]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
}

