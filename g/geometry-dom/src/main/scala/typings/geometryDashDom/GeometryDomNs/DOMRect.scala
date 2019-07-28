package typings.geometryDashDom.GeometryDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRect
  extends typings.geometryDashDom.GeometryDomNs.DOMRectReadOnly

object DOMRect {
  @scala.inline
  def apply(
    bottom: Double,
    height: Double,
    left: Double,
    right: Double,
    top: Double,
    width: Double,
    x: Double,
    y: Double
  ): DOMRect = {
    val __obj = js.Dynamic.literal(bottom = bottom, height = height, left = left, right = right, top = top, width = width, x = x, y = y)
  
    __obj.asInstanceOf[DOMRect]
  }
}

