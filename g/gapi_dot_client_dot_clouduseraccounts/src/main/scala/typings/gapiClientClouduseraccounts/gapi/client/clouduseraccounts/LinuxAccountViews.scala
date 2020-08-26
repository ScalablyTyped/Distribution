package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LinuxAccountViews extends js.Object {
  /** [Output Only] A list of all groups within a project. */
  var groupViews: js.UndefOr[js.Array[LinuxGroupView]] = js.native
  /** [Output Only] Type of the resource. Always clouduseraccounts#linuxAccountViews for Linux resources. */
  var kind: js.UndefOr[String] = js.native
  /** [Output Only] A list of all users within a project. */
  var userViews: js.UndefOr[js.Array[LinuxUserView]] = js.native
}

object LinuxAccountViews {
  @scala.inline
  def apply(): LinuxAccountViews = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LinuxAccountViews]
  }
  @scala.inline
  implicit class LinuxAccountViewsOps[Self <: LinuxAccountViews] (val x: Self) extends AnyVal {
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
    def setGroupViewsVarargs(value: LinuxGroupView*): Self = this.set("groupViews", js.Array(value :_*))
    @scala.inline
    def setGroupViews(value: js.Array[LinuxGroupView]): Self = this.set("groupViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupViews: Self = this.set("groupViews", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUserViewsVarargs(value: LinuxUserView*): Self = this.set("userViews", js.Array(value :_*))
    @scala.inline
    def setUserViews(value: js.Array[LinuxUserView]): Self = this.set("userViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserViews: Self = this.set("userViews", js.undefined)
  }
  
}

