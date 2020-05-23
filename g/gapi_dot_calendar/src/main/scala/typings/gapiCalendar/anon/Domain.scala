package typings.gapiCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Domain extends js.Object {
  var domain: String
  var reason: String
}

object Domain {
  @scala.inline
  def apply(domain: String, reason: String): Domain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
}

