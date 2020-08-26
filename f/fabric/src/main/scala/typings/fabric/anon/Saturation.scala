package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Saturation extends js.Object {
  var saturation: js.UndefOr[Double] = js.native
}

object Saturation {
  @scala.inline
  def apply(): Saturation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Saturation]
  }
  @scala.inline
  implicit class SaturationOps[Self <: Saturation] (val x: Self) extends AnyVal {
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
    def setSaturation(value: Double): Self = this.set("saturation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSaturation: Self = this.set("saturation", js.undefined)
  }
  
}

