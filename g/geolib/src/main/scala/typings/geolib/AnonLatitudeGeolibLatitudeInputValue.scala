package typings.geolib

import typings.geolib.typesMod.GeolibInputLatitude
import typings.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLatitudeGeolibLatitudeInputValue extends GeolibInputLatitude {
  var latitude: GeolibLatitudeInputValue
}

object AnonLatitudeGeolibLatitudeInputValue {
  @scala.inline
  def apply(latitude: GeolibLatitudeInputValue): AnonLatitudeGeolibLatitudeInputValue = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLatitudeGeolibLatitudeInputValue]
  }
}

