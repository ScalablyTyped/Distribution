package typings.geolib.anon

import typings.geolib.typesMod.AltitudeKeys
import typings.geolib.typesMod.LatitudeKeys
import typings.geolib.typesMod.LongitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Altitude extends js.Object {
  var altitude: js.Array[AltitudeKeys]
  var latitude: js.Array[LatitudeKeys]
  var longitude: js.Array[LongitudeKeys]
}

object Altitude {
  @scala.inline
  def apply(
    altitude: js.Array[AltitudeKeys],
    latitude: js.Array[LatitudeKeys],
    longitude: js.Array[LongitudeKeys]
  ): Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Altitude]
  }
}

