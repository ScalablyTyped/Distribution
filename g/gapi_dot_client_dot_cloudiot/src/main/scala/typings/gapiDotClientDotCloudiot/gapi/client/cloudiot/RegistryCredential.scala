package typings.gapiDotClientDotCloudiot.gapi.client.cloudiot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistryCredential extends js.Object {
  /** A public key certificate used to verify the device credentials. */
  var publicKeyCertificate: js.UndefOr[PublicKeyCertificate] = js.undefined
}

object RegistryCredential {
  @scala.inline
  def apply(publicKeyCertificate: PublicKeyCertificate = null): RegistryCredential = {
    val __obj = js.Dynamic.literal()
    if (publicKeyCertificate != null) __obj.updateDynamic("publicKeyCertificate")(publicKeyCertificate)
    __obj.asInstanceOf[RegistryCredential]
  }
}

