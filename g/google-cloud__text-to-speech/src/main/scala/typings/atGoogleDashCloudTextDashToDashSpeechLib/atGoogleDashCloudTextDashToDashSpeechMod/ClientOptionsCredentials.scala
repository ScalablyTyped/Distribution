package typings
package atGoogleDashCloudTextDashToDashSpeechLib.atGoogleDashCloudTextDashToDashSpeechMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptionsCredentials extends js.Object {
  var client_email: java.lang.String
  var private_key: java.lang.String
}

object ClientOptionsCredentials {
  @scala.inline
  def apply(client_email: java.lang.String, private_key: java.lang.String): ClientOptionsCredentials = {
    val __obj = js.Dynamic.literal(client_email = client_email, private_key = private_key)
  
    __obj.asInstanceOf[ClientOptionsCredentials]
  }
}

