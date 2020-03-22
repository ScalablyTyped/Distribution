package typings.devextreme

import typings.devextreme.mod.DevExpress.ui.format
import typings.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalidRangeColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ AnonValueValueText, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var invalidRangeColor: js.UndefOr[String] = js.undefined
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  var placeholderHeight: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonInvalidRangeColor {
  @scala.inline
  def apply(
    color: String = null,
    customizeText: /* scaleValue */ AnonValueValueText => String = null,
    font: Font = null,
    format: format = null,
    invalidRangeColor: String = null,
    paddingLeftRight: Int | Double = null,
    paddingTopBottom: Int | Double = null,
    placeholderHeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonInvalidRangeColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (invalidRangeColor != null) __obj.updateDynamic("invalidRangeColor")(invalidRangeColor.asInstanceOf[js.Any])
    if (paddingLeftRight != null) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.asInstanceOf[js.Any])
    if (paddingTopBottom != null) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.asInstanceOf[js.Any])
    if (placeholderHeight != null) __obj.updateDynamic("placeholderHeight")(placeholderHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalidRangeColor]
  }
}

