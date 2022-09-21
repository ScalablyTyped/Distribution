package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewDef extends StObject {
  
  var component: ViewComponentType
  
  var defaults: ViewOptions
  
  var overrides: ViewOptions
  
  var `type`: String
}
object ViewDef {
  
  inline def apply(component: ViewComponentType, defaults: ViewOptions, overrides: ViewOptions, `type`: String): ViewDef = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewDef]
  }
  
  extension [Self <: ViewDef](x: Self) {
    
    inline def setComponent(value: ViewComponentType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: ViewOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: ViewOptions): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
