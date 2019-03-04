package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthResponse extends js.Object {
  var accessToken: java.lang.String
  var expiresIn: scala.Double
  var signedRequest: java.lang.String
  var userID: java.lang.String
}

object AuthResponse {
  @scala.inline
  def apply(
    accessToken: java.lang.String,
    expiresIn: scala.Double,
    signedRequest: java.lang.String,
    userID: java.lang.String
  ): AuthResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken, expiresIn = expiresIn, signedRequest = signedRequest, userID = userID)
  
    __obj.asInstanceOf[AuthResponse]
  }
}

