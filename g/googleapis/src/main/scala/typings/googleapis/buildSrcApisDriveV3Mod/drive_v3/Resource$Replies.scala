package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Replies")
@js.native
class Resource$Replies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.replies.create
    * @desc Creates a new reply to a comment.
    * @alias drive.replies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {().Reply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Reply] = js.native
  def create(callback: BodyResponseCallback[Schema$Reply]): Unit = js.native
  def create(params: ParamsDollarResourceDollarRepliesDollarCreate): GaxiosPromise[Schema$Reply] = js.native
  def create(
    params: ParamsDollarResourceDollarRepliesDollarCreate,
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarRepliesDollarCreate,
    options: BodyResponseCallback[Schema$Reply],
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarRepliesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Reply] = js.native
  def create(
    params: ParamsDollarResourceDollarRepliesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
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
    * @desc Gets a reply by ID.
    * @alias drive.replies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted Whether to return deleted replies. Deleted replies will not include their original content.
    * @param {string} params.replyId The ID of the reply.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Reply] = js.native
  def get(callback: BodyResponseCallback[Schema$Reply]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRepliesDollarGet): GaxiosPromise[Schema$Reply] = js.native
  def get(params: ParamsDollarResourceDollarRepliesDollarGet, callback: BodyResponseCallback[Schema$Reply]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRepliesDollarGet,
    options: BodyResponseCallback[Schema$Reply],
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRepliesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Reply] = js.native
  def get(
    params: ParamsDollarResourceDollarRepliesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
  /**
    * drive.replies.list
    * @desc Lists a comment's replies.
    * @alias drive.replies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.includeDeleted Whether to include deleted replies. Deleted replies will not include their original content.
    * @param {integer=} params.pageSize The maximum number of replies to return per page.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ReplyList] = js.native
  def list(callback: BodyResponseCallback[Schema$ReplyList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRepliesDollarList): GaxiosPromise[Schema$ReplyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRepliesDollarList,
    callback: BodyResponseCallback[Schema$ReplyList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRepliesDollarList,
    options: BodyResponseCallback[Schema$ReplyList],
    callback: BodyResponseCallback[Schema$ReplyList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRepliesDollarList, options: MethodOptions): GaxiosPromise[Schema$ReplyList] = js.native
  def list(
    params: ParamsDollarResourceDollarRepliesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReplyList]
  ): Unit = js.native
  /**
    * drive.replies.update
    * @desc Updates a reply with patch semantics.
    * @alias drive.replies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.commentId The ID of the comment.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.replyId The ID of the reply.
    * @param {().Reply} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Reply] = js.native
  def update(callback: BodyResponseCallback[Schema$Reply]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRepliesDollarUpdate): GaxiosPromise[Schema$Reply] = js.native
  def update(
    params: ParamsDollarResourceDollarRepliesDollarUpdate,
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRepliesDollarUpdate,
    options: BodyResponseCallback[Schema$Reply],
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRepliesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Reply] = js.native
  def update(
    params: ParamsDollarResourceDollarRepliesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Reply]
  ): Unit = js.native
}

