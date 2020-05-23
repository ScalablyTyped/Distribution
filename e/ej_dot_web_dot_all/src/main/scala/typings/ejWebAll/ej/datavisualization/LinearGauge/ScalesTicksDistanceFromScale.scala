package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesTicksDistanceFromScale extends js.Object {
  /** Specifies the xDistanceFromScale in the tick.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specifies the yDistanceFromScale in the tick.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesTicksDistanceFromScale {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ScalesTicksDistanceFromScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesTicksDistanceFromScale]
  }
}

