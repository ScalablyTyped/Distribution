package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeekNumberContentArg extends StObject {
  
  var date: js.Date
  
  var num: Double
  
  var text: String
}
object WeekNumberContentArg {
  
  inline def apply(date: js.Date, num: Double, text: String): WeekNumberContentArg = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], num = num.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekNumberContentArg]
  }
  
  extension [Self <: WeekNumberContentArg](x: Self) {
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setNum(value: Double): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
