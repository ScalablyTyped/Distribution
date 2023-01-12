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
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/kms", "v1.KeyManagementServiceClient")
@js.native
open class KeyManagementServiceClient () extends StObject {
  def this(options: ConfigurationObject) = this()
  
  def asymmetricSign(request: AsymmetricSignRequest): js.Promise[js.Tuple3[AsymmetricSignResponse, Any, Any]] = js.native
  def asymmetricSign(request: AsymmetricSignRequest, callback: AsymmetricSignCallback): Unit = js.native
  def asymmetricSign(request: AsymmetricSignRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[AsymmetricSignResponse, Any, Any]] = js.native
  def asymmetricSign(request: AsymmetricSignRequest, gaxOpts: CallOptions, callback: AsymmetricSignCallback): Unit = js.native
  
  // This needs to be after the declaration that has callback but not options.
  def createCryptoKey(request: CreateCryptoKeyRequest): js.Promise[js.Tuple3[CryptoKey, Any, Any]] = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, callback: CreateCryptoKeyCallback): Unit = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[CryptoKey, Any, Any]] = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, gaxOpts: CallOptions, callback: CreateCryptoKeyCallback): Unit = js.native
  
  // This needs to be after the declaration that has callback but not options.
  def createKeyRing(request: CreateKeyRingRequest): js.Promise[js.Tuple3[KeyRing, Any, Any]] = js.native
  def createKeyRing(request: CreateKeyRingRequest, callback: CreateKeyRingCallback): Unit = js.native
  def createKeyRing(request: CreateKeyRingRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[KeyRing, Any, Any]] = js.native
  def createKeyRing(request: CreateKeyRingRequest, gaxOpts: CallOptions, callback: CreateKeyRingCallback): Unit = js.native
  
  def cryptoKeyPath(project: String, location: String, keyRing: String, cryptoKey: String): String = js.native
  
  def cryptoKeyPathPath(project: String, location: String, keyRing: String, cryptoKeyPath: String): String = js.native
  
  def cryptoKeyVersionPath(project: String, location: String, keyRing: String, cryptoKey: String, cryptoKeyVersion: String): String = js.native
  
  def decrypt(request: DecryptRequest): js.Promise[js.Tuple3[DecryptResponse, Any, Any]] = js.native
  def decrypt(request: DecryptRequest, callback: DecryptCallback): Unit = js.native
  def decrypt(request: DecryptRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[DecryptResponse, Any, Any]] = js.native
  def decrypt(request: DecryptRequest, gaxOpts: CallOptions, callback: DecryptCallback): Unit = js.native
  
  def encrypt(request: EncryptRequest): js.Promise[js.Tuple3[EncryptResponse, Any, Any]] = js.native
  def encrypt(request: EncryptRequest, callback: EncryptCallback): Unit = js.native
  def encrypt(request: EncryptRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[EncryptResponse, Any, Any]] = js.native
  def encrypt(request: EncryptRequest, gaxOpts: CallOptions, callback: EncryptCallback): Unit = js.native
  
  def keyRingPath(project: String, location: String, keyRing: String): String = js.native
  
  def listCryptoKeys(request: ListCryptoKeysRequest): js.Promise[js.Tuple3[js.Array[CryptoKey], Any, Any]] = js.native
  def listCryptoKeys(request: ListCryptoKeysRequest, callback: ListCryptoKeysCallback): Unit = js.native
  def listCryptoKeys(request: ListCryptoKeysRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[js.Array[CryptoKey], Any, Any]] = js.native
  def listCryptoKeys(request: ListCryptoKeysRequest, gaxOpts: CallOptions, callback: ListCryptoKeysCallback): Unit = js.native
  
  def listKeyRings(request: ListKeyRingsRequest): js.Promise[js.Tuple3[js.Array[KeyRing], Any, Any]] = js.native
  def listKeyRings(request: ListKeyRingsRequest, callback: ListKeyRingsCallback): Unit = js.native
  def listKeyRings(request: ListKeyRingsRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[js.Array[KeyRing], Any, Any]] = js.native
  def listKeyRings(request: ListKeyRingsRequest, gaxOpts: CallOptions, callback: ListKeyRingsCallback): Unit = js.native
  
  def locationPath(project: String, location: String): String = js.native
}
object KeyManagementServiceClient {
  
