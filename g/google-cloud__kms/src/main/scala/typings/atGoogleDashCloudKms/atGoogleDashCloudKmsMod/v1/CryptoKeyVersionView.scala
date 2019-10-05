package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptoKeyVersionView extends js.Object

@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionView")
@js.native
object CryptoKeyVersionView extends js.Object {
  // Default view for each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. Does not include
  // the [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation] field.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED extends CryptoKeyVersionView
  
  // Provides all fields in each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], including the
  // [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation].
  @js.native
  sealed trait FULL extends CryptoKeyVersionView
  
  /* 0 */ val CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionView.CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED with Double = js.native
  /* 1 */ val FULL: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionView.FULL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionView with Double] = js.native
}

