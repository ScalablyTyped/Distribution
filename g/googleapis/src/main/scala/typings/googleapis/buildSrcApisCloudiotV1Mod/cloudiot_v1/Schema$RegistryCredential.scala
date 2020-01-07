package typings.googleapis.buildSrcApisCloudiotV1Mod.cloudiot_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A server-stored registry credential used to validate device credentials.
  */
@js.native
trait Schema$RegistryCredential extends js.Object {
  /**
    * A public key certificate used to verify the device credentials.
    */
  var publicKeyCertificate: js.UndefOr[Schema$PublicKeyCertificate] = js.native
}

object Schema$RegistryCredential {
  @scala.inline
  def apply(publicKeyCertificate: Schema$PublicKeyCertificate = null): Schema$RegistryCredential = {
    val __obj = js.Dynamic.literal()
    if (publicKeyCertificate != null) __obj.updateDynamic("publicKeyCertificate")(publicKeyCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegistryCredential]
  }
}

