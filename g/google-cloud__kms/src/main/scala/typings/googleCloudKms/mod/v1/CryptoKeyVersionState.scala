package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptoKeyVersionState extends StObject
@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionState")
@js.native
object CryptoKeyVersionState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionState & Double] = js.native
  
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_STATE_UNSPECIFIED
    extends StObject
       with CryptoKeyVersionState
  /* 0 */ val CRYPTO_KEY_VERSION_STATE_UNSPECIFIED: typings.googleCloudKms.mod.v1.CryptoKeyVersionState.CRYPTO_KEY_VERSION_STATE_UNSPECIFIED & Double = js.native
  
  // This version is destroyed, and the key material is no longer stored.
  // A version may not leave this state once entered.
  @js.native
  sealed trait DESTROYED
    extends StObject
       with CryptoKeyVersionState
  /* 3 */ val DESTROYED: typings.googleCloudKms.mod.v1.CryptoKeyVersionState.DESTROYED & Double = js.native
  
  // This version is scheduled for destruction, and will be destroyed soon.
  // Call
  // [RestoreCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.RestoreCryptoKeyVersion]
  // to put it back into the [DISABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DISABLED] state.
  @js.native
  sealed trait DESTROY_SCHEDULED
    extends StObject
       with CryptoKeyVersionState
  /* 4 */ val DESTROY_SCHEDULED: typings.googleCloudKms.mod.v1.CryptoKeyVersionState.DESTROY_SCHEDULED & Double = js.native
  
  // This version may not be used, but the key material is still available,
  // and the version can be placed back into the [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] state.
  @js.native
  sealed trait DISABLED
    extends StObject
       with CryptoKeyVersionState
  /* 2 */ val DISABLED: typings.googleCloudKms.mod.v1.CryptoKeyVersionState.DISABLED & Double = js.native
  
  // This version may be used for cryptographic operations.
  @js.native
  sealed trait ENABLED
    extends StObject
       with CryptoKeyVersionState
  /* 1 */ val ENABLED: typings.googleCloudKms.mod.v1.CryptoKeyVersionState.ENABLED & Double = js.native
  
  // This version is still being generated. It may not be used, enabled,
  // disabled, or destroyed yet. Cloud KMS will automatically mark this
  // version [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] as soon as the version is ready.
  @js.native
  sealed trait PENDING_GENERATION
    extends StObject
       with CryptoKeyVersionState
  /* 5 */ val PENDING_GENERATION: typings.googleCloudKms.mod.v1.CryptoKeyVersionState.PENDING_GENERATION & Double = js.native
}
