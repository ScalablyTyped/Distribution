package typings.googleapis.buildSrcApisCloudkmsV1Mod.cloudkms_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.AsymmetricSign.
  */
@js.native
trait Schema$AsymmetricSignResponse extends js.Object {
  /**
    * The created signature.
    */
  var signature: js.UndefOr[String] = js.native
}

object Schema$AsymmetricSignResponse {
  @scala.inline
  def apply(signature: String = null): Schema$AsymmetricSignResponse = {
    val __obj = js.Dynamic.literal()
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AsymmetricSignResponse]
  }
}

