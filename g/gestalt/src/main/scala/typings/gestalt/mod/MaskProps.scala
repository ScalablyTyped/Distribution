package typings.gestalt.mod

import typings.gestalt.gestaltNumbers.`0`
import typings.gestalt.gestaltNumbers.`1`
import typings.gestalt.gestaltNumbers.`2`
import typings.gestalt.gestaltNumbers.`3`
import typings.gestalt.gestaltNumbers.`4`
import typings.gestalt.gestaltNumbers.`5`
import typings.gestalt.gestaltNumbers.`6`
import typings.gestalt.gestaltNumbers.`7`
import typings.gestalt.gestaltNumbers.`8`
import typings.gestalt.gestaltStrings.circle
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaskProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var height: js.UndefOr[Double | String] = js.native
  var rounding: js.UndefOr[circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`] = js.native
  var wash: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double | String] = js.native
  var willChangeTransform: js.UndefOr[Boolean] = js.native
}

object MaskProps {
  @scala.inline
  def apply(): MaskProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskProps]
  }
  @scala.inline
  implicit class MaskPropsOps[Self <: MaskProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setRounding(value: circle | `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8`): Self = this.set("rounding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
    @scala.inline
    def setWash(value: Boolean): Self = this.set("wash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWash: Self = this.set("wash", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWillChangeTransform(value: Boolean): Self = this.set("willChangeTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWillChangeTransform: Self = this.set("willChangeTransform", js.undefined)
  }
  
}

