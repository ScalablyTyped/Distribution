package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.bottom
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.devextremeStrings.right
import typings.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisConstantLineStyleLabel extends dxChartCommonAxisSettingsConstantLineStyleLabel {
  /** @name dxChart.Options.valueAxis.constantLineStyle.label.horizontalAlignment */
  var horizontalAlignment: js.UndefOr[center | left | right] = js.undefined
  /** @name dxChart.Options.valueAxis.constantLineStyle.label.verticalAlignment */
  var verticalAlignment: js.UndefOr[bottom | center | top] = js.undefined
}

object dxChartValueAxisConstantLineStyleLabel {
  @scala.inline
  def apply(
    font: Font = null,
    horizontalAlignment: center | left | right = null,
    position: inside | outside = null,
    verticalAlignment: bottom | center | top = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxChartValueAxisConstantLineStyleLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisConstantLineStyleLabel]
  }
}

