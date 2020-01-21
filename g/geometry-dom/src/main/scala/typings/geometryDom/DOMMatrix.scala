package typings.geometryDom

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMMatrix")
@js.native
class DOMMatrix ()
  extends typings.geometryDom.GeometryDom.DOMMatrix {
  def this(array: js.Array[Double]) = this()
  def this(other: typings.geometryDom.GeometryDom.DOMMatrixReadOnly) = this()
  def this(transformList: String) = this()
  def this(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double) = this()
}

@JSGlobal("DOMMatrix")
@js.native
object DOMMatrix
  extends Instantiable0[typings.geometryDom.GeometryDom.DOMMatrix]
     with Instantiable1[
      (/* array */ js.Array[Double]) | (/* other */ typings.geometryDom.GeometryDom.DOMMatrixReadOnly) | (/* transformList */ String), 
      typings.geometryDom.GeometryDom.DOMMatrix
    ]
     with Instantiable6[
      /* a */ Double, 
      /* b */ Double, 
      /* c */ Double, 
      /* d */ Double, 
      /* e */ Double, 
      /* f */ Double, 
      typings.geometryDom.GeometryDom.DOMMatrix
    ]

