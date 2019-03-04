package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPointReadOnly extends js.Object {
  /**
    * w coordinate / readonly
    */
  var w: scala.Double
  /**
    * x coordinate / readonly
    */
  var x: scala.Double
  /**
    * y coordinate / readonly
    */
  var y: scala.Double
  /**
    * z coordinate / readonly
    */
  var z: scala.Double
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  def matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
}

object DOMPointReadOnly {
  @scala.inline
  def apply(
    matrixTransform: js.Function1[DOMMatrixReadOnly, DOMPoint],
    w: scala.Double,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): DOMPointReadOnly = {
    val __obj = js.Dynamic.literal(matrixTransform = matrixTransform, w = w, x = x, y = y, z = z)
  
    __obj.asInstanceOf[DOMPointReadOnly]
  }
}

