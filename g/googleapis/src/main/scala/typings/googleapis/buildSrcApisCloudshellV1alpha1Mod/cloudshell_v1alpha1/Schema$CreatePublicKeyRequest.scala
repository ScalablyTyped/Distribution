package typings.googleapis.buildSrcApisCloudshellV1alpha1Mod.cloudshell_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreatePublicKey.
  */
@js.native
trait Schema$CreatePublicKeyRequest extends js.Object {
  /**
    * Key that should be added to the environment.
    */
  var key: js.UndefOr[Schema$PublicKey] = js.native
}

object Schema$CreatePublicKeyRequest {
  @scala.inline
  def apply(key: Schema$PublicKey = null): Schema$CreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreatePublicKeyRequest]
  }
}

