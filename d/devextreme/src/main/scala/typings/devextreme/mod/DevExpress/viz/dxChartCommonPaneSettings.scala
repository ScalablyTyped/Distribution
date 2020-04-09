package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonPaneSettings extends js.Object {
  /** @name dxChart.Options.commonPaneSettings.backgroundColor */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** @name dxChart.Options.commonPaneSettings.border */
  var border: js.UndefOr[AnonLeft] = js.undefined
}

object dxChartCommonPaneSettings {
  @scala.inline
  def apply(backgroundColor: String = null, border: AnonLeft = null): dxChartCommonPaneSettings = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonPaneSettings]
  }
}

