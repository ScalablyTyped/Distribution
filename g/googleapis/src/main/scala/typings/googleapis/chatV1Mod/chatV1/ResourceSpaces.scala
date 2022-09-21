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

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces")
@js.native
open class ResourceSpaces protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaSpace] = js.native
  def get(callback: BodyResponseCallback[SchemaSpace]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSpace] = js.native
  def get(params: ParamsResourceSpacesGet): GaxiosPromise[SchemaSpace] = js.native
  def get(params: ParamsResourceSpacesGet, callback: BodyResponseCallback[SchemaSpace]): Unit = js.native
  def get(
    params: ParamsResourceSpacesGet,
    options: BodyResponseCallback[Readable | SchemaSpace],
    callback: BodyResponseCallback[Readable | SchemaSpace]
  ): Unit = js.native
  def get(params: ParamsResourceSpacesGet, options: MethodOptions): GaxiosPromise[SchemaSpace] = js.native
  def get(
    params: ParamsResourceSpacesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSpace]
  ): Unit = js.native
  /**
    * Returns a space. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
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
    *   const res = await chat.spaces.get({
    *     // Required. Resource name of the space, in the form "spaces/x". Format: spaces/{space\}
    *     name: 'spaces/my-space',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
    *   //   "singleUserBotDm": false,
    *   //   "spaceDetails": {},
    *   //   "threaded": false,
    *   //   "type": "my_type"
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
  def get(params: ParamsResourceSpacesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSpacesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListSpacesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(params: ParamsResourceSpacesList): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(params: ParamsResourceSpacesList, callback: BodyResponseCallback[SchemaListSpacesResponse]): Unit = js.native
  def list(
    params: ParamsResourceSpacesList,
    options: BodyResponseCallback[Readable | SchemaListSpacesResponse],
    callback: BodyResponseCallback[Readable | SchemaListSpacesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceSpacesList, options: MethodOptions): GaxiosPromise[SchemaListSpacesResponse] = js.native
  def list(
    params: ParamsResourceSpacesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListSpacesResponse]
  ): Unit = js.native
  /**
    * Lists spaces the caller is a member of. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
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
    *   const res = await chat.spaces.list({
    *     // Optional. Requested page size. The value is capped at 1000. Server may return fewer results than requested. If unspecified, server will default to 100.
    *     pageSize: 'placeholder-value',
    *     // Optional. A token identifying a page of results the server should return.
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "spaces": []
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
  def list(params: ParamsResourceSpacesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceSpacesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var members: ResourceSpacesMembers = js.native
  
  var messages: ResourceSpacesMessages = js.native
  
  def webhooks(): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def webhooks(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(params: ParamsResourceSpacesWebhooks): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(params: ParamsResourceSpacesWebhooks, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def webhooks(
    params: ParamsResourceSpacesWebhooks,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def webhooks(params: ParamsResourceSpacesWebhooks, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(
    params: ParamsResourceSpacesWebhooks,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Legacy path for creating message. Calling these will result in a BadRequest response.
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
    *   const res = await chat.spaces.webhooks({
    *     // Required. Space resource name, in the form "spaces/x". Example: spaces/AAAAAAAAAAA
    *     parent: 'spaces/my-space',
    *     // Optional. A unique request ID for this message. Specifying an existing request ID returns the message created with that ID instead of creating a new message.
    *     requestId: 'placeholder-value',
    *     // Optional. Opaque thread identifier. To start or add to a thread, create a message and specify a `threadKey` instead of thread.name. (Setting thread.name has no effect.) The first message with a given `threadKey` starts a new thread. Subsequent messages with the same `threadKey` post into the same thread.
    *     threadKey: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "actionResponse": {},
    *       //   "annotations": [],
    *       //   "argumentText": "my_argumentText",
    *       //   "attachment": [],
    *       //   "cards": [],
    *       //   "cardsV2": [],
    *       //   "createTime": "my_createTime",
    *       //   "fallbackText": "my_fallbackText",
    *       //   "lastUpdateTime": "my_lastUpdateTime",
    *       //   "matchedUrl": {},
    *       //   "name": "my_name",
    *       //   "sender": {},
    *       //   "slashCommand": {},
    *       //   "space": {},
    *       //   "text": "my_text",
    *       //   "thread": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "actionResponse": {},
    *   //   "annotations": [],
    *   //   "argumentText": "my_argumentText",
    *   //   "attachment": [],
    *   //   "cards": [],
    *   //   "cardsV2": [],
    *   //   "createTime": "my_createTime",
    *   //   "fallbackText": "my_fallbackText",
    *   //   "lastUpdateTime": "my_lastUpdateTime",
    *   //   "matchedUrl": {},
    *   //   "name": "my_name",
    *   //   "sender": {},
    *   //   "slashCommand": {},
    *   //   "space": {},
    *   //   "text": "my_text",
    *   //   "thread": {}
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
  def webhooks(params: ParamsResourceSpacesWebhooks, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def webhooks(
    params: ParamsResourceSpacesWebhooks,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
