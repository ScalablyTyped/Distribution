package typings.geometryDashDom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMPoint")
@js.native
class DOMPoint ()
  extends typings.geometryDashDom.GeometryDom.DOMPoint {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  /**
    * w coordinate / readonly
    */
  /* CompleteClass */
  override var w: Double = js.native
  /**
    * x coordinate / readonly
    */
  /* CompleteClass */
  override var x: Double = js.native
  /**
    * y coordinate / readonly
    */
  /* CompleteClass */
  override var y: Double = js.native
  /**
    * z coordinate / readonly
    */
  /* CompleteClass */
  override var z: Double = js.native
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  /* CompleteClass */
  override def matrixTransform(matrix: typings.geometryDashDom.GeometryDom.DOMMatrixReadOnly): typings.geometryDashDom.GeometryDom.DOMPoint = js.native
}

@JSGlobal("DOMPoint")
@js.native
object DOMPoint
  extends Instantiable0[typings.geometryDashDom.GeometryDom.DOMPoint]
     with Instantiable1[/* x */ Double, typings.geometryDashDom.GeometryDom.DOMPoint]
     with Instantiable2[/* x */ Double, /* y */ Double, typings.geometryDashDom.GeometryDom.DOMPoint]
     with Instantiable3[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      typings.geometryDashDom.GeometryDom.DOMPoint
    ]
     with Instantiable4[
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      typings.geometryDashDom.GeometryDom.DOMPoint
    ]

