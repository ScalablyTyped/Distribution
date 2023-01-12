package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines when a Place opens or closes.
  */
trait PlaceOpeningHoursTime extends StObject {
  
  /**
    * The days of the week, as a number in the range [<code>0</code>,
    * <code>6</code>], starting on Sunday. For example, <code>2</code> means
    * Tuesday.
    */
  var day: Double
  
  /**
    * The hours of the {@link google.maps.places.PlaceOpeningHoursTime.time} as
    * a number, in the range [<code>0</code>, <code>23</code>]. This will be
    * reported in the Place’s time zone.
    */
  var hours: Double
  
  /**
    * The minutes of the {@link google.maps.places.PlaceOpeningHoursTime.time}
    * as a number, in the range [<code>0</code>, <code>59</code>]. This will be
    * reported in the Place’s time zone.
    */
  var minutes: Double
  
  /**
    * The timestamp (as milliseconds since the epoch, suitable for use with
    * <code>new Date()</code>) representing the next occurrence of this
    * PlaceOpeningHoursTime. It is calculated from the {@link
    * google.maps.places.PlaceOpeningHoursTime.day} of week, the {@link
    * google.maps.places.PlaceOpeningHoursTime.time}, and the {@link
    * google.maps.places.PlaceResult.utc_offset_minutes}. If the {@link
    * google.maps.places.PlaceResult.utc_offset_minutes} is
    * <code>undefined</code>, then <code>nextDate</code> will be
    * <code>undefined</code>.
    */
  var nextDate: js.UndefOr[Double] = js.undefined
  
  /**
    * The time of day in 24-hour &quot;hhmm&quot; format. Values are in the
    * range
    * [<code>"0000"</code>, <code>"2359"</code>]. The time will be reported in
    * the Place’s time zone.
    */
  var time: String
}
object PlaceOpeningHoursTime {
  
  inline def apply(day: Double, hours: Double, minutes: Double, time: String): PlaceOpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceOpeningHoursTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceOpeningHoursTime] (val x: Self) extends AnyVal {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setNextDate(value: Double): Self = StObject.set(x, "nextDate", value.asInstanceOf[js.Any])
    
    inline def setNextDateUndefined: Self = StObject.set(x, "nextDate", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
