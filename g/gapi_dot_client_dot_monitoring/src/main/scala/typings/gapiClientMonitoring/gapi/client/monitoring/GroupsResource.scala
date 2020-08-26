package typings.gapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.gapiClientMonitoring.anon.Accesstoken
import typings.gapiClientMonitoring.anon.AncestorsOfGroup
import typings.gapiClientMonitoring.anon.Bearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsResource extends js.Object {
  var members: MembersResource = js.native
  /** Creates a new group. */
  def create(request: Bearertoken): Request[Group] = js.native
  /** Deletes an existing group. */
  def delete(request: Accesstoken): Request[js.Object] = js.native
  /** Gets a single group. */
  def get(request: Accesstoken): Request[Group] = js.native
  /** Lists the existing groups. */
  def list(request: AncestorsOfGroup): Request[ListGroupsResponse] = js.native
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: Bearertoken): Request[Group] = js.native
}

object GroupsResource {
  @scala.inline
  def apply(
    create: Bearertoken => Request[Group],
    delete: Accesstoken => Request[js.Object],
    get: Accesstoken => Request[Group],
    list: AncestorsOfGroup => Request[ListGroupsResponse],
    members: MembersResource,
    update: Bearertoken => Request[Group]
  ): GroupsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), members = members.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
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
    def setCreate(value: Bearertoken => Request[Group]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: Accesstoken => Request[js.Object]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: Accesstoken => Request[Group]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AncestorsOfGroup => Request[ListGroupsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setMembers(value: MembersResource): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: Bearertoken => Request[Group]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

