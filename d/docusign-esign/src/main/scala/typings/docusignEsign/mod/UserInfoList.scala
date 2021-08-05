package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserInfoList extends StObject {
  
  /**
    * An array of `userInfo` objects containing information about the users in the group.
    */
  var users: js.UndefOr[js.Array[UserInfo]] = js.undefined
}
object UserInfoList {
  
  inline def apply(): UserInfoList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserInfoList]
  }
  
  extension [Self <: UserInfoList](x: Self) {
    
    inline def setUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: UserInfo*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
