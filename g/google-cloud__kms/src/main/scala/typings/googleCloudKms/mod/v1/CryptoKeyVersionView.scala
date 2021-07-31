package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptoKeyVersionView extends StObject
@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionView")
@js.native
object CryptoKeyVersionView extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionView & Double] = js.native
  
  // Default view for each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. Does not include
  // the [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation] field.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED
    extends StObject
       with CryptoKeyVersionView
  /* 0 */ val CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED: typings.googleCloudKms.mod.v1.CryptoKeyVersionView.CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED & Double = js.native
  
  // Provides all fields in each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], including the
  // [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation].
  @js.native
  sealed trait FULL
    extends StObject
       with CryptoKeyVersionView
  /* 1 */ val FULL: typings.googleCloudKms.mod.v1.CryptoKeyVersionView.FULL & Double = js.native
}
