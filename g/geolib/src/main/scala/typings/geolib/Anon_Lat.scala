package typings.geolib

import typings.geolib.esTypesMod.GeolibInputLatitude
import typings.geolib.esTypesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lat extends GeolibInputLatitude {
  var lat: GeolibLatitudeInputValue
}

object Anon_Lat {
  @scala.inline
  def apply(lat: GeolibLatitudeInputValue): Anon_Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Lat]
  }
}

