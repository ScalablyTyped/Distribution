package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.rotate
import typings.devextreme.devextremeStrings.stagger
import typings.devextreme.devextremeStrings.standard
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAxisSettingsLabel extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.label.alignment */
  var alignment: js.UndefOr[center | left | right] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.displayMode */
  var displayMode: js.UndefOr[rotate | stagger | standard] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.font */
  var font: js.UndefOr[Font] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.indentFromAxis */
  var indentFromAxis: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.overlappingBehavior */
  var overlappingBehavior: js.UndefOr[rotate | stagger | none | hide] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.position */
  var position: js.UndefOr[inside | outside | bottom | left | right | top] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.rotationAngle */
  var rotationAngle: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.staggeringSpacing */
  var staggeringSpacing: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.textOverflow */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.visible */
  var visible: js.UndefOr[Boolean] = js.native
  /** @name dxChart.Options.commonAxisSettings.label.wordWrap */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}

object dxChartCommonAxisSettingsLabel {
  @scala.inline
  def apply(): dxChartCommonAxisSettingsLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsLabel]
  }
  @scala.inline
  implicit class dxChartCommonAxisSettingsLabelOps[Self <: dxChartCommonAxisSettingsLabel] (val x: Self) extends AnyVal {
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
    def setAlignment(value: center | left | right): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setDisplayMode(value: rotate | stagger | standard): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setIndentFromAxis(value: Double): Self = this.set("indentFromAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndentFromAxis: Self = this.set("indentFromAxis", js.undefined)
    @scala.inline
    def setOverlappingBehavior(value: rotate | stagger | none | hide): Self = this.set("overlappingBehavior", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlappingBehavior: Self = this.set("overlappingBehavior", js.undefined)
    @scala.inline
    def setPosition(value: inside | outside | bottom | left | right | top): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setRotationAngle(value: Double): Self = this.set("rotationAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotationAngle: Self = this.set("rotationAngle", js.undefined)
    @scala.inline
    def setStaggeringSpacing(value: Double): Self = this.set("staggeringSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStaggeringSpacing: Self = this.set("staggeringSpacing", js.undefined)
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

