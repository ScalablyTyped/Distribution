package typings.atFirebaseInstallations.distSrcInterfacesApiDashResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateAuthTokenResponse extends js.Object {
  /**
    * Encoded as a string with the suffix 's' (indicating seconds), preceded by
    * the number of seconds.
    *
    * Example: "604800s".
    */
  val expiresIn: String
  val token: String
}

object GenerateAuthTokenResponse {
  @scala.inline
  def apply(expiresIn: String, token: String): GenerateAuthTokenResponse = {
    val __obj = js.Dynamic.literal(expiresIn = expiresIn.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GenerateAuthTokenResponse]
  }
}

