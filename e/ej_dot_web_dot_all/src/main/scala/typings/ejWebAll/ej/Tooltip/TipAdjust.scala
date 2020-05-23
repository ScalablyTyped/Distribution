package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TipAdjust extends js.Object {
  /** Sets horizontal gap between Tooltip and target element.
    * @Default {0}
    */
  var xValue: js.UndefOr[Double] = js.undefined
  /** Sets vertical gap between Tooltip and target element.
    * @Default {0}
    */
  var yValue: js.UndefOr[Double] = js.undefined
}

object TipAdjust {
  @scala.inline
  def apply(xValue: js.UndefOr[Double] = js.undefined, yValue: js.UndefOr[Double] = js.undefined): TipAdjust = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(xValue)) __obj.updateDynamic("xValue")(xValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(yValue)) __obj.updateDynamic("yValue")(yValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TipAdjust]
  }
}

