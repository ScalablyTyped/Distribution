package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorHatching extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.native
  var color: js.UndefOr[String] = js.native
  var hatching: js.UndefOr[Step] = js.native
  var opacity: js.UndefOr[Double] = js.native
}

object ColorHatching {
  @scala.inline
  def apply(): ColorHatching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorHatching]
  }
  @scala.inline
  implicit class ColorHatchingOps[Self <: ColorHatching] (val x: Self) extends AnyVal {
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
    def setBorder(value: ColorVisible): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setHatching(value: Step): Self = this.set("hatching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHatching: Self = this.set("hatching", js.undefined)
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
  }
  
}

