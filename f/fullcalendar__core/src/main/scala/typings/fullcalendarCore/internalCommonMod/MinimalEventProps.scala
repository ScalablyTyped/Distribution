package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinimalEventProps extends StObject {
  
  var isDateSelecting: Boolean
  
  var isDragging: Boolean
  
  var isFuture: Boolean
  
  var isPast: Boolean
  
  var isResizing: Boolean
  
  var isSelected: Boolean
  
  var isToday: Boolean
  
  var seg: Seg
}
object MinimalEventProps {
  
  inline def apply(
    isDateSelecting: Boolean,
    isDragging: Boolean,
    isFuture: Boolean,
    isPast: Boolean,
    isResizing: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    seg: Seg
  ): MinimalEventProps = {
    val __obj = js.Dynamic.literal(isDateSelecting = isDateSelecting.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimalEventProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MinimalEventProps] (val x: Self) extends AnyVal {
    
    inline def setIsDateSelecting(value: Boolean): Self = StObject.set(x, "isDateSelecting", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
    
    inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
    
    inline def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
    
    inline def setSeg(value: Seg): Self = StObject.set(x, "seg", value.asInstanceOf[js.Any])
  }
}
