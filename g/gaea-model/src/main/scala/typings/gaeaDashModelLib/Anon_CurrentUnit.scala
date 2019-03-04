package typings
package gaeaDashModelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CurrentUnit extends js.Object {
  var currentUnit: java.lang.String
  var inputRange: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var outputRange: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var slider: js.UndefOr[scala.Boolean] = js.undefined
  var speed: js.UndefOr[scala.Double] = js.undefined
  var step: js.UndefOr[scala.Double] = js.undefined
  var units: js.Array[gaeaDashModelLib.FitGaeaNs.Number]
}

object Anon_CurrentUnit {
  @scala.inline
  def apply(
    currentUnit: java.lang.String,
    units: js.Array[gaeaDashModelLib.FitGaeaNs.Number],
    inputRange: js.Array[scala.Double] = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    outputRange: js.Array[scala.Double] = null,
    slider: js.UndefOr[scala.Boolean] = js.undefined,
    speed: scala.Int | scala.Double = null,
    step: scala.Int | scala.Double = null
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

