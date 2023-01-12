package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventRenderRange
  extends StObject
     with EventTuple {
  
  var isEnd: Boolean
  
  var isStart: Boolean
  
  var range: DateRange
  
  var ui: EventUi
}
object EventRenderRange {
  
  inline def apply(`def`: EventDef, isEnd: Boolean, isStart: Boolean, range: DateRange, ui: EventUi): EventRenderRange = {
    val __obj = js.Dynamic.literal(isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], instance = null)
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRenderRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventRenderRange] (val x: Self) extends AnyVal {
    
    inline def setIsEnd(value: Boolean): Self = StObject.set(x, "isEnd", value.asInstanceOf[js.Any])
    
    inline def setIsStart(value: Boolean): Self = StObject.set(x, "isStart", value.asInstanceOf[js.Any])
    
    inline def setRange(value: DateRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setUi(value: EventUi): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
  }
}
