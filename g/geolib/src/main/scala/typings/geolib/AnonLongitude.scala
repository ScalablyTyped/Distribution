package typings.geolib

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLongitude extends GeolibInputLongitude {
  var longitude: GeolibLongitudeInputValue
}

object AnonLongitude {
  @scala.inline
  def apply(longitude: GeolibLongitudeInputValue): AnonLongitude = {
    val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLongitude]
  }
}

