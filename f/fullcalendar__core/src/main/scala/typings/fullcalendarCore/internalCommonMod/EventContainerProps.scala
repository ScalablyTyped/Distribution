package typings.fullcalendarCore.internalCommonMod

import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventContainerProps
  extends StObject
     with ElProps
     with MinimalEventProps {
  
  var children: js.UndefOr[InnerContainerFunc[EventContentArg]] = js.undefined
  
  def defaultGenerator(renderProps: EventContentArg): ComponentChild
  
  var disableDragging: js.UndefOr[Boolean] = js.undefined
  
  var disableResizing: js.UndefOr[Boolean] = js.undefined
  
  var timeText: String
}
object EventContainerProps {
  
  inline def apply(
    defaultGenerator: EventContentArg => ComponentChild,
    elTag: String,
    isDateSelecting: Boolean,
    isDragging: Boolean,
    isFuture: Boolean,
    isPast: Boolean,
    isResizing: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    seg: Seg,
    timeText: String
  ): EventContainerProps = {
    val __obj = js.Dynamic.literal(defaultGenerator = js.Any.fromFunction1(defaultGenerator), elTag = elTag.asInstanceOf[js.Any], isDateSelecting = isDateSelecting.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], seg = seg.asInstanceOf[js.Any], timeText = timeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventContainerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventContainerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(
      value: (/* InnerContainer */ InnerContainerComponent, EventContentArg, /* elAttrs */ ElAttrs) => ComponentChildren
    ): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setDefaultGenerator(value: EventContentArg => ComponentChild): Self = StObject.set(x, "defaultGenerator", js.Any.fromFunction1(value))
    
    inline def setDisableDragging(value: Boolean): Self = StObject.set(x, "disableDragging", value.asInstanceOf[js.Any])
    
    inline def setDisableDraggingUndefined: Self = StObject.set(x, "disableDragging", js.undefined)
    
    inline def setDisableResizing(value: Boolean): Self = StObject.set(x, "disableResizing", value.asInstanceOf[js.Any])
    
    inline def setDisableResizingUndefined: Self = StObject.set(x, "disableResizing", js.undefined)
    
    inline def setTimeText(value: String): Self = StObject.set(x, "timeText", value.asInstanceOf[js.Any])
  }
}
