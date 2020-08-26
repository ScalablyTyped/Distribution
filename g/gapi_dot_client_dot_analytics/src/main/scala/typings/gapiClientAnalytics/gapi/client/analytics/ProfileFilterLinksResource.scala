package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.ProfileId
import typings.gapiClientAnalytics.anon.Startindex
import typings.gapiClientAnalytics.anon.WebPropertyId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: WebPropertyId): Request[Unit] = js.native
  /** Returns a single profile filter link. */
  def get(request: WebPropertyId): Request[ProfileFilterLink] = js.native
  /** Create a new profile filter link. */
  def insert(request: ProfileId): Request[ProfileFilterLink] = js.native
  /** Lists all profile filter links for a profile. */
  def list(request: Startindex): Request[ProfileFilterLinks] = js.native
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: WebPropertyId): Request[ProfileFilterLink] = js.native
  /** Update an existing profile filter link. */
  def update(request: WebPropertyId): Request[ProfileFilterLink] = js.native
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
  @scala.inline
  implicit class ProfileFilterLinksResourceOps[Self <: ProfileFilterLinksResource] (val x: Self) extends AnyVal {
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
    def setDelete(value: WebPropertyId => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: WebPropertyId => Request[ProfileFilterLink]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ProfileId => Request[ProfileFilterLink]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Startindex => Request[ProfileFilterLinks]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: WebPropertyId => Request[ProfileFilterLink]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: WebPropertyId => Request[ProfileFilterLink]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

