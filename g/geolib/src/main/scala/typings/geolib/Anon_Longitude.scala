package typings.geolib

import typings.geolib.esTypesMod.GeolibInputLongitude
import typings.geolib.esTypesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Longitude extends GeolibInputLongitude {
  var longitude: GeolibLongitudeInputValue
}

object Anon_Longitude {
  @scala.inline
  def apply(longitude: GeolibLongitudeInputValue): Anon_Longitude = {
    val __obj = js.Dynamic.literal(longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Longitude]
  }
}

