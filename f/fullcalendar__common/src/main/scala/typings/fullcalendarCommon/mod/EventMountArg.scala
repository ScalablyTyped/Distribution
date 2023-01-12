package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @fullcalendar/common.@fullcalendar/common.MountArg<@fullcalendar/common.@fullcalendar/common.EventContentArg> */
trait EventMountArg extends StObject {
  
  var backgroundColor: String
  
  var borderColor: String
  
  var el: HTMLElement
  
  var event: EventApi
  
  var isDraggable: Boolean
  
  var isDragging: Boolean
  
  var isEnd: Boolean
  
  var isEndResizable: Boolean
  
  var isFuture: Boolean
  
  var isMirror: Boolean
  
  var isPast: Boolean
  
  var isResizing: Boolean
  
  var isSelected: Boolean
  
  var isStart: Boolean
  
  var isStartResizable: Boolean
  
  var isToday: Boolean
  
  var textColor: String
  
  var timeText: String
  
  var view: ViewApi
}
object EventMountArg {
  
  inline def apply(
    backgroundColor: String,
    borderColor: String,
    el: HTMLElement,
    event: EventApi,
    isDraggable: Boolean,
    isDragging: Boolean,
    isEnd: Boolean,
    isEndResizable: Boolean,
    isFuture: Boolean,
    isMirror: Boolean,
    isPast: Boolean,
    isResizing: Boolean,
    isSelected: Boolean,
    isStart: Boolean,
    isStartResizable: Boolean,
    isToday: Boolean,
    textColor: String,
    timeText: String,
    view: ViewApi
  ): EventMountArg = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], el = el.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], isDraggable = isDraggable.asInstanceOf[js.Any], isDragging = isDragging.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isEndResizable = isEndResizable.asInstanceOf[js.Any], isFuture = isFuture.asInstanceOf[js.Any], isMirror = isMirror.asInstanceOf[js.Any], isPast = isPast.asInstanceOf[js.Any], isResizing = isResizing.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], isStartResizable = isStartResizable.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], timeText = timeText.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMountArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventMountArg] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: EventApi): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setIsDraggable(value: Boolean): Self = StObject.set(x, "isDraggable", value.asInstanceOf[js.Any])
    
    inline def setIsDragging(value: Boolean): Self = StObject.set(x, "isDragging", value.asInstanceOf[js.Any])
    
    inline def setIsEnd(value: Boolean): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
    
    inline def setIsEndResizable(value: Boolean): Self = StObject.set(x, "isEndResizable", value.asInstanceOf[js.Any])
    
    inline def setIsFuture(value: Boolean): Self = StObject.set(x, "isFuture", value.asInstanceOf[js.Any])
    
    inline def setIsMirror(value: Boolean): Self = StObject.set(x, "isMirror", value.asInstanceOf[js.Any])
    
    inline def setIsPast(value: Boolean): Self = StObject.set(x, "isPast", value.asInstanceOf[js.Any])
    
    inline def setIsResizing(value: Boolean): Self = StObject.set(x, "isResizing", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
    
    inline def setIsStart(value: Boolean): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
    
    inline def setIsStartResizable(value: Boolean): Self = StObject.set(x, "isStartResizable", value.asInstanceOf[js.Any])
    
    inline def setIsToday(value: Boolean): Self = StObject.set(x, "isToday", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTimeText(value: String): Self = StObject.set(x, "timeText", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
