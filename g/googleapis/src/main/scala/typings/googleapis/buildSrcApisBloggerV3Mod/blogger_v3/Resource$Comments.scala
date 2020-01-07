package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Comments")
@js.native
class Resource$Comments protected () extends js.Object {
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
  def approve(): GaxiosPromise[Schema$Comment] = js.native
  def approve(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def approve(params: ParamsDollarResourceDollarCommentsDollarApprove): GaxiosPromise[Schema$Comment] = js.native
  def approve(
    params: ParamsDollarResourceDollarCommentsDollarApprove,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def approve(
    params: ParamsDollarResourceDollarCommentsDollarApprove,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def approve(params: ParamsDollarResourceDollarCommentsDollarApprove, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def approve(
    params: ParamsDollarResourceDollarCommentsDollarApprove,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
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
  def listByBlog(): GaxiosPromise[Schema$CommentList] = js.native
  def listByBlog(callback: BodyResponseCallback[Schema$CommentList]): Unit = js.native
  def listByBlog(params: ParamsDollarResourceDollarCommentsDollarListbyblog): GaxiosPromise[Schema$CommentList] = js.native
  def listByBlog(
    params: ParamsDollarResourceDollarCommentsDollarListbyblog,
    callback: BodyResponseCallback[Schema$CommentList]
  ): Unit = js.native
  def listByBlog(
    params: ParamsDollarResourceDollarCommentsDollarListbyblog,
    options: BodyResponseCallback[Schema$CommentList],
    callback: BodyResponseCallback[Schema$CommentList]
  ): Unit = js.native
  def listByBlog(params: ParamsDollarResourceDollarCommentsDollarListbyblog, options: MethodOptions): GaxiosPromise[Schema$CommentList] = js.native
  def listByBlog(
    params: ParamsDollarResourceDollarCommentsDollarListbyblog,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CommentList]
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
  def markAsSpam(): GaxiosPromise[Schema$Comment] = js.native
  def markAsSpam(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def markAsSpam(params: ParamsDollarResourceDollarCommentsDollarMarkasspam): GaxiosPromise[Schema$Comment] = js.native
  def markAsSpam(
    params: ParamsDollarResourceDollarCommentsDollarMarkasspam,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def markAsSpam(
    params: ParamsDollarResourceDollarCommentsDollarMarkasspam,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def markAsSpam(params: ParamsDollarResourceDollarCommentsDollarMarkasspam, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def markAsSpam(
    params: ParamsDollarResourceDollarCommentsDollarMarkasspam,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
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
  def removeContent(): GaxiosPromise[Schema$Comment] = js.native
  def removeContent(callback: BodyResponseCallback[Schema$Comment]): Unit = js.native
  def removeContent(params: ParamsDollarResourceDollarCommentsDollarRemovecontent): GaxiosPromise[Schema$Comment] = js.native
  def removeContent(
    params: ParamsDollarResourceDollarCommentsDollarRemovecontent,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def removeContent(
    params: ParamsDollarResourceDollarCommentsDollarRemovecontent,
    options: BodyResponseCallback[Schema$Comment],
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
  def removeContent(params: ParamsDollarResourceDollarCommentsDollarRemovecontent, options: MethodOptions): GaxiosPromise[Schema$Comment] = js.native
  def removeContent(
    params: ParamsDollarResourceDollarCommentsDollarRemovecontent,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Comment]
  ): Unit = js.native
}

