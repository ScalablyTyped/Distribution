package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Livechatbans")
@js.native
class Resource$Livechatbans protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.liveChatBans.delete
    * @desc Removes a chat ban.
    * @alias youtube.liveChatBans.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter identifies the chat ban to remove. The value uniquely identifies both the ban and the chat.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLivechatbansDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarLivechatbansDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarLivechatbansDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLivechatbansDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLivechatbansDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.liveChatBans.insert
    * @desc Adds a new ban to the chat.
    * @alias youtube.liveChatBans.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response returns. Set the parameter value to snippet.
    * @param {().LiveChatBan} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$LiveChatBan] = js.native
  def insert(callback: BodyResponseCallback[Schema$LiveChatBan]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLivechatbansDollarInsert): GaxiosPromise[Schema$LiveChatBan] = js.native
  def insert(
    params: ParamsDollarResourceDollarLivechatbansDollarInsert,
    callback: BodyResponseCallback[Schema$LiveChatBan]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarLivechatbansDollarInsert,
    options: BodyResponseCallback[Schema$LiveChatBan],
    callback: BodyResponseCallback[Schema$LiveChatBan]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLivechatbansDollarInsert, options: MethodOptions): GaxiosPromise[Schema$LiveChatBan] = js.native
  def insert(
    params: ParamsDollarResourceDollarLivechatbansDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveChatBan]
  ): Unit = js.native
}

