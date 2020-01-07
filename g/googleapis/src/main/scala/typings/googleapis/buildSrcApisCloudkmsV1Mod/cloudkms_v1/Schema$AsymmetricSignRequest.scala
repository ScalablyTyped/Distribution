package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.AsymmetricSign.
  */
@js.native
trait Schema$AsymmetricSignRequest extends js.Object {
  /**
    * Required. The digest of the data to sign. The digest must be produced
    * with the same digest algorithm as specified by the key version&#39;s
    * algorithm.
    */
  var digest: js.UndefOr[Schema$Digest] = js.native
}

object Schema$AsymmetricSignRequest {
  @scala.inline
  def apply(digest: Schema$Digest = null): Schema$AsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AsymmetricSignRequest]
  }
}

