package typings.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _LatLng extends js.Object
object _LatLng {
  
  @scala.inline
  def LatLngLiteral(lat: Double, lng: Double): _LatLng = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LatLng]
  }
  
  @scala.inline
  def LatLngLiteralVerbose(latitude: Double, longitude: Double): _LatLng = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[_LatLng]
  }
}
