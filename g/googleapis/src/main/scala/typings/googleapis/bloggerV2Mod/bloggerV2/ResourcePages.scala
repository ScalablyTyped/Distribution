package typings.googleapis.bloggerV2Mod.bloggerV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/blogger/v2", "blogger_v2.Resource$Pages")
@js.native
class ResourcePages protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaPage] = js.native
  def get(callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  def get(
    params: ParamsResourcePagesGet,
    options: BodyResponseCallback[SchemaPage],
    callback: BodyResponseCallback[SchemaPage]
  ): Unit = js.native
  def get(params: ParamsResourcePagesGet, options: MethodOptions): GaxiosPromise[SchemaPage] = js.native
  def get(params: ParamsResourcePagesGet, options: MethodOptions, callback: BodyResponseCallback[SchemaPage]): Unit = js.native
  
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
  def list(): GaxiosPromise[SchemaPageList] = js.native
  def list(callback: BodyResponseCallback[SchemaPageList]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPageList] = js.native
  def list(params: ParamsResourcePagesList): GaxiosPromise[SchemaPageList] = js.native
  def list(params: ParamsResourcePagesList, callback: BodyResponseCallback[SchemaPageList]): Unit = js.native
  def list(
    params: ParamsResourcePagesList,
    options: BodyResponseCallback[SchemaPageList],
    callback: BodyResponseCallback[SchemaPageList]
  ): Unit = js.native
  def list(params: ParamsResourcePagesList, options: MethodOptions): GaxiosPromise[SchemaPageList] = js.native
  def list(
    params: ParamsResourcePagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPageList]
  ): Unit = js.native
}
