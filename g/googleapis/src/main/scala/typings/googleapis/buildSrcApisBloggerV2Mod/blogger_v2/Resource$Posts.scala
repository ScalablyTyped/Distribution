package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Posts")
@js.native
class Resource$Posts protected () extends js.Object {
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
  def get(): GaxiosPromise[Schema$Post] = js.native
  def get(callback: BodyResponseCallback[Schema$Post]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPostsDollarGet): GaxiosPromise[Schema$Post] = js.native
  def get(params: ParamsDollarResourceDollarPostsDollarGet, callback: BodyResponseCallback[Schema$Post]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPostsDollarGet,
    options: BodyResponseCallback[Schema$Post],
    callback: BodyResponseCallback[Schema$Post]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPostsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Post] = js.native
  def get(
    params: ParamsDollarResourceDollarPostsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Post]
  ): Unit = js.native
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
  def list(): GaxiosPromise[Schema$PostList] = js.native
  def list(callback: BodyResponseCallback[Schema$PostList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPostsDollarList): GaxiosPromise[Schema$PostList] = js.native
  def list(params: ParamsDollarResourceDollarPostsDollarList, callback: BodyResponseCallback[Schema$PostList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPostsDollarList,
    options: BodyResponseCallback[Schema$PostList],
    callback: BodyResponseCallback[Schema$PostList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPostsDollarList, options: MethodOptions): GaxiosPromise[Schema$PostList] = js.native
  def list(
    params: ParamsDollarResourceDollarPostsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PostList]
  ): Unit = js.native
}

