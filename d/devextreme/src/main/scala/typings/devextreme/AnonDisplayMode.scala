package typings.devextreme

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

trait AnonDisplayMode extends js.Object {
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

object AnonDisplayMode {
  @scala.inline
  def apply(
    color: String = null,
    displayMode: auto | high | low | none = null,
    edgeLength: Int | Double = null,
    highValueField: String = null,
    lineWidth: Int | Double = null,
    lowValueField: String = null,
    opacity: Int | Double = null,
    `type`: fixed | percent | stdDeviation | stdError | variance = null,
    value: Int | Double = null
  ): AnonDisplayMode = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (edgeLength != null) __obj.updateDynamic("edgeLength")(edgeLength.asInstanceOf[js.Any])
    if (highValueField != null) __obj.updateDynamic("highValueField")(highValueField.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (lowValueField != null) __obj.updateDynamic("lowValueField")(lowValueField.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayMode]
  }
}

