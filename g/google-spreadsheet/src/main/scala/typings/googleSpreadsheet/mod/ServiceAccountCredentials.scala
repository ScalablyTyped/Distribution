package typings.googleSpreadsheet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceAccountCredentials extends js.Object {
  /**
    * @description
    * service account email address
    */
  var client_email: String
  /**
    * @description
    * service account private key
    */
  var private_key: String
}

object ServiceAccountCredentials {
  @scala.inline
  def apply(client_email: String, private_key: String): ServiceAccountCredentials = {
    val __obj = js.Dynamic.literal(client_email = client_email.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountCredentials]
  }
}

