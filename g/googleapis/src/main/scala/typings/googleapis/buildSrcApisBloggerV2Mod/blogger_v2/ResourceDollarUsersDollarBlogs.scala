package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Users$Blogs")
@js.native
class ResourceDollarUsersDollarBlogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.users.blogs.list
    * @desc Retrieves a list of blogs, possibly filtered.
    * @alias blogger.users.blogs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId ID of the user whose blogs are to be fetched. Either the word 'self' (sans quote marks) or the user's profile identifier.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$BlogList] = js.native
  def list(callback: BodyResponseCallback[Schema$BlogList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarBlogsDollarList): GaxiosPromise[Schema$BlogList] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarBlogsDollarList,
    callback: BodyResponseCallback[Schema$BlogList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarBlogsDollarList,
    options: BodyResponseCallback[Schema$BlogList],
    callback: BodyResponseCallback[Schema$BlogList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarBlogsDollarList, options: MethodOptions): GaxiosPromise[Schema$BlogList] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarBlogsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BlogList]
  ): Unit = js.native
}

