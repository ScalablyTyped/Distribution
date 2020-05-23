package typings.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Center extends js.Object {
  var center: String
  var left: String
  var right: String
}

object Center {
  @scala.inline
  def apply(center: String, left: String, right: String): Center = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Center]
  }
}

