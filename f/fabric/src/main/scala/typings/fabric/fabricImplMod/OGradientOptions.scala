package typings.fabric.fabricImplMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OGradientOptions extends js.Object {
  var colorStops: js.UndefOr[StringDictionary[String]] = js.undefined
  var gradientTransform: js.UndefOr[js.Any] = js.undefined
  var r1: js.UndefOr[Double] = js.undefined
  var r2: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var x1: js.UndefOr[Double] = js.undefined
  var x2: js.UndefOr[Double] = js.undefined
  var y1: js.UndefOr[Double] = js.undefined
  var y2: js.UndefOr[Double] = js.undefined
}

object OGradientOptions {
  @scala.inline
  def apply(
    colorStops: StringDictionary[String] = null,
    gradientTransform: js.Any = null,
    r1: js.UndefOr[Double] = js.undefined,
    r2: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    x1: js.UndefOr[Double] = js.undefined,
    x2: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined,
    y2: js.UndefOr[Double] = js.undefined
  ): OGradientOptions = {
    val __obj = js.Dynamic.literal()
    if (colorStops != null) __obj.updateDynamic("colorStops")(colorStops.asInstanceOf[js.Any])
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(r1)) __obj.updateDynamic("r1")(r1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r2)) __obj.updateDynamic("r2")(r2.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y2)) __obj.updateDynamic("y2")(y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OGradientOptions]
  }
}

