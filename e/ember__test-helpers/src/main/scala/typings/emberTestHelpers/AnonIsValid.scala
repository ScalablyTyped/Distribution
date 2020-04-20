package typings.emberTestHelpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsValid extends js.Object {
  var isValid: Boolean
  var message: String
}

object AnonIsValid {
  @scala.inline
  def apply(isValid: Boolean, message: String): AnonIsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsValid]
  }
}

