package typings.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeChallenge extends js.Object {
  var codeChallenge: String
  var codeVerifier: String
}

object AnonCodeChallenge {
  @scala.inline
  def apply(codeChallenge: String, codeVerifier: String): AnonCodeChallenge = {
    val __obj = js.Dynamic.literal(codeChallenge = codeChallenge.asInstanceOf[js.Any], codeVerifier = codeVerifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodeChallenge]
  }
}

