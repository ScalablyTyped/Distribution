package typings.emberTestHelpers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsValid extends js.Object {
  var isValid: Boolean
  var message: String
}

object IsValid {
  @scala.inline
  def apply(isValid: Boolean, message: String): IsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsValid]
  }
}

