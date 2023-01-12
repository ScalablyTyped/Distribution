package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disable extends StObject {
  
  var Disable: js.UndefOr[Boolean] = js.undefined
  
  var Level: js.UndefOr[String] = js.undefined
  
  var Role: js.UndefOr[String] = js.undefined
  
  var Type: js.UndefOr[String] = js.undefined
  
  var User: js.UndefOr[String] = js.undefined
}
object Disable {
  
  inline def apply(): Disable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Disable] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: Boolean): Self = StObject.set(x, "Disable", value.asInstanceOf[js.Any])
    
    inline def setDisableUndefined: Self = StObject.set(x, "Disable", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "Level", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
