package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Posts")
@js.native
class ResourcePosts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.posts.delete
    * @desc Delete a post by ID.
    * @alias blogger.posts.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.postId The ID of the Post.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsResourcePostsDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePostsDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourcePostsDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourcePostsDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourcePostsDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  /**
    * blogger.posts.get
    * @desc Get a post by ID.
    * @alias blogger.posts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch the post from.
    * @param {boolean=} params.fetchBody Whether the body content of the post is included (default: true). This should be set to false when the post bodies are not required, to help minimize traffic.
    * @param {boolean=} params.fetchImages Whether image URL metadata for each post is included (default: false).
    * @param {integer=} params.maxComments Maximum number of comments to pull back on a post.
    * @param {string} params.postId The ID of the post
    * @param {string=} params.view Access level with which to view the returned result. Note that some fields require elevated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPost] = js.native
  def get(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def get(params: ParamsResourcePostsGet): GaxiosPromise[SchemaPost] = js.native
  def get(params: ParamsResourcePostsGet, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def get(
    params: ParamsResourcePostsGet,
    options: BodyResponseCallback[SchemaPost],
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  def get(params: ParamsResourcePostsGet, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def get(params: ParamsResourcePostsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  /**
    * blogger.posts.getByPath
    * @desc Retrieve a Post by Path.
    * @alias blogger.posts.getByPath
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch the post from.
    * @param {integer=} params.maxComments Maximum number of comments to pull back on a post.
    * @param {string} params.path Path of the Post to retrieve.
    * @param {string=} params.view Access level with which to view the returned result. Note that some fields require elevated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getByPath(): GaxiosPromise[SchemaPost] = js.native
  def getByPath(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def getByPath(params: ParamsResourcePostsGetbypath): GaxiosPromise[SchemaPost] = js.native
  def getByPath(params: ParamsResourcePostsGetbypath, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def getByPath(
    params: ParamsResourcePostsGetbypath,
    options: BodyResponseCallback[SchemaPost],
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  def getByPath(params: ParamsResourcePostsGetbypath, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def getByPath(
    params: ParamsResourcePostsGetbypath,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * blogger.posts.insert
    * @desc Add a post.
    * @alias blogger.posts.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to add the post to.
    * @param {boolean=} params.fetchBody Whether the body content of the post is included with the result (default: true).
    * @param {boolean=} params.fetchImages Whether image URL metadata for each post is included in the returned result (default: false).
    * @param {boolean=} params.isDraft Whether to create the post as a draft (default: false).
    * @param {().Post} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[SchemaPost] = js.native
  def insert(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def insert(params: ParamsResourcePostsInsert): GaxiosPromise[SchemaPost] = js.native
  def insert(params: ParamsResourcePostsInsert, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def insert(
    params: ParamsResourcePostsInsert,
    options: BodyResponseCallback[SchemaPost],
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  def insert(params: ParamsResourcePostsInsert, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def insert(
    params: ParamsResourcePostsInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * blogger.posts.list
    * @desc Retrieves a list of posts, possibly filtered.
    * @alias blogger.posts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch posts from.
    * @param {string=} params.endDate Latest post date to fetch, a date-time with RFC 3339 formatting.
    * @param {boolean=} params.fetchBodies Whether the body content of posts is included (default: true). This should be set to false when the post bodies are not required, to help minimize traffic.
    * @param {boolean=} params.fetchImages Whether image URL metadata for each post is included.
    * @param {string=} params.labels Comma-separated list of labels to search for.
    * @param {integer=} params.maxResults Maximum number of posts to fetch.
    * @param {string=} params.orderBy Sort search results
    * @param {string=} params.pageToken Continuation token if the request is paged.
    * @param {string=} params.startDate Earliest post date to fetch, a date-time with RFC 3339 formatting.
    * @param {string=} params.status Statuses to include in the results.
    * @param {string=} params.view Access level with which to view the returned result. Note that some fields require escalated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPostList] = js.native
  def list(callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def list(params: ParamsResourcePostsList): GaxiosPromise[SchemaPostList] = js.native
  def list(params: ParamsResourcePostsList, callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def list(
    params: ParamsResourcePostsList,
    options: BodyResponseCallback[SchemaPostList],
    callback: BodyResponseCallback[SchemaPostList]
  ): Unit = js.native
  def list(params: ParamsResourcePostsList, options: MethodOptions): GaxiosPromise[SchemaPostList] = js.native
  def list(
    params: ParamsResourcePostsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostList]
  ): Unit = js.native
  /**
    * blogger.posts.patch
    * @desc Update a post. This method supports patch semantics.
    * @alias blogger.posts.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {boolean=} params.fetchBody Whether the body content of the post is included with the result (default: true).
    * @param {boolean=} params.fetchImages Whether image URL metadata for each post is included in the returned result (default: false).
    * @param {integer=} params.maxComments Maximum number of comments to retrieve with the returned post.
    * @param {string} params.postId The ID of the Post.
    * @param {boolean=} params.publish Whether a publish action should be performed when the post is updated (default: false).
    * @param {boolean=} params.revert Whether a revert action should be performed when the post is updated (default: false).
    * @param {().Post} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPost] = js.native
  def patch(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def patch(params: ParamsResourcePostsPatch): GaxiosPromise[SchemaPost] = js.native
  def patch(params: ParamsResourcePostsPatch, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def patch(
    params: ParamsResourcePostsPatch,
    options: BodyResponseCallback[SchemaPost],
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  def patch(params: ParamsResourcePostsPatch, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def patch(
    params: ParamsResourcePostsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * blogger.posts.publish
    * @desc Publishes a draft post, optionally at the specific time of the
    * given publishDate parameter.
    * @alias blogger.posts.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.postId The ID of the Post.
    * @param {string=} params.publishDate Optional date and time to schedule the publishing of the Blog. If no publishDate parameter is given, the post is either published at the a previously saved schedule date (if present), or the current time. If a future date is given, the post will be scheduled to be published.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[SchemaPost] = js.native
  def publish(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def publish(params: ParamsResourcePostsPublish): GaxiosPromise[SchemaPost] = js.native
  def publish(params: ParamsResourcePostsPublish, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def publish(
    params: ParamsResourcePostsPublish,
    options: BodyResponseCallback[SchemaPost],
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  def publish(params: ParamsResourcePostsPublish, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def publish(
    params: ParamsResourcePostsPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * blogger.posts.revert
    * @desc Revert a published or scheduled post to draft state.
    * @alias blogger.posts.revert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {string} params.postId The ID of the Post.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revert(): GaxiosPromise[SchemaPost] = js.native
  def revert(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def revert(params: ParamsResourcePostsRevert): GaxiosPromise[SchemaPost] = js.native
  def revert(params: ParamsResourcePostsRevert, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def revert(
    params: ParamsResourcePostsRevert,
    options: BodyResponseCallback[SchemaPost],
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  def revert(params: ParamsResourcePostsRevert, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def revert(
    params: ParamsResourcePostsRevert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  /**
    * blogger.posts.search
    * @desc Search for a post.
    * @alias blogger.posts.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch the post from.
    * @param {boolean=} params.fetchBodies Whether the body content of posts is included (default: true). This should be set to false when the post bodies are not required, to help minimize traffic.
    * @param {string=} params.orderBy Sort search results
    * @param {string} params.q Query terms to search this blog for matching posts.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaPostList] = js.native
  def search(callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def search(params: ParamsResourcePostsSearch): GaxiosPromise[SchemaPostList] = js.native
  def search(params: ParamsResourcePostsSearch, callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def search(
    params: ParamsResourcePostsSearch,
    options: BodyResponseCallback[SchemaPostList],
    callback: BodyResponseCallback[SchemaPostList]
  ): Unit = js.native
  def search(params: ParamsResourcePostsSearch, options: MethodOptions): GaxiosPromise[SchemaPostList] = js.native
  def search(
    params: ParamsResourcePostsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostList]
  ): Unit = js.native
  /**
    * blogger.posts.update
    * @desc Update a post.
    * @alias blogger.posts.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the Blog.
    * @param {boolean=} params.fetchBody Whether the body content of the post is included with the result (default: true).
    * @param {boolean=} params.fetchImages Whether image URL metadata for each post is included in the returned result (default: false).
    * @param {integer=} params.maxComments Maximum number of comments to retrieve with the returned post.
    * @param {string} params.postId The ID of the Post.
    * @param {boolean=} params.publish Whether a publish action should be performed when the post is updated (default: false).
    * @param {boolean=} params.revert Whether a revert action should be performed when the post is updated (default: false).
    * @param {().Post} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[SchemaPost] = js.native
  def update(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def update(params: ParamsResourcePostsUpdate): GaxiosPromise[SchemaPost] = js.native
  def update(params: ParamsResourcePostsUpdate, callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def update(
    params: ParamsResourcePostsUpdate,
    options: BodyResponseCallback[SchemaPost],
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
  def update(params: ParamsResourcePostsUpdate, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
  def update(
    params: ParamsResourcePostsUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPost]
  ): Unit = js.native
}

