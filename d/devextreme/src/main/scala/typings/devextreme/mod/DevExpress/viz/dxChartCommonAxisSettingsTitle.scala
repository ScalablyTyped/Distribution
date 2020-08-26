package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.breakWord
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.ellipsis
import typings.devextreme.devextremeStrings.hide
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.normal
import typings.devextreme.devextremeStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonAxisSettingsTitle extends js.Object {
  /** @name dxChart.Options.commonAxisSettings.title.alignment */
  var alignment: js.UndefOr[center | left | right] = js.native
  /** @name dxChart.Options.commonAxisSettings.title.font */
  var font: js.UndefOr[Font] = js.native
  /** @name dxChart.Options.commonAxisSettings.title.margin */
  var margin: js.UndefOr[Double] = js.native
  /** @name dxChart.Options.commonAxisSettings.title.textOverflow */
  var textOverflow: js.UndefOr[ellipsis | hide | none] = js.native
  /** @name dxChart.Options.commonAxisSettings.title.wordWrap */
  var wordWrap: js.UndefOr[normal | breakWord | none] = js.native
}

object dxChartCommonAxisSettingsTitle {
  @scala.inline
  def apply(): dxChartCommonAxisSettingsTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonAxisSettingsTitle]
  }
  @scala.inline
  implicit class dxChartCommonAxisSettingsTitleOps[Self <: dxChartCommonAxisSettingsTitle] (val x: Self) extends AnyVal {
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    @scala.inline
    def setMargin(value: Double): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setTextOverflow(value: ellipsis | hide | none): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    @scala.inline
    def setWordWrap(value: normal | breakWord | none): Self = this.set("wordWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordWrap: Self = this.set("wordWrap", js.undefined)
  }
  
}

