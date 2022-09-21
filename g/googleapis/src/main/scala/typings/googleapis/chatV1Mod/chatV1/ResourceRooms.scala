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

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Rooms")
@js.native
open class ResourceRooms protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var conversations: ResourceRoomsConversations = js.native
  
  def messages(): GaxiosPromise[SchemaMessage] = js.native
  def messages(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def messages(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def messages(params: ParamsResourceRoomsMessages): GaxiosPromise[SchemaMessage] = js.native
  def messages(params: ParamsResourceRoomsMessages, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def messages(
    params: ParamsResourceRoomsMessages,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def messages(params: ParamsResourceRoomsMessages, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def messages(
    params: ParamsResourceRoomsMessages,
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
    *   const res = await chat.rooms.messages({
    *     // Required. Space resource name, in the form "spaces/x". Example: spaces/AAAAAAAAAAA
    *     parent: 'rooms/my-room',
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
  def messages(params: ParamsResourceRoomsMessages, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def messages(
    params: ParamsResourceRoomsMessages,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def webhooks(): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def webhooks(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(params: ParamsResourceRoomsWebhooks): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(params: ParamsResourceRoomsWebhooks, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def webhooks(
    params: ParamsResourceRoomsWebhooks,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def webhooks(params: ParamsResourceRoomsWebhooks, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def webhooks(
    params: ParamsResourceRoomsWebhooks,
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
    *   const res = await chat.rooms.webhooks({
    *     // Required. Space resource name, in the form "spaces/x". Example: spaces/AAAAAAAAAAA
    *     parent: 'rooms/my-room',
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
  def webhooks(params: ParamsResourceRoomsWebhooks, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def webhooks(
    params: ParamsResourceRoomsWebhooks,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
