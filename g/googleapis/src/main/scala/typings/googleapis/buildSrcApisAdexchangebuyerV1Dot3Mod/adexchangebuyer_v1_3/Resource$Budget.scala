package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot3Mod.adexchangebuyer_v1_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.3", "adexchangebuyer_v1_3.Resource$Budget")
@js.native
class Resource$Budget protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.budget.get
    * @desc Returns the budget information for the adgroup specified by the
    * accountId and billingId.
    * @alias adexchangebuyer.budget.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id to get the budget information for.
    * @param {string} params.billingId The billing id to get the budget information for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Budget] = js.native
  def get(callback: BodyResponseCallback[Schema$Budget]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBudgetDollarGet): GaxiosPromise[Schema$Budget] = js.native
  def get(params: ParamsDollarResourceDollarBudgetDollarGet, callback: BodyResponseCallback[Schema$Budget]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBudgetDollarGet,
    options: BodyResponseCallback[Schema$Budget],
    callback: BodyResponseCallback[Schema$Budget]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBudgetDollarGet, options: MethodOptions): GaxiosPromise[Schema$Budget] = js.native
  def get(
    params: ParamsDollarResourceDollarBudgetDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Budget]
  ): Unit = js.native
  /**
    * adexchangebuyer.budget.patch
    * @desc Updates the budget amount for the budget of the adgroup specified
    * by the accountId and billingId, with the budget amount in the request.
    * This method supports patch semantics.
    * @alias adexchangebuyer.budget.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id associated with the budget being updated.
    * @param {string} params.billingId The billing id associated with the budget being updated.
    * @param {().Budget} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Budget] = js.native
  def patch(callback: BodyResponseCallback[Schema$Budget]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBudgetDollarPatch): GaxiosPromise[Schema$Budget] = js.native
  def patch(params: ParamsDollarResourceDollarBudgetDollarPatch, callback: BodyResponseCallback[Schema$Budget]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarBudgetDollarPatch,
    options: BodyResponseCallback[Schema$Budget],
    callback: BodyResponseCallback[Schema$Budget]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarBudgetDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Budget] = js.native
  def patch(
    params: ParamsDollarResourceDollarBudgetDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Budget]
  ): Unit = js.native
  /**
    * adexchangebuyer.budget.update
    * @desc Updates the budget amount for the budget of the adgroup specified
    * by the accountId and billingId, with the budget amount in the request.
    * @alias adexchangebuyer.budget.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The account id associated with the budget being updated.
    * @param {string} params.billingId The billing id associated with the budget being updated.
    * @param {().Budget} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Budget] = js.native
  def update(callback: BodyResponseCallback[Schema$Budget]): Unit = js.native
  def update(params: ParamsDollarResourceDollarBudgetDollarUpdate): GaxiosPromise[Schema$Budget] = js.native
  def update(
    params: ParamsDollarResourceDollarBudgetDollarUpdate,
    callback: BodyResponseCallback[Schema$Budget]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarBudgetDollarUpdate,
    options: BodyResponseCallback[Schema$Budget],
    callback: BodyResponseCallback[Schema$Budget]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarBudgetDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Budget] = js.native
  def update(
    params: ParamsDollarResourceDollarBudgetDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Budget]
  ): Unit = js.native
}

