package typings.googleapis.buildSrcApisIamV1Mod.iam_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account keys list response.
  */
@js.native
trait Schema$ListServiceAccountKeysResponse extends js.Object {
  /**
    * The public keys for the service account.
    */
  var keys: js.UndefOr[js.Array[Schema$ServiceAccountKey]] = js.native
}

object Schema$ListServiceAccountKeysResponse {
  @scala.inline
  def apply(keys: js.Array[Schema$ServiceAccountKey] = null): Schema$ListServiceAccountKeysResponse = {
    val __obj = js.Dynamic.literal()
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListServiceAccountKeysResponse]
  }
}

