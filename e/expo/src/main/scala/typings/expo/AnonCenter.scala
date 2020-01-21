package typings.expo

import typings.expo.aRMod.AnchorType.Plane
import typings.expo.aRMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var center: Vector3
  var extent: AnonLength
  var `type`: Plane
}

object AnonCenter {
  @scala.inline
  def apply(center: Vector3, extent: AnonLength, `type`: Plane): AnonCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenter]
  }
}

