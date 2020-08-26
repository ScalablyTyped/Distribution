package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitVehicle extends js.Object {
  /** contains the URL for an icon associated with this vehicle type. */
  var icon: String = js.native
  /** contains the URL for the icon associated with this vehicle type, based on the local transport signage. */
  var local_icon: String = js.native
  /** contains the name of the vehicle on this line. eg. "Subway.". */
  var name: String = js.native
  /** contains the type of vehicle that runs on this line. */
  var `type`: VehicleType = js.native
}

object TransitVehicle {
  @scala.inline
  def apply(icon: String, local_icon: String, name: String, `type`: VehicleType): TransitVehicle = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], local_icon = local_icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitVehicle]
  }
  @scala.inline
  implicit class TransitVehicleOps[Self <: TransitVehicle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocal_icon(value: String): Self = this.set("local_icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: VehicleType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

