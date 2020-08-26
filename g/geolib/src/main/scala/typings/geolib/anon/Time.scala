package typings.geolib.anon

import typings.geolib.typesMod.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Time extends js.Object {
  var time: Timestamp = js.native
}

object Time {
  @scala.inline
  def apply(time: Timestamp): Time = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
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
    def setTime(value: Timestamp): Self = this.set("time", value.asInstanceOf[js.Any])
  }
  
}

