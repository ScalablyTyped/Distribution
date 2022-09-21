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

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces$Messages")
@js.native
open class ResourceSpacesMessages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var attachments: ResourceSpacesMessagesAttachments = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaMessage] = js.native
  def create(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def create(params: ParamsResourceSpacesMessagesCreate): GaxiosPromise[SchemaMessage] = js.native
  def create(params: ParamsResourceSpacesMessagesCreate, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def create(
    params: ParamsResourceSpacesMessagesCreate,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def create(params: ParamsResourceSpacesMessagesCreate, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def create(
    params: ParamsResourceSpacesMessagesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Creates a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
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
    *   const res = await chat.spaces.messages.create({
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
  def create(params: ParamsResourceSpacesMessagesCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceSpacesMessagesCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSpacesMessagesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSpacesMessagesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSpacesMessagesDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSpacesMessagesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSpacesMessagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
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
    *   const res = await chat.spaces.messages.delete({
    *     // Required. Resource name of the message to be deleted, in the form "spaces/x/messages/x" Example: spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB
    *     name: 'spaces/my-space/messages/my-message',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceSpacesMessagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceSpacesMessagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaMessage] = js.native
  def get(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(params: ParamsResourceSpacesMessagesGet): GaxiosPromise[SchemaMessage] = js.native
  def get(params: ParamsResourceSpacesMessagesGet, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def get(
    params: ParamsResourceSpacesMessagesGet,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def get(params: ParamsResourceSpacesMessagesGet, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(
    params: ParamsResourceSpacesMessagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Returns a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
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
    *   const res = await chat.spaces.messages.get({
    *     // Required. Resource name of the message to be retrieved, in the form "spaces/x/messages/x". Example: spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB
    *     name: 'spaces/my-space/messages/my-message',
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
  def get(params: ParamsResourceSpacesMessagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceSpacesMessagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def update(): GaxiosPromise[SchemaMessage] = js.native
  def update(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def update(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def update(params: ParamsResourceSpacesMessagesUpdate): GaxiosPromise[SchemaMessage] = js.native
  def update(params: ParamsResourceSpacesMessagesUpdate, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def update(
    params: ParamsResourceSpacesMessagesUpdate,
    options: BodyResponseCallback[Readable | SchemaMessage],
    callback: BodyResponseCallback[Readable | SchemaMessage]
  ): Unit = js.native
  def update(params: ParamsResourceSpacesMessagesUpdate, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def update(
    params: ParamsResourceSpacesMessagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * Updates a message. Requires [service account authentication](https://developers.google.com/chat/api/guides/auth/service-accounts).
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
    *   const res = await chat.spaces.messages.update({
    *     // Resource name in the form `spaces/x/messages/x`. Example: `spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB`
    *     name: 'spaces/my-space/messages/my-message',
    *     // Required. The field paths to update. Separate multiple values with commas. Currently supported field paths: - text - cards (Requires [service account authentication](/chat/api/guides/auth/service-accounts).)
    *     updateMask: 'placeholder-value',
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
  def update(params: ParamsResourceSpacesMessagesUpdate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def update(
    params: ParamsResourceSpacesMessagesUpdate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
