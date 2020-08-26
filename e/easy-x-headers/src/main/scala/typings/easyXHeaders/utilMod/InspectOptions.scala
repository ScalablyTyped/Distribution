package typings.easyXHeaders.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InspectOptions extends js.Object {
  var colors: js.UndefOr[Boolean] = js.native
  var customInspect: js.UndefOr[Boolean] = js.native
  var depth: js.UndefOr[Double] = js.native
  var showHidden: js.UndefOr[Boolean] = js.native
}

object InspectOptions {
  @scala.inline
  def apply(): InspectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InspectOptions]
  }
  @scala.inline
  implicit class InspectOptionsOps[Self <: InspectOptions] (val x: Self) extends AnyVal {
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
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setCustomInspect(value: Boolean): Self = this.set("customInspect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomInspect: Self = this.set("customInspect", js.undefined)
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
  }
  
}

