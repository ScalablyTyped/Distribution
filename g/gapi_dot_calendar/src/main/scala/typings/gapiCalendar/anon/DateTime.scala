package typings.gapiCalendar.anon

import typings.gapiCalendar.gapi.client.calendar.date
import typings.gapiCalendar.gapi.client.calendar.datetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTime extends StObject {
  
  var date: typings.gapiCalendar.gapi.client.calendar.date
  
  var dateTime: datetime
  
  var timeZone: String
}
object DateTime {
  
  @scala.inline
  def apply(date: date, dateTime: datetime, timeZone: String): DateTime = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], timeZone = timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
  
  @scala.inline
  implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: datetime): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
  }
}
