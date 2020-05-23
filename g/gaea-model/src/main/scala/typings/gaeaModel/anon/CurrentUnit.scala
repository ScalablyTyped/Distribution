package typings.gaeaModel.anon

import typings.gaeaModel.FitGaea.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentUnit extends js.Object {
  var currentUnit: String
  var inputRange: js.UndefOr[js.Array[Double]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var outputRange: js.UndefOr[js.Array[Double]] = js.undefined
  var slider: js.UndefOr[Boolean] = js.undefined
  var speed: js.UndefOr[Double] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var units: js.Array[Number]
}

object CurrentUnit {
  @scala.inline
  def apply(
    currentUnit: String,
    units: js.Array[Number],
    inputRange: js.Array[Double] = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    outputRange: js.Array[Double] = null,
    slider: js.UndefOr[Boolean] = js.undefined,
    speed: js.UndefOr[Double] = js.undefined,
    step: js.UndefOr[Double] = js.undefined
  ): CurrentUnit = {
    val __obj = js.Dynamic.literal(currentUnit = currentUnit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    if (inputRange != null) __obj.updateDynamic("inputRange")(inputRange.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (outputRange != null) __obj.updateDynamic("outputRange")(outputRange.asInstanceOf[js.Any])
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider.get.asInstanceOf[js.Any])
    if (!js.isUndefined(speed)) __obj.updateDynamic("speed")(speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentUnit]
  }
}

