package typings.geolib

import typings.geolib.typesMod.GeolibInputLatitude
import typings.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLat extends GeolibInputLatitude {
  var lat: GeolibLatitudeInputValue
}

object AnonLat {
  @scala.inline
  def apply(lat: GeolibLatitudeInputValue): AnonLat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLat]
  }
}

