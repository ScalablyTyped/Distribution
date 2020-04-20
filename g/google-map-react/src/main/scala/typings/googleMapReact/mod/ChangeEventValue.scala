package typings.googleMapReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventValue extends js.Object {
  var bounds: Bounds
  var center: Coords
  var marginBounds: Bounds
  var size: Size
  var zoom: Double
}

object ChangeEventValue {
  @scala.inline
  def apply(bounds: Bounds, center: Coords, marginBounds: Bounds, size: Size, zoom: Double): ChangeEventValue = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], marginBounds = marginBounds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventValue]
  }
}

