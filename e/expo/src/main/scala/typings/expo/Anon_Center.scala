package typings.expo

import typings.expo.buildARMod.AnchorType.Plane
import typings.expo.buildARMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var center: Vector3
  var extent: Anon_Length
  var `type`: Plane
}

object Anon_Center {
  @scala.inline
  def apply(center: Vector3, extent: Anon_Length, `type`: Plane): Anon_Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Center]
  }
}

