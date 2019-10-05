package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CryptoKeyVersionAlgorithm extends js.Object

@JSImport("@google-cloud/kms", "v1.CryptoKeyVersionAlgorithm")
@js.native
object CryptoKeyVersionAlgorithm extends js.Object {
  // Not specified.
  @js.native
  sealed trait CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED extends CryptoKeyVersionAlgorithm
  
  // ECDSA on the NIST P-256 curve with a SHA256 digest.
  @js.native
  sealed trait EC_SIGN_P256_SHA256 extends CryptoKeyVersionAlgorithm
  
  // ECDSA on the NIST P-384 curve with a SHA384 digest.
  @js.native
  sealed trait EC_SIGN_P384_SHA384 extends CryptoKeyVersionAlgorithm
  
  // Creates symmetric encryption keys.
  @js.native
  sealed trait GOOGLE_SYMMETRIC_ENCRYPTION extends CryptoKeyVersionAlgorithm
  
  // RSAES-OAEP 2048 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_2048_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSAES-OAEP 3072 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_3072_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSAES-OAEP 4096 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_DECRYPT_OAEP_4096_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSASSA-PKCS1-v1_5 with a 2048 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_2048_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSASSA-PKCS1-v1_5 with a 3072 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_3072_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSASSA-PKCS1-v1_5 with a 4096 bit key and a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PKCS1_4096_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSASSA-PSS 2048 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_2048_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSASSA-PSS 3072 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_3072_SHA256 extends CryptoKeyVersionAlgorithm
  
  // RSASSA-PSS 4096 bit key with a SHA256 digest.
  @js.native
  sealed trait RSA_SIGN_PSS_4096_SHA256 extends CryptoKeyVersionAlgorithm
  
  /* 0 */ val CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED with Double = js.native
  /* 12 */ val EC_SIGN_P256_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.EC_SIGN_P256_SHA256 with Double = js.native
  /* 13 */ val EC_SIGN_P384_SHA384: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.EC_SIGN_P384_SHA384 with Double = js.native
  /* 1 */ val GOOGLE_SYMMETRIC_ENCRYPTION: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.GOOGLE_SYMMETRIC_ENCRYPTION with Double = js.native
  /* 8 */ val RSA_DECRYPT_OAEP_2048_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_2048_SHA256 with Double = js.native
  /* 9 */ val RSA_DECRYPT_OAEP_3072_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_3072_SHA256 with Double = js.native
  /* 10 */ val RSA_DECRYPT_OAEP_4096_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_4096_SHA256 with Double = js.native
  /* 5 */ val RSA_SIGN_PKCS1_2048_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_2048_SHA256 with Double = js.native
  /* 6 */ val RSA_SIGN_PKCS1_3072_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_3072_SHA256 with Double = js.native
  /* 7 */ val RSA_SIGN_PKCS1_4096_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_4096_SHA256 with Double = js.native
  /* 2 */ val RSA_SIGN_PSS_2048_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_2048_SHA256 with Double = js.native
  /* 3 */ val RSA_SIGN_PSS_3072_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_3072_SHA256 with Double = js.native
  /* 4 */ val RSA_SIGN_PSS_4096_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_4096_SHA256 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CryptoKeyVersionAlgorithm with Double] = js.native
}

