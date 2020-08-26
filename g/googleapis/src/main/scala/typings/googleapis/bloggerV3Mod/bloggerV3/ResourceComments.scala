package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Comments")
@js.native
class ResourceComments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.comments.approve
    * @desc Marks a comment as not spam.
    * @alias blogger.comments.approve
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.commentId The ID of the comment to mark as not spam.
    * @param {string} params.postId The ID of the Post.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def approve(): GaxiosPromise[SchemaComment] = js.native
  def approve(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def approve(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def approve(params: ParamsResourceCommentsApprove): GaxiosPromise[SchemaComment] = js.native
  def approve(params: ParamsResourceCommentsApprove, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def approve(
    params: ParamsResourceCommentsApprove,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def approve(params: ParamsResourceCommentsApprove, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def approve(
    params: ParamsResourceCommentsApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * blogger.comments.delete
    * @desc Delete a comment by ID.
    * @alias blogger.comments.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.commentId The ID of the comment to delete.
    * @param {string} params.postId The ID of the Post.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceCommentsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceCommentsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * blogger.comments.get
    * @desc Gets one comment by ID.
    * @alias blogger.comments.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to containing the comment.
    * @param {string} params.commentId The ID of the comment to get.
    * @param {string} params.postId ID of the post to fetch posts from.
    * @param {string=} params.view Access level for the requested comment (default: READER). Note that some comments will require elevated permissions, for example comments where the parent posts which is in a draft state, or comments that are pending moderation.
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
    * @desc Retrieves the comments for a post, possibly filtered.
    * @alias blogger.comments.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch comments from.
    * @param {string=} params.endDate Latest date of comment to fetch, a date-time with RFC 3339 formatting.
    * @param {boolean=} params.fetchBodies Whether the body content of the comments is included.
    * @param {integer=} params.maxResults Maximum number of comments to include in the result.
    * @param {string=} params.pageToken Continuation token if request is paged.
    * @param {string} params.postId ID of the post to fetch posts from.
    * @param {string=} params.startDate Earliest date of comment to fetch, a date-time with RFC 3339 formatting.
    * @param {string=} params.status
    * @param {string=} params.view Access level with which to view the returned result. Note that some fields require elevated access.
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
  /**
    * blogger.comments.listByBlog
    * @desc Retrieves the comments for a blog, across all posts, possibly
    * filtered.
    * @alias blogger.comments.listByBlog
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch comments from.
    * @param {string=} params.endDate Latest date of comment to fetch, a date-time with RFC 3339 formatting.
    * @param {boolean=} params.fetchBodies Whether the body content of the comments is included.
    * @param {integer=} params.maxResults Maximum number of comments to include in the result.
    * @param {string=} params.pageToken Continuation token if request is paged.
    * @param {string=} params.startDate Earliest date of comment to fetch, a date-time with RFC 3339 formatting.
    * @param {string=} params.status
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listByBlog(): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def listByBlog(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(params: ParamsResourceCommentsListbyblog): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(params: ParamsResourceCommentsListbyblog, callback: BodyResponseCallback[SchemaCommentList]): Unit = js.native
  def listByBlog(
    params: ParamsResourceCommentsListbyblog,
    options: BodyResponseCallback[SchemaCommentList],
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  def listByBlog(params: ParamsResourceCommentsListbyblog, options: MethodOptions): GaxiosPromise[SchemaCommentList] = js.native
  def listByBlog(
    params: ParamsResourceCommentsListbyblog,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCommentList]
  ): Unit = js.native
  /**
    * blogger.comments.markAsSpam
    * @desc Marks a comment as spam.
    * @alias blogger.comments.markAsSpam
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.commentId The ID of the comment to mark as spam.
    * @param {string} params.postId The ID of the Post.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def markAsSpam(): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def markAsSpam(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def markAsSpam(
    params: ParamsResourceCommentsMarkasspam,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def markAsSpam(params: ParamsResourceCommentsMarkasspam, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def markAsSpam(
    params: ParamsResourceCommentsMarkasspam,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  /**
    * blogger.comments.removeContent
    * @desc Removes the content of a comment.
    * @alias blogger.comments.removeContent
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.commentId The ID of the comment to delete content from.
    * @param {string} params.postId The ID of the Post.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removeContent(): GaxiosPromise[SchemaComment] = js.native
  def removeContent(callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def removeContent(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def removeContent(params: ParamsResourceCommentsRemovecontent): GaxiosPromise[SchemaComment] = js.native
  def removeContent(params: ParamsResourceCommentsRemovecontent, callback: BodyResponseCallback[SchemaComment]): Unit = js.native
  def removeContent(
    params: ParamsResourceCommentsRemovecontent,
    options: BodyResponseCallback[SchemaComment],
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
  def removeContent(params: ParamsResourceCommentsRemovecontent, options: MethodOptions): GaxiosPromise[SchemaComment] = js.native
  def removeContent(
    params: ParamsResourceCommentsRemovecontent,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaComment]
  ): Unit = js.native
}

