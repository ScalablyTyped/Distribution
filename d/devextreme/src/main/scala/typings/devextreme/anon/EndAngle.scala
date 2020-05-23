package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndAngle extends js.Object {
  var endAngle: js.UndefOr[Double] = js.undefined
  var startAngle: js.UndefOr[Double] = js.undefined
}

object EndAngle {
  @scala.inline
  def apply(endAngle: js.UndefOr[Double] = js.undefined, startAngle: js.UndefOr[Double] = js.undefined): EndAngle = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(endAngle)) __obj.updateDynamic("endAngle")(endAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAngle)) __obj.updateDynamic("startAngle")(startAngle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndAngle]
  }
}

