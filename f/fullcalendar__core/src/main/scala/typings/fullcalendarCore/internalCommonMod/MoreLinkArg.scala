package typings.fullcalendarCore.internalCommonMod

import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoreLinkArg extends StObject {
  
  var allDay: Boolean
  
  var allSegs: js.Array[EventSegment]
  
  var date: js.Date
  
  var hiddenSegs: js.Array[EventSegment]
  
  var jsEvent: UIEvent
  
  var view: ViewApi
}
object MoreLinkArg {
  
  inline def apply(
    allDay: Boolean,
    allSegs: js.Array[EventSegment],
    date: js.Date,
    hiddenSegs: js.Array[EventSegment],
    jsEvent: UIEvent,
    view: ViewApi
  ): MoreLinkArg = {
    val __obj = js.Dynamic.literal(allDay = allDay.asInstanceOf[js.Any], allSegs = allSegs.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], hiddenSegs = hiddenSegs.asInstanceOf[js.Any], jsEvent = jsEvent.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoreLinkArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoreLinkArg] (val x: Self) extends AnyVal {
    
    inline def setAllDay(value: Boolean): Self = StObject.set(x, "allDay", value.asInstanceOf[js.Any])
    
    inline def setAllSegs(value: js.Array[EventSegment]): Self = StObject.set(x, "allSegs", value.asInstanceOf[js.Any])
    
    inline def setAllSegsVarargs(value: EventSegment*): Self = StObject.set(x, "allSegs", js.Array(value*))
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setHiddenSegs(value: js.Array[EventSegment]): Self = StObject.set(x, "hiddenSegs", value.asInstanceOf[js.Any])
    
    inline def setHiddenSegsVarargs(value: EventSegment*): Self = StObject.set(x, "hiddenSegs", js.Array(value*))
    
    inline def setJsEvent(value: UIEvent): Self = StObject.set(x, "jsEvent", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
