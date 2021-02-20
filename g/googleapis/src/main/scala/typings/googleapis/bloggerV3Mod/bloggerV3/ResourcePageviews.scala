package typings.googleapis.bloggerV3Mod.bloggerV3

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Pageviews")
@js.native
class ResourcePageviews protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * blogger.pageViews.get
    * @desc Retrieve pageview stats for a Blog.
    * @alias blogger.pageViews.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId The ID of the blog to get.
    * @param {string=} params.range
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPageviews] = js.native
  def get(callback: BodyResponseCallback[SchemaPageviews]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaPageviews] = js.native
  def get(params: ParamsResourcePageviewsGet): GaxiosPromise[SchemaPageviews] = js.native
  def get(params: ParamsResourcePageviewsGet, callback: BodyResponseCallback[SchemaPageviews]): Unit = js.native
  def get(
    params: ParamsResourcePageviewsGet,
    options: BodyResponseCallback[SchemaPageviews],
    callback: BodyResponseCallback[SchemaPageviews]
  ): Unit = js.native
  def get(params: ParamsResourcePageviewsGet, options: MethodOptions): GaxiosPromise[SchemaPageviews] = js.native
  def get(
    params: ParamsResourcePageviewsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPageviews]
  ): Unit = js.native
}
