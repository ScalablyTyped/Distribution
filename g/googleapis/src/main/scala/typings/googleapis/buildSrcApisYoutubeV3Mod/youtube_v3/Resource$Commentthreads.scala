package typings.googleapis.buildSrcApisYoutubeV3Mod.youtube_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtube/v3", "youtube_v3.Resource$Commentthreads")
@js.native
class Resource$Commentthreads protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * youtube.commentThreads.insert
    * @desc Creates a new top-level comment. To add a reply to an existing
    * comment, use the comments.insert method instead.
    * @alias youtube.commentThreads.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter identifies the properties that the API response will include. Set the parameter value to snippet. The snippet part has a quota cost of 2 units.
    * @param {().CommentThread} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CommentThread] = js.native
  def insert(callback: BodyResponseCallback[Schema$CommentThread]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCommentthreadsDollarInsert): GaxiosPromise[Schema$CommentThread] = js.native
  def insert(
    params: ParamsDollarResourceDollarCommentthreadsDollarInsert,
    callback: BodyResponseCallback[Schema$CommentThread]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCommentthreadsDollarInsert,
    options: BodyResponseCallback[Schema$CommentThread],
    callback: BodyResponseCallback[Schema$CommentThread]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCommentthreadsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CommentThread] = js.native
  def insert(
    params: ParamsDollarResourceDollarCommentthreadsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentThread]
  ): Unit = js.native
  /**
    * youtube.commentThreads.list
    * @desc Returns a list of comment threads that match the API request
    * parameters.
    * @alias youtube.commentThreads.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.allThreadsRelatedToChannelId The allThreadsRelatedToChannelId parameter instructs the API to return all comment threads associated with the specified channel. The response can include comments about the channel or about the channel's videos.
    * @param {string=} params.channelId The channelId parameter instructs the API to return comment threads containing comments about the specified channel. (The response will not include comments left on videos that the channel uploaded.)
    * @param {string=} params.id The id parameter specifies a comma-separated list of comment thread IDs for the resources that should be retrieved.
    * @param {integer=} params.maxResults The maxResults parameter specifies the maximum number of items that should be returned in the result set.  Note: This parameter is not supported for use in conjunction with the id parameter.
    * @param {string=} params.moderationStatus Set this parameter to limit the returned comment threads to a particular moderation state.  Note: This parameter is not supported for use in conjunction with the id parameter.
    * @param {string=} params.order The order parameter specifies the order in which the API response should list comment threads. Valid values are:  - time - Comment threads are ordered by time. This is the default behavior. - relevance - Comment threads are ordered by relevance.Note: This parameter is not supported for use in conjunction with the id parameter.
    * @param {string=} params.pageToken The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken property identifies the next page of the result that can be retrieved.  Note: This parameter is not supported for use in conjunction with the id parameter.
    * @param {string} params.part The part parameter specifies a comma-separated list of one or more commentThread resource properties that the API response will include.
    * @param {string=} params.searchTerms The searchTerms parameter instructs the API to limit the API response to only contain comments that contain the specified search terms.  Note: This parameter is not supported for use in conjunction with the id parameter.
    * @param {string=} params.textFormat Set this parameter's value to html or plainText to instruct the API to return the comments left by users in html formatted or in plain text.
    * @param {string=} params.videoId The videoId parameter instructs the API to return comment threads associated with the specified video ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CommentThreadListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CommentThreadListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCommentthreadsDollarList): GaxiosPromise[Schema$CommentThreadListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCommentthreadsDollarList,
    callback: BodyResponseCallback[Schema$CommentThreadListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCommentthreadsDollarList,
    options: BodyResponseCallback[Schema$CommentThreadListResponse],
    callback: BodyResponseCallback[Schema$CommentThreadListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCommentthreadsDollarList, options: MethodOptions): GaxiosPromise[Schema$CommentThreadListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCommentthreadsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentThreadListResponse]
  ): Unit = js.native
  /**
    * youtube.commentThreads.update
    * @desc Modifies the top-level comment in a comment thread.
    * @alias youtube.commentThreads.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.part The part parameter specifies a comma-separated list of commentThread resource properties that the API response will include. You must at least include the snippet part in the parameter value since that part contains all of the properties that the API request can update.
    * @param {().CommentThread} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CommentThread] = js.native
  def update(callback: BodyResponseCallback[Schema$CommentThread]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCommentthreadsDollarUpdate): GaxiosPromise[Schema$CommentThread] = js.native
  def update(
    params: ParamsDollarResourceDollarCommentthreadsDollarUpdate,
    callback: BodyResponseCallback[Schema$CommentThread]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCommentthreadsDollarUpdate,
    options: BodyResponseCallback[Schema$CommentThread],
    callback: BodyResponseCallback[Schema$CommentThread]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCommentthreadsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CommentThread] = js.native
  def update(
    params: ParamsDollarResourceDollarCommentthreadsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentThread]
  ): Unit = js.native
}

