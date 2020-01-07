package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Accounttax")
@js.native
class Resource$Accounttax protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.accounttax.custombatch
    * @desc Retrieves and updates tax settings of multiple accounts in a single
    * request.
    * @alias content.accounttax.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccounttaxCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$AccounttaxCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$AccounttaxCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarAccounttaxDollarCustombatch): GaxiosPromise[Schema$AccounttaxCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccounttaxDollarCustombatch,
    callback: BodyResponseCallback[Schema$AccounttaxCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccounttaxDollarCustombatch,
    options: BodyResponseCallback[Schema$AccounttaxCustomBatchResponse],
    callback: BodyResponseCallback[Schema$AccounttaxCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarAccounttaxDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$AccounttaxCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarAccounttaxDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccounttaxCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.accounttax.get
    * @desc Retrieves the tax settings of the account.
    * @alias content.accounttax.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update account tax settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccountTax] = js.native
  def get(callback: BodyResponseCallback[Schema$AccountTax]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccounttaxDollarGet): GaxiosPromise[Schema$AccountTax] = js.native
  def get(
    params: ParamsDollarResourceDollarAccounttaxDollarGet,
    callback: BodyResponseCallback[Schema$AccountTax]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccounttaxDollarGet,
    options: BodyResponseCallback[Schema$AccountTax],
    callback: BodyResponseCallback[Schema$AccountTax]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccounttaxDollarGet, options: MethodOptions): GaxiosPromise[Schema$AccountTax] = js.native
  def get(
    params: ParamsDollarResourceDollarAccounttaxDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountTax]
  ): Unit = js.native
  /**
    * content.accounttax.list
    * @desc Lists the tax settings of the sub-accounts in your Merchant Center
    * account.
    * @alias content.accounttax.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of tax settings to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccounttaxListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AccounttaxListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccounttaxDollarList): GaxiosPromise[Schema$AccounttaxListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccounttaxDollarList,
    callback: BodyResponseCallback[Schema$AccounttaxListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccounttaxDollarList,
    options: BodyResponseCallback[Schema$AccounttaxListResponse],
    callback: BodyResponseCallback[Schema$AccounttaxListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccounttaxDollarList, options: MethodOptions): GaxiosPromise[Schema$AccounttaxListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccounttaxDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccounttaxListResponse]
  ): Unit = js.native
  /**
    * content.accounttax.update
    * @desc Updates the tax settings of the account.
    * @alias content.accounttax.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update account tax settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().AccountTax} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$AccountTax] = js.native
  def update(callback: BodyResponseCallback[Schema$AccountTax]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccounttaxDollarUpdate): GaxiosPromise[Schema$AccountTax] = js.native
  def update(
    params: ParamsDollarResourceDollarAccounttaxDollarUpdate,
    callback: BodyResponseCallback[Schema$AccountTax]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccounttaxDollarUpdate,
    options: BodyResponseCallback[Schema$AccountTax],
    callback: BodyResponseCallback[Schema$AccountTax]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccounttaxDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$AccountTax] = js.native
  def update(
    params: ParamsDollarResourceDollarAccounttaxDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountTax]
  ): Unit = js.native
}

