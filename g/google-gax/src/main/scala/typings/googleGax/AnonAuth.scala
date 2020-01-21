package typings.googleGax

import typings.googleAuthLibrary.mod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAuth extends js.Object {
  var auth: OAuth2Client
}

object AnonAuth {
  @scala.inline
  def apply(auth: OAuth2Client): AnonAuth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAuth]
  }
}

