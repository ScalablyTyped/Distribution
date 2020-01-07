package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Comments")
@js.native
class Resource$Comments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.comments.delete
    * @desc Deletes a comment.
    * @alias drive.comments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCommentsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarCommentsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarCommentsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarCommentsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarCommentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.comments.get
    * @desc Gets a comment by ID.
    * @alias drive.comments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted If set, this will succeed when retrieving a deleted comment, and will include any deleted replies.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Comment] = js.native
  def get(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCommentsDollarGet): GaxiosPromise[Schema$Comment] = js.native
  def get(
    params: ParamsDollarResourceDollarCommentsDollarGet,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCommentsDollarGet,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCommentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def get(
    params: ParamsDollarResourceDollarCommentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  /**
    * drive.comments.insert
    * @desc Creates a new comment on the given file.
    * @alias drive.comments.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Comment] = js.native
  def insert(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCommentsDollarInsert): GaxiosPromise[Schema$Comment] = js.native
  def insert(
    params: ParamsDollarResourceDollarCommentsDollarInsert,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCommentsDollarInsert,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCommentsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def insert(
    params: ParamsDollarResourceDollarCommentsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  /**
    * drive.comments.list
    * @desc Lists a file's comments.
    * @alias drive.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted If set, all comments and replies, including deleted comments and replies (with content stripped) will be returned.
    * @param {integer=} params.maxResults The maximum number of discussions to include in the response, used for paging.
    * @param {string=} params.pageToken The continuation token, used to page through large result sets. To get the next page of results, set this parameter to the value of "nextPageToken" from the previous response.
    * @param {string=} params.updatedMin Only discussions that were updated after this timestamp will be returned. Formatted as an RFC 3339 timestamp.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CommentList] = js.native
  def list(callback: BodyResponseCallback[Schema$CommentList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCommentsDollarList): GaxiosPromise[Schema$CommentList] = js.native
  def list(
    params: ParamsDollarResourceDollarCommentsDollarList,
    callback: BodyResponseCallback[Schema$CommentList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCommentsDollarList,
    options: BodyResponseCallback[Schema$CommentList],
    callback: BodyResponseCallback[Schema$CommentList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCommentsDollarList, options: MethodOptions): GaxiosPromise[Schema$CommentList] = js.native
  def list(
    params: ParamsDollarResourceDollarCommentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentList]
  ): Unit = js.native
  /**
    * drive.comments.patch
    * @desc Updates an existing comment. This method supports patch semantics.
    * @alias drive.comments.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Comment] = js.native
  def patch(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCommentsDollarPatch): GaxiosPromise[Schema$Comment] = js.native
  def patch(
    params: ParamsDollarResourceDollarCommentsDollarPatch,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCommentsDollarPatch,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCommentsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def patch(
    params: ParamsDollarResourceDollarCommentsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  /**
    * drive.comments.update
    * @desc Updates an existing comment.
    * @alias drive.comments.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Comment] = js.native
  def update(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCommentsDollarUpdate): GaxiosPromise[Schema$Comment] = js.native
  def update(
    params: ParamsDollarResourceDollarCommentsDollarUpdate,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCommentsDollarUpdate,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCommentsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def update(
    params: ParamsDollarResourceDollarCommentsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
}

