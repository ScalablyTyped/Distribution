package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  /** the time specified as a string. The time is displayed in the time zone of the transit stop. */
  var text: java.lang.String
  /**
    * contains the time zone of this station. The value is the name of the time zone as defined in the
    * [IANA Time Zone Database](http://www.iana.org/time-zones), e.g. "America/New_York".
    */
  var time_zone: java.lang.String
  /** the time specified as a JavaScript `Date` object. */
  var value: stdLib.Date
}

object Time {
  @scala.inline
  def apply(text: java.lang.String, time_zone: java.lang.String, value: stdLib.Date): Time = {
    val __obj = js.Dynamic.literal(text = text, time_zone = time_zone, value = value)
  
    __obj.asInstanceOf[Time]
  }
}

