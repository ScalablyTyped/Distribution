package typings
package geometryDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPointInit extends js.Object {
  /**
    * w coordinate: 1
    */
  var w: js.UndefOr[scala.Double] = js.undefined
  /**
    * x coordinate: 0
    */
  var x: scala.Double
  /**
    * y coordinate: 0
    */
  var y: scala.Double
  /**
    * z coordinate: 0
    */
  var z: js.UndefOr[scala.Double] = js.undefined
}

object DOMPointInit {
  @scala.inline
  def apply(
    x: scala.Double,
    y: scala.Double,
    w: scala.Int | scala.Double = null,
    z: scala.Int | scala.Double = null
  ): DOMPointInit = {
    val __obj = js.Dynamic.literal(x = x, y = y)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMPointInit]
  }
}

