package typings.expoDashLocation.buildExpoLocationDotWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var coords: Coordinates
  var timestamp: Double
}

object Position {
  @scala.inline
  def apply(coords: Coordinates, timestamp: Double): Position = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Position]
  }
}

