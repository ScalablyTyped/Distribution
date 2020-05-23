package typings.expressValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequiredOnly extends js.Object {
  var requiredOnly: Boolean
}

object RequiredOnly {
  @scala.inline
  def apply(requiredOnly: Boolean): RequiredOnly = {
    val __obj = js.Dynamic.literal(requiredOnly = requiredOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredOnly]
  }
}

