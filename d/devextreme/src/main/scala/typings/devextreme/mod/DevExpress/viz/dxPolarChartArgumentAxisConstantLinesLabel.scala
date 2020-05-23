package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxisConstantLinesLabel extends dxPolarChartCommonAxisSettingsConstantLineStyleLabel {
  /** @name dxPolarChart.Options.argumentAxis.constantLines.label.text */
  var text: js.UndefOr[String] = js.undefined
}

object dxPolarChartArgumentAxisConstantLinesLabel {
  @scala.inline
  def apply(font: Font = null, text: String = null, visible: js.UndefOr[Boolean] = js.undefined): dxPolarChartArgumentAxisConstantLinesLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxisConstantLinesLabel]
  }
}

