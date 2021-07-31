package typings.googleCloudKms.mod.v1

import typings.googleCloudKms.anon.Clientemail
import typings.googleCloudKms.anon.PartialKeyRing
import typings.googleCloudKms.anon.PartialOmitCryptoKeypurpo
import typings.googleCloudKms.mod.GAX.CallOptions
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.AsymmetricSignCallback
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.AsymmetricSignRequest
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.AsymmetricSignResponse
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.ConfigurationObject
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.CreateCryptoKeyCallback
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.CreateCryptoKeyRequest
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.CreateKeyRingCallback
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.CreateKeyRingRequest
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.DecryptCallback
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.DecryptRequest
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.DecryptResponse
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.EncryptCallback
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.EncryptRequest
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.EncryptResponse
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.ListCryptoKeysCallback
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.ListCryptoKeysRequest
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.ListKeyRingsCallback
import typings.googleCloudKms.mod.v1.KeyManagementServiceClient.ListKeyRingsRequest
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/kms", "v1.KeyManagementServiceClient")
@js.native
class KeyManagementServiceClient () extends StObject {
  def this(options: ConfigurationObject) = this()
  
  def asymmetricSign(request: AsymmetricSignRequest): js.Promise[js.Tuple3[AsymmetricSignResponse, js.Any, js.Any]] = js.native
  def asymmetricSign(request: AsymmetricSignRequest, callback: AsymmetricSignCallback): Unit = js.native
  def asymmetricSign(request: AsymmetricSignRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[AsymmetricSignResponse, js.Any, js.Any]] = js.native
  def asymmetricSign(request: AsymmetricSignRequest, gaxOpts: CallOptions, callback: AsymmetricSignCallback): Unit = js.native
  
  // This needs to be after the declaration that has callback but not options.
  def createCryptoKey(request: CreateCryptoKeyRequest): js.Promise[js.Tuple3[CryptoKey, js.Any, js.Any]] = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, callback: CreateCryptoKeyCallback): Unit = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[CryptoKey, js.Any, js.Any]] = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, gaxOpts: CallOptions, callback: CreateCryptoKeyCallback): Unit = js.native
  
  // This needs to be after the declaration that has callback but not options.
  def createKeyRing(request: CreateKeyRingRequest): js.Promise[js.Tuple3[KeyRing, js.Any, js.Any]] = js.native
  def createKeyRing(request: CreateKeyRingRequest, callback: CreateKeyRingCallback): Unit = js.native
  def createKeyRing(request: CreateKeyRingRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[KeyRing, js.Any, js.Any]] = js.native
  def createKeyRing(request: CreateKeyRingRequest, gaxOpts: CallOptions, callback: CreateKeyRingCallback): Unit = js.native
  
  def cryptoKeyPath(project: String, location: String, keyRing: String, cryptoKey: String): String = js.native
  
  def cryptoKeyPathPath(project: String, location: String, keyRing: String, cryptoKeyPath: String): String = js.native
  
  def cryptoKeyVersionPath(project: String, location: String, keyRing: String, cryptoKey: String, cryptoKeyVersion: String): String = js.native
  
  def decrypt(request: DecryptRequest): js.Promise[js.Tuple3[DecryptResponse, js.Any, js.Any]] = js.native
  def decrypt(request: DecryptRequest, callback: DecryptCallback): Unit = js.native
  def decrypt(request: DecryptRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[DecryptResponse, js.Any, js.Any]] = js.native
  def decrypt(request: DecryptRequest, gaxOpts: CallOptions, callback: DecryptCallback): Unit = js.native
  
  def encrypt(request: EncryptRequest): js.Promise[js.Tuple3[EncryptResponse, js.Any, js.Any]] = js.native
  def encrypt(request: EncryptRequest, callback: EncryptCallback): Unit = js.native
  def encrypt(request: EncryptRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[EncryptResponse, js.Any, js.Any]] = js.native
  def encrypt(request: EncryptRequest, gaxOpts: CallOptions, callback: EncryptCallback): Unit = js.native
  
  def keyRingPath(project: String, location: String, keyRing: String): String = js.native
  
  def listCryptoKeys(request: ListCryptoKeysRequest): js.Promise[js.Tuple3[js.Array[CryptoKey], js.Any, js.Any]] = js.native
  def listCryptoKeys(request: ListCryptoKeysRequest, callback: ListCryptoKeysCallback): Unit = js.native
  def listCryptoKeys(request: ListCryptoKeysRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[js.Array[CryptoKey], js.Any, js.Any]] = js.native
  def listCryptoKeys(request: ListCryptoKeysRequest, gaxOpts: CallOptions, callback: ListCryptoKeysCallback): Unit = js.native
  
  def listKeyRings(request: ListKeyRingsRequest): js.Promise[js.Tuple3[js.Array[KeyRing], js.Any, js.Any]] = js.native
  def listKeyRings(request: ListKeyRingsRequest, callback: ListKeyRingsCallback): Unit = js.native
  def listKeyRings(request: ListKeyRingsRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[js.Array[KeyRing], js.Any, js.Any]] = js.native
  def listKeyRings(request: ListKeyRingsRequest, gaxOpts: CallOptions, callback: ListKeyRingsCallback): Unit = js.native
  
  def locationPath(project: String, location: String): String = js.native
}
object KeyManagementServiceClient {
  
