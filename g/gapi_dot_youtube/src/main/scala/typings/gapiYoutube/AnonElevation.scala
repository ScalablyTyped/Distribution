package typings.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElevation extends js.Object {
  /**
    * Altitude above the WGS 84 reference ellipsoid, in meters.
    */
  var elevation: Double
  /**
    * Latitude in degrees.
    */
  var latitude: Double
  /**
    * Longitude in degrees.
    */
  var longitude: Double
}

object AnonElevation {
  @scala.inline
  def apply(elevation: Double, latitude: Double, longitude: Double): AnonElevation = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElevation]
  }
}

