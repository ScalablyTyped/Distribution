package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeWindow extends StObject {
  
  /**
    * The end time of the time window (inclusive).
    */
  var endTime: js.Date
  
  /**
    * The start time of the time window (inclusive).
    */
  var startTime: js.Date
}
object TimeWindow {
  
  inline def apply(endTime: js.Date, startTime: js.Date): TimeWindow = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeWindow] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
