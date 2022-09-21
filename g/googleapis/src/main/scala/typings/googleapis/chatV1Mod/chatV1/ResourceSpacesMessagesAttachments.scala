package typings.googleapis.chatV1Mod.chatV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces$Messages$Attachments")
@js.native
open class ResourceSpacesMessagesAttachments protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaAttachment] = js.native
  def get(callback: BodyResponseCallback[SchemaAttachment]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def get(params: ParamsResourceSpacesMessagesAttachmentsGet): GaxiosPromise[SchemaAttachment] = js.native
  def get(
    params: ParamsResourceSpacesMessagesAttachmentsGet,
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  def get(
    params: ParamsResourceSpacesMessagesAttachmentsGet,
    options: BodyResponseCallback[Readable | SchemaAttachment],
    callback: BodyResponseCallback[Readable | SchemaAttachment]
  ): Unit = js.native
  def get(params: ParamsResourceSpacesMessagesAttachmentsGet, options: MethodOptions): GaxiosPromise[SchemaAttachment] = js.native
  def get(
    params: ParamsResourceSpacesMessagesAttachmentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAttachment]
  ): Unit = js.native
  /**
    * Gets the metadata of a message attachment. The attachment data is fetched using the media API. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/chat.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const chat = google.chat('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await chat.spaces.messages.attachments.get({
    *     // Required. Resource name of the attachment, in the form "spaces/x/messages/x/attachments/x".
    *     name: 'spaces/my-space/messages/my-message/attachments/my-attachment',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "attachmentDataRef": {},
    *   //   "contentName": "my_contentName",
    *   //   "contentType": "my_contentType",
    *   //   "downloadUri": "my_downloadUri",
    *   //   "driveDataRef": {},
    *   //   "name": "my_name",
    *   //   "source": "my_source",
    *   //   "thumbnailUri": "my_thumbnailUri"
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
  def get(params: ParamsResourceSpacesMessagesAttachmentsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSpacesMessagesAttachmentsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
