package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateServiceAccountKeyRequest extends js.Object {
  /**
    * Which type of key and algorithm to use for the key.
    * The default is currently a 2K RSA key.  However this may change in the
    * future.
    */
  var keyAlgorithm: js.UndefOr[String] = js.undefined
  /**
    * The output format of the private key. `GOOGLE_CREDENTIALS_FILE` is the
    * default output format.
    */
  var privateKeyType: js.UndefOr[String] = js.undefined
}

object CreateServiceAccountKeyRequest {
  @scala.inline
  def apply(keyAlgorithm: String = null, privateKeyType: String = null): CreateServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (keyAlgorithm != null) __obj.updateDynamic("keyAlgorithm")(keyAlgorithm.asInstanceOf[js.Any])
    if (privateKeyType != null) __obj.updateDynamic("privateKeyType")(privateKeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateServiceAccountKeyRequest]
  }
}

