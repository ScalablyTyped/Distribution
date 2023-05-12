package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionSettings extends StObject {
  
  var component: DateComponent[Any, Dictionary]
  
  var el: HTMLElement
  
  var isHitComboAllowed: (js.Function2[/* hit0 */ Hit, /* hit1 */ Hit, Boolean]) | Null
  
  var useEventCenter: Boolean
}
object InteractionSettings {
  
  inline def apply(component: DateComponent[Any, Dictionary], el: HTMLElement, useEventCenter: Boolean): InteractionSettings = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], useEventCenter = useEventCenter.asInstanceOf[js.Any], isHitComboAllowed = null)
    __obj.asInstanceOf[InteractionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionSettings] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: DateComponent[Any, Dictionary]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setIsHitComboAllowed(value: (/* hit0 */ Hit, /* hit1 */ Hit) => Boolean): Self = StObject.set(x, "isHitComboAllowed", js.Any.fromFunction2(value))
    
    inline def setIsHitComboAllowedNull: Self = StObject.set(x, "isHitComboAllowed", null)
    
    inline def setUseEventCenter(value: Boolean): Self = StObject.set(x, "useEventCenter", value.asInstanceOf[js.Any])
  }
}
