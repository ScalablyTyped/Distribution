package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangeApiWithTimeZone
  extends StObject
     with RangeApi {
  
  var timeZone: String
}
object RangeApiWithTimeZone {
  
  inline def apply(end: js.Date, endStr: String, start: js.Date, startStr: String, timeZone: String): RangeApiWithTimeZone = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], endStr = endStr.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], startStr = startStr.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeApiWithTimeZone]
  }
  
  extension [Self <: RangeApiWithTimeZone](x: Self) {
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
