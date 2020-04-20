package typings.gapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuthuser extends js.Object {
  var authuser: String
}

object AnonAuthuser {
  @scala.inline
  def apply(authuser: String): AnonAuthuser = {
    val __obj = js.Dynamic.literal(authuser = authuser.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAuthuser]
  }
}

