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
  
  @scala.inline
  def apply(): DurandalRelativeRouteSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurandalRelativeRouteSettings]
  }
  
  @scala.inline
  implicit class DurandalRelativeRouteSettingsMutableBuilder[Self <: DurandalRelativeRouteSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDynamicHash(value: String): Self = StObject.set(x, "dynamicHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicHashUndefined: Self = StObject.set(x, "dynamicHash", js.undefined)
    
    @scala.inline
    def setFromParent(value: Boolean): Self = StObject.set(x, "fromParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromParentUndefined: Self = StObject.set(x, "fromParent", js.undefined)
    
    @scala.inline
    def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModuleIdUndefined: Self = StObject.set(x, "moduleId", js.undefined)
    
    @scala.inline
    def setRoute(value: String): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