  type AsymmetricSignCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[AsymmetricSignResponse, Any, Any], 
    Unit
  ]
  
  trait AsymmetricSignRequest extends StObject {
    
    var digest: Digest
    
    var name: String
  }
  object AsymmetricSignRequest {
    
    inline def apply(digest: Digest, name: String): AsymmetricSignRequest = {
      val __obj = js.Dynamic.literal(digest = digest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsymmetricSignRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsymmetricSignRequest] (val x: Self) extends AnyVal {
      
      inline def setDigest(value: Digest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait AsymmetricSignResponse extends StObject {
    
    var signature: Buffer
  }
  object AsymmetricSignResponse {
    
    inline def apply(signature: Buffer): AsymmetricSignResponse = {
      val __obj = js.Dynamic.literal(signature = signature.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsymmetricSignResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsymmetricSignResponse] (val x: Self) extends AnyVal {
      
      inline def setSignature(value: Buffer): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConfigurationObject extends StObject {
    
    var credentials: js.UndefOr[Clientemail] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var keyFilename: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var projectId: js.UndefOr[String] = js.undefined
    
    var promise: js.UndefOr[Any] = js.undefined
    
    var servicePath: js.UndefOr[String] = js.undefined
  }
  object ConfigurationObject {
    
    inline def apply(): ConfigurationObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigurationObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConfigurationObject] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: Clientemail): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
      
      inline def setKeyFilenameUndefined: Self = StObject.set(x, "keyFilename", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
      
      inline def setPromise(value: Any): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setServicePath(value: String): Self = StObject.set(x, "servicePath", value.asInstanceOf[js.Any])
      
      inline def setServicePathUndefined: Self = StObject.set(x, "servicePath", js.undefined)
    }
  }
  
  type CreateCryptoKeyCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.Tuple3[CryptoKey, Any, Any], Unit]
  
  trait CreateCryptoKeyRequest extends StObject {
    
    var cryptoKey: PartialOmitCryptoKeypurpo
    
    var cryptoKeyId: String
    
    var parent: String
    
    var skipInitialVersionCreation: js.UndefOr[Boolean] = js.undefined
  }
  object CreateCryptoKeyRequest {
    
    inline def apply(cryptoKey: PartialOmitCryptoKeypurpo, cryptoKeyId: String, parent: String): CreateCryptoKeyRequest = {
      val __obj = js.Dynamic.literal(cryptoKey = cryptoKey.asInstanceOf[js.Any], cryptoKeyId = cryptoKeyId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateCryptoKeyRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateCryptoKeyRequest] (val x: Self) extends AnyVal {
      
      inline def setCryptoKey(value: PartialOmitCryptoKeypurpo): Self = StObject.set(x, "cryptoKey", value.asInstanceOf[js.Any])
      
      inline def setCryptoKeyId(value: String): Self = StObject.set(x, "cryptoKeyId", value.asInstanceOf[js.Any])
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setSkipInitialVersionCreation(value: Boolean): Self = StObject.set(x, "skipInitialVersionCreation", value.asInstanceOf[js.Any])
      
      inline def setSkipInitialVersionCreationUndefined: Self = StObject.set(x, "skipInitialVersionCreation", js.undefined)
    }
  }
  
  type CreateKeyRingCallback = js.Function2[/* err */ js.Error | Null, /* apiResponse */ js.Tuple3[KeyRing, Any, Any], Unit]
  
  trait CreateKeyRingRequest extends StObject {
    
    var keyRing: js.UndefOr[PartialKeyRing] = js.undefined
    
    var keyRingId: String
    
    var parent: String
  }
  object CreateKeyRingRequest {
    
    inline def apply(keyRingId: String, parent: String): CreateKeyRingRequest = {
      val __obj = js.Dynamic.literal(keyRingId = keyRingId.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateKeyRingRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateKeyRingRequest] (val x: Self) extends AnyVal {
      
      inline def setKeyRing(value: PartialKeyRing): Self = StObject.set(x, "keyRing", value.asInstanceOf[js.Any])
      
      inline def setKeyRingId(value: String): Self = StObject.set(x, "keyRingId", value.asInstanceOf[js.Any])
      
      inline def setKeyRingUndefined: Self = StObject.set(x, "keyRing", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  type DecryptCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[DecryptResponse, Any, Any], 
    Unit
  ]
  
  trait DecryptRequest extends StObject {
    
    var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
    
    var ciphertext: Buffer
    
    var name: String
  }
  object DecryptRequest {
    
    inline def apply(ciphertext: Buffer, name: String): DecryptRequest = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecryptRequest] (val x: Self) extends AnyVal {
      
      inline def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
      
      inline def setCiphertext(value: Buffer): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecryptResponse extends StObject {
    
    var plaintext: Buffer
  }
  object DecryptResponse {
    
    inline def apply(plaintext: Buffer): DecryptResponse = {
      val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecryptResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecryptResponse] (val x: Self) extends AnyVal {
      
      inline def setPlaintext(value: Buffer): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
  
  type EncryptCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[EncryptResponse, Any, Any], 
    Unit
  ]
  
  trait EncryptRequest extends StObject {
    
    var additionalAuthenticatedData: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var plaintext: Buffer
  }
  object EncryptRequest {
    
    inline def apply(name: String, plaintext: Buffer): EncryptRequest = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], plaintext = plaintext.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptRequest] (val x: Self) extends AnyVal {
      
      inline def setAdditionalAuthenticatedData(value: String): Self = StObject.set(x, "additionalAuthenticatedData", value.asInstanceOf[js.Any])
      
      inline def setAdditionalAuthenticatedDataUndefined: Self = StObject.set(x, "additionalAuthenticatedData", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlaintext(value: Buffer): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
    }
  }
  
  trait EncryptResponse extends StObject {
    
    var ciphertext: Buffer
    
    var name: String
  }
  object EncryptResponse {
    
    inline def apply(ciphertext: Buffer, name: String): EncryptResponse = {
      val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncryptResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EncryptResponse] (val x: Self) extends AnyVal {
      
      inline def setCiphertext(value: Buffer): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ListCryptoKeysCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[js.Array[CryptoKey], Any, Any], 
    Unit
  ]
  
  trait ListCryptoKeysRequest extends StObject {
    
    var page_size: js.UndefOr[Double] = js.undefined
    
    var page_token: js.UndefOr[String] = js.undefined
    
    var parent: String
  }
  object ListCryptoKeysRequest {
    
    inline def apply(parent: String): ListCryptoKeysRequest = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListCryptoKeysRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListCryptoKeysRequest] (val x: Self) extends AnyVal {
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
      
      inline def setPage_token(value: String): Self = StObject.set(x, "page_token", value.asInstanceOf[js.Any])
      
      inline def setPage_tokenUndefined: Self = StObject.set(x, "page_token", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  type ListKeyRingsCallback = js.Function2[
    /* err */ js.Error | Null, 
    /* apiResponse */ js.Tuple3[js.Array[KeyRing], Any, Any], 
    Unit
  ]
  
  trait ListKeyRingsRequest extends StObject {
    
    var page_size: js.UndefOr[Double] = js.undefined
    
    var page_token: js.UndefOr[String] = js.undefined
    
    var parent: String
  }
  object ListKeyRingsRequest {
    
    inline def apply(parent: String): ListKeyRingsRequest = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListKeyRingsRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListKeyRingsRequest] (val x: Self) extends AnyVal {
      
      inline def setPage_size(value: Double): Self = StObject.set(x, "page_size", value.asInstanceOf[js.Any])
      
      inline def setPage_sizeUndefined: Self = StObject.set(x, "page_size", js.undefined)
      
      inline def setPage_token(value: String): Self = StObject.set(x, "page_token", value.asInstanceOf[js.Any])
      
      inline def setPage_tokenUndefined: Self = StObject.set(x, "page_token", js.undefined)
      
      inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
}
