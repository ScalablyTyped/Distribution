package typings
package googleDashAuthDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeChallenge extends js.Object {
  var codeChallenge: java.lang.String
  var codeVerifier: java.lang.String
}

object Anon_CodeChallenge {
  @scala.inline
  def apply(codeChallenge: java.lang.String, codeVerifier: java.lang.String): Anon_CodeChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codeChallenge")(codeChallenge)
    __obj.updateDynamic("codeVerifier")(codeVerifier)
    __obj.asInstanceOf[Anon_CodeChallenge]
  }
}

