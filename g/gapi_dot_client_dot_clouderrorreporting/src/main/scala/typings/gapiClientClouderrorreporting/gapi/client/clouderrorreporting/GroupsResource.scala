package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientClouderrorreporting.anon.Bearertoken
import typings.gapiClientClouderrorreporting.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  /** Get the specified group. */
  def get(request: Bearertoken): Request[ErrorGroup] = js.native
  /**
    * Replace the data for the specified group.
    * Fails if the group does not exist.
    */
  def update(request: Callback): Request[ErrorGroup] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(get: Bearertoken => Request[ErrorGroup], update: Callback => Request[ErrorGroup]): GroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), update = js.Any.fromFunction1(update))
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
    def setGet(value: Bearertoken => Request[ErrorGroup]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Callback => Request[ErrorGroup]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

