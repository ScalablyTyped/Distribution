package typings.googleapis.buildSrcApisBloggerV2Mod.blogger_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Pages")
@js.native
class Resource$Pages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * blogger.pages.get
    * @desc Gets one blog page by id.
    * @alias blogger.pages.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog containing the page.
    * @param {string} params.pageId The ID of the page to get.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Page] = js.native
  def get(callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet): GaxiosPromise[Schema$Page] = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet, callback: BodyResponseCallback[Schema$Page]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPagesDollarGet,
    options: BodyResponseCallback[Schema$Page],
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPagesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Page] = js.native
  def get(
    params: ParamsDollarResourceDollarPagesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Page]
  ): Unit = js.native
  /**
    * blogger.pages.list
    * @desc Retrieves pages for a blog, possibly filtered.
    * @alias blogger.pages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.blogId ID of the blog to fetch pages from.
    * @param {boolean=} params.fetchBodies Whether to retrieve the Page bodies.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PageList] = js.native
  def list(callback: BodyResponseCallback[Schema$PageList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList): GaxiosPromise[Schema$PageList] = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList, callback: BodyResponseCallback[Schema$PageList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPagesDollarList,
    options: BodyResponseCallback[Schema$PageList],
    callback: BodyResponseCallback[Schema$PageList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPagesDollarList, options: MethodOptions): GaxiosPromise[Schema$PageList] = js.native
  def list(
    params: ParamsDollarResourceDollarPagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PageList]
  ): Unit = js.native
}

