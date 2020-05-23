package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLatitude
import typings.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lat extends GeolibInputLatitude {
  var lat: GeolibLatitudeInputValue
}

object Lat {
  @scala.inline
  def apply(lat: GeolibLatitudeInputValue): Lat = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lat]
  }
}

