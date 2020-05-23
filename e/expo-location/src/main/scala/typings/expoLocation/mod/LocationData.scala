package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationData extends js.Object {
  var coords: typings.expoLocation.anon.Accuracy
  var timestamp: Double
}

object LocationData {
  @scala.inline
  def apply(coords: typings.expoLocation.anon.Accuracy, timestamp: Double): LocationData = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationData]
  }
}

