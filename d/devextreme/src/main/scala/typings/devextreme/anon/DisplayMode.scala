package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.fixed
import typings.devextreme.devextremeStrings.high
import typings.devextreme.devextremeStrings.low
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.percent
import typings.devextreme.devextremeStrings.stdDeviation
import typings.devextreme.devextremeStrings.stdError
import typings.devextreme.devextremeStrings.variance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayMode extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var displayMode: js.UndefOr[auto | high | low | none] = js.undefined
  var edgeLength: js.UndefOr[Double] = js.undefined
  var highValueField: js.UndefOr[String] = js.undefined
  var lineWidth: js.UndefOr[Double] = js.undefined
  var lowValueField: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[fixed | percent | stdDeviation | stdError | variance] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object DisplayMode {
  @scala.inline
  def apply(
    color: String = null,
    displayMode: auto | high | low | none = null,
    edgeLength: js.UndefOr[Double] = js.undefined,
    highValueField: String = null,
    lineWidth: js.UndefOr[Double] = js.undefined,
    lowValueField: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    `type`: fixed | percent | stdDeviation | stdError | variance = null,
    value: js.UndefOr[Double] = js.undefined
  ): DisplayMode = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(edgeLength)) __obj.updateDynamic("edgeLength")(edgeLength.get.asInstanceOf[js.Any])
    if (highValueField != null) __obj.updateDynamic("highValueField")(highValueField.asInstanceOf[js.Any])
    if (!js.isUndefined(lineWidth)) __obj.updateDynamic("lineWidth")(lineWidth.get.asInstanceOf[js.Any])
    if (lowValueField != null) __obj.updateDynamic("lowValueField")(lowValueField.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMode]
  }
}

