package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Postuserinfos")
@js.native
class ResourcePostuserinfos protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * blogger.postUserInfos.get
    * @desc Gets one post and user info pair, by post ID and user ID. The post
    * user info contains per-user information about the post, such as access
    * rights, specific to the user.
    * @alias blogger.postUserInfos.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the blog.
    * @param {integer=} params.maxComments Maximum number of comments to pull back on a post.
    * @param {string} params.postId The ID of the post to get.
    * @param {string} params.userId ID of the user for the per-user information to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(callback: BodyResponseCallback[SchemaPostUserInfo]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(params: ParamsResourcePostuserinfosGet): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(params: ParamsResourcePostuserinfosGet, callback: BodyResponseCallback[SchemaPostUserInfo]): Unit = js.native
  def get(
    params: ParamsResourcePostuserinfosGet,
    options: BodyResponseCallback[SchemaPostUserInfo],
    callback: BodyResponseCallback[SchemaPostUserInfo]
  ): Unit = js.native
  def get(params: ParamsResourcePostuserinfosGet, options: MethodOptions): GaxiosPromise[SchemaPostUserInfo] = js.native
  def get(
    params: ParamsResourcePostuserinfosGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostUserInfo]
  ): Unit = js.native
  
  /**
    * blogger.postUserInfos.list
    * @desc Retrieves a list of post and post user info pairs, possibly
    * filtered. The post user info contains per-user information about the
    * post, such as access rights, specific to the user.
    * @alias blogger.postUserInfos.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch posts from.
    * @param {string=} params.endDate Latest post date to fetch, a date-time with RFC 3339 formatting.
    * @param {boolean=} params.fetchBodies Whether the body content of posts is included. Default is false.
    * @param {string=} params.labels Comma-separated list of labels to search for.
    * @param {integer=} params.maxResults Maximum number of posts to fetch.
    * @param {string=} params.orderBy Sort order applied to search results. Default is published.
    * @param {string=} params.pageToken Continuation token if the request is paged.
    * @param {string=} params.startDate Earliest post date to fetch, a date-time with RFC 3339 formatting.
    * @param {string=} params.status
    * @param {string} params.userId ID of the user for the per-user information to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier.
    * @param {string=} params.view Access level with which to view the returned result. Note that some fields require elevated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(callback: BodyResponseCallback[SchemaPostUserInfosList]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(params: ParamsResourcePostuserinfosList): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(params: ParamsResourcePostuserinfosList, callback: BodyResponseCallback[SchemaPostUserInfosList]): Unit = js.native
  def list(
    params: ParamsResourcePostuserinfosList,
    options: BodyResponseCallback[SchemaPostUserInfosList],
    callback: BodyResponseCallback[SchemaPostUserInfosList]
  ): Unit = js.native
  def list(params: ParamsResourcePostuserinfosList, options: MethodOptions): GaxiosPromise[SchemaPostUserInfosList] = js.native
  def list(
    params: ParamsResourcePostuserinfosList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPostUserInfosList]
  ): Unit = js.native
}
