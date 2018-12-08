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
  extends atGoogleDashCloudCommonLib.commonMod.ServiceObject[js.Object] {
  def this(bucket: atGoogleDashCloudStorageLib.buildSrcBucketMod.Bucket, id: java.lang.String) = this()
  /**
       * @typedef {array} DeleteNotificationResponse
       * @property {object} 0 The full API response.
       */
  /**
       * Permanently deletes a notification subscription.
       *
       * @see [Notifications: delete API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/notifications/delete}
       *
       * @param {object} [options] Configuration options.
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {DeleteNotificationCallback} [callback] Callback function.
       * @returns {Promise<DeleteNotificationResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const myBucket = storage.bucket('my-bucket');
       * const notification = myBucket.notification('1');
       *
       * notification.delete(function(err, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * notification.delete().then(function(data) {
       *   const apiResponse = data[0];
       * });
       *
       * @example <caption>include:samples/notifications.js</caption>
       * region_tag:storage_delete_notification
       * Another example:
       */
  def delete(options: DeleteNotificationOptions): stdLib.Promise[js.Array[requestLib.requestMod.requestNs.Response]] = js.native
  def delete(options: DeleteNotificationOptions, callback: DeleteNotificationCallback): scala.Unit = js.native
  /**
       * Get a notification and its metadata if it exists.
       *
       * @see [Notifications: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/notifications/get}
       *
       * @param {object} [options] Configuration options.
       *     See {@link Bucket#createNotification} for create options.
       * @param {boolean} [options.autoCreate] Automatically create the object if
       *     it does not exist. Default: `false`.
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {GetNotificationCallback} [callback] Callback function.
       * @return {Promise<GetNotificationCallback>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const myBucket = storage.bucket('my-bucket');
       * const notification = myBucket.notification('1');
       *
       * notification.get(function(err, notification, apiResponse) {
       *   // `notification.metadata` has been populated.
       * });
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * notification.get().then(function(data) {
       *   const notification = data[0];
       *   const apiResponse = data[1];
       * });
       */
  def get(options: GetNotificationOptions): stdLib.Promise[GetNotificationResponse] = js.native
  def get(options: GetNotificationOptions, callback: GetNotificationCallback): scala.Unit = js.native
  /**
       * Get the notification's metadata.
       *
       * @see [Notifications: get API Documentation]{@link https://cloud.google.com/storage/docs/json_api/v1/notifications/get}
       *
       * @param {object} [options] Configuration options.
       * @param {string} [options.userProject] The ID of the project which will be
       *     billed for the request.
       * @param {GetNotificationMetadataCallback} [callback] Callback function.
       * @returns {Promise<GetNotificationMetadataResponse>}
       *
       * @example
       * const {Storage} = require('@google-cloud/storage');
       * const storage = new Storage();
       * const myBucket = storage.bucket('my-bucket');
       * const notification = myBucket.notification('1');
       *
       * notification.getMetadata(function(err, metadata, apiResponse) {});
       *
       * //-
       * // If the callback is omitted, we'll return a Promise.
       * //-
       * notification.getMetadata().then(function(data) {
       *   const metadata = data[0];
       *   const apiResponse = data[1];
       * });
       *
       * @example <caption>include:samples/notifications.js</caption>
       * region_tag:storage_notifications_get_metadata
       * Another example:
       */
  def getMetadata(options: GetNotificationMetadataOptions): stdLib.Promise[GetNotificationMetadataResponse] = js.native
  def getMetadata(
    options: GetNotificationMetadataOptions,
    callback: atGoogleDashCloudCommonLib.buildSrcServiceDashObjectMod.GetMetadataCallback
  ): scala.Unit = js.native
}

