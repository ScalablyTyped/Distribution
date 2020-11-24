package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptoKeyPurpose extends js.Object
@JSImport("@google-cloud/kms", "v1.CryptoKeyPurpose")
@js.native
object CryptoKeyPurpose extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyPurpose with Double] = js.native
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [AsymmetricDecrypt][google.cloud.kms.v1.KeyManagementService.AsymmetricDecrypt] and
  // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
  @js.native
  sealed trait ASYMMETRIC_DECRYPT extends CryptoKeyPurpose
  /* 6 */ @js.native
  object ASYMMETRIC_DECRYPT extends TopLevel[ASYMMETRIC_DECRYPT with Double]
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [AsymmetricSign][google.cloud.kms.v1.KeyManagementService.AsymmetricSign] and
  // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
  @js.native
  sealed trait ASYMMETRIC_SIGN extends CryptoKeyPurpose
  /* 5 */ @js.native
  object ASYMMETRIC_SIGN extends TopLevel[ASYMMETRIC_SIGN with Double]
  
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_PURPOSE_UNSPECIFIED extends CryptoKeyPurpose
  /* 0 */ @js.native
  object CRYPTO_KEY_PURPOSE_UNSPECIFIED extends TopLevel[CRYPTO_KEY_PURPOSE_UNSPECIFIED with Double]
  
  // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
  // [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt] and
  // [Decrypt][google.cloud.kms.v1.KeyManagementService.Decrypt].
  @js.native
  sealed trait ENCRYPT_DECRYPT extends CryptoKeyPurpose
  /* 1 */ @js.native
  object ENCRYPT_DECRYPT extends TopLevel[ENCRYPT_DECRYPT with Double]
}
