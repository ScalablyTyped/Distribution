package typings.googleDashMapDashReact.googleDashMapDashReactMod

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
    val __obj = js.Dynamic.literal(bounds = bounds, center = center, marginBounds = marginBounds, size = size, zoom = zoom)
  
    __obj.asInstanceOf[ChangeEventValue]
  }
}

