package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPoint extends DOMPointReadOnly

object DOMPoint {
  @scala.inline
  def apply(
    matrixTransform: DOMMatrixReadOnly => DOMPoint,
    w: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): DOMPoint = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w, x = x, y = y, z = z)
  
    __obj.asInstanceOf[DOMPoint]
  }
}

