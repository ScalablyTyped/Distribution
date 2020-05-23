package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGradientOptionsCoords extends js.Object {
  var r1: js.UndefOr[Double] = js.undefined
  var r2: js.UndefOr[Double] = js.undefined
  var x1: js.UndefOr[Double] = js.undefined
  var x2: js.UndefOr[Double] = js.undefined
  var y1: js.UndefOr[Double] = js.undefined
  var y2: js.UndefOr[Double] = js.undefined
}

object IGradientOptionsCoords {
  @scala.inline
  def apply(
    r1: js.UndefOr[Double] = js.undefined,
    r2: js.UndefOr[Double] = js.undefined,
    x1: js.UndefOr[Double] = js.undefined,
    x2: js.UndefOr[Double] = js.undefined,
    y1: js.UndefOr[Double] = js.undefined,
    y2: js.UndefOr[Double] = js.undefined
  ): IGradientOptionsCoords = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(r1)) __obj.updateDynamic("r1")(r1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(r2)) __obj.updateDynamic("r2")(r2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x1)) __obj.updateDynamic("x1")(x1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(x2)) __obj.updateDynamic("x2")(x2.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y1)) __obj.updateDynamic("y1")(y1.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y2)) __obj.updateDynamic("y2")(y2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGradientOptionsCoords]
  }
}

