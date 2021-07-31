package typings.googleCloudKms.mod.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CryptoKeyVersionAlgorithm extends StObject
@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionAlgorithm")
@js.native
object CryptoKeyVersionAlgorithm extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionAlgorithm & Double] = js.native
  
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 0 */ val CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED & Double = js.native
  
  // ECDSA on the NIST P-256 curve with a SHA256 digest.
  @js.native
  sealed trait EC_SIGN_P256_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 12 */ val EC_SIGN_P256_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.EC_SIGN_P256_SHA256 & Double = js.native
  
  // ECDSA on the NIST P-384 curve with a SHA384 digest.
  @js.native
  sealed trait EC_SIGN_P384_SHA384
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 13 */ val EC_SIGN_P384_SHA384: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.EC_SIGN_P384_SHA384 & Double = js.native
  
  // Creates symmetric encryption keys.
  @js.native
  sealed trait GOOGLE_SYMMETRIC_ENCRYPTION
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 1 */ val GOOGLE_SYMMETRIC_ENCRYPTION: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.GOOGLE_SYMMETRIC_ENCRYPTION & Double = js.native
  
  // RSAES-OAEP 2048 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_2048_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 8 */ val RSA_DECRYPT_OAEP_2048_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_2048_SHA256 & Double = js.native
  
  // RSAES-OAEP 3072 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_3072_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 9 */ val RSA_DECRYPT_OAEP_3072_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_3072_SHA256 & Double = js.native
  
  // RSAES-OAEP 4096 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_4096_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 10 */ val RSA_DECRYPT_OAEP_4096_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_4096_SHA256 & Double = js.native
  
  // RSASSA-PKCS1-v1_5 with a 2048 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_2048_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 5 */ val RSA_SIGN_PKCS1_2048_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_2048_SHA256 & Double = js.native
  
  // RSASSA-PKCS1-v1_5 with a 3072 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_3072_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 6 */ val RSA_SIGN_PKCS1_3072_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_3072_SHA256 & Double = js.native
  
  // RSASSA-PKCS1-v1_5 with a 4096 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_4096_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 7 */ val RSA_SIGN_PKCS1_4096_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_4096_SHA256 & Double = js.native
  
  // RSASSA-PSS 2048 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_2048_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 2 */ val RSA_SIGN_PSS_2048_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_2048_SHA256 & Double = js.native
  
  // RSASSA-PSS 3072 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_3072_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 3 */ val RSA_SIGN_PSS_3072_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_3072_SHA256 & Double = js.native
  
  // RSASSA-PSS 4096 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_4096_SHA256
    extends StObject
       with CryptoKeyVersionAlgorithm
  /* 4 */ val RSA_SIGN_PSS_4096_SHA256: typings.googleCloudKms.mod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_4096_SHA256 & Double = js.native
}
