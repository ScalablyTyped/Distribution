package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndStr extends StObject {
  
  var end: js.Date
  
  var endStr: String
  
  var start: js.Date
  
  var startStr: String
  
  var timeZone: String
}
object EndStr {
  
  inline def apply(end: js.Date, endStr: String, start: js.Date, startStr: String, timeZone: String): EndStr = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], endStr = endStr.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startStr = startStr.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndStr]
  }
  
  extension [Self <: EndStr](x: Self) {
    
    inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndStr(value: String): Self = StObject.set(x, "endStr", value.asInstanceOf[js.Any])
    
    inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartStr(value: String): Self = StObject.set(x, "startStr", value.asInstanceOf[js.Any])
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
