package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account key create request.
  */
@js.native
trait Schema$CreateServiceAccountKeyRequest extends js.Object {
  /**
    * Which type of key and algorithm to use for the key. The default is
    * currently a 2K RSA key.  However this may change in the future.
    */
  var keyAlgorithm: js.UndefOr[String] = js.native
  /**
    * The output format of the private key. The default value is
    * `TYPE_GOOGLE_CREDENTIALS_FILE`, which is the Google Credentials File
    * format.
    */
  var privateKeyType: js.UndefOr[String] = js.native
}

object Schema$CreateServiceAccountKeyRequest {
  @scala.inline
  def apply(keyAlgorithm: String = null, privateKeyType: String = null): Schema$CreateServiceAccountKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (keyAlgorithm != null) __obj.updateDynamic("keyAlgorithm")(keyAlgorithm.asInstanceOf[js.Any])
    if (privateKeyType != null) __obj.updateDynamic("privateKeyType")(privateKeyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateServiceAccountKeyRequest]
  }
}

