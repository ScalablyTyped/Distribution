package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitVehicle extends js.Object {
  /** contains the URL for an icon associated with this vehicle type. */
  var icon: String
  /** contains the URL for the icon associated with this vehicle type, based on the local transport signage. */
  var local_icon: String
  /** contains the name of the vehicle on this line. eg. "Subway.". */
  var name: String
  /** contains the type of vehicle that runs on this line. */
  var `type`: VehicleType
}

object TransitVehicle {
  @scala.inline
  def apply(icon: String, local_icon: String, name: String, `type`: VehicleType): TransitVehicle = {
    val __obj = js.Dynamic.literal(icon = icon, local_icon = local_icon, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TransitVehicle]
  }
}

