package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserInfoList extends StObject {
  
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
  implicit class UserInfoListMutableBuilder[Self <: UserInfoList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: UserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
