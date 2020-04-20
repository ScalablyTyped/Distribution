package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonProfileId
import typings.gapiClientAnalytics.AnonStartindex
import typings.gapiClientAnalytics.AnonWebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: AnonWebPropertyId): Request_[Unit]
  /** Returns a single profile filter link. */
  def get(request: AnonWebPropertyId): Request_[ProfileFilterLink]
  /** Create a new profile filter link. */
  def insert(request: AnonProfileId): Request_[ProfileFilterLink]
  /** Lists all profile filter links for a profile. */
  def list(request: AnonStartindex): Request_[ProfileFilterLinks]
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: AnonWebPropertyId): Request_[ProfileFilterLink]
  /** Update an existing profile filter link. */
  def update(request: AnonWebPropertyId): Request_[ProfileFilterLink]
}

object ProfileFilterLinksResource {
  @scala.inline
  def apply(
    delete: AnonWebPropertyId => Request_[Unit],
    get: AnonWebPropertyId => Request_[ProfileFilterLink],
    insert: AnonProfileId => Request_[ProfileFilterLink],
    list: AnonStartindex => Request_[ProfileFilterLinks],
    patch: AnonWebPropertyId => Request_[ProfileFilterLink],
    update: AnonWebPropertyId => Request_[ProfileFilterLink]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
}

