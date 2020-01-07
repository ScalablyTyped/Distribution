package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Directdeals")
@js.native
class Resource$Directdeals protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.directDeals.get
    * @desc Gets one direct deal by ID.
    * @alias adexchangebuyer.directDeals.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id The direct deal id
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$DirectDeal] = js.native
  def get(callback: BodyResponseCallback[Schema$DirectDeal]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDirectdealsDollarGet): GaxiosPromise[Schema$DirectDeal] = js.native
  def get(
    params: ParamsDollarResourceDollarDirectdealsDollarGet,
    callback: BodyResponseCallback[Schema$DirectDeal]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDirectdealsDollarGet,
    options: BodyResponseCallback[Schema$DirectDeal],
    callback: BodyResponseCallback[Schema$DirectDeal]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDirectdealsDollarGet, options: MethodOptions): GaxiosPromise[Schema$DirectDeal] = js.native
  def get(
    params: ParamsDollarResourceDollarDirectdealsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DirectDeal]
  ): Unit = js.native
  /**
    * adexchangebuyer.directDeals.list
    * @desc Retrieves the authenticated user's list of direct deals.
    * @alias adexchangebuyer.directDeals.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$DirectDealsList] = js.native
  def list(callback: BodyResponseCallback[Schema$DirectDealsList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarDirectdealsDollarList): GaxiosPromise[Schema$DirectDealsList] = js.native
  def list(
    params: ParamsDollarResourceDollarDirectdealsDollarList,
    callback: BodyResponseCallback[Schema$DirectDealsList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarDirectdealsDollarList,
    options: BodyResponseCallback[Schema$DirectDealsList],
    callback: BodyResponseCallback[Schema$DirectDealsList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarDirectdealsDollarList, options: MethodOptions): GaxiosPromise[Schema$DirectDealsList] = js.native
  def list(
    params: ParamsDollarResourceDollarDirectdealsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DirectDealsList]
  ): Unit = js.native
}

