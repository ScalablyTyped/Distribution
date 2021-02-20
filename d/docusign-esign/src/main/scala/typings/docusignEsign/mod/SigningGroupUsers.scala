package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SigningGroupUsers extends StObject {
  
  /**
    * User management information.
    */
  var users: js.UndefOr[js.Array[SigningGroupUser]] = js.native
}
object SigningGroupUsers {
  
  @scala.inline
  def apply(): SigningGroupUsers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningGroupUsers]
  }
  
  @scala.inline
  implicit class SigningGroupUsersMutableBuilder[Self <: SigningGroupUsers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsers(value: js.Array[SigningGroupUser]): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    @scala.inline
    def setUsersVarargs(value: SigningGroupUser*): Self = StObject.set(x, "users", js.Array(value :_*))
  }
}
