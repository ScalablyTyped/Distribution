package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPoint extends DOMPointReadOnly

object DOMPoint {
  @scala.inline
  def apply(
    matrixTransform: js.Function1[DOMMatrixReadOnly, DOMPoint],
    w: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): DOMPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("matrixTransform")(matrixTransform)
    __obj.updateDynamic("w")(w)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[DOMPoint]
  }
}

