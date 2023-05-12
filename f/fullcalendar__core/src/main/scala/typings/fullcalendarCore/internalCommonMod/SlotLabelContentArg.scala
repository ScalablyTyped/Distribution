package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotLabelContentArg extends StObject {
  
  var date: js.Date
  
  var level: Double
  
  var text: String
  
  var time: Duration
  
  var view: ViewApi
}
object SlotLabelContentArg {
  
  inline def apply(date: js.Date, level: Double, text: String, time: Duration, view: ViewApi): SlotLabelContentArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotLabelContentArg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotLabelContentArg] (val x: Self) extends AnyVal {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setView(value: ViewApi): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
