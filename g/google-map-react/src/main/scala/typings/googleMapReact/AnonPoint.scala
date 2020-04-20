package typings.googleMapReact

import typings.googleMapReact.mod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPoint extends js.Object {
  var point: Point
}

object AnonPoint {
  @scala.inline
  def apply(point: Point): AnonPoint = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPoint]
  }
}

