package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardEventProps extends StObject {
  
  var defaultDisplayEventEnd: js.UndefOr[Boolean] = js.undefined
  
  var defaultDisplayEventTime: js.UndefOr[Boolean] = js.undefined
  
  var defaultTimeFormat: DateFormatter
  
  var disableDragging: js.UndefOr[Boolean] = js.undefined
  
  var disableResizing: js.UndefOr[Boolean] = js.undefined
  
  var elClasses: js.UndefOr[js.Array[String]] = js.undefined
  
  var elRef: js.UndefOr[ElRef] = js.undefined
  
  var isDateSelecting: Boolean
  
  var isDragging: Boolean
  
  var isFuture: Boolean
  
  var isPast: Boolean
  
  var isResizing: Boolean
  
  var isSelected: Boolean
  
  var isToday: Boolean
  
  var seg: Seg
}
object StandardEventProps {
  
  inline def apply(
    defaultTimeFormat: DateFormatter,
    isDateSelecting: Boolean,
    isDragging: Boolean,
    isFuture: Boolean,
    isPast: Boolean,
    isResizing: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    seg: Seg
  ): StandardEventProps = {
    val __obj = js.Dynamic.literal(defaultTimeFormat = defaultTimeFormat.asInstanceOf[js.Any], isDateSelecting = isDateSelecting.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardEventProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StandardEventProps] (val x: Self) extends AnyVal {
    
    inline def setDefaultDisplayEventEnd(value: Boolean): Self = StObject.set(x, "defaultDisplayEventEnd", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisplayEventEndUndefined: Self = StObject.set(x, "defaultDisplayEventEnd", js.undefined)
    
    inline def setDefaultDisplayEventTime(value: Boolean): Self = StObject.set(x, "defaultDisplayEventTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultDisplayEventTimeUndefined: Self = StObject.set(x, "defaultDisplayEventTime", js.undefined)
    
    inline def setDefaultTimeFormat(value: DateFormatter): Self = StObject.set(x, "defaultTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setDisableDragging(value: Boolean): Self = StObject.set(x, "disableDragging", value.asInstanceOf[js.Any])
    
    inline def setDisableDraggingUndefined: Self = StObject.set(x, "disableDragging", js.undefined)
    
    inline def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    inline def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
    
    inline def setElClasses(value: js.Array[String]): Self = StObject.set(x, "elClasses", value.asInstanceOf[js.Any])
    
    inline def setElClassesUndefined: Self = StObject.set(x, "elClasses", js.undefined)
    
    inline def setElClassesVarargs(value: String*): Self = StObject.set(x, "elClasses", js.Array(value*))
    
    inline def setElRef(value: ElRef): Self = StObject.set(x, "elRef", value.asInstanceOf[js.Any])
    
    inline def setElRefFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = StObject.set(x, "elRef", js.Any.fromFunction1(value))
    
    inline def setElRefNull: Self = StObject.set(x, "elRef", null)
    
    inline def setElRefUndefined: Self = StObject.set(x, "elRef", js.undefined)
    
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
