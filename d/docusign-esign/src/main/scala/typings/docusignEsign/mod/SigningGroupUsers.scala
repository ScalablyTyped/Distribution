package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningGroupUsers extends StObject {
  
  /**
    * User management information.
    */
  var users: js.UndefOr[js.Array[SigningGroupUser]] = js.undefined
}
object SigningGroupUsers {
  
  inline def apply(): SigningGroupUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningGroupUsers]
  }
  
  extension [Self <: SigningGroupUsers](x: Self) {
    
    inline def setUsers(value: js.Array[SigningGroupUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: SigningGroupUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
