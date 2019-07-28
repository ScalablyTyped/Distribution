package typings.fundamentalDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  /* Value for aria-label on the next <a> element. */
  var next: String
  /* Value for aria-label on the previous <a> element. */
  var previous: String
}

object Anon_Next {
  @scala.inline
  def apply(next: String, previous: String): Anon_Next = {
    val __obj = js.Dynamic.literal(next = next, previous = previous)
  
    __obj.asInstanceOf[Anon_Next]
  }
}

