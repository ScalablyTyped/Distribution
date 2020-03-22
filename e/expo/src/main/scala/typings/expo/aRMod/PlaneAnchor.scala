package typings.expo.aRMod

import typings.expo.AnonLength
import typings.expo.aRMod.AnchorType.Plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined expo.expo/build/AR.BaseAnchor & {  type  :expo.expo/build/AR.AnchorType.Plane,   center  :expo.expo/build/AR.Vector3,   extent  :{  width  :number,   length  :number}} */
trait PlaneAnchor extends Anchor {
  var center: Vector3
  var extent: AnonLength
  var id: String
  var transform: Matrix
  var `type`: AnchorType with Plane
}

object PlaneAnchor {
  @scala.inline
  def apply(center: Vector3, extent: AnonLength, id: String, transform: Matrix, `type`: AnchorType with Plane): PlaneAnchor = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaneAnchor]
  }
}

