package typings.googleMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPoints extends js.Object {
  var points: String
}

object AnonPoints {
  @scala.inline
  def apply(points: String): AnonPoints = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPoints]
  }
}

