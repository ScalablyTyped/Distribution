package typings.googleapis.buildSrcApisBloggerV3Mod.blogger_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v3", "blogger_v3.Resource$Pageviews")
@js.native
class Resource$Pageviews protected () extends js.Object {
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
  def get(): GaxiosPromise[Schema$Pageviews] = js.native
  def get(callback: BodyResponseCallback[Schema$Pageviews]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPageviewsDollarGet): GaxiosPromise[Schema$Pageviews] = js.native
  def get(
    params: ParamsDollarResourceDollarPageviewsDollarGet,
    callback: BodyResponseCallback[Schema$Pageviews]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPageviewsDollarGet,
    options: BodyResponseCallback[Schema$Pageviews],
    callback: BodyResponseCallback[Schema$Pageviews]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPageviewsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Pageviews] = js.native
  def get(
    params: ParamsDollarResourceDollarPageviewsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Pageviews]
  ): Unit = js.native
}

