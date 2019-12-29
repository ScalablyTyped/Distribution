package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionState with Double] = js.native
  /* 0 */ @js.native
  object CRYPTO_KEY_VERSION_STATE_UNSPECIFIED extends TopLevel[CRYPTO_KEY_VERSION_STATE_UNSPECIFIED with Double]
  
  /* 3 */ @js.native
  object DESTROYED extends TopLevel[DESTROYED with Double]
  
  /* 4 */ @js.native
  object DESTROY_SCHEDULED extends TopLevel[DESTROY_SCHEDULED with Double]
  
  /* 2 */ @js.native
  object DISABLED extends TopLevel[DISABLED with Double]
  
  /* 1 */ @js.native
  object ENABLED extends TopLevel[ENABLED with Double]
  
  /* 5 */ @js.native
  object PENDING_GENERATION extends TopLevel[PENDING_GENERATION with Double]
  
}