  type AsymmetricSignCallback = js.Function2[
    /* err */ Error | Null, 
    /* apiResponse */ js.Tuple3[AsymmetricSignResponse, js.Any, js.Any], 
    Unit
  ]
  
  trait AsymmetricSignRequest extends StObject {
    
    var digest: Digest
    
    var name: String
  }
  object AsymmetricSignRequest {
    
    @scala.inline
    def apply(digest: Digest, name: String): AsymmetricSignRequest = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsymmetricSignRequest]
    }
    
    @scala.inline
    implicit class AsymmetricSignRequestMutableBuilder[Self <: AsymmetricSignRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDigest(value: Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsymmetricSignResponse extends StObject {
    
    var signature: Buffer
  }
  object AsymmetricSignResponse {
    
    @scala.inline
    def apply(signature: Buffer): AsymmetricSignResponse = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsymmetricSignResponse]
    }
    
    @scala.inline
    implicit class AsymmetricSignResponseMutableBuilder[Self <: AsymmetricSignResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigurationObject extends StObject {
    
    var credentials: js.UndefOr[Clientemail] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var keyFilename: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var promise: js.UndefOr[js.Any] = js.undefined
    
    var servicePath: js.UndefOr[String] = js.undefined
  }
  object ConfigurationObject {
    
    @scala.inline
    def apply(): ConfigurationObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationObject]
    }
    
    @scala.inline
    implicit class ConfigurationObjectMutableBuilder[Self <: ConfigurationObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCredentials(value: Clientemail): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      @scala.inline
      def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      @scala.inline
      def setPromise(value: js.Any): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      @scala.inline
      def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
    }
  }
  
  type CreateCryptoKeyCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.Tuple3[CryptoKey, js.Any, js.Any], Unit]
  
  trait CreateCryptoKeyRequest extends StObject {
    
    var cryptoKey: PartialOmitCryptoKeypurpo
    
    var cryptoKeyId: String
    
    var parent: String
    
    var skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
  }
  object CreateCryptoKeyRequest {
    
    @scala.inline
    def apply(cryptoKey: PartialOmitCryptoKeypurpo, cryptoKeyId: String, parent: String): CreateCryptoKeyRequest = {
      val __obj = js.Dynamic.literal(cryptoKey = cryptoKey.asInstanceOf[js.Any], cryptoKeyId = cryptoKeyId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCryptoKeyRequest]
    }
    
    @scala.inline
    implicit class CreateCryptoKeyRequestMutableBuilder[Self <: CreateCryptoKeyRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCryptoKey(value: PartialOmitCryptoKeypurpo): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCryptoKeyId(value: String): Self = StObject.set(x, "cryptoKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipInitialVersionCreation(value: Boolean): Self = StObject.set(x, "skipInitialVersionCreation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipInitialVersionCreationUndefined: Self = StObject.set(x, "skipInitialVersionCreation", js.undefined)
    }
  }
  
  type CreateKeyRingCallback = js.Function2[/* err */ Error | Null, /* apiResponse */ js.Tuple3[KeyRing, js.Any, js.Any], Unit]
  
  trait CreateKeyRingRequest extends StObject {
    
    var keyRing: js.UndefOr[PartialKeyRing] = js.undefined
    
    var keyRingId: String
    
    var parent: String
  }
  object CreateKeyRingRequest {
    
    @scala.inline
    def apply(keyRingId: String, parent: String): CreateKeyRingRequest = {
      val __obj = js.Dynamic.literal(keyRingId = keyRingId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKeyRingRequest]
    }
    
    @scala.inline
    implicit class CreateKeyRingRequestMutableBuilder[Self <: CreateKeyRingRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKeyRing(value: PartialKeyRing): Self = StObject.set(x, "keyRing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyRingId(value: String): Self = StObject.set(x, "keyRingId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyRingUndefined: Self = StObject.set(x, "keyRing", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  type DecryptCallback = js.Function2[
    /* err */ Error | Null, 
    /* apiResponse */ js.Tuple3[DecryptResponse, js.Any, js.Any], 
    Unit
  ]
  
  trait DecryptRequest extends StObject {
    
    var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
    
    var ciphertext: Buffer
    
    var name: String
  }
  object DecryptRequest {
    
    @scala.inline
    def apply(ciphertext: Buffer, name: String): DecryptRequest = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptRequest]
    }
    
    @scala.inline
    implicit class DecryptRequestMutableBuilder[Self <: DecryptRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
      
      @scala.inline
      def setCiphertext(value: Buffer): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecryptResponse extends StObject {
    
    var plaintext: Buffer
  }
  object DecryptResponse {
    
    @scala.inline
    def apply(plaintext: Buffer): DecryptResponse = {
      val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptResponse]
    }
    
    @scala.inline
    implicit class DecryptResponseMutableBuilder[Self <: DecryptResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlaintext(value: Buffer): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
  
  type EncryptCallback = js.Function2[
    /* err */ Error | Null, 
    /* apiResponse */ js.Tuple3[EncryptResponse, js.Any, js.Any], 
    Unit
  ]
  
  trait EncryptRequest extends StObject {
    
    var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var plaintext: Buffer
  }
  object EncryptRequest {
    
    @scala.inline
    def apply(name: String, plaintext: Buffer): EncryptRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptRequest]
    }
    
    @scala.inline
    implicit class EncryptRequestMutableBuilder[Self <: EncryptRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintext(value: Buffer): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncryptResponse extends StObject {
    
    var ciphertext: Buffer
    
    var name: String
  }
  object EncryptResponse {
    
    @scala.inline
    def apply(ciphertext: Buffer, name: String): EncryptResponse = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptResponse]
    }
    
    @scala.inline
    implicit class EncryptResponseMutableBuilder[Self <: EncryptResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCiphertext(value: Buffer): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ListCryptoKeysCallback = js.Function2[
    /* err */ Error | Null, 
    /* apiResponse */ js.Tuple3[js.Array[CryptoKey], js.Any, js.Any], 
    Unit
  ]
  
  trait ListCryptoKeysRequest extends StObject {
    
    var page_size: js.UndefOr[Double] = js.undefined
    
    var page_token: js.UndefOr[String] = js.undefined
    
    var parent: String
  }
  object ListCryptoKeysRequest {
    
    @scala.inline
    def apply(parent: String): ListCryptoKeysRequest = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListCryptoKeysRequest]
    }
    
    @scala.inline
    implicit class ListCryptoKeysRequestMutableBuilder[Self <: ListCryptoKeysRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
      
      @scala.inline
      def setPage_token(value: String): Self = StObject.set(x, "page_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage_tokenUndefined: Self = StObject.set(x, "page_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  type ListKeyRingsCallback = js.Function2[
    /* err */ Error | Null, 
    /* apiResponse */ js.Tuple3[js.Array[KeyRing], js.Any, js.Any], 
    Unit
  ]
  
  trait ListKeyRingsRequest extends StObject {
    
    var page_size: js.UndefOr[Double] = js.undefined
    
    var page_token: js.UndefOr[String] = js.undefined
    
    var parent: String
  }
  object ListKeyRingsRequest {
    
    @scala.inline
    def apply(parent: String): ListKeyRingsRequest = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListKeyRingsRequest]
    }
    
    @scala.inline
    implicit class ListKeyRingsRequestMutableBuilder[Self <: ListKeyRingsRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
      
      @scala.inline
      def setPage_token(value: String): Self = StObject.set(x, "page_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPage_tokenUndefined: Self = StObject.set(x, "page_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
}
