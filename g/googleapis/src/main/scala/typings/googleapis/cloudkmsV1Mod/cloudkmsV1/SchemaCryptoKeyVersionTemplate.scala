package typings.googleapis.cloudkmsV1Mod.cloudkmsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CryptoKeyVersionTemplate specifies the properties to use when creating a
  * new CryptoKeyVersion, either manually with CreateCryptoKeyVersion or
  * automatically as a result of auto-rotation.
  */
@js.native
trait SchemaCryptoKeyVersionTemplate extends js.Object {
  /**
    * Required. Algorithm to use when creating a CryptoKeyVersion based on this
    * template.  For backwards compatibility, GOOGLE_SYMMETRIC_ENCRYPTION is
    * implied if both this field is omitted and CryptoKey.purpose is
    * ENCRYPT_DECRYPT.
    */
  var algorithm: js.UndefOr[String] = js.native
  /**
    * ProtectionLevel to use when creating a CryptoKeyVersion based on this
    * template. Immutable. Defaults to SOFTWARE.
    */
  var protectionLevel: js.UndefOr[String] = js.native
}

object SchemaCryptoKeyVersionTemplate {
  @scala.inline
  def apply(algorithm: String = null, protectionLevel: String = null): SchemaCryptoKeyVersionTemplate = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (protectionLevel != null) __obj.updateDynamic("protectionLevel")(protectionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCryptoKeyVersionTemplate]
  }
}

