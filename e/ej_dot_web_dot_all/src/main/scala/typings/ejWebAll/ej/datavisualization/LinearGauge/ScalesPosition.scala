package typings.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPosition extends js.Object {
  /** Specifies the Horizontal position
    * @Default {50}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Specifies the vertical position
    * @Default {50}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ScalesPosition {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ScalesPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPosition]
  }
}

