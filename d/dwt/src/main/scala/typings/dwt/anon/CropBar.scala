package typings.dwt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropBar extends js.Object {
  var cropBar: js.UndefOr[Boolean] = js.native
   // Example [[1, 1], [3, 2], [4, 3], [5, 4], [7, 5], [16, 9]],
  var cropMask: js.UndefOr[Boolean] = js.native
  var ratios: js.UndefOr[js.Any] = js.native
}

object CropBar {
  @scala.inline
  def apply(): CropBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropBar]
  }
  @scala.inline
  implicit class CropBarOps[Self <: CropBar] (val x: Self) extends AnyVal {
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
    def setCropBar(value: Boolean): Self = this.set("cropBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropBar: Self = this.set("cropBar", js.undefined)
    @scala.inline
    def setCropMask(value: Boolean): Self = this.set("cropMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCropMask: Self = this.set("cropMask", js.undefined)
    @scala.inline
    def setRatios(value: js.Any): Self = this.set("ratios", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatios: Self = this.set("ratios", js.undefined)
  }
  
}

