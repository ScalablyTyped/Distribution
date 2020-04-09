package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartPanes extends dxChartCommonPaneSettings {
  /** @name dxChart.Options.panes.height */
  var height: js.UndefOr[Double | String] = js.undefined
  /** @name dxChart.Options.panes.name */
  var name: js.UndefOr[String] = js.undefined
}

object dxChartPanes {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    border: AnonLeft = null,
    height: Double | String = null,
    name: String = null
  ): dxChartPanes = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartPanes]
  }
}

