package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateFormatOptions extends js.Object {
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
  @scala.inline
  def apply(formatType: String = null, pattern: String = null, timeZone: Int | Double = null): DateFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (formatType != null) __obj.updateDynamic("formatType")(formatType.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormatOptions]
  }
}

