package typings.fullcalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextYear extends js.Object {
  var next: String
  var nextYear: String
  var prev: String
  var prevYear: String
}

object NextYear {
  @scala.inline
  def apply(next: String, nextYear: String, prev: String, prevYear: String): NextYear = {
    val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any], nextYear = nextYear.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any], prevYear = prevYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextYear]
  }
}

