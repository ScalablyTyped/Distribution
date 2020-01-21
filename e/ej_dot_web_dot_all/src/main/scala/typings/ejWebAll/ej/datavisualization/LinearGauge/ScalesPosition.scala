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
  def apply(x: Int | Double = null, y: Int | Double = null): ScalesPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPosition]
  }
}

