package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartArgumentAxisStripsLabel extends dxPolarChartCommonAxisSettingsStripStyleLabel {
  /** @name dxPolarChart.Options.argumentAxis.strips.label.text */
  var text: js.UndefOr[String] = js.undefined
}

object dxPolarChartArgumentAxisStripsLabel {
  @scala.inline
  def apply(font: Font = null, text: String = null): dxPolarChartArgumentAxisStripsLabel = {
    val __obj = js.Dynamic.literal()
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartArgumentAxisStripsLabel]
  }
}

