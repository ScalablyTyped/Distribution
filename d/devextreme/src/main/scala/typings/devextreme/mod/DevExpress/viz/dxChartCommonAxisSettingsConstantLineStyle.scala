package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.devextremeStrings.dash
import typings.devextreme.devextremeStrings.dot
import typings.devextreme.devextremeStrings.longDash
import typings.devextreme.devextremeStrings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartCommonAxisSettingsConstantLineStyle extends js.Object {
  /** Specifies the color of constant lines. */
  var color: js.UndefOr[String] = js.undefined
  /** Specifies the dash style of constant lines. */
  var dashStyle: js.UndefOr[dash | dot | longDash | solid] = js.undefined
  /** Configures constant line labels. */
  var label: js.UndefOr[dxChartCommonAxisSettingsConstantLineStyleLabel] = js.undefined
  /** Generates a pixel-measured empty space between the left/right side of a constant line and the constant line label. */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  /** Generates a pixel-measured empty space between the top/bottom side of a constant line and the constant line label. */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  /** Specifies the width of constant lines in pixels. */
  var width: js.UndefOr[Double] = js.undefined
}

object dxChartCommonAxisSettingsConstantLineStyle {
  @scala.inline
  def apply(
    color: String = null,
    dashStyle: dash | dot | longDash | solid = null,
    label: dxChartCommonAxisSettingsConstantLineStyleLabel = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    width: Int | Double = null
  ): dxChartCommonAxisSettingsConstantLineStyle = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartCommonAxisSettingsConstantLineStyle]
  }
}

