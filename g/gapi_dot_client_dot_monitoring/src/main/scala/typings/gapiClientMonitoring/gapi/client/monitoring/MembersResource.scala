package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MembersResource extends js.Object {
  /** Lists the monitored resources that are members of a group. */
  def list(request: Alt): Request[ListGroupMembersResponse] = js.native
}

object MembersResource {
  @scala.inline
  def apply(list: Alt => Request[ListGroupMembersResponse]): MembersResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[MembersResource]
  }
  @scala.inline
  implicit class MembersResourceOps[Self <: MembersResource] (val x: Self) extends AnyVal {
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
    def setList(value: Alt => Request[ListGroupMembersResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

