package typings.geolib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Latitude extends js.Object {
  var latitude: Double
  var longitude: Double
}

object Anon_Latitude {
  @scala.inline
  def apply(latitude: Double, longitude: Double): Anon_Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude, longitude = longitude)
  
    __obj.asInstanceOf[Anon_Latitude]
  }
}

