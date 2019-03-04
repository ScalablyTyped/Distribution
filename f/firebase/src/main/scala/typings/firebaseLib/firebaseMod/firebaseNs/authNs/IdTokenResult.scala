package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdTokenResult extends js.Object {
  var authTime: java.lang.String
  var claims: org.scalablytyped.runtime.StringDictionary[js.Any]
  var expirationTime: java.lang.String
  var issuedAtTime: java.lang.String
  var signInProvider: java.lang.String | scala.Null
  var token: java.lang.String
}

object IdTokenResult {
  @scala.inline
  def apply(
    authTime: java.lang.String,
    claims: org.scalablytyped.runtime.StringDictionary[js.Any],
    expirationTime: java.lang.String,
    issuedAtTime: java.lang.String,
    token: java.lang.String,
    signInProvider: java.lang.String = null
  ): IdTokenResult = {
    val __obj = js.Dynamic.literal(authTime = authTime, claims = claims, expirationTime = expirationTime, issuedAtTime = issuedAtTime, token = token)
    if (signInProvider != null) __obj.updateDynamic("signInProvider")(signInProvider)
    __obj.asInstanceOf[IdTokenResult]
  }
}

