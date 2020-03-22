package typings.devextreme

import typings.devextreme.devextremeStrings.driving
import typings.devextreme.devextremeStrings.walking
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColor extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var locations: js.UndefOr[js.Array[_]] = js.undefined
  var mode: js.UndefOr[driving | walking] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var weight: js.UndefOr[Double] = js.undefined
}

object AnonColor {
  @scala.inline
  def apply(
    color: String = null,
    locations: js.Array[_] = null,
    mode: driving | walking = null,
    opacity: Int | Double = null,
    weight: Int | Double = null
  ): AnonColor = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColor]
  }
}

