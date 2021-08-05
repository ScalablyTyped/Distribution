package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivilegeName extends StObject {
  
  var privilegeName: js.UndefOr[String] = js.undefined
  
  var serviceId: js.UndefOr[String] = js.undefined
}
object PrivilegeName {
  
  inline def apply(): PrivilegeName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrivilegeName]
  }
  
  extension [Self <: PrivilegeName](x: Self) {
    
    inline def setPrivilegeName(value: String): Self = StObject.set(x, "privilegeName", value.asInstanceOf[js.Any])
    
    inline def setPrivilegeNameUndefined: Self = StObject.set(x, "privilegeName", js.undefined)
    
    inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
  }
}
