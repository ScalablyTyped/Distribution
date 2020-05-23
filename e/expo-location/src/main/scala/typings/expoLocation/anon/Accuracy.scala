package typings.expoLocation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accuracy extends js.Object {
  var accuracy: Double
  var altitude: Double
  var heading: Double
  var latitude: Double
  var longitude: Double
  var speed: Double
}

object Accuracy {
  @scala.inline
  def apply(
    accuracy: Double,
    altitude: Double,
    heading: Double,
    latitude: Double,
    longitude: Double,
    speed: Double
  ): Accuracy = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accuracy]
  }
}

