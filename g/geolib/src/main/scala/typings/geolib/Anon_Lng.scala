package typings.geolib

import typings.geolib.esTypesMod.GeolibInputLongitude
import typings.geolib.esTypesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Lng extends GeolibInputLongitude {
  var lng: GeolibLongitudeInputValue
}

object Anon_Lng {
  @scala.inline
  def apply(lng: GeolibLongitudeInputValue): Anon_Lng = {
    val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Lng]
  }
}

