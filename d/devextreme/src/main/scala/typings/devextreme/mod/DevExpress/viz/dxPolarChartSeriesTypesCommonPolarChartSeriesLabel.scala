package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorDashStyle
import typings.devextreme.AnonColorVisible
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartSeriesTypesCommonPolarChartSeriesLabel extends js.Object {
  /** Formats the point argument before it is displayed in the point label. To format the point value, use the format option. */
  var argumentFormat: js.UndefOr[format] = js.undefined
  /** Colors the point labels' background. The default color is inherited from the points. */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Specifies border options for point labels. */
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  /** Specifies connector options for series point labels. */
  var connector: js.UndefOr[AnonColorVisible] = js.undefined
  /** Specifies a callback function that returns the text to be displayed by point labels. */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.undefined
  /** Specifies font options for the text displayed in point labels. */
  var font: js.UndefOr[Font] = js.undefined
  /** Formats a value before it is displayed in a point label. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Specifies a label position in bar-like series. */
  var position: js.UndefOr[inside | outside] = js.undefined
  /** Specifies the angle used to rotate point labels from their initial position. */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  /** Specifies whether or not to show a label when the point has a zero value. */
  var showForZeroValues: js.UndefOr[Boolean] = js.undefined
  /** Specifies the visibility of point labels. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxPolarChartSeriesTypesCommonPolarChartSeriesLabel {
  @scala.inline
  def apply(
    argumentFormat: format = null,
    backgroundColor: String = null,
    border: AnonColorDashStyle = null,
    connector: AnonColorVisible = null,
    customizeText: /* pointInfo */ js.Any => String = null,
    font: Font = null,
    format: format = null,
    position: inside | outside = null,
    rotationAngle: Int | Double = null,
    showForZeroValues: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartSeriesTypesCommonPolarChartSeriesLabel = {
    val __obj = js.Dynamic.literal()
    if (argumentFormat != null) __obj.updateDynamic("argumentFormat")(argumentFormat.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(showForZeroValues)) __obj.updateDynamic("showForZeroValues")(showForZeroValues.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartSeriesTypesCommonPolarChartSeriesLabel]
  }
}

