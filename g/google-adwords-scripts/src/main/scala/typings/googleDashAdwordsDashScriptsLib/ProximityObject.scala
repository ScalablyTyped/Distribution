package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProximityObject extends js.Object {
  var address: js.UndefOr[AddressObject] = js.undefined
  var bidModifier: js.UndefOr[scala.Double] = js.undefined
  var latitude: scala.Double
  var longitude: scala.Double
  var radius: scala.Double
  var radiusUnits: RadiusUnits
}

object ProximityObject {
  @scala.inline
  def apply(
    latitude: scala.Double,
    longitude: scala.Double,
    radius: scala.Double,
    radiusUnits: RadiusUnits,
    address: AddressObject = null,
    bidModifier: scala.Int | scala.Double = null
  ): ProximityObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("radiusUnits")(radiusUnits)
    if (address != null) __obj.updateDynamic("address")(address)
    if (bidModifier != null) __obj.updateDynamic("bidModifier")(bidModifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximityObject]
  }
}

