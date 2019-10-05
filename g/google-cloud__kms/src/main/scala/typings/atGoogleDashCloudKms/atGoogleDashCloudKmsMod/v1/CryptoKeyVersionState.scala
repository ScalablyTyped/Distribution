package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptoKeyVersionState extends js.Object

@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionState")
@js.native
object CryptoKeyVersionState extends js.Object {
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_STATE_UNSPECIFIED extends CryptoKeyVersionState
  
  // This version is destroyed, and the key material is no longer stored.
  // A version may not leave this state once entered.
  @js.native
  sealed trait DESTROYED extends CryptoKeyVersionState
  
  // This version is scheduled for destruction, and will be destroyed soon.
  // Call
  // [RestoreCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.RestoreCryptoKeyVersion]
  // to put it back into the [DISABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DISABLED] state.
  @js.native
  sealed trait DESTROY_SCHEDULED extends CryptoKeyVersionState
  
  // This version may not be used, but the key material is still available,
  // and the version can be placed back into the [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] state.
  @js.native
  sealed trait DISABLED extends CryptoKeyVersionState
  
  // This version may be used for cryptographic operations.
  @js.native
  sealed trait ENABLED extends CryptoKeyVersionState
  
  // This version is still being generated. It may not be used, enabled,
  // disabled, or destroyed yet. Cloud KMS will automatically mark this
  // version [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] as soon as the version is ready.
  @js.native
  sealed trait PENDING_GENERATION extends CryptoKeyVersionState
  
  /* 0 */ val CRYPTO_KEY_VERSION_STATE_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionState.CRYPTO_KEY_VERSION_STATE_UNSPECIFIED with Double = js.native
  /* 3 */ val DESTROYED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionState.DESTROYED with Double = js.native
  /* 4 */ val DESTROY_SCHEDULED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionState.DESTROY_SCHEDULED with Double = js.native
  /* 2 */ val DISABLED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionState.DISABLED with Double = js.native
  /* 1 */ val ENABLED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionState.ENABLED with Double = js.native
  /* 5 */ val PENDING_GENERATION: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionState.PENDING_GENERATION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionState with Double] = js.native
}

