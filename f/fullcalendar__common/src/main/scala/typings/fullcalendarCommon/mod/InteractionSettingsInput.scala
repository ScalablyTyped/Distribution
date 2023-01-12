package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractionSettingsInput extends StObject {
  
  var el: HTMLElement
  
  var isHitComboAllowed: js.UndefOr[js.Function2[/* hit0 */ Hit, /* hit1 */ Hit, Boolean]] = js.undefined
  
  var useEventCenter: js.UndefOr[Boolean] = js.undefined
}
object InteractionSettingsInput {
  
  inline def apply(el: HTMLElement): InteractionSettingsInput = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionSettingsInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InteractionSettingsInput] (val x: Self) extends AnyVal {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setIsHitComboAllowed(value: (/* hit0 */ Hit, /* hit1 */ Hit) => Boolean): Self = StObject.set(x, "isHitComboAllowed", js.Any.fromFunction2(value))
    
    inline def setIsHitComboAllowedUndefined: Self = StObject.set(x, "isHitComboAllowed", js.undefined)
    
    inline def setUseEventCenter(value: Boolean): Self = StObject.set(x, "useEventCenter", value.asInstanceOf[js.Any])
    
    inline def setUseEventCenterUndefined: Self = StObject.set(x, "useEventCenter", js.undefined)
  }
}
