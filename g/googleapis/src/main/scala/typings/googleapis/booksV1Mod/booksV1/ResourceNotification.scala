package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Notification")
@js.native
class ResourceNotification protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * books.notification.get
    * @desc Returns notification details for a given notification id.
    * @alias books.notification.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.locale ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating notification title and body.
    * @param {string} params.notification_id String to identify the notification.
    * @param {string=} params.source String to identify the originator of this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaNotification] = js.native
  def get(callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(params: ParamsResourceNotificationGet): GaxiosPromise[SchemaNotification] = js.native
  def get(params: ParamsResourceNotificationGet, callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(
    params: ParamsResourceNotificationGet,
    options: BodyResponseCallback[SchemaNotification],
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  def get(params: ParamsResourceNotificationGet, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def get(
    params: ParamsResourceNotificationGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
}

