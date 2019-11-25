package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthResponse extends js.Object {
  var accessToken: String
  var expiresIn: Double
  var signedRequest: String
  var userID: String
}

object AuthResponse {
  @scala.inline
  def apply(accessToken: String, expiresIn: Double, signedRequest: String, userID: String): AuthResponse = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], signedRequest = signedRequest.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AuthResponse]
  }
}

