package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngLiteralVerbose extends _LatLng {
  var latitude: Double
  var longitude: Double
}

object LatLngLiteralVerbose {
  @scala.inline
  def apply(latitude: Double, longitude: Double): LatLngLiteralVerbose = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LatLngLiteralVerbose]
  }
}

