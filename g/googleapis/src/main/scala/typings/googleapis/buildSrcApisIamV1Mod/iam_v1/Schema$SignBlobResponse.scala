package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account sign blob response.
  */
@js.native
trait Schema$SignBlobResponse extends js.Object {
  /**
    * The id of the key used to sign the blob.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The signed blob.
    */
  var signature: js.UndefOr[String] = js.native
}

object Schema$SignBlobResponse {
  @scala.inline
  def apply(keyId: String = null, signature: String = null): Schema$SignBlobResponse = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SignBlobResponse]
  }
}

