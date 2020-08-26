package typings.googleCloudPreciseDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateStruct extends js.Object {
  var nanos: Double = js.native
  var seconds: Double = js.native
}

object DateStruct {
  @scala.inline
  def apply(nanos: Double, seconds: Double): DateStruct = {
    val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateStruct]
  }
  @scala.inline
  implicit class DateStructOps[Self <: DateStruct] (val x: Self) extends AnyVal {
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
    def setNanos(value: Double): Self = this.set("nanos", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
  }
  
}

