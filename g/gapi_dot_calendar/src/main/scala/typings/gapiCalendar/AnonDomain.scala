package typings.gapiCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var domain: String
  var reason: String
}

object AnonDomain {
  @scala.inline
  def apply(domain: String, reason: String): AnonDomain = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomain]
  }
}

