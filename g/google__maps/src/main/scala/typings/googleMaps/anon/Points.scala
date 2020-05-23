package typings.googleMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points extends js.Object {
  var points: String
}

object Points {
  @scala.inline
  def apply(points: String): Points = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
}

