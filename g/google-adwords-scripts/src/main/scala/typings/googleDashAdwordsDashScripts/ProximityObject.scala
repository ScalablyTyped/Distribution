package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProximityObject extends js.Object {
  var address: js.UndefOr[AddressObject] = js.undefined
  var bidModifier: js.UndefOr[Double] = js.undefined
  var latitude: Double
  var longitude: Double
  var radius: Double
  var radiusUnits: RadiusUnits
}

object ProximityObject {
  @scala.inline
  def apply(
    latitude: Double,
    longitude: Double,
    radius: Double,
    radiusUnits: RadiusUnits,
    address: AddressObject = null,
    bidModifier: Int | Double = null
  ): ProximityObject = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], radiusUnits = radiusUnits.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (bidModifier != null) __obj.updateDynamic("bidModifier")(bidModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityObject]
  }
}

