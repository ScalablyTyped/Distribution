package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorsSourcePoint extends js.Object {
  /** Defines the x-coordinate of a position
    * @Default {0}
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /** Defines the y-coordinate of a position
    * @Default {0}
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ConnectorsSourcePoint {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): ConnectorsSourcePoint = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorsSourcePoint]
  }
}

