package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartCommonAxisSettingsConstantLineStyle extends js.Object {
  /** Specifies a color for a constant line. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies a dash style for a constant line. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** An object defining constant line label options. */
  var label: js.UndefOr[dxPolarChartCommonAxisSettingsConstantLineStyleLabel] = js.undefined
  /** Specifies a constant line width in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxPolarChartCommonAxisSettingsConstantLineStyle {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    label: dxPolarChartCommonAxisSettingsConstantLineStyleLabel = null,
    width: Int | Double = null
  ): dxPolarChartCommonAxisSettingsConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartCommonAxisSettingsConstantLineStyle]
  }
}

