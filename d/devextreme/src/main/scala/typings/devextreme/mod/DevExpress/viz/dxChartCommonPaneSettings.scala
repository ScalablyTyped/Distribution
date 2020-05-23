package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonPaneSettings extends js.Object {
  /** @name dxChart.Options.commonPaneSettings.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.commonPaneSettings.border */
  var border: js.UndefOr[Left] = js.undefined
}

object dxChartCommonPaneSettings {
  @scala.inline
  def apply(backgroundColor: String = null, border: Left = null): dxChartCommonPaneSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonPaneSettings]
  }
}

