package typings.firebaseInstallations.commonMod

import typings.firebaseInstallations.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends js.Object {
  var error: AnonCode
}

object ErrorResponse {
  @scala.inline
  def apply(error: AnonCode): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorResponse]
  }
}

