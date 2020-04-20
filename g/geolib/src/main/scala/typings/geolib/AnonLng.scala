package typings.geolib

import typings.geolib.typesMod.GeolibInputLongitude
import typings.geolib.typesMod.GeolibLongitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLng extends GeolibInputLongitude {
  var lng: GeolibLongitudeInputValue
}

object AnonLng {
  @scala.inline
  def apply(lng: GeolibLongitudeInputValue): AnonLng = {
    val __obj = js.Dynamic.literal(lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLng]
  }
}

