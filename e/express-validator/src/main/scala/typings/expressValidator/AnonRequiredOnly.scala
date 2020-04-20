package typings.expressValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequiredOnly extends js.Object {
  var requiredOnly: Boolean
}

object AnonRequiredOnly {
  @scala.inline
  def apply(requiredOnly: Boolean): AnonRequiredOnly = {
    val __obj = js.Dynamic.literal(requiredOnly = requiredOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRequiredOnly]
  }
}

