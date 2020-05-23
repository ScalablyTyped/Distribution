package typings.geolib.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Longitude extends js.Object {
  var latitude: Double
  var longitude: Double
}

object Longitude {
  @scala.inline
  def apply(latitude: Double, longitude: Double): Longitude = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Longitude]
  }
}

