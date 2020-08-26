package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: ProfileId): Request[Unit] = js.native
  /** Gets a view (profile) to which the user has access. */
  def get(request: ProfileId): Request[Profile] = js.native
  /** Create a new view (profile). */
  def insert(request: QuotaUser): Request[Profile] = js.native
  /** Lists views (profiles) to which the user has access. */
  def list(request: PrettyPrint): Request[Profiles] = js.native
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: ProfileId): Request[Profile] = js.native
  /** Updates an existing view (profile). */
  def update(request: ProfileId): Request[Profile] = js.native
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
  @scala.inline
  implicit class ProfilesResourceOps[Self <: ProfilesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: ProfileId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ProfileId => Request[Profile]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: QuotaUser => Request[Profile]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: PrettyPrint => Request[Profiles]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: ProfileId => Request[Profile]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: ProfileId => Request[Profile]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

