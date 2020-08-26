package typings.expressServeStaticCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByteRange extends js.Object {
  var end: Double = js.native
  var start: Double = js.native
}

object ByteRange {
  @scala.inline
  def apply(end: Double, start: Double): ByteRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByteRange]
  }
  @scala.inline
  implicit class ByteRangeOps[Self <: ByteRange] (val x: Self) extends AnyVal {
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
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

