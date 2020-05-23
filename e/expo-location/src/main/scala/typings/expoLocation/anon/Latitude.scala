package typings.expoLocation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Latitude extends js.Object {
  var latitude: Double
  var longitude: Double
}

object Latitude {
  @scala.inline
  def apply(latitude: Double, longitude: Double): Latitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Latitude]
  }
}

