package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxChartCommonPaneSettings extends js.Object {
  /** @name dxChart.Options.commonPaneSettings.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.native
  /** @name dxChart.Options.commonPaneSettings.border */
  var border: js.UndefOr[Left] = js.native
}

object dxChartCommonPaneSettings {
  @scala.inline
  def apply(): dxChartCommonPaneSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxChartCommonPaneSettings]
  }
  @scala.inline
  implicit class dxChartCommonPaneSettingsOps[Self <: dxChartCommonPaneSettings] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setBorder(value: Left): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
  }
  
}

