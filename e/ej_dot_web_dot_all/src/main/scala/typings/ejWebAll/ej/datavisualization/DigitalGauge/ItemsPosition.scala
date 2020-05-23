package typings.ejWebAll.ej.datavisualization.DigitalGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsPosition extends js.Object {
  /** Set the horizontal location for the text, where it needs to be placed within the gauge.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Set the vertical location for the text, where it needs to be placed within the gauge.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ItemsPosition {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ItemsPosition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsPosition]
  }
}

