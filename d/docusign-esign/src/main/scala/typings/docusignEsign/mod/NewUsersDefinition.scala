package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewUsersDefinition extends StObject {
  
  /**
    * A list of one or more new users.
    */
  var newUsers: js.UndefOr[js.Array[UserInformation]] = js.undefined
}
object NewUsersDefinition {
  
  @scala.inline
  def apply(): NewUsersDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewUsersDefinition]
  }
  
  @scala.inline
  implicit class NewUsersDefinitionMutableBuilder[Self <: NewUsersDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewUsers(value: js.Array[UserInformation]): Self = StObject.set(x, "newUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewUsersUndefined: Self = StObject.set(x, "newUsers", js.undefined)
    
    @scala.inline
    def setNewUsersVarargs(value: UserInformation*): Self = StObject.set(x, "newUsers", js.Array(value :_*))
  }
}
