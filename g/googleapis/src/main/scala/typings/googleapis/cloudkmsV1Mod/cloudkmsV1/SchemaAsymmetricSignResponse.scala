package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for KeyManagementService.AsymmetricSign.
  */
@js.native
trait SchemaAsymmetricSignResponse extends js.Object {
  /**
    * The created signature.
    */
  var signature: js.UndefOr[String] = js.native
}

object SchemaAsymmetricSignResponse {
  @scala.inline
  def apply(signature: String = null): SchemaAsymmetricSignResponse = {
    val __obj = js.Dynamic.literal()
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAsymmetricSignResponse]
  }
}

