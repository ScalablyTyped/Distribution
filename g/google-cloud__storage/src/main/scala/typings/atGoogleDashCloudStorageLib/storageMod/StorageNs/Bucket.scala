package typings
package atGoogleDashCloudStorageLib.storageMod.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A bucket in the cloud.
     */
@js.native
trait Bucket extends js.Object {
  var acl: Acl = js.native
  var iam: Iam = js.native
  var id: java.lang.String = js.native
  var metadata: BucketMetadata = js.native
  var name: java.lang.String = js.native
  def combine(sources: js.Array[File | java.lang.String], destination: File): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def combine(sources: js.Array[File | java.lang.String], destination: java.lang.String): stdLib.Promise[js.Tuple2[File, ApiResponse]] = js.native
  def create(): stdLib.Promise[js.Tuple2[Bucket, ApiResponse]] = js.native
  def create(config: BucketConfig): stdLib.Promise[js.Tuple2[Bucket, ApiResponse]] = js.native
  def createChannel(id: java.lang.String, config: ChannelConfig): stdLib.Promise[js.Tuple2[Channel, ApiResponse]] = js.native
  def delete(): stdLib.Promise[js.Array[ApiResponse]] = js.native
  def deleteFiles(): stdLib.Promise[scala.Unit] = js.native
  def deleteFiles(query: BucketQuery): stdLib.Promise[scala.Unit] = js.native
  def exists(): stdLib.Promise[js.Array[scala.Boolean]] = js.native
  def file(name: java.lang.String): File = js.native
  def file(name: java.lang.String, options: BucketFileOptions): File = js.native
  def get(): stdLib.Promise[js.Tuple2[Bucket, ApiResponse]] = js.native
  def get(options: BucketGetOptions): stdLib.Promise[js.Tuple2[Bucket, ApiResponse]] = js.native
  def getFiles(): stdLib.Promise[js.Array[js.Array[File]]] = js.native
  def getFiles(query: BucketQuery): stdLib.Promise[js.Array[js.Array[File]]] = js.native
  def getFilesStream(): nodeLib.fsMod.ReadStream = js.native
  def getFilesStream(query: BucketQuery): nodeLib.fsMod.ReadStream = js.native
  def getMetadata(): stdLib.Promise[js.Tuple2[BucketMetadata, ApiResponse]] = js.native
  def makePrivate(): stdLib.Promise[js.Array[js.Array[File]]] = js.native
  def makePrivate(options: BucketPrivacyOptions): stdLib.Promise[js.Array[js.Array[File]]] = js.native
  def makePublic(): stdLib.Promise[js.Array[js.Array[File]]] = js.native
  def makePublic(options: BucketPrivacyOptions): stdLib.Promise[js.Array[js.Array[File]]] = js.native
  def setMetadata(): stdLib.Promise[js.Array[ApiResponse]] = js.native
  def setMetadata(metadata: BucketMetadata): stdLib.Promise[js.Array[ApiResponse]] = js.native
  def upload(localPath: java.lang.String): stdLib.Promise[js.Array[File]] = js.native
  def upload(localPath: java.lang.String, options: UploadOptions): stdLib.Promise[js.Array[File]] = js.native
}

