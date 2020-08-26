package typings.googleAuthLibrary.iamMod

import typings.googleAuthLibrary.anon.Xgoogiamauthorityselector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-auth-library/build/src/auth/iam", "IAMAuth")
@js.native
class IAMAuth protected () extends js.Object {
  /**
    * IAM credentials.
    *
    * @param selector the iam authority selector
    * @param token the token
    * @constructor
    */
  def this(selector: String, token: String) = this()
  var selector: String = js.native
  var token: String = js.native
  /**
    * Acquire the HTTP headers required to make an authenticated request.
    */
  def getRequestHeaders(): Xgoogiamauthorityselector = js.native
}

