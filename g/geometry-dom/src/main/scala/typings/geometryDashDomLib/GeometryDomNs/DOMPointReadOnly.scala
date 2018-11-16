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

