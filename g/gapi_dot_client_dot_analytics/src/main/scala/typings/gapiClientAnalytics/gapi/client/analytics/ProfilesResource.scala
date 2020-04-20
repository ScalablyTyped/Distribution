package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonPrettyPrint
import typings.gapiClientAnalytics.AnonProfileId
import typings.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: AnonProfileId): Request_[Unit]
  /** Gets a view (profile) to which the user has access. */
  def get(request: AnonProfileId): Request_[Profile]
  /** Create a new view (profile). */
  def insert(request: AnonQuotaUser): Request_[Profile]
  /** Lists views (profiles) to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[Profiles]
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: AnonProfileId): Request_[Profile]
  /** Updates an existing view (profile). */
  def update(request: AnonProfileId): Request_[Profile]
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: AnonProfileId => Request_[Unit],
    get: AnonProfileId => Request_[Profile],
    insert: AnonQuotaUser => Request_[Profile],
    list: AnonPrettyPrint => Request_[Profiles],
    patch: AnonProfileId => Request_[Profile],
    update: AnonProfileId => Request_[Profile]
  ): ProfilesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[ProfilesResource]
  }
}

