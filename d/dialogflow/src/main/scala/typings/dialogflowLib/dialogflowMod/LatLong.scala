package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLong extends js.Object {
  var latitude: scala.Double
  var longitude: scala.Double
}

object LatLong {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): LatLong = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.asInstanceOf[LatLong]
  }
}

