package typings.googleapis.chatV1Mod.chatV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces$Messages")
@js.native
class ResourceSpacesMessages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * chat.spaces.messages.create
    * @desc Creates a message.
    * @alias chat.spaces.messages.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. Space resource name, in the form "spaces/x". Example: spaces/AAAAMpdlehY
    * @param {string=} params.threadKey Opaque thread identifier string that can be specified to group messages into a single thread. If this is the first message with a given thread identifier, a new thread is created. Subsequent messages with the same thread identifier will be posted into the same thread. This relieves bots and webhooks from having to store the Hangouts Chat thread ID of a thread (created earlier by them) to post further updates to it.  Has no effect if thread field, corresponding to an existing thread, is set in message.
    * @param {().Message} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaMessage] = js.native
  def create(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def create(params: ParamsResourceSpacesMessagesCreate): GaxiosPromise[SchemaMessage] = js.native
  def create(params: ParamsResourceSpacesMessagesCreate, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def create(
    params: ParamsResourceSpacesMessagesCreate,
    options: BodyResponseCallback[SchemaMessage],
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def create(params: ParamsResourceSpacesMessagesCreate, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def create(
    params: ParamsResourceSpacesMessagesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * chat.spaces.messages.delete
    * @desc Deletes a message.
    * @alias chat.spaces.messages.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name of the message to be deleted, in the form "spaces/x/messages/x"  Example: spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSpacesMessagesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceSpacesMessagesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceSpacesMessagesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceSpacesMessagesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceSpacesMessagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * chat.spaces.messages.get
    * @desc Returns a message.
    * @alias chat.spaces.messages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name of the message to be retrieved, in the form "spaces/x/messages/x".  Example: spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaMessage] = js.native
  def get(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(params: ParamsResourceSpacesMessagesGet): GaxiosPromise[SchemaMessage] = js.native
  def get(params: ParamsResourceSpacesMessagesGet, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def get(
    params: ParamsResourceSpacesMessagesGet,
    options: BodyResponseCallback[SchemaMessage],
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def get(params: ParamsResourceSpacesMessagesGet, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def get(
    params: ParamsResourceSpacesMessagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  /**
    * chat.spaces.messages.update
    * @desc Updates a message.
    * @alias chat.spaces.messages.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Resource name, in the form "spaces/x/messages/x".  Example: spaces/AAAAMpdlehY/messages/UMxbHmzDlr4.UMxbHmzDlr4
    * @param {string=} params.updateMask Required. The field paths to be updated.  Currently supported field paths: "text", "cards".
    * @param {().Message} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaMessage] = js.native
  def update(callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def update(params: ParamsResourceSpacesMessagesUpdate): GaxiosPromise[SchemaMessage] = js.native
  def update(params: ParamsResourceSpacesMessagesUpdate, callback: BodyResponseCallback[SchemaMessage]): Unit = js.native
  def update(
    params: ParamsResourceSpacesMessagesUpdate,
    options: BodyResponseCallback[SchemaMessage],
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
  def update(params: ParamsResourceSpacesMessagesUpdate, options: MethodOptions): GaxiosPromise[SchemaMessage] = js.native
  def update(
    params: ParamsResourceSpacesMessagesUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMessage]
  ): Unit = js.native
}

