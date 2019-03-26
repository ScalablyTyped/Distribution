package typings
package geometryDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMPointReadOnly")
@js.native
class DOMPointReadOnly protected ()
  extends geometryDashDomLib.GeometryDomNs.DOMPointReadOnly {
  def this(x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double) = this()
  /**
    * w coordinate / readonly
    */
  /* CompleteClass */
  override var w: scala.Double = js.native
  /**
    * x coordinate / readonly
    */
  /* CompleteClass */
  override var x: scala.Double = js.native
  /**
    * y coordinate / readonly
    */
  /* CompleteClass */
  override var y: scala.Double = js.native
  /**
    * z coordinate / readonly
    */
  /* CompleteClass */
  override var z: scala.Double = js.native
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  /* CompleteClass */
  override def matrixTransform(matrix: geometryDashDomLib.GeometryDomNs.DOMMatrixReadOnly): geometryDashDomLib.GeometryDomNs.DOMPoint = js.native
}

@JSGlobal("DOMPointReadOnly")
@js.native
object DOMPointReadOnly
  extends org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      geometryDashDomLib.GeometryDomNs.DOMPointReadOnly
    ]

