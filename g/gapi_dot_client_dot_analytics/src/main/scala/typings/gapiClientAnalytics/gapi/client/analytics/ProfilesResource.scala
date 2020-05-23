package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: ProfileId): Request[Unit]
  /** Gets a view (profile) to which the user has access. */
  def get(request: ProfileId): Request[Profile]
  /** Create a new view (profile). */
  def insert(request: QuotaUser): Request[Profile]
  /** Lists views (profiles) to which the user has access. */
  def list(request: PrettyPrint): Request[Profiles]
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: ProfileId): Request[Profile]
  /** Updates an existing view (profile). */
  def update(request: ProfileId): Request[Profile]
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: ProfileId => Request[Unit],
    get: ProfileId => Request[Profile],
    insert: QuotaUser => Request[Profile],
    list: PrettyPrint => Request[Profiles],
    patch: ProfileId => Request[Profile],
    update: ProfileId => Request[Profile]
  ): ProfilesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfilesResource]
  }
}

