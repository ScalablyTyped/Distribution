package typings
package geometryDashDomLib.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMQuad extends js.Object {
  /**
    * the associated bounding rectangle of the quadrilateral
    */
  var bounds: DOMRectReadOnly
  /**
    * a DOMPoint that represents p1 of the quadrilateral
    */
  var p1: DOMPoint
  /**
    * a DOMPoint that represents p2 of the quadrilateral
    */
  var p2: DOMPoint
  /**
    * a DOMPoint that represents p3 of the quadrilateral
    */
  var p3: DOMPoint
  /**
    * a DOMPoint that represents p4 of the quadrilateral
    */
  var p4: DOMPoint
}

object DOMQuad {
  @scala.inline
  def apply(bounds: DOMRectReadOnly, p1: DOMPoint, p2: DOMPoint, p3: DOMPoint, p4: DOMPoint): DOMQuad = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("p1")(p1)
    __obj.updateDynamic("p2")(p2)
    __obj.updateDynamic("p3")(p3)
    __obj.updateDynamic("p4")(p4)
    __obj.asInstanceOf[DOMQuad]
  }
}

