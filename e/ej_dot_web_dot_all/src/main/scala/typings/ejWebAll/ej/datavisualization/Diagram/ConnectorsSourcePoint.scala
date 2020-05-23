package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsSourcePoint extends js.Object {
  /** Defines the x-coordinate of a position
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** Defines the y-coordinate of a position
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ConnectorsSourcePoint {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ConnectorsSourcePoint = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsSourcePoint]
  }
}

