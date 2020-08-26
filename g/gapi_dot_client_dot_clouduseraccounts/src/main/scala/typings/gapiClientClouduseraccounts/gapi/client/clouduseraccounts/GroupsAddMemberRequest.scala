package typings.gapiClientClouduseraccounts.gapi.client.clouduseraccounts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupsAddMemberRequest extends js.Object {
  /** Fully-qualified URLs of the User resources to add. */
  var users: js.UndefOr[js.Array[String]] = js.native
}

object GroupsAddMemberRequest {
  @scala.inline
  def apply(): GroupsAddMemberRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupsAddMemberRequest]
  }
  @scala.inline
  implicit class GroupsAddMemberRequestOps[Self <: GroupsAddMemberRequest] (val x: Self) extends AnyVal {
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
    def setUsersVarargs(value: String*): Self = this.set("users", js.Array(value :_*))
    @scala.inline
    def setUsers(value: js.Array[String]): Self = this.set("users", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
  
}

