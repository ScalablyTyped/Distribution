package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud KMS metadata for the given google.cloud.location.Location.
  */
@js.native
trait SchemaLocationMetadata extends js.Object {
  /**
    * Indicates whether CryptoKeys with protection_level HSM can be created in
    * this location.
    */
  var hsmAvailable: js.UndefOr[Boolean] = js.native
}

object SchemaLocationMetadata {
  @scala.inline
  def apply(hsmAvailable: js.UndefOr[Boolean] = js.undefined): SchemaLocationMetadata = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hsmAvailable)) __obj.updateDynamic("hsmAvailable")(hsmAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocationMetadata]
  }
}

