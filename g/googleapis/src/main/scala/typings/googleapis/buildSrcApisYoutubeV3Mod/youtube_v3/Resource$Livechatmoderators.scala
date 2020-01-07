package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Livechatmoderators")
@js.native
class Resource$Livechatmoderators protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.liveChatModerators.delete
    * @desc Removes a chat moderator.
    * @alias youtube.liveChatModerators.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The id parameter identifies the chat moderator to remove. The value uniquely identifies both the moderator and the chat.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLivechatmoderatorsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarLivechatmoderatorsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * youtube.liveChatModerators.insert
    * @desc Adds a new moderator for the chat.
    * @alias youtube.liveChatModerators.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter serves two purposes in this operation. It identifies the properties that the write operation will set as well as the properties that the API response returns. Set the parameter value to snippet.
    * @param {().LiveChatModerator} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$LiveChatModerator] = js.native
  def insert(callback: BodyResponseCallback[Schema$LiveChatModerator]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLivechatmoderatorsDollarInsert): GaxiosPromise[Schema$LiveChatModerator] = js.native
  def insert(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarInsert,
    callback: BodyResponseCallback[Schema$LiveChatModerator]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarInsert,
    options: BodyResponseCallback[Schema$LiveChatModerator],
    callback: BodyResponseCallback[Schema$LiveChatModerator]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarLivechatmoderatorsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$LiveChatModerator] = js.native
  def insert(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveChatModerator]
  ): Unit = js.native
  /**
    * youtube.liveChatModerators.list
    * @desc Lists moderators for a live chat.
    * @alias youtube.liveChatModerators.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.liveChatId The liveChatId parameter specifies the YouTube live chat for which the API should return moderators.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    * @param {string} params.part The part parameter specifies the liveChatModerator resource parts that the API response will include. Supported values are id and snippet.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$LiveChatModeratorListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$LiveChatModeratorListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarLivechatmoderatorsDollarList): GaxiosPromise[Schema$LiveChatModeratorListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarList,
    callback: BodyResponseCallback[Schema$LiveChatModeratorListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarList,
    options: BodyResponseCallback[Schema$LiveChatModeratorListResponse],
    callback: BodyResponseCallback[Schema$LiveChatModeratorListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarLivechatmoderatorsDollarList, options: MethodOptions): GaxiosPromise[Schema$LiveChatModeratorListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarLivechatmoderatorsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LiveChatModeratorListResponse]
  ): Unit = js.native
}

