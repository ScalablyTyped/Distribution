package typings.expoLocation.mod

import typings.expoLocation.AnonAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationData extends js.Object {
  var coords: AnonAccuracy
  var timestamp: Double
}

object LocationData {
  @scala.inline
  def apply(coords: AnonAccuracy, timestamp: Double): LocationData = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
}

