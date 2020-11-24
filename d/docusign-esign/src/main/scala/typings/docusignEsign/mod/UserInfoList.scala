package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfoList extends js.Object {
  
  /**
    * An array of `userInfo` objects containing information about the users in the group.
    */
  var users: js.UndefOr[js.Array[UserInfo]] = js.native
}
object UserInfoList {
  
  @scala.inline
  def apply(): UserInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInfoList]
  }
  
  @scala.inline
  implicit class UserInfoListOps[Self <: UserInfoList] (val x: Self) extends AnyVal {
    
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
    def setUsersVarargs(value: UserInfo*): Self = this.set("users", js.Array(value :_*))
    
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = this.set("users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsers: Self = this.set("users", js.undefined)
  }
}
