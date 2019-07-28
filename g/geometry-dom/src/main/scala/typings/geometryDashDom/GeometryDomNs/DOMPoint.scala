package typings.geometryDashDom.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPoint
  extends typings.geometryDashDom.GeometryDomNs.DOMPointReadOnly

object DOMPoint {
  @scala.inline
  def apply(
    matrixTransform: typings.geometryDashDom.GeometryDomNs.DOMMatrixReadOnly => typings.geometryDashDom.GeometryDomNs.DOMPoint,
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): DOMPoint = {
    val __obj = js.Dynamic.literal(matrixTransform = js.Any.fromFunction1(matrixTransform), w = w, x = x, y = y, z = z)
  
    __obj.asInstanceOf[DOMPoint]
  }
}

