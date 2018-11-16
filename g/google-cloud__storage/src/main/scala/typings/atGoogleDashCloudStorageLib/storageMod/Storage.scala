package typings
package atGoogleDashCloudStorageLib.storageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The Storage class allows you interact with Google Cloud Storage.
 */
@js.native
trait Storage extends js.Object {
  var acl: atGoogleDashCloudStorageLib.storageMod.StorageNs.Acl = js.native
  def Bucket(storage: Storage, name: java.lang.String): atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket = js.native
  def Channel(storage: Storage, id: java.lang.String, resourceId: java.lang.String): atGoogleDashCloudStorageLib.storageMod.StorageNs.Channel = js.native
  def File(
    bucket: atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket,
    name: java.lang.String,
    opts: atGoogleDashCloudStorageLib.storageMod.StorageNs.BucketFileOptions
  ): atGoogleDashCloudStorageLib.storageMod.StorageNs.File = js.native
  def bucket(name: atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket): atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket = js.native
  def bucket(name: java.lang.String): atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket = js.native
  def channel(id: java.lang.String, resourceId: java.lang.String): atGoogleDashCloudStorageLib.storageMod.StorageNs.Channel = js.native
  def createBucket(name: java.lang.String): stdLib.Promise[
    js.Tuple2[
      atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket, 
      atGoogleDashCloudStorageLib.storageMod.StorageNs.ApiResponse
    ]
  ] = js.native
  def createBucket(name: java.lang.String, metadata: atGoogleDashCloudStorageLib.storageMod.StorageNs.BucketConfig): stdLib.Promise[
    js.Tuple2[
      atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket, 
      atGoogleDashCloudStorageLib.storageMod.StorageNs.ApiResponse
    ]
  ] = js.native
  def getBuckets(): stdLib.Promise[js.Array[js.Array[atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket]]] = js.native
  def getBuckets(query: atGoogleDashCloudStorageLib.storageMod.StorageNs.BucketQuery): stdLib.Promise[js.Array[js.Array[atGoogleDashCloudStorageLib.storageMod.StorageNs.Bucket]]] = js.native
  def getBucketsStream(): stdLib.Promise[js.Array[nodeLib.fsMod.ReadStream]] = js.native
  def getBucketsStream(query: atGoogleDashCloudStorageLib.storageMod.StorageNs.BucketQuery): stdLib.Promise[js.Array[nodeLib.fsMod.ReadStream]] = js.native
}

