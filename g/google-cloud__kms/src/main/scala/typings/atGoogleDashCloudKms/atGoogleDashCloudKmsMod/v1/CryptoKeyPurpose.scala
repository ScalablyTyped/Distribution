package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import org.scalablytyped.runtime.TopLevel
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.ASYMMETRIC_DECRYPT
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.ASYMMETRIC_SIGN
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.CRYPTO_KEY_PURPOSE_UNSPECIFIED
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyPurpose.ENCRYPT_DECRYPT
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyPurpose with Double] = js.native
  /* 6 */ @js.native
  object ASYMMETRIC_DECRYPT extends TopLevel[ASYMMETRIC_DECRYPT with Double]
  
  /* 5 */ @js.native
  object ASYMMETRIC_SIGN extends TopLevel[ASYMMETRIC_SIGN with Double]
  
  /* 0 */ @js.native
  object CRYPTO_KEY_PURPOSE_UNSPECIFIED extends TopLevel[CRYPTO_KEY_PURPOSE_UNSPECIFIED with Double]
  
  /* 1 */ @js.native
  object ENCRYPT_DECRYPT extends TopLevel[ENCRYPT_DECRYPT with Double]
  
}

