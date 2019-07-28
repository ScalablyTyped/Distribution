package typings.geometryDashDom.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMQuad extends js.Object {
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  var bounds: typings.geometryDashDom.GeometryDomNs.DOMRectReadOnly
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  var p1: typings.geometryDashDom.GeometryDomNs.DOMPoint
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  var p2: typings.geometryDashDom.GeometryDomNs.DOMPoint
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  var p3: typings.geometryDashDom.GeometryDomNs.DOMPoint
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  var p4: typings.geometryDashDom.GeometryDomNs.DOMPoint
}

object DOMQuad {
  @scala.inline
  def apply(
    bounds: typings.geometryDashDom.GeometryDomNs.DOMRectReadOnly,
    p1: typings.geometryDashDom.GeometryDomNs.DOMPoint,
    p2: typings.geometryDashDom.GeometryDomNs.DOMPoint,
    p3: typings.geometryDashDom.GeometryDomNs.DOMPoint,
    p4: typings.geometryDashDom.GeometryDomNs.DOMPoint
  ): DOMQuad = {
    val __obj = js.Dynamic.literal(bounds = bounds, p1 = p1, p2 = p2, p3 = p3, p4 = p4)
  
    __obj.asInstanceOf[DOMQuad]
  }
}

