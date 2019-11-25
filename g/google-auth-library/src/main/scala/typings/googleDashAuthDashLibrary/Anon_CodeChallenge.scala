package typings.googleDashAuthDashLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeChallenge extends js.Object {
  var codeChallenge: String
  var codeVerifier: String
}

object Anon_CodeChallenge {
  @scala.inline
  def apply(codeChallenge: String, codeVerifier: String): Anon_CodeChallenge = {
    val __obj = js.Dynamic.literal(codeChallenge = codeChallenge.asInstanceOf[js.Any], codeVerifier = codeVerifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CodeChallenge]
  }
}

