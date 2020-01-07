package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer2/v2beta1", "adexchangebuyer2_v2beta1.Resource$Accounts$Products")
@js.native
class ResourceDollarAccountsDollarProducts protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer2.accounts.products.get
    * @desc Gets the requested product by ID.
    * @alias adexchangebuyer2.accounts.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string} params.productId The ID for the product to get the head revision for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Product] = js.native
  def get(callback: BodyResponseCallback[Schema$Product]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarProductsDollarGet): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarProductsDollarGet,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarProductsDollarGet,
    options: BodyResponseCallback[Schema$Product],
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountsDollarProductsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountsDollarProductsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  /**
    * adexchangebuyer2.accounts.products.list
    * @desc List all products visible to the buyer (optionally filtered by the
    * specified PQL query).
    * @alias adexchangebuyer2.accounts.products.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID of the buyer.
    * @param {string=} params.filter An optional PQL query used to query for products. See https://developers.google.com/ad-manager/docs/pqlreference for documentation about PQL and examples.  Nested repeated fields, such as product.targetingCriterion.inclusions, cannot be filtered.
    * @param {integer=} params.pageSize Requested page size. The server may return fewer results than requested. If unspecified, the server will pick an appropriate default.
    * @param {string=} params.pageToken The page token as returned from ListProductsResponse.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListProductsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListProductsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarProductsDollarList): GaxiosPromise[Schema$ListProductsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarProductsDollarList,
    callback: BodyResponseCallback[Schema$ListProductsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarProductsDollarList,
    options: BodyResponseCallback[Schema$ListProductsResponse],
    callback: BodyResponseCallback[Schema$ListProductsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountsDollarProductsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListProductsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountsDollarProductsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListProductsResponse]
  ): Unit = js.native
}

