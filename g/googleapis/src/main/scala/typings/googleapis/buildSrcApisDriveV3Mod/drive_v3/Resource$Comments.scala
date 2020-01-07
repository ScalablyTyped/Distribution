package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Comments")
@js.native
class Resource$Comments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.comments.create
    * @desc Creates a new comment on a file.
    * @alias drive.comments.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {().Comment} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Comment] = js.native
  def create(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def create(params: ParamsDollarResourceDollarCommentsDollarCreate): GaxiosPromise[Schema$Comment] = js.native
  def create(
    params: ParamsDollarResourceDollarCommentsDollarCreate,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarCommentsDollarCreate,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarCommentsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def create(
    params: ParamsDollarResourceDollarCommentsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
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
    * @param {boolean=} params.includeDeleted Whether to return deleted comments. Deleted comments will not include their original content.
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
    * drive.comments.list
    * @desc Lists a file's comments.
    * @alias drive.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted Whether to include deleted comments. Deleted comments will not include their original content.
    * @param {integer=} params.pageSize The maximum number of comments to return per page.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {string=} params.startModifiedTime The minimum value of 'modifiedTime' for the result comments (RFC 3339 date-time).
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
    * drive.comments.update
    * @desc Updates a comment with patch semantics.
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

