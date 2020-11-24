package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudprivatecatalog/v1beta1", "cloudprivatecatalog_v1beta1.Resource$Projects$Products")
@js.native
class ResourceProjectsProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * cloudprivatecatalog.projects.products.search
    * @desc Search Product resources that consumers have access to, within the
    * scope of the consumer cloud resource hierarchy context.
    * @alias cloudprivatecatalog.projects.products.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of entries that are requested.
    * @param {string=} params.pageToken A pagination token returned from a previous call to SearchProducts that indicates where this listing should continue from. This field is optional.
    * @param {string=} params.query The query to filter the products.  The supported queries are: * List products of all catalogs: empty * List products under a catalog: `parent=catalogs/{catalog_id}` * Get a product by name: `name=catalogs/{catalog_id}/products/{product_id}`
    * @param {string} params.resource_ Required. The name of the resource context. See SearchCatalogsRequest.resource for details.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse] = js.native
  def search(callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]): Unit = js.native
  def search(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse] = js.native
  def search(params: ParamsResourceProjectsProductsSearch): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse] = js.native
  def search(
    params: ParamsResourceProjectsProductsSearch,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  ): Unit = js.native
  def search(
    params: ParamsResourceProjectsProductsSearch,
    options: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse],
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  ): Unit = js.native
  def search(params: ParamsResourceProjectsProductsSearch, options: MethodOptions): GaxiosPromise[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse] = js.native
  def search(
    params: ParamsResourceProjectsProductsSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  ): Unit = js.native
}
