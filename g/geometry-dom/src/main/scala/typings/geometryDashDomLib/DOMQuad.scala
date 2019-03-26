package typings
package geometryDashDomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DOMQuad")
@js.native
class DOMQuad ()
  extends geometryDashDomLib.GeometryDomNs.DOMQuad {
  def this(p1: DOMPointInit) = this()
  def this(rect: DOMRectInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit) = this()
  def this(p1: DOMPointInit, p2: DOMPointInit, p3: DOMPointInit, p4: DOMPointInit) = this()
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  /* CompleteClass */
  override var bounds: geometryDashDomLib.GeometryDomNs.DOMRectReadOnly = js.native
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  /* CompleteClass */
  override var p1: geometryDashDomLib.GeometryDomNs.DOMPoint = js.native
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  /* CompleteClass */
  override var p2: geometryDashDomLib.GeometryDomNs.DOMPoint = js.native
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  /* CompleteClass */
  override var p3: geometryDashDomLib.GeometryDomNs.DOMPoint = js.native
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  /* CompleteClass */
  override var p4: geometryDashDomLib.GeometryDomNs.DOMPoint = js.native
}

@JSGlobal("DOMQuad")
@js.native
object DOMQuad
  extends org.scalablytyped.runtime.Instantiable2[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      geometryDashDomLib.GeometryDomNs.DOMQuad
    ]
     with org.scalablytyped.runtime.Instantiable3[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      geometryDashDomLib.GeometryDomNs.DOMQuad
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* p1 */ DOMPointInit, 
      /* p2 */ DOMPointInit, 
      /* p3 */ DOMPointInit, 
      /* p4 */ DOMPointInit, 
      geometryDashDomLib.GeometryDomNs.DOMQuad
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* p1 */ DOMPointInit) | (/* rect */ DOMRectInit), 
      geometryDashDomLib.GeometryDomNs.DOMQuad
    ]
     with org.scalablytyped.runtime.Instantiable0[geometryDashDomLib.GeometryDomNs.DOMQuad]

