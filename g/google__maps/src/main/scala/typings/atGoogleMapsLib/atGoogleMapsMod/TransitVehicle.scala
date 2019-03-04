package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitVehicle extends js.Object {
  /** contains the URL for an icon associated with this vehicle type. */
  var icon: java.lang.String
  /** contains the URL for the icon associated with this vehicle type, based on the local transport signage. */
  var local_icon: java.lang.String
  /** contains the name of the vehicle on this line. eg. "Subway.". */
  var name: java.lang.String
  /** contains the type of vehicle that runs on this line. */
  var `type`: VehicleType
}

object TransitVehicle {
  @scala.inline
  def apply(icon: java.lang.String, local_icon: java.lang.String, name: java.lang.String, `type`: VehicleType): TransitVehicle = {
    val __obj = js.Dynamic.literal(icon = icon, local_icon = local_icon, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TransitVehicle]
  }
}

