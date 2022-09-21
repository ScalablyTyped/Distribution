package typings.googleapis.booksV1Mod.booksV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/books/v1", "books_v1.Resource$Notification")
@js.native
open class ResourceNotification protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaNotification] = js.native
  def get(callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def get(params: ParamsResourceNotificationGet): GaxiosPromise[SchemaNotification] = js.native
  def get(params: ParamsResourceNotificationGet, callback: BodyResponseCallback[SchemaNotification]): Unit = js.native
  def get(
    params: ParamsResourceNotificationGet,
    options: BodyResponseCallback[Readable | SchemaNotification],
    callback: BodyResponseCallback[Readable | SchemaNotification]
  ): Unit = js.native
  def get(params: ParamsResourceNotificationGet, options: MethodOptions): GaxiosPromise[SchemaNotification] = js.native
  def get(
    params: ParamsResourceNotificationGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNotification]
  ): Unit = js.native
  /**
    * Returns notification details for a given notification id.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/books.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const books = google.books('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/books'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await books.notification.get({
    *     // ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating notification title and body.
    *     locale: 'placeholder-value',
    *     // String to identify the notification.
    *     notification_id: 'placeholder-value',
    *     // String to identify the originator of this request.
    *     source: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "body": "my_body",
    *   //   "crmExperimentIds": [],
    *   //   "doc_id": "my_doc_id",
    *   //   "doc_type": "my_doc_type",
    *   //   "dont_show_notification": false,
    *   //   "iconUrl": "my_iconUrl",
    *   //   "is_document_mature": false,
    *   //   "kind": "my_kind",
    *   //   "notificationGroup": "my_notificationGroup",
    *   //   "notification_type": "my_notification_type",
    *   //   "pcampaign_id": "my_pcampaign_id",
    *   //   "reason": "my_reason",
    *   //   "show_notification_settings_action": false,
    *   //   "targetUrl": "my_targetUrl",
    *   //   "timeToExpireMs": "my_timeToExpireMs",
    *   //   "title": "my_title"
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def get(params: ParamsResourceNotificationGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceNotificationGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
