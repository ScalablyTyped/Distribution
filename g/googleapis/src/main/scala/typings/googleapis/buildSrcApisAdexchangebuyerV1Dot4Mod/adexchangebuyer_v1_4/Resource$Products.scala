package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Products")
@js.native
class Resource$Products protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.products.get
    * @desc Gets the requested product by id.
    * @alias adexchangebuyer.products.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.productId The id for the product to get the head revision for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Product] = js.native
  def get(callback: BodyResponseCallback[Schema$Product]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductsDollarGet): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    options: BodyResponseCallback[Schema$Product],
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProductsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Product] = js.native
  def get(
    params: ParamsDollarResourceDollarProductsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Product]
  ): Unit = js.native
  /**
    * adexchangebuyer.products.search
    * @desc Gets the requested product.
    * @alias adexchangebuyer.products.search
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.pqlQuery The pql query used to query for products.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$GetOffersResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$GetOffersResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarProductsDollarSearch): GaxiosPromise[Schema$GetOffersResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProductsDollarSearch,
    callback: BodyResponseCallback[Schema$GetOffersResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarProductsDollarSearch,
    options: BodyResponseCallback[Schema$GetOffersResponse],
    callback: BodyResponseCallback[Schema$GetOffersResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarProductsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$GetOffersResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProductsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetOffersResponse]
  ): Unit = js.native
}

