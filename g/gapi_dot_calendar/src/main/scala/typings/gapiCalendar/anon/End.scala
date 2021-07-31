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
  
  @scala.inline
  def apply(end: datetime, start: datetime): End = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  @scala.inline
  implicit class EndMutableBuilder[Self <: End] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: datetime): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: datetime): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
