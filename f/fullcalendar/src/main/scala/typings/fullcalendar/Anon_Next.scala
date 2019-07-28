package typings.fullcalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: String
  var nextYear: String
  var prev: String
  var prevYear: String
}

object Anon_Next {
  @scala.inline
  def apply(next: String, nextYear: String, prev: String, prevYear: String): Anon_Next = {
    val __obj = js.Dynamic.literal(next = next, nextYear = nextYear, prev = prev, prevYear = prevYear)
  
    __obj.asInstanceOf[Anon_Next]
  }
}

