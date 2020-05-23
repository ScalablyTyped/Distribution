package typings.geometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPointInit extends js.Object {
  /**
    * w coordinate: 1
    */
  var w: js.UndefOr[Double] = js.undefined
  /**
    * x coordinate: 0
    */
  var x: Double
  /**
    * y coordinate: 0
    */
  var y: Double
  /**
    * z coordinate: 0
    */
  var z: js.UndefOr[Double] = js.undefined
}

object DOMPointInit {
  @scala.inline
  def apply(x: Double, y: Double, w: js.UndefOr[Double] = js.undefined, z: js.UndefOr[Double] = js.undefined): DOMPointInit = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    if (!js.isUndefined(z)) __obj.updateDynamic("z")(z.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMPointInit]
  }
}

