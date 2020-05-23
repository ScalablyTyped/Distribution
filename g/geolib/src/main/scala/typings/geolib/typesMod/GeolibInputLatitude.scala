package typings.geolib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.geolib.anon.Lat
  - typings.geolib.anon.LatitudeGeolibLatitudeInputValue
*/
trait GeolibInputLatitude extends js.Object

object GeolibInputLatitude {
  @scala.inline
  def Lat(lat: GeolibLatitudeInputValue): GeolibInputLatitude = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputLatitude]
  }
  @scala.inline
  def LatitudeGeolibLatitudeInputValue(latitude: GeolibLatitudeInputValue): GeolibInputLatitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputLatitude]
  }
}

