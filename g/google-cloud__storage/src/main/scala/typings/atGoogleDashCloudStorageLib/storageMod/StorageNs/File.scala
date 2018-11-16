package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A file in the cloud.
     */
@js.native
trait File extends js.Object {
  var acl: Acl = js.native
  var metadata: js.UndefOr[FileMetadata] = js.native
  var name: java.lang.String = js.native
  def copy(destination: Bucket): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def copy(destination: File): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def copy(destination: java.lang.String): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def createReadStream(): nodeLib.fsMod.ReadStream = js.native
  def createReadStream(options: ReadStreamOptions): nodeLib.fsMod.ReadStream = js.native
  def createResumableUpload(): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def createResumableUpload(options: ResumableUploadOptions): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def createWriteStream(): nodeLib.fsMod.WriteStream = js.native
  def createWriteStream(options: WriteStreamOptions): nodeLib.fsMod.WriteStream = js.native
  def delete(): stdLib.Promise[js.Array[ApiResponse]] = js.native
  def download(): stdLib.Promise[js.Array[nodeLib.Buffer]] = js.native
  def download(options: DownloadOptions): stdLib.Promise[js.Array[nodeLib.Buffer]] = js.native
  def exists(): stdLib.Promise[js.Array[scala.Boolean]] = js.native
  def get(): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def getMetadata(): stdLib.Promise[js.Tuple2[FileMetadata, ApiResponse]] = js.native
  def getSignedPolicy(): stdLib.Promise[js.Array[SignedPolicy]] = js.native
  def getSignedPolicy(options: SignedPolicyOptions): stdLib.Promise[js.Array[SignedPolicy]] = js.native
  def getSignedUrl(config: SignedUrlConfig): stdLib.Promise[js.Array[java.lang.String]] = js.native
  def makePrivate(): stdLib.Promise[js.Array[ApiResponse]] = js.native
  def makePrivate(options: FilePrivateOptions): stdLib.Promise[js.Array[ApiResponse]] = js.native
  def makePublic(): stdLib.Promise[js.Array[ApiResponse]] = js.native
  def move(destination: Bucket): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def move(destination: File): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def move(destination: java.lang.String): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def save(data: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def save(data: java.lang.String, options: WriteStreamOptions): stdLib.Promise[scala.Unit] = js.native
  def save(data: nodeLib.Buffer): stdLib.Promise[scala.Unit] = js.native
  def save(data: nodeLib.Buffer, options: WriteStreamOptions): stdLib.Promise[scala.Unit] = js.native
  def setEncryptionKey(encryptionKey: java.lang.String): File = js.native
  def setEncryptionKey(encryptionKey: nodeLib.Buffer): File = js.native
  def setMetadata(metadata: FileMetadata): stdLib.Promise[js.Array[ApiResponse]] = js.native
}

