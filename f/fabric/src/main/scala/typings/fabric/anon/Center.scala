package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Center extends js.Object {
  var center: js.Any
  var farthest: js.Any
  var nearest: js.Any
}

object Center {
  @scala.inline
  def apply(center: js.Any, farthest: js.Any, nearest: js.Any): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], farthest = farthest.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
}

