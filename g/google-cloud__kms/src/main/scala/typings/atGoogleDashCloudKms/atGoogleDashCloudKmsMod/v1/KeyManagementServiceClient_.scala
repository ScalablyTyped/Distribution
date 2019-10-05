package typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1

import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.GAX.CallOptions
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.ConfigurationObject
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.DecryptCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.DecryptRequest
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.DecryptResponse
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.EncryptCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.EncryptRequest
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.EncryptResponse
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.ListCryptoKeysCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.ListCryptoKeysRequest
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.ListKeyRingsCallback
import typings.atGoogleDashCloudKms.atGoogleDashCloudKmsMod.v1.KeyManagementServiceClient.ListKeyRingsRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/kms", "v1.KeyManagementServiceClient")
@js.native
class KeyManagementServiceClient_ () extends js.Object {
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

