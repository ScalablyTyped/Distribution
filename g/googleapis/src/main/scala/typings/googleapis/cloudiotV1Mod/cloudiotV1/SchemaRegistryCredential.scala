package typings.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A server-stored registry credential used to validate device credentials.
  */
@js.native
trait SchemaRegistryCredential extends js.Object {
  /**
    * A public key certificate used to verify the device credentials.
    */
  var publicKeyCertificate: js.UndefOr[SchemaPublicKeyCertificate] = js.native
}

object SchemaRegistryCredential {
  @scala.inline
  def apply(publicKeyCertificate: SchemaPublicKeyCertificate = null): SchemaRegistryCredential = {
    val __obj = js.Dynamic.literal()
    if (publicKeyCertificate != null) __obj.updateDynamic("publicKeyCertificate")(publicKeyCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegistryCredential]
  }
}

