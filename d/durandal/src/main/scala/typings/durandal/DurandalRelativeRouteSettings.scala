package typings.durandal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurandalRelativeRouteSettings extends StObject {
  
  var dynamicHash: js.UndefOr[String] = js.undefined
  
  var fromParent: js.UndefOr[Boolean] = js.undefined
  
  var moduleId: js.UndefOr[String] = js.undefined
  
  var route: js.UndefOr[String] = js.undefined
}
object DurandalRelativeRouteSettings {
  
  inline def apply(): DurandalRelativeRouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalRelativeRouteSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurandalRelativeRouteSettings] (val x: Self) extends AnyVal {
    
    inline def setDynamicHash(value: String): Self = StObject.set(x, "dynamicHash", value.asInstanceOf[js.Any])
    
    inline def setDynamicHashUndefined: Self = StObject.set(x, "dynamicHash", js.undefined)
    
    inline def setFromParent(value: Boolean): Self = StObject.set(x, "fromParent", value.asInstanceOf[js.Any])
    
    inline def setFromParentUndefined: Self = StObject.set(x, "fromParent", js.undefined)
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    inline def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
