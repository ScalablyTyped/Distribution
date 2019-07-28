package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod

import org.scalablytyped.runtime.StringDictionary
import typings.atGoogleDashCloudKms.Anon_Clientemail
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.GAXNs.CallOptions
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.AttestationFormat
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKey
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyPurpose
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersion
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionState
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionTemplate
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionView
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.ConfigurationObject
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.DecryptCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.DecryptRequest
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.DecryptResponse
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.EncryptCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.EncryptRequest
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.EncryptResponse
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysRequest
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsRequest
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyOperationAttestation
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.KeyRing
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.ProtectionLevel
import typings.googleDashProtobuf.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/kms", "v1")
@js.native
object v1Ns extends js.Object {
  @js.native
  sealed trait AttestationFormat extends js.Object
  
  trait CryptoKey extends js.Object {
    var createTime: AsObject
    var labels: StringDictionary[String]
    var name: String
    var nextRotationTime: js.UndefOr[AsObject] = js.undefined
    var primary: CryptoKeyVersion
    var purpose: CryptoKeyPurpose
    var versionTemplate: CryptoKeyVersionTemplate
  }
  
  @js.native
  sealed trait CryptoKeyPurpose extends js.Object
  
  trait CryptoKeyVersion extends js.Object {
    var algorithm: CryptoKeyVersionAlgorithm
    var attestation: js.UndefOr[KeyOperationAttestation] = js.undefined
    var createTime: AsObject
    var destroyEventTime: js.UndefOr[AsObject] = js.undefined
    var destroyTime: js.UndefOr[AsObject] = js.undefined
    var generateTime: AsObject
    var name: String
    var protectionLevel: ProtectionLevel
    var state: CryptoKeyVersionState
  }
  
  @js.native
  sealed trait CryptoKeyVersionAlgorithm extends js.Object
  
  @js.native
  sealed trait CryptoKeyVersionState extends js.Object
  
  trait CryptoKeyVersionTemplate extends js.Object {
    var algorithm: CryptoKeyVersionAlgorithm
    var protectionLevel: ProtectionLevel
  }
  
  @js.native
  sealed trait CryptoKeyVersionView extends js.Object
  
  @js.native
  class KeyManagementServiceClient () extends js.Object {
    def this(options: ConfigurationObject) = this()
    def cryptoKeyPath(project: String, location: String, keyRing: String, cryptoKey: String): String = js.native
    def cryptoKeyPathPath(project: String, location: String, keyRing: String, cryptoKeyPath: String): String = js.native
    def cryptoKeyVersionPath(project: String, location: String, keyRing: String, cryptoKey: String, cryptoKeyVersion: String): String = js.native
    def decrypt(request: DecryptRequest): js.Promise[js.Tuple3[DecryptResponse, _, _]] = js.native
    def decrypt(request: DecryptRequest, callback: DecryptCallback): Unit = js.native
    def decrypt(request: DecryptRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[DecryptResponse, _, _]] = js.native
    def decrypt(request: DecryptRequest, gaxOpts: CallOptions, callback: DecryptCallback): Unit = js.native
    def encrypt(request: EncryptRequest): js.Promise[js.Tuple3[EncryptResponse, _, _]] = js.native
    def encrypt(request: EncryptRequest, callback: EncryptCallback): Unit = js.native
    def encrypt(request: EncryptRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[EncryptResponse, _, _]] = js.native
    def encrypt(request: EncryptRequest, gaxOpts: CallOptions, callback: EncryptCallback): Unit = js.native
    def keyRingPath(project: String, location: String, keyRing: String): String = js.native
    def listCryptoKeys(request: ListCryptoKeysRequest): js.Promise[js.Tuple3[js.Array[CryptoKey], _, _]] = js.native
    def listCryptoKeys(request: ListCryptoKeysRequest, callback: ListCryptoKeysCallback): Unit = js.native
    def listCryptoKeys(request: ListCryptoKeysRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[js.Array[CryptoKey], _, _]] = js.native
    def listCryptoKeys(request: ListCryptoKeysRequest, gaxOpts: CallOptions, callback: ListCryptoKeysCallback): Unit = js.native
    def listKeyRings(request: ListKeyRingsRequest): js.Promise[js.Tuple3[js.Array[KeyRing], _, _]] = js.native
    def listKeyRings(request: ListKeyRingsRequest, callback: ListKeyRingsCallback): Unit = js.native
    def listKeyRings(request: ListKeyRingsRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[js.Array[KeyRing], _, _]] = js.native
    def listKeyRings(request: ListKeyRingsRequest, gaxOpts: CallOptions, callback: ListKeyRingsCallback): Unit = js.native
    def locationPath(project: String, location: String): String = js.native
  }
  
