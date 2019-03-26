package typings
package geometryDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMMatrix")
@js.native
class DOMMatrix ()
  extends geometryDashDomLib.GeometryDomNs.DOMMatrix {
  def this(array: js.Array[scala.Double]) = this()
  def this(other: geometryDashDomLib.GeometryDomNs.DOMMatrixReadOnly) = this()
  def this(transformList: java.lang.String) = this()
  def this(a: scala.Double, b: scala.Double, c: scala.Double, d: scala.Double, e: scala.Double, f: scala.Double) = this()
}

@JSGlobal("DOMMatrix")
@js.native
object DOMMatrix
  extends org.scalablytyped.runtime.Instantiable0[geometryDashDomLib.GeometryDomNs.DOMMatrix]
     with org.scalablytyped.runtime.Instantiable6[
      /* a */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      /* d */ scala.Double, 
      /* e */ scala.Double, 
      /* f */ scala.Double, 
      geometryDashDomLib.GeometryDomNs.DOMMatrix
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* array */ js.Array[scala.Double]) | (/* other */ geometryDashDomLib.GeometryDomNs.DOMMatrixReadOnly) | (/* transformList */ java.lang.String), 
      geometryDashDomLib.GeometryDomNs.DOMMatrix
    ]

