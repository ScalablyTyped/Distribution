package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidRangeColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ ValueValueText, String]] = js.undefined
  var font: js.UndefOr[typings.devextreme.mod.DevExpress.viz.Font] = js.undefined
  var format: js.UndefOr[typings.devextreme.mod.DevExpress.ui.format] = js.undefined
  var invalidRangeColor: js.UndefOr[String] = js.undefined
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  var placeholderHeight: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object InvalidRangeColor {
  @scala.inline
  def apply(
    color: String = null,
    customizeText: /* scaleValue */ ValueValueText => String = null,
    font: typings.devextreme.mod.DevExpress.viz.Font = null,
    format: format = null,
    invalidRangeColor: String = null,
    paddingLeftRight: js.UndefOr[Double] = js.undefined,
    paddingTopBottom: js.UndefOr[Double] = js.undefined,
    placeholderHeight: js.UndefOr[Double] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): InvalidRangeColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (invalidRangeColor != null) __obj.updateDynamic("invalidRangeColor")(invalidRangeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeftRight)) __obj.updateDynamic("paddingLeftRight")(paddingLeftRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTopBottom)) __obj.updateDynamic("paddingTopBottom")(paddingTopBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(placeholderHeight)) __obj.updateDynamic("placeholderHeight")(placeholderHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidRangeColor]
  }
}

