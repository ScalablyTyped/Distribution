package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lon extends GeolibInputLongitude {
  var lon: GeolibLongitudeInputValue
}

object Lon {
  @scala.inline
  def apply(lon: GeolibLongitudeInputValue): Lon = {
    val __obj = js.Dynamic.literal(lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lon]
  }
}

