package typings.googleGax.anon

import typings.googleAuthLibrary.mod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth extends js.Object {
  var auth: OAuth2Client
}

object Auth {
  @scala.inline
  def apply(auth: OAuth2Client): Auth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth]
  }
}

