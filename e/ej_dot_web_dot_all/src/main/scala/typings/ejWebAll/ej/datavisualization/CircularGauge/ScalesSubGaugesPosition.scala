package typings.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesSubGaugesPosition extends js.Object {
  /** Specify x-axis position for sub-gauge of circular gauge
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specify y-axis position for sub-gauge of circular gauge
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesSubGaugesPosition {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ScalesSubGaugesPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesSubGaugesPosition]
  }
}

