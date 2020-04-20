package typings.googleMapReact

import typings.googleMapReact.mod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var center: AnonMetersPerLatDegree
  var newBounds: Bounds
  var zoom: Double
}

object AnonCenter {
  @scala.inline
  def apply(center: AnonMetersPerLatDegree, newBounds: Bounds, zoom: Double): AnonCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], newBounds = newBounds.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCenter]
  }
}

