package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Blogs")
@js.native
class ResourceBlogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.blogs.get
    * @desc Gets one blog by ID.
    * @alias blogger.blogs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the blog to get.
    * @param {integer=} params.maxPosts Maximum number of posts to pull back with the blog.
    * @param {string=} params.view Access level with which to view the blog. Note that some fields require elevated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaBlog] = js.native
  def get(callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def get(params: ParamsResourceBlogsGet): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def get(
    params: ParamsResourceBlogsGet,
    options: BodyResponseCallback[SchemaBlog],
    callback: BodyResponseCallback[SchemaBlog]
  ): Unit = js.native
  def get(params: ParamsResourceBlogsGet, options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  /**
    * blogger.blogs.getByUrl
    * @desc Retrieve a Blog by URL.
    * @alias blogger.blogs.getByUrl
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.url The URL of the blog to retrieve.
    * @param {string=} params.view Access level with which to view the blog. Note that some fields require elevated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getByUrl(): GaxiosPromise[SchemaBlog] = js.native
  def getByUrl(callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def getByUrl(params: ParamsResourceBlogsGetbyurl): GaxiosPromise[SchemaBlog] = js.native
  def getByUrl(params: ParamsResourceBlogsGetbyurl, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def getByUrl(
    params: ParamsResourceBlogsGetbyurl,
    options: BodyResponseCallback[SchemaBlog],
    callback: BodyResponseCallback[SchemaBlog]
  ): Unit = js.native
  def getByUrl(params: ParamsResourceBlogsGetbyurl, options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def getByUrl(
    params: ParamsResourceBlogsGetbyurl,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlog]
  ): Unit = js.native
  /**
    * blogger.blogs.listByUser
    * @desc Retrieves a list of blogs, possibly filtered.
    * @alias blogger.blogs.listByUser
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.fetchUserInfo Whether the response is a list of blogs with per-user information instead of just blogs.
    * @param {string=} params.role User access types for blogs to include in the results, e.g. AUTHOR will return blogs where the user has author level access. If no roles are specified, defaults to ADMIN and AUTHOR roles.
    * @param {string=} params.status Blog statuses to include in the result (default: Live blogs only). Note that ADMIN access is required to view deleted blogs.
    * @param {string} params.userId ID of the user whose blogs are to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier.
    * @param {string=} params.view Access level with which to view the blogs. Note that some fields require elevated access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def listByUser(): GaxiosPromise[SchemaBlogList] = js.native
  def listByUser(callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def listByUser(params: ParamsResourceBlogsListbyuser): GaxiosPromise[SchemaBlogList] = js.native
  def listByUser(params: ParamsResourceBlogsListbyuser, callback: BodyResponseCallback[SchemaBlogList]): Unit = js.native
  def listByUser(
    params: ParamsResourceBlogsListbyuser,
    options: BodyResponseCallback[SchemaBlogList],
    callback: BodyResponseCallback[SchemaBlogList]
  ): Unit = js.native
  def listByUser(params: ParamsResourceBlogsListbyuser, options: MethodOptions): GaxiosPromise[SchemaBlogList] = js.native
  def listByUser(
    params: ParamsResourceBlogsListbyuser,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBlogList]
  ): Unit = js.native
}

