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
@JSImport("@google-cloud/storage/build/src/notification", "Notification")
@js.native
class Notification protected ()
  extends atGoogleDashCloudCommonLib.atGoogleDashCloudCommonMod.ServiceObject[js.Any] {
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, id: java.lang.String) = this()
  def delete(options: DeleteNotificationOptions): js.Promise[js.Array[atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.Metadata]] = js.native
  def delete(options: DeleteNotificationOptions, callback: DeleteNotificationCallback): scala.Unit = js.native
  def get(options: GetNotificationOptions): js.Promise[GetNotificationResponse] = js.native
  def get(options: GetNotificationOptions, callback: GetNotificationCallback): scala.Unit = js.native
  def getMetadata(options: GetNotificationMetadataOptions): js.Promise[GetNotificationMetadataResponse] = js.native
  def getMetadata(
    options: GetNotificationMetadataOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.MetadataCallback
  ): scala.Unit = js.native
}

