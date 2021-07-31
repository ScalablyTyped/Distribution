package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Posts")
@js.native
class ResourcePosts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * blogger.posts.get
    * @desc Get a post by id.
    * @alias blogger.posts.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch the post from.
    * @param {string} params.postId The ID of the post
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPost] = js.native
  def get(callback: BodyResponseCallback[SchemaPost]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPost] = js.native
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
    * blogger.posts.list
    * @desc Retrieves a list of posts, possibly filtered.
    * @alias blogger.posts.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch posts from.
    * @param {boolean=} params.fetchBodies Whether the body content of posts is included.
    * @param {integer=} params.maxResults Maximum number of posts to fetch.
    * @param {string=} params.pageToken Continuation token if the request is paged.
    * @param {string=} params.startDate Earliest post date to fetch, a date-time with RFC 3339 formatting.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPostList] = js.native
  def list(callback: BodyResponseCallback[SchemaPostList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPostList] = js.native
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
}
