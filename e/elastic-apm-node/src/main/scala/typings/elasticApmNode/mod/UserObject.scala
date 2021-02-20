package typings.elasticApmNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserObject extends StObject {
  
  var email: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String | Double] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object UserObject {
  
  @scala.inline
  def apply(): UserObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserObject]
  }
  
  @scala.inline
  implicit class UserObjectMutableBuilder[Self <: UserObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
