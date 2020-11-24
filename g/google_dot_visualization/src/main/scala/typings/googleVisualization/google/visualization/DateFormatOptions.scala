package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateFormatOptions extends js.Object {
  
  /**
    * A quick formatting option for the date. The following string values are supported, reformatting the date February 28, 2016 as shown:
    * - 'short' - Short format: e.g., "2/28/16"
    * - 'medium' - Medium format: e.g., "Feb 28, 2016"
    * - 'long' - Long format: e.g., "February 28, 2016"
    * You cannot specify both formatType and pattern.
    */
  var formatType: js.UndefOr[String] = js.native
  
  /**
    * A custom format pattern to apply to the value, similar to the ICU date and time format.
    * You cannot specify both formatType and pattern.
    * @example
    * var formatter3 = new google.visualization.DateFormat({pattern: "EEE, MMM d, ''yy"});
    */
  var pattern: js.UndefOr[String] = js.native
  
  /**
    * The time zone in which to display the date value. This is a numeric value, indicating GMT + this number of time zones (can be negative). Date object are created by default with the assumed time zone of the computer on which they are created; this option is used to display that value in a different time zone. For example, if you created a Date object of 5pm noon on a computer located in Greenwich, England, and specified timeZone to be -5 (options['timeZone'] = -5, or Eastern Pacific Time in the US), the value displayed would be 12 noon.
    */
  var timeZone: js.UndefOr[Double] = js.native
}
object DateFormatOptions {
  
  @scala.inline
  def apply(): DateFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateFormatOptions]
  }
  
  @scala.inline
  implicit class DateFormatOptionsOps[Self <: DateFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormatType(value: String): Self = this.set("formatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatType: Self = this.set("formatType", js.undefined)
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setTimeZone(value: Double): Self = this.set("timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZone: Self = this.set("timeZone", js.undefined)
  }
}
