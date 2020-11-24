package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptoKeyVersionAlgorithm extends js.Object
@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionAlgorithm")
@js.native
object CryptoKeyVersionAlgorithm extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionAlgorithm with Double] = js.native
  
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED extends CryptoKeyVersionAlgorithm
  /* 0 */ @js.native
  object CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED extends TopLevel[CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED with Double]
  
  // ECDSA on the NIST P-256 curve with a SHA256 digest.
  @js.native
  sealed trait EC_SIGN_P256_SHA256 extends CryptoKeyVersionAlgorithm
  /* 12 */ @js.native
  object EC_SIGN_P256_SHA256 extends TopLevel[EC_SIGN_P256_SHA256 with Double]
  
  // ECDSA on the NIST P-384 curve with a SHA384 digest.
  @js.native
  sealed trait EC_SIGN_P384_SHA384 extends CryptoKeyVersionAlgorithm
  /* 13 */ @js.native
  object EC_SIGN_P384_SHA384 extends TopLevel[EC_SIGN_P384_SHA384 with Double]
  
  // Creates symmetric encryption keys.
  @js.native
  sealed trait GOOGLE_SYMMETRIC_ENCRYPTION extends CryptoKeyVersionAlgorithm
  /* 1 */ @js.native
  object GOOGLE_SYMMETRIC_ENCRYPTION extends TopLevel[GOOGLE_SYMMETRIC_ENCRYPTION with Double]
  
  // RSAES-OAEP 2048 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_2048_SHA256 extends CryptoKeyVersionAlgorithm
  /* 8 */ @js.native
  object RSA_DECRYPT_OAEP_2048_SHA256 extends TopLevel[RSA_DECRYPT_OAEP_2048_SHA256 with Double]
  
  // RSAES-OAEP 3072 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_3072_SHA256 extends CryptoKeyVersionAlgorithm
  /* 9 */ @js.native
  object RSA_DECRYPT_OAEP_3072_SHA256 extends TopLevel[RSA_DECRYPT_OAEP_3072_SHA256 with Double]
  
  // RSAES-OAEP 4096 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_4096_SHA256 extends CryptoKeyVersionAlgorithm
  /* 10 */ @js.native
  object RSA_DECRYPT_OAEP_4096_SHA256 extends TopLevel[RSA_DECRYPT_OAEP_4096_SHA256 with Double]
  
  // RSASSA-PKCS1-v1_5 with a 2048 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_2048_SHA256 extends CryptoKeyVersionAlgorithm
  /* 5 */ @js.native
  object RSA_SIGN_PKCS1_2048_SHA256 extends TopLevel[RSA_SIGN_PKCS1_2048_SHA256 with Double]
  
  // RSASSA-PKCS1-v1_5 with a 3072 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_3072_SHA256 extends CryptoKeyVersionAlgorithm
  /* 6 */ @js.native
  object RSA_SIGN_PKCS1_3072_SHA256 extends TopLevel[RSA_SIGN_PKCS1_3072_SHA256 with Double]
  
  // RSASSA-PKCS1-v1_5 with a 4096 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_4096_SHA256 extends CryptoKeyVersionAlgorithm
  /* 7 */ @js.native
  object RSA_SIGN_PKCS1_4096_SHA256 extends TopLevel[RSA_SIGN_PKCS1_4096_SHA256 with Double]
  
  // RSASSA-PSS 2048 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_2048_SHA256 extends CryptoKeyVersionAlgorithm
  /* 2 */ @js.native
  object RSA_SIGN_PSS_2048_SHA256 extends TopLevel[RSA_SIGN_PSS_2048_SHA256 with Double]
  
  // RSASSA-PSS 3072 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_3072_SHA256 extends CryptoKeyVersionAlgorithm
  /* 3 */ @js.native
  object RSA_SIGN_PSS_3072_SHA256 extends TopLevel[RSA_SIGN_PSS_3072_SHA256 with Double]
  
  // RSASSA-PSS 4096 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_4096_SHA256 extends CryptoKeyVersionAlgorithm
  /* 4 */ @js.native
  object RSA_SIGN_PSS_4096_SHA256 extends TopLevel[RSA_SIGN_PSS_4096_SHA256 with Double]
}
