package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Comments")
@js.native
class Resource$Comments protected () extends js.Object {
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
}

