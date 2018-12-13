package typings
package atGoogleDashCloudKmsLib.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/kms", "v1")
@js.native
object v1Ns extends js.Object {
  @js.native
  sealed trait AttestationFormat extends js.Object
  
  
  trait CryptoKey extends js.Object {
    var createTime: googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
    var labels: ScalablyTyped.runtime.StringDictionary[java.lang.String]
    var name: java.lang.String
    var nextRotationTime: js.UndefOr[
        googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
      ] = js.undefined
    var primary: CryptoKeyVersion
    var purpose: CryptoKeyPurpose
    var versionTemplate: CryptoKeyVersionTemplate
  }
  
  @js.native
  sealed trait CryptoKeyPurpose extends js.Object
  
  
  trait CryptoKeyVersion extends js.Object {
    var algorithm: CryptoKeyVersionAlgorithm
    var attestation: js.UndefOr[KeyOperationAttestation] = js.undefined
    var createTime: googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
    var destroyEventTime: js.UndefOr[
        googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
      ] = js.undefined
    var destroyTime: js.UndefOr[
        googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
      ] = js.undefined
    var generateTime: googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
    var name: java.lang.String
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
    def this(options: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ConfigurationObject) = this()
    def cryptoKeyPath(
      project: java.lang.String,
      location: java.lang.String,
      keyRing: java.lang.String,
      cryptoKey: java.lang.String
    ): java.lang.String = js.native
    def cryptoKeyPathPath(
      project: java.lang.String,
      location: java.lang.String,
      keyRing: java.lang.String,
      cryptoKeyPath: java.lang.String
    ): java.lang.String = js.native
    def cryptoKeyVersionPath(
      project: java.lang.String,
      location: java.lang.String,
      keyRing: java.lang.String,
      cryptoKey: java.lang.String,
      cryptoKeyVersion: java.lang.String
    ): java.lang.String = js.native
    def decrypt(request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptRequest): js.Promise[
        js.Tuple3[
          atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptResponse, 
          _, 
          _
        ]
      ] = js.native
    def decrypt(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptRequest,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptCallback
    ): scala.Unit = js.native
    def decrypt(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions
    ): js.Promise[
        js.Tuple3[
          atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptResponse, 
          _, 
          _
        ]
      ] = js.native
    def decrypt(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.DecryptCallback
    ): scala.Unit = js.native
    def encrypt(request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptRequest): js.Promise[
        js.Tuple3[
          atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptResponse, 
          _, 
          _
        ]
      ] = js.native
    def encrypt(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptRequest,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptCallback
    ): scala.Unit = js.native
    def encrypt(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions
    ): js.Promise[
        js.Tuple3[
          atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptResponse, 
          _, 
          _
        ]
      ] = js.native
    def encrypt(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.EncryptCallback
    ): scala.Unit = js.native
    def keyRingPath(project: java.lang.String, location: java.lang.String, keyRing: java.lang.String): java.lang.String = js.native
    def listCryptoKeys(request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysRequest): js.Promise[js.Tuple3[js.Array[CryptoKey], _, _]] = js.native
    def listCryptoKeys(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysRequest,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysCallback
    ): scala.Unit = js.native
    def listCryptoKeys(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions
    ): js.Promise[js.Tuple3[js.Array[CryptoKey], _, _]] = js.native
    def listCryptoKeys(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListCryptoKeysCallback
    ): scala.Unit = js.native
    def listKeyRings(request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsRequest): js.Promise[js.Tuple3[js.Array[KeyRing], _, _]] = js.native
    def listKeyRings(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsRequest,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsCallback
    ): scala.Unit = js.native
    def listKeyRings(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions
    ): js.Promise[js.Tuple3[js.Array[KeyRing], _, _]] = js.native
    def listKeyRings(
      request: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsRequest,
      gaxOpts: atGoogleDashCloudKmsLib.kmsMod.GAXNs.CallOptions,
      callback: atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyManagementServiceClientNs.ListKeyRingsCallback
    ): scala.Unit = js.native
    def locationPath(project: java.lang.String, location: java.lang.String): java.lang.String = js.native
  }
  
  
  trait KeyOperationAttestation extends js.Object {
    var format: AttestationFormat
  }
  
  
  trait KeyRing extends js.Object {
    var createTime: googleDashProtobufLib.googleProtobufTimestampUnderscorePbMod.TimestampNs.AsObject
    var name: java.lang.String
  }
  
