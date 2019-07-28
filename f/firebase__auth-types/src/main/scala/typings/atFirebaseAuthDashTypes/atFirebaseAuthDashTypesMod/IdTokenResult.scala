package typings.atFirebaseAuthDashTypes.atFirebaseAuthDashTypesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTokenResult extends js.Object {
  var authTime: String
  var claims: StringDictionary[js.Any]
  var expirationTime: String
  var issuedAtTime: String
  var signInProvider: String | Null
  var token: String
}

object IdTokenResult {
  @scala.inline
  def apply(
    authTime: String,
    claims: StringDictionary[js.Any],
    expirationTime: String,
    issuedAtTime: String,
    token: String,
    signInProvider: String = null
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime, claims = claims, expirationTime = expirationTime, issuedAtTime = issuedAtTime, token = token)
    if (signInProvider != null) __obj.updateDynamic("signInProvider")(signInProvider)
    __obj.asInstanceOf[IdTokenResult]
  }
}

