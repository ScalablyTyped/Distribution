package typings.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCenter extends js.Object {
  var center: js.Any
  var farthest: js.Any
  var nearest: js.Any
}

object AnonCenter {
  @scala.inline
  def apply(center: js.Any, farthest: js.Any, nearest: js.Any): AnonCenter = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], farthest = farthest.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCenter]
  }
}

