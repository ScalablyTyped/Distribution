package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Comments")
@js.native
class ResourceComments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.comments.get
    * @desc Gets one comment by id.
    * @alias blogger.comments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to containing the comment.
    * @param {string} params.commentId The ID of the comment to get.
    * @param {string} params.postId ID of the post to fetch posts from.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaComment] = js.native
  def get(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet): GaxiosPromise[SchemaComment] = js.native
  def get(params: ParamsResourceCommentsGet, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def get(params: ParamsResourceCommentsGet, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def get(
    params: ParamsResourceCommentsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * blogger.comments.list
    * @desc Retrieves the comments for a blog, possibly filtered.
    * @alias blogger.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch comments from.
    * @param {boolean=} params.fetchBodies Whether the body content of the comments is included.
    * @param {integer=} params.maxResults Maximum number of comments to include in the result.
    * @param {string=} params.pageToken Continuation token if request is paged.
    * @param {string} params.postId ID of the post to fetch posts from.
    * @param {string=} params.startDate Earliest date of comment to fetch, a date-time with RFC 3339 formatting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCommentList] = js.native
  def list(callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList): GaxiosPromise[SchemaCommentList] = js.native
  def list(params: ParamsResourceCommentsList, callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: BodyResponseCallback[SchemaCommentList],
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  def list(params: ParamsResourceCommentsList, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def list(
    params: ParamsResourceCommentsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
}

