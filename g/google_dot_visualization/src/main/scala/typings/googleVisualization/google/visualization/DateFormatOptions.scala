package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormatOptions extends StObject {
  
  /**
    * A quick formatting option for the date. The following string values are supported, reformatting the date February 28, 2016 as shown:
    * - 'short' - Short format: e.g., "2/28/16"
    * - 'medium' - Medium format: e.g., "Feb 28, 2016"
    * - 'long' - Long format: e.g., "February 28, 2016"
    * You cannot specify both formatType and pattern.
    */
  var formatType: js.UndefOr[String] = js.undefined
  
  /**
    * A custom format pattern to apply to the value, similar to the ICU date and time format.
    * You cannot specify both formatType and pattern.
    * @example
    * var formatter3 = new google.visualization.DateFormat({pattern: "EEE, MMM d, ''yy"});
    */
  var pattern: js.UndefOr[String] = js.undefined
  
  /**
    * The time zone in which to display the date value. This is a numeric value, indicating GMT + this number of time zones (can be negative). Date object are created by default with the assumed time zone of the computer on which they are created; this option is used to display that value in a different time zone. For example, if you created a Date object of 5pm noon on a computer located in Greenwich, England, and specified timeZone to be -5 (options['timeZone'] = -5, or Eastern Pacific Time in the US), the value displayed would be 12 noon.
    */
  var timeZone: js.UndefOr[Double] = js.undefined
}
object DateFormatOptions {
  
  inline def apply(): DateFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormatOptions]
  }
  
  extension [Self <: DateFormatOptions](x: Self) {
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setFormatTypeUndefined: Self = StObject.set(x, "formatType", js.undefined)
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setTimeZone(value: Double): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
