package typings.gapiClientGroupssettings.gapi.client.groupssettings

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGroupssettings.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  /** Gets one resource by id. */
  def get(request: Alt): Request[Groups] = js.native
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: Alt): Request[Groups] = js.native
  /** Updates an existing resource. */
  def update(request: Alt): Request[Groups] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(get: Alt => Request[Groups], patch: Alt => Request[Groups], update: Alt => Request[Groups]): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GroupsResource]
  }
  @scala.inline
  implicit class GroupsResourceOps[Self <: GroupsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Alt => Request[Groups]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: Alt => Request[Groups]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Alt => Request[Groups]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

