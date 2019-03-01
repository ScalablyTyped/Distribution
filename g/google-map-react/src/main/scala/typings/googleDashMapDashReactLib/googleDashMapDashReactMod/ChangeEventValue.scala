package typings
package googleDashMapDashReactLib.googleDashMapDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventValue extends js.Object {
  var bounds: Bounds
  var center: Coords
  var marginBounds: Bounds
  var size: Size
  var zoom: scala.Double
}

object ChangeEventValue {
  @scala.inline
  def apply(bounds: Bounds, center: Coords, marginBounds: Bounds, size: Size, zoom: scala.Double): ChangeEventValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bounds")(bounds)
    __obj.updateDynamic("center")(center)
    __obj.updateDynamic("marginBounds")(marginBounds)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("zoom")(zoom)
    __obj.asInstanceOf[ChangeEventValue]
  }
}

