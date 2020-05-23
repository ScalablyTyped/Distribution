package typings.gapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authuser extends js.Object {
  var authuser: String
}

object Authuser {
  @scala.inline
  def apply(authuser: String): Authuser = {
    val __obj = js.Dynamic.literal(authuser = authuser.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authuser]
  }
}

