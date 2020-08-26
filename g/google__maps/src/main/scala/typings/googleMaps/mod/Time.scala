package typings.googleMaps.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Time extends js.Object {
  /** the time specified as a string. The time is displayed in the time zone of the transit stop. */
  var text: String = js.native
  /**
    * contains the time zone of this station. The value is the name of the time zone as defined in the
    * [IANA Time Zone Database](http://www.iana.org/time-zones), e.g. "America/New_York".
    */
  var time_zone: String = js.native
  /** the time specified as a JavaScript `Date` object. */
  var value: Date = js.native
}

object Time {
  @scala.inline
  def apply(text: String, time_zone: String, value: Date): Time = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], time_zone = time_zone.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTime_zone(value: String): Self = this.set("time_zone", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Date): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

