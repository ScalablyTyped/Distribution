package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Notification")
@js.native
class Resource$Notification protected () extends js.Object {
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
  def get(): GaxiosPromise[Schema$Notification] = js.native
  def get(callback: BodyResponseCallback[Schema$Notification]): Unit = js.native
  def get(params: ParamsDollarResourceDollarNotificationDollarGet): GaxiosPromise[Schema$Notification] = js.native
  def get(
    params: ParamsDollarResourceDollarNotificationDollarGet,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarNotificationDollarGet,
    options: BodyResponseCallback[Schema$Notification],
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarNotificationDollarGet, options: MethodOptions): GaxiosPromise[Schema$Notification] = js.native
  def get(
    params: ParamsDollarResourceDollarNotificationDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Notification]
  ): Unit = js.native
}

