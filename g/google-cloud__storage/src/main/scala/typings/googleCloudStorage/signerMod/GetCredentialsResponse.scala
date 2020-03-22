package typings.googleCloudStorage.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCredentialsResponse extends js.Object {
  var client_email: js.UndefOr[String] = js.undefined
}

object GetCredentialsResponse {
  @scala.inline
  def apply(client_email: String = null): GetCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    if (client_email != null) __obj.updateDynamic("client_email")(client_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResponse]
  }
}