  trait KeyOperationAttestation extends js.Object {
    var format: AttestationFormat
  }
  
  trait KeyRing extends js.Object {
    var createTime: AsObject
    var name: String
  }
  
  @js.native
  sealed trait ProtectionLevel extends js.Object
  
  @js.native
  object AttestationFormat extends js.Object {
    @js.native
    sealed trait ATTESTATION_FORMAT_UNSPECIFIED extends AttestationFormat
    
    // Cavium HSM attestation compressed with gzip. Note that this format is
    // defined by Cavium and subject to change at any time.
    @js.native
    sealed trait CAVIUM_V1_COMPRESSED extends AttestationFormat
    
    /* 0 */ val ATTESTATION_FORMAT_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.AttestationFormat.ATTESTATION_FORMAT_UNSPECIFIED with Double = js.native
    /* 3 */ val CAVIUM_V1_COMPRESSED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.AttestationFormat.CAVIUM_V1_COMPRESSED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AttestationFormat with Double] = js.native
  }
  
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
    
    /* 6 */ val ASYMMETRIC_DECRYPT: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyPurpose.ASYMMETRIC_DECRYPT with Double = js.native
    /* 5 */ val ASYMMETRIC_SIGN: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyPurpose.ASYMMETRIC_SIGN with Double = js.native
    /* 0 */ val CRYPTO_KEY_PURPOSE_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyPurpose.CRYPTO_KEY_PURPOSE_UNSPECIFIED with Double = js.native
    /* 1 */ val ENCRYPT_DECRYPT: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyPurpose.ENCRYPT_DECRYPT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CryptoKeyPurpose with Double] = js.native
  }
  
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
    
    /* 0 */ val CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED with Double = js.native
    /* 12 */ val EC_SIGN_P256_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.EC_SIGN_P256_SHA256 with Double = js.native
    /* 13 */ val EC_SIGN_P384_SHA384: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.EC_SIGN_P384_SHA384 with Double = js.native
    /* 1 */ val GOOGLE_SYMMETRIC_ENCRYPTION: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.GOOGLE_SYMMETRIC_ENCRYPTION with Double = js.native
    /* 8 */ val RSA_DECRYPT_OAEP_2048_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_2048_SHA256 with Double = js.native
    /* 9 */ val RSA_DECRYPT_OAEP_3072_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_3072_SHA256 with Double = js.native
    /* 10 */ val RSA_DECRYPT_OAEP_4096_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_DECRYPT_OAEP_4096_SHA256 with Double = js.native
    /* 5 */ val RSA_SIGN_PKCS1_2048_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_2048_SHA256 with Double = js.native
    /* 6 */ val RSA_SIGN_PKCS1_3072_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_3072_SHA256 with Double = js.native
    /* 7 */ val RSA_SIGN_PKCS1_4096_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_SIGN_PKCS1_4096_SHA256 with Double = js.native
    /* 2 */ val RSA_SIGN_PSS_2048_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_2048_SHA256 with Double = js.native
    /* 3 */ val RSA_SIGN_PSS_3072_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_3072_SHA256 with Double = js.native
    /* 4 */ val RSA_SIGN_PSS_4096_SHA256: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionAlgorithm.RSA_SIGN_PSS_4096_SHA256 with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CryptoKeyVersionAlgorithm with Double] = js.native
  }
  
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
    
    /* 0 */ val CRYPTO_KEY_VERSION_STATE_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionState.CRYPTO_KEY_VERSION_STATE_UNSPECIFIED with Double = js.native
    /* 3 */ val DESTROYED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionState.DESTROYED with Double = js.native
    /* 4 */ val DESTROY_SCHEDULED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionState.DESTROY_SCHEDULED with Double = js.native
    /* 2 */ val DISABLED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionState.DISABLED with Double = js.native
    /* 1 */ val ENABLED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionState.ENABLED with Double = js.native
    /* 5 */ val PENDING_GENERATION: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionState.PENDING_GENERATION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CryptoKeyVersionState with Double] = js.native
  }
  
  @js.native
  object CryptoKeyVersionView extends js.Object {
    // Default view for each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. Does not include
    // the [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation] field.
    @js.native
    sealed trait CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED extends CryptoKeyVersionView
    
    // Provides all fields in each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], including the
    // [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation].
    @js.native
    sealed trait FULL extends CryptoKeyVersionView
    
    /* 0 */ val CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionView.CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED with Double = js.native
    /* 1 */ val FULL: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.CryptoKeyVersionView.FULL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CryptoKeyVersionView with Double] = js.native
  }
  
  @JSName("KeyManagementServiceClient")
  @js.native
  object KeyManagementServiceClientNs extends js.Object {
    trait ConfigurationObject extends js.Object {
      var credentials: js.UndefOr[Anon_Clientemail] = js.undefined
      var email: js.UndefOr[String] = js.undefined
      var keyFilename: js.UndefOr[String] = js.undefined
      var port: js.UndefOr[Double] = js.undefined
      var projectId: js.UndefOr[String] = js.undefined
      var promise: js.UndefOr[js.Any] = js.undefined
      var servicePath: js.UndefOr[String] = js.undefined
    }
    
    trait DecryptRequest extends js.Object {
      var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
      var ciphertext: String
      var name: String
    }
    
    trait DecryptResponse extends js.Object {
      var plaintext: Buffer
    }
    
    trait EncryptRequest extends js.Object {
      var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
      var name: String
      var plaintext: String
    }
    
    trait EncryptResponse extends js.Object {
      var ciphertext: Buffer
      var name: String
    }
    
    trait ListCryptoKeysRequest extends js.Object {
      var page_size: js.UndefOr[Double] = js.undefined
      var page_token: js.UndefOr[String] = js.undefined
      var parent: String
    }
    
    trait ListKeyRingsRequest extends js.Object {
      var page_size: js.UndefOr[Double] = js.undefined
      var page_token: js.UndefOr[String] = js.undefined
      var parent: String
    }
    
    type DecryptCallback = js.Function2[
        /* err */ Error | Null, 
        /* apiResponse */ js.Tuple3[DecryptResponse, js.Any, js.Any], 
        Unit
      ]
    type EncryptCallback = js.Function2[
        /* err */ Error | Null, 
        /* apiResponse */ js.Tuple3[EncryptResponse, js.Any, js.Any], 
        Unit
      ]
    type ListCryptoKeysCallback = js.Function2[
        /* err */ Error | Null, 
        /* apiResponse */ js.Tuple3[js.Array[CryptoKey], js.Any, js.Any], 
        Unit
      ]
    type ListKeyRingsCallback = js.Function2[
        /* err */ Error | Null, 
        /* apiResponse */ js.Tuple3[js.Array[KeyRing], js.Any, js.Any], 
        Unit
      ]
  }
  
  @js.native
  object ProtectionLevel extends js.Object {
    // Crypto operations are performed in a Hardware Security Module.
    @js.native
    sealed trait HSM extends ProtectionLevel
    
    // Not specified.
    @js.native
    sealed trait PROTECTION_LEVEL_UNSPECIFIED extends ProtectionLevel
    
    // Crypto operations are performed in software.
    @js.native
    sealed trait SOFTWARE extends ProtectionLevel
    
    /* 2 */ val HSM: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.ProtectionLevel.HSM with Double = js.native
    /* 0 */ val PROTECTION_LEVEL_UNSPECIFIED: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.ProtectionLevel.PROTECTION_LEVEL_UNSPECIFIED with Double = js.native
    /* 1 */ val SOFTWARE: typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1Ns.ProtectionLevel.SOFTWARE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ProtectionLevel with Double] = js.native
  }
  
}

