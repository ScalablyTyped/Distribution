package typings.famous.physicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDragOptions extends IForceOptions {
  var max: js.UndefOr[Double] = js.native
  var strength: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[js.Function1[/* v */ Double, Double]] = js.native
}

object IDragOptions {
  @scala.inline
  def apply(): IDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDragOptions]
  }
  @scala.inline
  implicit class IDragOptionsOps[Self <: IDragOptions] (val x: Self) extends AnyVal {
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
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setStrength(value: Double): Self = this.set("strength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrength: Self = this.set("strength", js.undefined)
    @scala.inline
    def setType(value: /* v */ Double => Double): Self = this.set("type", js.Any.fromFunction1(value))
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

