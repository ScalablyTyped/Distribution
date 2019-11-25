package typings.atGoogleDashCloudKms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clientemail extends js.Object {
  var client_email: js.UndefOr[String] = js.undefined
  var private_key: js.UndefOr[String] = js.undefined
}

object Anon_Clientemail {
  @scala.inline
  def apply(client_email: String = null, private_key: String = null): Anon_Clientemail = {
    val __obj = js.Dynamic.literal()
    if (client_email != null) __obj.updateDynamic("client_email")(client_email.asInstanceOf[js.Any])
    if (private_key != null) __obj.updateDynamic("private_key")(private_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clientemail]
  }
}

