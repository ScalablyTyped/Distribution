package typings.googleapis.buildSrcApisCloudprivatecatalogV1beta1Mod.cloudprivatecatalog_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudprivatecatalog/v1beta1", "cloudprivatecatalog_v1beta1.Resource$Folders$Products")
@js.native
class ResourceDollarFoldersDollarProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudprivatecatalog.folders.products.search
    * @desc Search Product resources that consumers have access to, within the
    * scope of the consumer cloud resource hierarchy context.
    * @alias cloudprivatecatalog.folders.products.search
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
  def search(): GaxiosPromise[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarFoldersDollarProductsDollarSearch): GaxiosPromise[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarFoldersDollarProductsDollarSearch,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarFoldersDollarProductsDollarSearch,
    options: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarFoldersDollarProductsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarFoldersDollarProductsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudPrivatecatalogV1beta1SearchProductsResponse]
  ): Unit = js.native
}

