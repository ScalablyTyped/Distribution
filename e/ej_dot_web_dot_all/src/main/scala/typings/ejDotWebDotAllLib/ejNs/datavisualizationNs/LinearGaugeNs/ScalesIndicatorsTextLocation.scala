package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesIndicatorsTextLocation extends js.Object {
  /** Specifies the textLocation position in bar indicators
    * @Default {0}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the Y position in bar indicators
    * @Default {0}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ScalesIndicatorsTextLocation {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): ScalesIndicatorsTextLocation = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesIndicatorsTextLocation]
  }
}

