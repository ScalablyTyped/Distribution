package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for KeyManagementService.AsymmetricSign.
  */
@js.native
trait SchemaAsymmetricSignRequest extends js.Object {
  /**
    * Required. The digest of the data to sign. The digest must be produced
    * with the same digest algorithm as specified by the key version&#39;s
    * algorithm.
    */
  var digest: js.UndefOr[SchemaDigest] = js.native
}

object SchemaAsymmetricSignRequest {
  @scala.inline
  def apply(digest: SchemaDigest = null): SchemaAsymmetricSignRequest = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsymmetricSignRequest]
  }
}

