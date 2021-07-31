package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventDateTime extends StObject {
  
  /**
    * The date, in the format &quot;yyyy-mm-dd&quot;, if this is an all-day
    * event.
    */
  var date: js.UndefOr[String] = js.undefined
  
  /**
    * The time, as a combined date-time value (formatted according to RFC3339).
    * A time zone offset is required unless a time zone is explicitly specified
    * in timeZone.
    */
  var dateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone in which the time is specified. (Formatted as an IANA Time
    * Zone Database name, e.g. &quot;Europe/Zurich&quot;.) For recurring events
    * this field is required and specifies the time zone in which the
    * recurrence is expanded. For single events this field is optional and
    * indicates a custom time zone for the event start/end.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object SchemaEventDateTime {
  
  @scala.inline
  def apply(): SchemaEventDateTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventDateTime]
  }
  
  @scala.inline
  implicit class SchemaEventDateTimeMutableBuilder[Self <: SchemaEventDateTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
