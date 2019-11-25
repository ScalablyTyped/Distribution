package typings.atGoogleDashCloudTextDashToDashSpeech.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptionsCredentials extends js.Object {
  var client_email: String
  var private_key: String
}

object ClientOptionsCredentials {
  @scala.inline
  def apply(client_email: String, private_key: String): ClientOptionsCredentials = {
    val __obj = js.Dynamic.literal(client_email = client_email.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientOptionsCredentials]
  }
}

