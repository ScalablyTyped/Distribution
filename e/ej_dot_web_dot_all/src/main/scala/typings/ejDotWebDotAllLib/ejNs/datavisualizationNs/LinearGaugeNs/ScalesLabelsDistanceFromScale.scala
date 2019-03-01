package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalesLabelsDistanceFromScale extends js.Object {
  /** Specifies the xDistanceFromScale of labels.
    * @Default {-10}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the yDistanceFromScale of labels.
    * @Default {0}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ScalesLabelsDistanceFromScale {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): ScalesLabelsDistanceFromScale = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalesLabelsDistanceFromScale]
  }
}

