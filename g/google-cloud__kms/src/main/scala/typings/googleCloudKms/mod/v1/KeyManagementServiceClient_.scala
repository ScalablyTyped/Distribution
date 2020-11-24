package typings.googleCloudKms.mod.v1

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/kms", "v1.KeyManagementServiceClient")
@js.native
class KeyManagementServiceClient_ () extends js.Object {
  def this(options: ConfigurationObject) = this()
  
  def asymmetricSign(request: AsymmetricSignRequest): js.Promise[js.Tuple3[AsymmetricSignResponse, _, _]] = js.native
  def asymmetricSign(request: AsymmetricSignRequest, callback: AsymmetricSignCallback): Unit = js.native
  def asymmetricSign(request: AsymmetricSignRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[AsymmetricSignResponse, _, _]] = js.native
  def asymmetricSign(request: AsymmetricSignRequest, gaxOpts: CallOptions, callback: AsymmetricSignCallback): Unit = js.native
  
  // This needs to be after the declaration that has callback but not options.
  def createCryptoKey(request: CreateCryptoKeyRequest): js.Promise[js.Tuple3[CryptoKey, _, _]] = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, callback: CreateCryptoKeyCallback): Unit = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[CryptoKey, _, _]] = js.native
  def createCryptoKey(request: CreateCryptoKeyRequest, gaxOpts: CallOptions, callback: CreateCryptoKeyCallback): Unit = js.native
  
  // This needs to be after the declaration that has callback but not options.
  def createKeyRing(request: CreateKeyRingRequest): js.Promise[js.Tuple3[KeyRing, _, _]] = js.native
  def createKeyRing(request: CreateKeyRingRequest, callback: CreateKeyRingCallback): Unit = js.native
  def createKeyRing(request: CreateKeyRingRequest, gaxOpts: CallOptions): js.Promise[js.Tuple3[KeyRing, _, _]] = js.native
  def createKeyRing(request: CreateKeyRingRequest, gaxOpts: CallOptions, callback: CreateKeyRingCallback): Unit = js.native
  
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
