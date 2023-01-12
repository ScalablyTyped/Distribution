package typings.fullcalendarCommon.mod

import typings.std.EventTarget
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerDragEvent extends StObject {
  
  var deltaX: Double
  
  var deltaY: Double
  
  var isTouch: Boolean
  
  var origEvent: UIEvent
  
  var pageX: Double
  
  var pageY: Double
  
  var subjectEl: EventTarget
}
object PointerDragEvent {
  
  inline def apply(
    deltaX: Double,
    deltaY: Double,
    isTouch: Boolean,
    origEvent: UIEvent,
    pageX: Double,
    pageY: Double,
    subjectEl: EventTarget
  ): PointerDragEvent = {
    val __obj = js.Dynamic.literal(deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], isTouch = isTouch.asInstanceOf[js.Any], origEvent = origEvent.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], subjectEl = subjectEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerDragEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointerDragEvent] (val x: Self) extends AnyVal {
    
    inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
    
    inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
    
    inline def setIsTouch(value: Boolean): Self = StObject.set(x, "isTouch", value.asInstanceOf[js.Any])
    
    inline def setOrigEvent(value: UIEvent): Self = StObject.set(x, "origEvent", value.asInstanceOf[js.Any])
    
    inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    inline def setSubjectEl(value: EventTarget): Self = StObject.set(x, "subjectEl", value.asInstanceOf[js.Any])
  }
}
