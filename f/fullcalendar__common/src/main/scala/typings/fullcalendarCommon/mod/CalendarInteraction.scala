package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarInteraction extends StObject {
  
  def destroy(): Unit
}
object CalendarInteraction {
  
  inline def apply(destroy: () => Unit): CalendarInteraction = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[CalendarInteraction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CalendarInteraction] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
