package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lng extends GeolibInputLongitude {
  var lng: GeolibLongitudeInputValue
}

object Lng {
  @scala.inline
  def apply(lng: GeolibLongitudeInputValue): Lng = {
    val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lng]
  }
}

