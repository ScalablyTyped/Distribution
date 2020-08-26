package typings.devextreme.anon

import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.none
import typings.devextreme.mod.DevExpress.viz.dxSankeyNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HorizontalOffset extends js.Object {
  var border: js.UndefOr[ColorVisible] = js.native
  var customizeText: js.UndefOr[js.Function1[/* itemInfo */ dxSankeyNode, String]] = js.native
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.native
  var horizontalOffset: js.UndefOr[Double] = js.native
  var overlappingBehavior: js.UndefOr[ellipsis | hide | none] = js.native
  var shadow: js.UndefOr[Blur] = js.native
  var useNodeColors: js.UndefOr[Boolean] = js.native
  var verticalOffset: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object HorizontalOffset {
  @scala.inline
  def apply(): HorizontalOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HorizontalOffset]
  }
  @scala.inline
  implicit class HorizontalOffsetOps[Self <: HorizontalOffset] (val x: Self) extends AnyVal {
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
    def setCustomizeText(value: /* itemInfo */ dxSankeyNode => String): Self = this.set("customizeText", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCustomizeText: Self = this.set("customizeText", js.undefined)
    @scala.inline
    def setFont(value: typings.devextreme.mod.DevExpress.viz.Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setHorizontalOffset(value: Double): Self = this.set("horizontalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalOffset: Self = this.set("horizontalOffset", js.undefined)
    @scala.inline
    def setOverlappingBehavior(value: ellipsis | hide | none): Self = this.set("overlappingBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlappingBehavior: Self = this.set("overlappingBehavior", js.undefined)
    @scala.inline
    def setShadow(value: Blur): Self = this.set("shadow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShadow: Self = this.set("shadow", js.undefined)
    @scala.inline
    def setUseNodeColors(value: Boolean): Self = this.set("useNodeColors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNodeColors: Self = this.set("useNodeColors", js.undefined)
    @scala.inline
    def setVerticalOffset(value: Double): Self = this.set("verticalOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalOffset: Self = this.set("verticalOffset", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

