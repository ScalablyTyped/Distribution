package typings
package geolibLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolibInputLongitude extends js.Object {
  var lng: js.UndefOr[GeolibLongitudeInputValue] = js.undefined
  var lon: js.UndefOr[GeolibLongitudeInputValue] = js.undefined
  var longitude: js.UndefOr[GeolibLongitudeInputValue] = js.undefined
}

object GeolibInputLongitude {
  @scala.inline
  def apply(
    lng: GeolibLongitudeInputValue = null,
    lon: GeolibLongitudeInputValue = null,
    longitude: GeolibLongitudeInputValue = null
  ): GeolibInputLongitude = {
    val __obj = js.Dynamic.literal()
    if (lng != null) __obj.updateDynamic("lng")(lng.asInstanceOf[js.Any])
    if (lon != null) __obj.updateDynamic("lon")(lon.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputLongitude]
  }
}

