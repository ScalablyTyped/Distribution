package typings.googleapis.buildSrcApisIndexingV3Mod.indexing_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/indexing/v3", "indexing_v3.Resource$Urlnotifications")
@js.native
class Resource$Urlnotifications protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * indexing.urlNotifications.getMetadata
    * @desc Gets metadata about a Web Document. This method can _only_ be used
    * to query URLs that were previously seen in successful Indexing API
    * notifications. Includes the latest `UrlNotification` received via this
    * API.
    * @alias indexing.urlNotifications.getMetadata
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.url URL that is being queried.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetadata(): GaxiosPromise[Schema$UrlNotificationMetadata] = js.native
  def getMetadata(callback: BodyResponseCallback[Schema$UrlNotificationMetadata]): Unit = js.native
  def getMetadata(params: ParamsDollarResourceDollarUrlnotificationsDollarGetmetadata): GaxiosPromise[Schema$UrlNotificationMetadata] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarUrlnotificationsDollarGetmetadata,
    callback: BodyResponseCallback[Schema$UrlNotificationMetadata]
  ): Unit = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarUrlnotificationsDollarGetmetadata,
    options: BodyResponseCallback[Schema$UrlNotificationMetadata],
    callback: BodyResponseCallback[Schema$UrlNotificationMetadata]
  ): Unit = js.native
  def getMetadata(params: ParamsDollarResourceDollarUrlnotificationsDollarGetmetadata, options: MethodOptions): GaxiosPromise[Schema$UrlNotificationMetadata] = js.native
  def getMetadata(
    params: ParamsDollarResourceDollarUrlnotificationsDollarGetmetadata,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UrlNotificationMetadata]
  ): Unit = js.native
  /**
    * indexing.urlNotifications.publish
    * @desc Notifies that a URL has been updated or deleted.
    * @alias indexing.urlNotifications.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().UrlNotification} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[Schema$PublishUrlNotificationResponse] = js.native
  def publish(callback: BodyResponseCallback[Schema$PublishUrlNotificationResponse]): Unit = js.native
  def publish(params: ParamsDollarResourceDollarUrlnotificationsDollarPublish): GaxiosPromise[Schema$PublishUrlNotificationResponse] = js.native
  def publish(
    params: ParamsDollarResourceDollarUrlnotificationsDollarPublish,
    callback: BodyResponseCallback[Schema$PublishUrlNotificationResponse]
  ): Unit = js.native
  def publish(
    params: ParamsDollarResourceDollarUrlnotificationsDollarPublish,
    options: BodyResponseCallback[Schema$PublishUrlNotificationResponse],
    callback: BodyResponseCallback[Schema$PublishUrlNotificationResponse]
  ): Unit = js.native
  def publish(params: ParamsDollarResourceDollarUrlnotificationsDollarPublish, options: MethodOptions): GaxiosPromise[Schema$PublishUrlNotificationResponse] = js.native
  def publish(
    params: ParamsDollarResourceDollarUrlnotificationsDollarPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PublishUrlNotificationResponse]
  ): Unit = js.native
}

