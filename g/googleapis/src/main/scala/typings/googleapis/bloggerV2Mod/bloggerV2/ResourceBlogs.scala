package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Blogs")
@js.native
class ResourceBlogs protected () extends js.Object {
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
  def get(): GaxiosPromise[SchemaBlog] = js.native
  def get(callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
  def get(
    params: ParamsResourceBlogsGet,
    options: BodyResponseCallback[SchemaBlog],
    callback: BodyResponseCallback[SchemaBlog]
  ): Unit = js.native
  def get(params: ParamsResourceBlogsGet, options: MethodOptions): GaxiosPromise[SchemaBlog] = js.native
  def get(params: ParamsResourceBlogsGet, options: MethodOptions, callback: BodyResponseCallback[SchemaBlog]): Unit = js.native
}
