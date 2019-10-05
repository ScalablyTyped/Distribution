package typings.geometryDashDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMQuad extends js.Object {
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  var bounds: typings.geometryDashDom.GeometryDom.DOMRectReadOnly
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  var p1: typings.geometryDashDom.GeometryDom.DOMPoint
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  var p2: typings.geometryDashDom.GeometryDom.DOMPoint
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  var p3: typings.geometryDashDom.GeometryDom.DOMPoint
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  var p4: typings.geometryDashDom.GeometryDom.DOMPoint
}

object DOMQuad {
  @scala.inline
  def apply(
    bounds: typings.geometryDashDom.GeometryDom.DOMRectReadOnly,
    p1: typings.geometryDashDom.GeometryDom.DOMPoint,
    p2: typings.geometryDashDom.GeometryDom.DOMPoint,
    p3: typings.geometryDashDom.GeometryDom.DOMPoint,
    p4: typings.geometryDashDom.GeometryDom.DOMPoint
  ): DOMQuad = {
    val __obj = js.Dynamic.literal(bounds = bounds, p1 = p1, p2 = p2, p3 = p3, p4 = p4)
  
    __obj.asInstanceOf[DOMQuad]
  }
}

