package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.datetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var end: datetime
  
  var start: datetime
}
object End {
  
  inline def apply(end: datetime, start: datetime): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: datetime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setStart(value: datetime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
