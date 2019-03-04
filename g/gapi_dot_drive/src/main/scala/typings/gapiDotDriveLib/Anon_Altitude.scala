package typings
package gapiDotDriveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Altitude extends js.Object {
  var altitude: scala.Double
  var latitude: scala.Double
  var longitude: scala.Double
}

object Anon_Altitude {
  @scala.inline
  def apply(altitude: scala.Double, latitude: scala.Double, longitude: scala.Double): Anon_Altitude = {
    val __obj = js.Dynamic.literal(altitude = altitude, latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Anon_Altitude]
  }
}

