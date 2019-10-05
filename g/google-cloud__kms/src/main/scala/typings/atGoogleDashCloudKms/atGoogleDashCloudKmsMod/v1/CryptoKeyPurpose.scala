package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptoKeyPurpose extends js.Object

@JSImport("@google-cloud/kms", "v1.CryptoKeyPurpose")
@js.native
object CryptoKeyPurpose extends js.Object {
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [AsymmetricDecrypt][google.cloud.kms.v1.KeyManagementService.AsymmetricDecrypt] and
  // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
  @js.native
  sealed trait ASYMMETRIC_DECRYPT extends CryptoKeyPurpose
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [AsymmetricSign][google.cloud.kms.v1.KeyManagementService.AsymmetricSign] and
  // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
  @js.native
  sealed trait ASYMMETRIC_SIGN extends CryptoKeyPurpose
  
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_PURPOSE_UNSPECIFIED extends CryptoKeyPurpose
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt] and
  // [Decrypt][google.cloud.kms.v1.KeyManagementService.Decrypt].
  @js.native
  sealed trait ENCRYPT_DECRYPT extends CryptoKeyPurpose
  
  /* 6 */ val ASYMMETRIC_DECRYPT: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.ASYMMETRIC_DECRYPT with Double = js.native
  /* 5 */ val ASYMMETRIC_SIGN: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.ASYMMETRIC_SIGN with Double = js.native
  /* 0 */ val CRYPTO_KEY_PURPOSE_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.CRYPTO_KEY_PURPOSE_UNSPECIFIED with Double = js.native
  /* 1 */ val ENCRYPT_DECRYPT: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.ENCRYPT_DECRYPT with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyPurpose with Double] = js.native
}

