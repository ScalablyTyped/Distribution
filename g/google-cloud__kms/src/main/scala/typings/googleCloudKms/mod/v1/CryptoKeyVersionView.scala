package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptoKeyVersionView extends js.Object
@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionView")
@js.native
object CryptoKeyVersionView extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionView with Double] = js.native
  
  // Default view for each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. Does not include
  // the [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation] field.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED extends CryptoKeyVersionView
  /* 0 */ @js.native
  object CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED extends TopLevel[CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED with Double]
  
  // Provides all fields in each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], including the
  // [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation].
  @js.native
  sealed trait FULL extends CryptoKeyVersionView
  /* 1 */ @js.native
  object FULL extends TopLevel[FULL with Double]
}
