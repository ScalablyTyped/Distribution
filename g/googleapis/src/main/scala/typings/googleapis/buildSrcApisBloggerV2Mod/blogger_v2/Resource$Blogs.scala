package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Blogs")
@js.native
class Resource$Blogs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.blogs.get
    * @desc Gets one blog by id.
    * @alias blogger.blogs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the blog to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Blog] = js.native
  def get(callback: BodyResponseCallback[Schema$Blog]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBlogsDollarGet): GaxiosPromise[Schema$Blog] = js.native
  def get(params: ParamsDollarResourceDollarBlogsDollarGet, callback: BodyResponseCallback[Schema$Blog]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBlogsDollarGet,
    options: BodyResponseCallback[Schema$Blog],
    callback: BodyResponseCallback[Schema$Blog]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBlogsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Blog] = js.native
  def get(
    params: ParamsDollarResourceDollarBlogsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Blog]
  ): Unit = js.native
}

