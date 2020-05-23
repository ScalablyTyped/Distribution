package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsPosition extends js.Object {
  /** Specify x-axis of position of circular gauge
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specify y-axis of position of circular gauge
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesIndicatorsPosition {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ScalesIndicatorsPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicatorsPosition]
  }
}

