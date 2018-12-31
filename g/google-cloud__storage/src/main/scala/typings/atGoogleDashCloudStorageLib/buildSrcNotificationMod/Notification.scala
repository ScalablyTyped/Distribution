package typings
package atGoogleDashCloudStorageLib.buildSrcNotificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Notification object is created from your {@link Bucket} object using
  * {@link Bucket#notification}. Use it to interact with Cloud Pub/Sub
  * notifications.
  *
  * @see [Cloud Pub/Sub Notifications for Google Cloud Storage]{@link https://cloud.google.com/storage/docs/pubsub-notifications}
  *
  * @class
  * @hideconstructor
  *
  * @param {Bucket} bucket The bucket instance this notification is attached to.
  * @param {string} id The ID of the notification.
  *
  * @example
  * const {Storage} = require('@google-cloud/storage');
  * const storage = new Storage();
  * const myBucket = storage.bucket('my-bucket');
  *
  * const notification = myBucket.notification('1');
  */
/* RemoveDifficultInheritance: 
- Dropped any
- Dropped any */ @JSImport("@google-cloud/storage/build/src/notification", "Notification")
@js.native
class Notification protected () extends js.Object {
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, id: java.lang.String) = this()
  def delete(): js.Promise[js.Array[requestLib.requestMod.requestNs.Response]] = js.native
  def delete(callback: DeleteNotificationCallback): scala.Unit = js.native
  def delete(options: DeleteNotificationOptions): js.Promise[js.Array[requestLib.requestMod.requestNs.Response]] = js.native
  def delete(options: DeleteNotificationOptions, callback: DeleteNotificationCallback): scala.Unit = js.native
  def get(): js.Promise[GetNotificationResponse] = js.native
  def get(callback: GetNotificationCallback): scala.Unit = js.native
  def get(options: GetNotificationOptions): js.Promise[GetNotificationResponse] = js.native
  def get(options: GetNotificationOptions, callback: GetNotificationCallback): scala.Unit = js.native
  def getMetadata(): js.Promise[GetNotificationMetadataResponse] = js.native
  def getMetadata(
    callback: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify GetMetadataCallback */ js.Any
  ): scala.Unit = js.native
  def getMetadata(options: GetNotificationMetadataOptions): js.Promise[GetNotificationMetadataResponse] = js.native
  def getMetadata(
    options: GetNotificationMetadataOptions,
    callback: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify GetMetadataCallback */ js.Any
  ): scala.Unit = js.native
}

