package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxGroupView extends js.Object {
  /** [Output Only] The Group ID. */
  var gid: js.UndefOr[Double] = js.native
  /** [Output Only] Group name. */
  var groupName: js.UndefOr[String] = js.native
  /** [Output Only] List of user accounts that belong to the group. */
  var members: js.UndefOr[js.Array[String]] = js.native
}

object LinuxGroupView {
  @scala.inline
  def apply(): LinuxGroupView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxGroupView]
  }
  @scala.inline
  implicit class LinuxGroupViewOps[Self <: LinuxGroupView] (val x: Self) extends AnyVal {
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
    def setGid(value: Double): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGid: Self = this.set("gid", js.undefined)
    @scala.inline
    def setGroupName(value: String): Self = this.set("groupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("groupName", js.undefined)
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
  }
  
}

