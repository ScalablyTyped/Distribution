package typings.devextreme.anon

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalAlignment extends js.Object {
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  var horizontalAlignment: js.UndefOr[center | left | right] = js.native
  var margin: js.UndefOr[Bottom] = js.native
  var placeholderSize: js.UndefOr[Double] = js.native
  var subtitle: js.UndefOr[Font | String] = js.native
  var text: js.UndefOr[String] = js.native
  var verticalAlignment: js.UndefOr[bottom | top] = js.native
}

object HorizontalAlignment {
  @scala.inline
  def apply(): HorizontalAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalAlignment]
  }
  @scala.inline
  implicit class HorizontalAlignmentOps[Self <: HorizontalAlignment] (val x: Self) extends AnyVal {
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
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: center | left | right): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    @scala.inline
    def setMargin(value: Bottom): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setPlaceholderSize(value: Double): Self = this.set("placeholderSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderSize: Self = this.set("placeholderSize", js.undefined)
    @scala.inline
    def setSubtitle(value: Font | String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVerticalAlignment(value: bottom | top): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
  }
  
}

