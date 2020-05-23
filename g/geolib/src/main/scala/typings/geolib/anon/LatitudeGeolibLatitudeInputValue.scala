package typings.geolib.anon

import typings.geolib.typesMod.GeolibInputLatitude
import typings.geolib.typesMod.GeolibLatitudeInputValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatitudeGeolibLatitudeInputValue extends GeolibInputLatitude {
  var latitude: GeolibLatitudeInputValue
}

object LatitudeGeolibLatitudeInputValue {
  @scala.inline
  def apply(latitude: GeolibLatitudeInputValue): LatitudeGeolibLatitudeInputValue = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatitudeGeolibLatitudeInputValue]
  }
}

