package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import typings.gapiClientAnalytics.anon.WebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: WebPropertyId): Request[Unit]
  /** Returns a single profile filter link. */
  def get(request: WebPropertyId): Request[ProfileFilterLink]
  /** Create a new profile filter link. */
  def insert(request: ProfileId): Request[ProfileFilterLink]
  /** Lists all profile filter links for a profile. */
  def list(request: Startindex): Request[ProfileFilterLinks]
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: WebPropertyId): Request[ProfileFilterLink]
  /** Update an existing profile filter link. */
  def update(request: WebPropertyId): Request[ProfileFilterLink]
}

object ProfileFilterLinksResource {
  @scala.inline
  def apply(
    delete: WebPropertyId => Request[Unit],
    get: WebPropertyId => Request[ProfileFilterLink],
    insert: ProfileId => Request[ProfileFilterLink],
    list: Startindex => Request[ProfileFilterLinks],
    patch: WebPropertyId => Request[ProfileFilterLink],
    update: WebPropertyId => Request[ProfileFilterLink]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
}

