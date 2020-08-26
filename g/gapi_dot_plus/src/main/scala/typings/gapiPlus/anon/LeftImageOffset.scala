package typings.gapiPlus.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeftImageOffset extends js.Object {
  var leftImageOffset: Double = js.native
  var topImageOffset: Double = js.native
}

object LeftImageOffset {
  @scala.inline
  def apply(leftImageOffset: Double, topImageOffset: Double): LeftImageOffset = {
    val __obj = js.Dynamic.literal(leftImageOffset = leftImageOffset.asInstanceOf[js.Any], topImageOffset = topImageOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftImageOffset]
  }
  @scala.inline
  implicit class LeftImageOffsetOps[Self <: LeftImageOffset] (val x: Self) extends AnyVal {
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
    def setLeftImageOffset(value: Double): Self = this.set("leftImageOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopImageOffset(value: Double): Self = this.set("topImageOffset", value.asInstanceOf[js.Any])
  }
  
}

