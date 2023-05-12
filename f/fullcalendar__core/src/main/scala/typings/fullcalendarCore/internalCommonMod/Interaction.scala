package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction extends StObject {
  
  var component: DateComponent[Any, Dictionary]
  
  def destroy(): Unit
  
  var isHitComboAllowed: (js.Function2[/* hit0 */ Hit, /* hit1 */ Hit, Boolean]) | Null
}
object Interaction {
  
  inline def apply(component: DateComponent[Any, Dictionary], destroy: () => Unit): Interaction = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), isHitComboAllowed = null)
    __obj.asInstanceOf[Interaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interaction] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: DateComponent[Any, Dictionary]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setIsHitComboAllowed(value: (/* hit0 */ Hit, /* hit1 */ Hit) => Boolean): Self = StObject.set(x, "isHitComboAllowed", js.Any.fromFunction2(value))
    
    inline def setIsHitComboAllowedNull: Self = StObject.set(x, "isHitComboAllowed", null)
  }
}
