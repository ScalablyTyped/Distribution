package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Notifications")
@js.native
class Resource$Notifications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.notifications.delete
    * @desc Deletes a notification
    * @alias directory.notifications.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. The customerId is also returned as part of the Users resource.
    * @param {string} params.notificationId The unique ID of the notification.
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
    * directory.notifications.get
    * @desc Retrieves a notification.
    * @alias directory.notifications.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. The customerId is also returned as part of the Users resource.
    * @param {string} params.notificationId The unique ID of the notification.
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
    * directory.notifications.list
    * @desc Retrieves a list of notifications.
    * @alias directory.notifications.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account.
    * @param {string=} params.language The ISO 639-1 code of the language notifications are returned in. The default is English (en).
    * @param {integer=} params.maxResults Maximum number of notifications to return per page. The default is 100.
    * @param {string=} params.pageToken The token to specify the page of results to retrieve.
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
  /**
    * directory.notifications.patch
    * @desc Updates a notification. This method supports patch semantics.
    * @alias directory.notifications.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account.
    * @param {string} params.notificationId The unique ID of the notification.
    * @param {().Notification} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Notification] = js.native
  def patch(callback: BodyResponseCallback[Schema$Notification]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarNotificationsDollarPatch): GaxiosPromise[Schema$Notification] = js.native
  def patch(
    params: ParamsDollarResourceDollarNotificationsDollarPatch,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarNotificationsDollarPatch,
    options: BodyResponseCallback[Schema$Notification],
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarNotificationsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Notification] = js.native
  def patch(
    params: ParamsDollarResourceDollarNotificationsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  /**
    * directory.notifications.update
    * @desc Updates a notification.
    * @alias directory.notifications.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account.
    * @param {string} params.notificationId The unique ID of the notification.
    * @param {().Notification} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Notification] = js.native
  def update(callback: BodyResponseCallback[Schema$Notification]): Unit = js.native
  def update(params: ParamsDollarResourceDollarNotificationsDollarUpdate): GaxiosPromise[Schema$Notification] = js.native
  def update(
    params: ParamsDollarResourceDollarNotificationsDollarUpdate,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarNotificationsDollarUpdate,
    options: BodyResponseCallback[Schema$Notification],
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarNotificationsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Notification] = js.native
  def update(
    params: ParamsDollarResourceDollarNotificationsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
}

