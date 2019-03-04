package typings
package atGoogleMapsLib.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatLngLiteralVerbose extends _LatLng {
  var latitude: scala.Double
  var longitude: scala.Double
}

object LatLngLiteralVerbose {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double): LatLngLiteralVerbose = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[LatLngLiteralVerbose]
  }
}

