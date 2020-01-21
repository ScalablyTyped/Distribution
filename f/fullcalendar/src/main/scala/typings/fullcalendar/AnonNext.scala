package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext extends js.Object {
  var next: String
  var nextYear: String
  var prev: String
  var prevYear: String
}

object AnonNext {
  @scala.inline
  def apply(next: String, nextYear: String, prev: String, prevYear: String): AnonNext = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], prevYear = prevYear.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNext]
  }
}

