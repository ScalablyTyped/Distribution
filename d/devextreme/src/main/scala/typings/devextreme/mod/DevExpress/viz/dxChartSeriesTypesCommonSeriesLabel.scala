package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.AnonColorDashStyle
import typings.devextreme.AnonColorVisible
import typings.devextreme.devextremeStrings.center
import typings.devextreme.devextremeStrings.inside
import typings.devextreme.devextremeStrings.left
import typings.devextreme.devextremeStrings.outside
import typings.devextreme.devextremeStrings.right
import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Configures point labels. */
trait dxChartSeriesTypesCommonSeriesLabel extends js.Object {
  /** Aligns point labels in relation to their points. */
  var alignment: js.UndefOr[center | left | right] = js.undefined
  /** Formats the point argument before it is displayed in the point label. To format the point value, use the format option. */
  var argumentFormat: js.UndefOr[format] = js.undefined
  /** Colors the point labels' background. The default color is inherited from the points. */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** Configures the borders of point labels. */
  var border: js.UndefOr[AnonColorDashStyle] = js.undefined
  /** Configures the label connectors. */
  var connector: js.UndefOr[AnonColorVisible] = js.undefined
  /** Customizes the text displayed by point labels. */
  var customizeText: js.UndefOr[js.Function1[/* pointInfo */ js.Any, String]] = js.undefined
  /** Specifies font options for point labels. */
  var font: js.UndefOr[Font] = js.undefined
  /** Formats the point value before it will be displayed in the point label. */
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Along with verticalOffset, shifts point labels from their initial positions. */
  var horizontalOffset: js.UndefOr[Double] = js.undefined
  /** Specifies whether to display point labels inside or outside of series points. Applies only to bubble, range-like and bar-like series. */
  var position: js.UndefOr[inside | outside] = js.undefined
  /** Rotates point labels. */
  var rotationAngle: js.UndefOr[Double] = js.undefined
  /** Specifies whether or not to show labels for points with zero value. Applies only to bar-like series. */
  var showForZeroValues: js.UndefOr[Boolean] = js.undefined
  /** Along with horizontalOffset, shifts point labels from their initial positions. */
  var verticalOffset: js.UndefOr[Double] = js.undefined
  /** Makes the point labels visible. */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object dxChartSeriesTypesCommonSeriesLabel {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    argumentFormat: format = null,
    backgroundColor: String = null,
    border: AnonColorDashStyle = null,
    connector: AnonColorVisible = null,
    customizeText: /* pointInfo */ js.Any => String = null,
    font: Font = null,
    format: format = null,
    horizontalOffset: Int | Double = null,
    position: inside | outside = null,
    rotationAngle: Int | Double = null,
    showForZeroValues: js.UndefOr[Boolean] = js.undefined,
    verticalOffset: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxChartSeriesTypesCommonSeriesLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (argumentFormat != null) __obj.updateDynamic("argumentFormat")(argumentFormat.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (connector != null) __obj.updateDynamic("connector")(connector.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (horizontalOffset != null) __obj.updateDynamic("horizontalOffset")(horizontalOffset.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(showForZeroValues)) __obj.updateDynamic("showForZeroValues")(showForZeroValues.asInstanceOf[js.Any])
    if (verticalOffset != null) __obj.updateDynamic("verticalOffset")(verticalOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartSeriesTypesCommonSeriesLabel]
  }
}

