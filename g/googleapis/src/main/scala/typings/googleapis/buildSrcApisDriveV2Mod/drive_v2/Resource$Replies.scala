package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Replies")
@js.native
class Resource$Replies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.replies.delete
    * @desc Deletes a reply.
    * @alias drive.replies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRepliesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarRepliesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRepliesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRepliesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarRepliesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.replies.get
    * @desc Gets a reply.
    * @alias drive.replies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted If set, this will succeed when retrieving a deleted reply.
    * @param {string} params.replyId The ID of the reply.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CommentReply] = js.native
  def get(callback: BodyResponseCallback[Schema$CommentReply]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRepliesDollarGet): GaxiosPromise[Schema$CommentReply] = js.native
  def get(
    params: ParamsDollarResourceDollarRepliesDollarGet,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRepliesDollarGet,
    options: BodyResponseCallback[Schema$CommentReply],
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRepliesDollarGet, options: MethodOptions): GaxiosPromise[Schema$CommentReply] = js.native
  def get(
    params: ParamsDollarResourceDollarRepliesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  /**
    * drive.replies.insert
    * @desc Creates a new reply to the given comment.
    * @alias drive.replies.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {().CommentReply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CommentReply] = js.native
  def insert(callback: BodyResponseCallback[Schema$CommentReply]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRepliesDollarInsert): GaxiosPromise[Schema$CommentReply] = js.native
  def insert(
    params: ParamsDollarResourceDollarRepliesDollarInsert,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarRepliesDollarInsert,
    options: BodyResponseCallback[Schema$CommentReply],
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarRepliesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$CommentReply] = js.native
  def insert(
    params: ParamsDollarResourceDollarRepliesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  /**
    * drive.replies.list
    * @desc Lists all of the replies to a comment.
    * @alias drive.replies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted If set, all replies, including deleted replies (with content stripped) will be returned.
    * @param {integer=} params.maxResults The maximum number of replies to include in the response, used for paging.
    * @param {string=} params.pageToken The continuation token, used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CommentReplyList] = js.native
  def list(callback: BodyResponseCallback[Schema$CommentReplyList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRepliesDollarList): GaxiosPromise[Schema$CommentReplyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRepliesDollarList,
    callback: BodyResponseCallback[Schema$CommentReplyList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRepliesDollarList,
    options: BodyResponseCallback[Schema$CommentReplyList],
    callback: BodyResponseCallback[Schema$CommentReplyList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRepliesDollarList, options: MethodOptions): GaxiosPromise[Schema$CommentReplyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRepliesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentReplyList]
  ): Unit = js.native
  /**
    * drive.replies.patch
    * @desc Updates an existing reply. This method supports patch semantics.
    * @alias drive.replies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {().CommentReply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CommentReply] = js.native
  def patch(callback: BodyResponseCallback[Schema$CommentReply]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRepliesDollarPatch): GaxiosPromise[Schema$CommentReply] = js.native
  def patch(
    params: ParamsDollarResourceDollarRepliesDollarPatch,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarRepliesDollarPatch,
    options: BodyResponseCallback[Schema$CommentReply],
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarRepliesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CommentReply] = js.native
  def patch(
    params: ParamsDollarResourceDollarRepliesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  /**
    * drive.replies.update
    * @desc Updates an existing reply.
    * @alias drive.replies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {().CommentReply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CommentReply] = js.native
  def update(callback: BodyResponseCallback[Schema$CommentReply]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRepliesDollarUpdate): GaxiosPromise[Schema$CommentReply] = js.native
  def update(
    params: ParamsDollarResourceDollarRepliesDollarUpdate,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRepliesDollarUpdate,
    options: BodyResponseCallback[Schema$CommentReply],
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRepliesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$CommentReply] = js.native
  def update(
    params: ParamsDollarResourceDollarRepliesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentReply]
  ): Unit = js.native
}

