package typings.atGoogleMaps.atGoogleMapsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Time extends js.Object {
  /** the time specified as a string. The time is displayed in the time zone of the transit stop. */
  var text: String
  /**
    * contains the time zone of this station. The value is the name of the time zone as defined in the
    * [IANA Time Zone Database](http://www.iana.org/time-zones), e.g. "America/New_York".
    */
  var time_zone: String
  /** the time specified as a JavaScript `Date` object. */
  var value: Date
}

object Time {
  @scala.inline
  def apply(text: String, time_zone: String, value: Date): Time = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Time]
  }
}

