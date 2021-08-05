package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewUsersSummary extends StObject {
  
  /**
    * A list of one or more new users.
    */
  var newUsers: js.UndefOr[js.Array[/* object representing a new user. */ NewUser]] = js.undefined
}
object NewUsersSummary {
  
  inline def apply(): NewUsersSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUsersSummary]
  }
  
  extension [Self <: NewUsersSummary](x: Self) {
    
    inline def setNewUsers(value: js.Array[/* object representing a new user. */ NewUser]): Self = StObject.set(x, "newUsers", value.asInstanceOf[js.Any])
    
    inline def setNewUsersUndefined: Self = StObject.set(x, "newUsers", js.undefined)
    
    inline def setNewUsersVarargs(value: (/* object representing a new user. */ NewUser)*): Self = StObject.set(x, "newUsers", js.Array(value :_*))
  }
}
