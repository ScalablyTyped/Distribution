package typings.firmata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaudRate extends js.Object {
  var baudRate: Double = js.native
  var bufferSize: Double = js.native
}

object BaudRate {
  @scala.inline
  def apply(baudRate: Double, bufferSize: Double): BaudRate = {
    val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaudRate]
  }
  @scala.inline
  implicit class BaudRateOps[Self <: BaudRate] (val x: Self) extends AnyVal {
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
    def setBaudRate(value: Double): Self = this.set("baudRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
  }
  
}

