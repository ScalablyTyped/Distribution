package typings.gaeaDashModel

import typings.gaeaDashModel.FitGaea.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentUnit extends js.Object {
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

object Anon_CurrentUnit {
  @scala.inline
  def apply(
    currentUnit: String,
    units: js.Array[Number],
    inputRange: js.Array[Double] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    outputRange: js.Array[Double] = null,
    slider: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    step: Int | Double = null
  ): Anon_CurrentUnit = {
    val __obj = js.Dynamic.literal(currentUnit = currentUnit, units = units)
    if (inputRange != null) __obj.updateDynamic("inputRange")(inputRange)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (outputRange != null) __obj.updateDynamic("outputRange")(outputRange)
    if (!js.isUndefined(slider)) __obj.updateDynamic("slider")(slider)
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CurrentUnit]
  }
}

