package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /** [Output Only] Creation timestamp in RFC3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** An optional textual description of the resource; provided by the client when the resource is created. */
  var description: js.UndefOr[String] = js.native
  /** [Output Only] Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** [Output Only] Type of the resource. Always clouduseraccounts#group for groups. */
  var kind: js.UndefOr[String] = js.native
  /** [Output Only] A list of URLs to User resources who belong to the group. Users may only be members of groups in the same project. */
  var members: js.UndefOr[js.Array[String]] = js.native
  /** Name of the resource; provided by the client when the resource is created. */
  var name: js.UndefOr[String] = js.native
  /** [Output Only] Server defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.native
}

object Group {
  @scala.inline
  def apply(): Group = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Group]
  }
  @scala.inline
  implicit class GroupOps[Self <: Group] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
  
}

