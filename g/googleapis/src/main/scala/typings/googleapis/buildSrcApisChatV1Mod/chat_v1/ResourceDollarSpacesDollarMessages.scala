package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/chat/v1", "chat_v1.Resource$Spaces$Messages")
@js.native
class ResourceDollarSpacesDollarMessages protected () extends js.Object {
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
  def create(): GaxiosPromise[Schema$Message] = js.native
  def create(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def create(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarCreate): GaxiosPromise[Schema$Message] = js.native
  def create(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarCreate,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarCreate,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def create(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
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
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
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
  def get(): GaxiosPromise[Schema$Message] = js.native
  def get(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarGet): GaxiosPromise[Schema$Message] = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarGet,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarGet,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def get(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
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
  def update(): GaxiosPromise[Schema$Message] = js.native
  def update(callback: BodyResponseCallback[Schema$Message]): Unit = js.native
  def update(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarUpdate): GaxiosPromise[Schema$Message] = js.native
  def update(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarUpdate,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarUpdate,
    options: BodyResponseCallback[Schema$Message],
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarSpacesDollarMessagesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Message] = js.native
  def update(
    params: ParamsDollarResourceDollarSpacesDollarMessagesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Message]
  ): Unit = js.native
}

