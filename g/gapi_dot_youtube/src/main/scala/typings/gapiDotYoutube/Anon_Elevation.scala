package typings.gapiDotYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elevation extends js.Object {
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

object Anon_Elevation {
  @scala.inline
  def apply(elevation: Double, latitude: Double, longitude: Double): Anon_Elevation = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Elevation]
  }
}

