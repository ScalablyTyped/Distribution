package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elevation extends js.Object {
  /**
    * Altitude above the WGS 84 reference ellipsoid, in meters.
    */
  var elevation: scala.Double
  /**
    * Latitude in degrees.
    */
  var latitude: scala.Double
  /**
    * Longitude in degrees.
    */
  var longitude: scala.Double
}

object Anon_Elevation {
  @scala.inline
  def apply(elevation: scala.Double, latitude: scala.Double, longitude: scala.Double): Anon_Elevation = {
    val __obj = js.Dynamic.literal(elevation = elevation, latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Anon_Elevation]
  }
}

