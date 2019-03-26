package typings
package geometryDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMPoint")
@js.native
class DOMPoint ()
  extends geometryDashDomLib.GeometryDomNs.DOMPoint {
  def this(x: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double) = this()
  def this(x: scala.Double, y: scala.Double, z: scala.Double) = this()
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

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends org.scalablytyped.runtime.Instantiable0[geometryDashDomLib.GeometryDomNs.DOMPoint]
     with org.scalablytyped.runtime.Instantiable1[/* x */ scala.Double, geometryDashDomLib.GeometryDomNs.DOMPoint]
     with org.scalablytyped.runtime.Instantiable2[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      geometryDashDomLib.GeometryDomNs.DOMPoint
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      geometryDashDomLib.GeometryDomNs.DOMPoint
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      geometryDashDomLib.GeometryDomNs.DOMPoint
    ]