  @js.native
  sealed trait ProtectionLevel extends js.Object
  
  @js.native
  object AttestationFormat extends js.Object {
    @js.native
    sealed trait ATTESTATION_FORMAT_UNSPECIFIED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.AttestationFormat
    
    // Cavium HSM attestation compressed with gzip. Note that this format is
    // defined by Cavium and subject to change at any time.
    @js.native
    sealed trait CAVIUM_V1_COMPRESSED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.AttestationFormat
    
    /* 0 */ val ATTESTATION_FORMAT_UNSPECIFIED: ATTESTATION_FORMAT_UNSPECIFIED with scala.Double = js.native
    /* 3 */ val CAVIUM_V1_COMPRESSED: CAVIUM_V1_COMPRESSED with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atGoogleDashCloudKmsLib.kmsMod.v1Ns.AttestationFormat with scala.Double] = js.native
  }
  
  @js.native
  object CryptoKeyPurpose extends js.Object {
    // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
    // [AsymmetricDecrypt][google.cloud.kms.v1.KeyManagementService.AsymmetricDecrypt] and
    // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
    @js.native
    sealed trait ASYMMETRIC_DECRYPT
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyPurpose
    
    // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
    // [AsymmetricSign][google.cloud.kms.v1.KeyManagementService.AsymmetricSign] and
    // [GetPublicKey][google.cloud.kms.v1.KeyManagementService.GetPublicKey].
    @js.native
    sealed trait ASYMMETRIC_SIGN
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyPurpose
    
    // Not specified.
    @js.native
    sealed trait CRYPTO_KEY_PURPOSE_UNSPECIFIED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyPurpose
    
    // [CryptoKeys][google.cloud.kms.v1.CryptoKey] with this purpose may be used with
    // [Encrypt][google.cloud.kms.v1.KeyManagementService.Encrypt] and
    // [Decrypt][google.cloud.kms.v1.KeyManagementService.Decrypt].
    @js.native
    sealed trait ENCRYPT_DECRYPT
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyPurpose
    
    /* 6 */ val ASYMMETRIC_DECRYPT: ASYMMETRIC_DECRYPT with scala.Double = js.native
    /* 5 */ val ASYMMETRIC_SIGN: ASYMMETRIC_SIGN with scala.Double = js.native
    /* 0 */ val CRYPTO_KEY_PURPOSE_UNSPECIFIED: CRYPTO_KEY_PURPOSE_UNSPECIFIED with scala.Double = js.native
    /* 1 */ val ENCRYPT_DECRYPT: ENCRYPT_DECRYPT with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyPurpose with scala.Double] = js.native
  }
  
  @js.native
  object CryptoKeyVersionAlgorithm extends js.Object {
    // Not specified.
    @js.native
    sealed trait CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // ECDSA on the NIST P-256 curve with a SHA256 digest.
    @js.native
    sealed trait EC_SIGN_P256_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // ECDSA on the NIST P-384 curve with a SHA384 digest.
    @js.native
    sealed trait EC_SIGN_P384_SHA384
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // Creates symmetric encryption keys.
    @js.native
    sealed trait GOOGLE_SYMMETRIC_ENCRYPTION
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSAES-OAEP 2048 bit key with a SHA256 digest.
    @js.native
    sealed trait RSA_DECRYPT_OAEP_2048_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSAES-OAEP 3072 bit key with a SHA256 digest.
    @js.native
    sealed trait RSA_DECRYPT_OAEP_3072_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSAES-OAEP 4096 bit key with a SHA256 digest.
    @js.native
    sealed trait RSA_DECRYPT_OAEP_4096_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSASSA-PKCS1-v1_5 with a 2048 bit key and a SHA256 digest.
    @js.native
    sealed trait RSA_SIGN_PKCS1_2048_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSASSA-PKCS1-v1_5 with a 3072 bit key and a SHA256 digest.
    @js.native
    sealed trait RSA_SIGN_PKCS1_3072_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSASSA-PKCS1-v1_5 with a 4096 bit key and a SHA256 digest.
    @js.native
    sealed trait RSA_SIGN_PKCS1_4096_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSASSA-PSS 2048 bit key with a SHA256 digest.
    @js.native
    sealed trait RSA_SIGN_PSS_2048_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSASSA-PSS 3072 bit key with a SHA256 digest.
    @js.native
    sealed trait RSA_SIGN_PSS_3072_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    // RSASSA-PSS 4096 bit key with a SHA256 digest.
    @js.native
    sealed trait RSA_SIGN_PSS_4096_SHA256
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm
    
    /* 0 */ val CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED: CRYPTO_KEY_VERSION_ALGORITHM_UNSPECIFIED with scala.Double = js.native
    /* 12 */ val EC_SIGN_P256_SHA256: EC_SIGN_P256_SHA256 with scala.Double = js.native
    /* 13 */ val EC_SIGN_P384_SHA384: EC_SIGN_P384_SHA384 with scala.Double = js.native
    /* 1 */ val GOOGLE_SYMMETRIC_ENCRYPTION: GOOGLE_SYMMETRIC_ENCRYPTION with scala.Double = js.native
    /* 8 */ val RSA_DECRYPT_OAEP_2048_SHA256: RSA_DECRYPT_OAEP_2048_SHA256 with scala.Double = js.native
    /* 9 */ val RSA_DECRYPT_OAEP_3072_SHA256: RSA_DECRYPT_OAEP_3072_SHA256 with scala.Double = js.native
    /* 10 */ val RSA_DECRYPT_OAEP_4096_SHA256: RSA_DECRYPT_OAEP_4096_SHA256 with scala.Double = js.native
    /* 5 */ val RSA_SIGN_PKCS1_2048_SHA256: RSA_SIGN_PKCS1_2048_SHA256 with scala.Double = js.native
    /* 6 */ val RSA_SIGN_PKCS1_3072_SHA256: RSA_SIGN_PKCS1_3072_SHA256 with scala.Double = js.native
    /* 7 */ val RSA_SIGN_PKCS1_4096_SHA256: RSA_SIGN_PKCS1_4096_SHA256 with scala.Double = js.native
    /* 2 */ val RSA_SIGN_PSS_2048_SHA256: RSA_SIGN_PSS_2048_SHA256 with scala.Double = js.native
    /* 3 */ val RSA_SIGN_PSS_3072_SHA256: RSA_SIGN_PSS_3072_SHA256 with scala.Double = js.native
    /* 4 */ val RSA_SIGN_PSS_4096_SHA256: RSA_SIGN_PSS_4096_SHA256 with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionAlgorithm with scala.Double] = js.native
  }
  
  @js.native
  object CryptoKeyVersionState extends js.Object {
    // Not specified.
    @js.native
    sealed trait CRYPTO_KEY_VERSION_STATE_UNSPECIFIED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionState
    
    // This version is destroyed, and the key material is no longer stored.
    // A version may not leave this state once entered.
    @js.native
    sealed trait DESTROYED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionState
    
    // This version is scheduled for destruction, and will be destroyed soon.
    // Call
    // [RestoreCryptoKeyVersion][google.cloud.kms.v1.KeyManagementService.RestoreCryptoKeyVersion]
    // to put it back into the [DISABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.DISABLED] state.
    @js.native
    sealed trait DESTROY_SCHEDULED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionState
    
    // This version may not be used, but the key material is still available,
    // and the version can be placed back into the [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] state.
    @js.native
    sealed trait DISABLED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionState
    
    // This version may be used for cryptographic operations.
    @js.native
    sealed trait ENABLED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionState
    
    // This version is still being generated. It may not be used, enabled,
    // disabled, or destroyed yet. Cloud KMS will automatically mark this
    // version [ENABLED][google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionState.ENABLED] as soon as the version is ready.
    @js.native
    sealed trait PENDING_GENERATION
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionState
    
    /* 0 */ val CRYPTO_KEY_VERSION_STATE_UNSPECIFIED: CRYPTO_KEY_VERSION_STATE_UNSPECIFIED with scala.Double = js.native
    /* 3 */ val DESTROYED: DESTROYED with scala.Double = js.native
    /* 4 */ val DESTROY_SCHEDULED: DESTROY_SCHEDULED with scala.Double = js.native
    /* 2 */ val DISABLED: DISABLED with scala.Double = js.native
    /* 1 */ val ENABLED: ENABLED with scala.Double = js.native
    /* 5 */ val PENDING_GENERATION: PENDING_GENERATION with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionState with scala.Double] = js.native
  }
  
  @js.native
  object CryptoKeyVersionView extends js.Object {
    // Default view for each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion]. Does not include
    // the [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation] field.
    @js.native
    sealed trait CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionView
    
    // Provides all fields in each [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion], including the
    // [attestation][google.cloud.kms.v1.CryptoKeyVersion.attestation].
    @js.native
    sealed trait FULL
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionView
    
    /* 0 */ val CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED: CRYPTO_KEY_VERSION_VIEW_UNSPECIFIED with scala.Double = js.native
    /* 1 */ val FULL: FULL with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKeyVersionView with scala.Double] = js.native
  }
  
  @JSName("KeyManagementServiceClient")
  @js.native
  object KeyManagementServiceClientNs extends js.Object {
    
    trait ConfigurationObject extends js.Object {
      var credentials: js.UndefOr[atGoogleDashCloudKmsLib.Anon_Clientemail] = js.undefined
      var email: js.UndefOr[java.lang.String] = js.undefined
      var keyFilename: js.UndefOr[java.lang.String] = js.undefined
      var port: js.UndefOr[scala.Double] = js.undefined
      var projectId: js.UndefOr[java.lang.String] = js.undefined
      var promise: js.UndefOr[js.Any] = js.undefined
      var servicePath: js.UndefOr[java.lang.String] = js.undefined
    }
    
    
    trait DecryptRequest extends js.Object {
      var additionalAuthenticatedData: js.UndefOr[java.lang.String] = js.undefined
      var ciphertext: java.lang.String
      var name: java.lang.String
    }
    
    
    trait DecryptResponse extends js.Object {
      var plaintext: nodeLib.Buffer
    }
    
    
    trait EncryptRequest extends js.Object {
      var additionalAuthenticatedData: js.UndefOr[java.lang.String] = js.undefined
      var name: java.lang.String
      var plaintext: java.lang.String
    }
    
    
    trait EncryptResponse extends js.Object {
      var ciphertext: nodeLib.Buffer
      var name: java.lang.String
    }
    
    
    trait ListCryptoKeysRequest extends js.Object {
      var page_size: js.UndefOr[scala.Double] = js.undefined
      var page_token: js.UndefOr[java.lang.String] = js.undefined
      var parent: java.lang.String
    }
    
    
    trait ListKeyRingsRequest extends js.Object {
      var page_size: js.UndefOr[scala.Double] = js.undefined
      var page_token: js.UndefOr[java.lang.String] = js.undefined
      var parent: java.lang.String
    }
    
    type DecryptCallback = js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* apiResponse */ js.Tuple3[DecryptResponse, js.Any, js.Any], 
        scala.Unit
      ]
    type EncryptCallback = js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* apiResponse */ js.Tuple3[EncryptResponse, js.Any, js.Any], 
        scala.Unit
      ]
    type ListCryptoKeysCallback = js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* apiResponse */ js.Tuple3[js.Array[atGoogleDashCloudKmsLib.kmsMod.v1Ns.CryptoKey], js.Any, js.Any], 
        scala.Unit
      ]
    type ListKeyRingsCallback = js.Function2[
        /* err */ nodeLib.Error | scala.Null, 
        /* apiResponse */ js.Tuple3[js.Array[atGoogleDashCloudKmsLib.kmsMod.v1Ns.KeyRing], js.Any, js.Any], 
        scala.Unit
      ]
  }
  
  @js.native
  object ProtectionLevel extends js.Object {
    // Crypto operations are performed in a Hardware Security Module.
    @js.native
    sealed trait HSM
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.ProtectionLevel
    
    // Not specified.
    @js.native
    sealed trait PROTECTION_LEVEL_UNSPECIFIED
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.ProtectionLevel
    
    // Crypto operations are performed in software.
    @js.native
    sealed trait SOFTWARE
      extends atGoogleDashCloudKmsLib.kmsMod.v1Ns.ProtectionLevel
    
    /* 2 */ val HSM: HSM with scala.Double = js.native
    /* 0 */ val PROTECTION_LEVEL_UNSPECIFIED: PROTECTION_LEVEL_UNSPECIFIED with scala.Double = js.native
    /* 1 */ val SOFTWARE: SOFTWARE with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[atGoogleDashCloudKmsLib.kmsMod.v1Ns.ProtectionLevel with scala.Double] = js.native
  }
  
}

