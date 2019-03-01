package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesPosition extends js.Object {
  /** Specifies the Horizontal position
    * @Default {50}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the vertical position
    * @Default {50}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ScalesPosition {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): ScalesPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesPosition]
  }
}

