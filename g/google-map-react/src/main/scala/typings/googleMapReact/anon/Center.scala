package typings.googleMapReact.anon

import typings.googleMapReact.mod.Bounds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Center extends js.Object {
  var center: Lat
  var newBounds: Bounds
  var zoom: Double
}

object Center {
  @scala.inline
  def apply(center: Lat, newBounds: Bounds, zoom: Double): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], newBounds = newBounds.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
}

