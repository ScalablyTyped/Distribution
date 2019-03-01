package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesCustomLabelsPosition extends js.Object {
  /** Specifies the position x in customLabels
    * @Default {0}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the y in customLabels
    * @Default {0}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ScalesCustomLabelsPosition {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): ScalesCustomLabelsPosition = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesCustomLabelsPosition]
  }
}

