package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Notifications")
@js.native
class Resource$Notifications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.notifications.delete
    * @desc Permanently deletes a notification subscription.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The parent bucket of the notification.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // ID of the notification to delete.
    *     notification: 'my-notification',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.notifications.delete(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.notifications.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket The parent bucket of the notification.
    * @param {string} params.notification ID of the notification to delete.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNotificationsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarNotificationsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarNotificationsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarNotificationsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarNotificationsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.notifications.get
    * @desc View a notification configuration.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The parent bucket of the notification.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Notification ID
    *     notification: 'my-notification',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.notifications.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.notifications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket The parent bucket of the notification.
    * @param {string} params.notification Notification ID
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Notification] = js.native
  def get(callback: BodyResponseCallback[Schema$Notification]): Unit = js.native
  def get(params: ParamsDollarResourceDollarNotificationsDollarGet): GaxiosPromise[Schema$Notification] = js.native
  def get(
    params: ParamsDollarResourceDollarNotificationsDollarGet,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarNotificationsDollarGet,
    options: BodyResponseCallback[Schema$Notification],
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarNotificationsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Notification] = js.native
  def get(
    params: ParamsDollarResourceDollarNotificationsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  /**
    * storage.notifications.insert
    * @desc Creates a notification subscription for a given bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The parent bucket of the notification.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.notifications.insert(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.notifications.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket The parent bucket of the notification.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Notification} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Notification] = js.native
  def insert(callback: BodyResponseCallback[Schema$Notification]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarNotificationsDollarInsert): GaxiosPromise[Schema$Notification] = js.native
  def insert(
    params: ParamsDollarResourceDollarNotificationsDollarInsert,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarNotificationsDollarInsert,
    options: BodyResponseCallback[Schema$Notification],
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarNotificationsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Notification] = js.native
  def insert(
    params: ParamsDollarResourceDollarNotificationsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  /**
    * storage.notifications.list
    * @desc Retrieves a list of notification subscriptions for a given bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of a Google Cloud Storage bucket.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.notifications.list(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias storage.notifications.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of a Google Cloud Storage bucket.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Notifications] = js.native
  def list(callback: BodyResponseCallback[Schema$Notifications]): Unit = js.native
  def list(params: ParamsDollarResourceDollarNotificationsDollarList): GaxiosPromise[Schema$Notifications] = js.native
  def list(
    params: ParamsDollarResourceDollarNotificationsDollarList,
    callback: BodyResponseCallback[Schema$Notifications]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarNotificationsDollarList,
    options: BodyResponseCallback[Schema$Notifications],
    callback: BodyResponseCallback[Schema$Notifications]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarNotificationsDollarList, options: MethodOptions): GaxiosPromise[Schema$Notifications] = js.native
  def list(
    params: ParamsDollarResourceDollarNotificationsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Notifications]
  ): Unit = js.native
}

