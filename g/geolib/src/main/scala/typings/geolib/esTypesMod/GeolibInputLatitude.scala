package typings.geolib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolibInputLatitude extends js.Object {
  var lat: js.UndefOr[GeolibLatitudeInputValue] = js.undefined
  var latitude: js.UndefOr[GeolibLatitudeInputValue] = js.undefined
}

object GeolibInputLatitude {
  @scala.inline
  def apply(lat: GeolibLatitudeInputValue = null, latitude: GeolibLatitudeInputValue = null): GeolibInputLatitude = {
    val __obj = js.Dynamic.literal()
    if (lat != null) __obj.updateDynamic("lat")(lat.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputLatitude]
  }
}

