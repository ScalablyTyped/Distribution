package typings.googleDashGax

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Auth extends js.Object {
  var auth: OAuth2Client
}

object Anon_Auth {
  @scala.inline
  def apply(auth: OAuth2Client): Anon_Auth = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Auth]
  }
}

