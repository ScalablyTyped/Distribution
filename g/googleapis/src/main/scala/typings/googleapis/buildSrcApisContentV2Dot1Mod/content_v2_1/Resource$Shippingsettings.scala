package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2.1", "content_v2_1.Resource$Shippingsettings")
@js.native
class Resource$Shippingsettings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.shippingsettings.custombatch
    * @desc Retrieves and updates the shipping settings of multiple accounts in
    * a single request.
    * @alias content.shippingsettings.custombatch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().ShippingsettingsCustomBatchRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def custombatch(): GaxiosPromise[Schema$ShippingsettingsCustomBatchResponse] = js.native
  def custombatch(callback: BodyResponseCallback[Schema$ShippingsettingsCustomBatchResponse]): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarShippingsettingsDollarCustombatch): GaxiosPromise[Schema$ShippingsettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarShippingsettingsDollarCustombatch,
    callback: BodyResponseCallback[Schema$ShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(
    params: ParamsDollarResourceDollarShippingsettingsDollarCustombatch,
    options: BodyResponseCallback[Schema$ShippingsettingsCustomBatchResponse],
    callback: BodyResponseCallback[Schema$ShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  def custombatch(params: ParamsDollarResourceDollarShippingsettingsDollarCustombatch, options: MethodOptions): GaxiosPromise[Schema$ShippingsettingsCustomBatchResponse] = js.native
  def custombatch(
    params: ParamsDollarResourceDollarShippingsettingsDollarCustombatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShippingsettingsCustomBatchResponse]
  ): Unit = js.native
  /**
    * content.shippingsettings.get
    * @desc Retrieves the shipping settings of the account.
    * @alias content.shippingsettings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update shipping settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ShippingSettings] = js.native
  def get(callback: BodyResponseCallback[Schema$ShippingSettings]): Unit = js.native
  def get(params: ParamsDollarResourceDollarShippingsettingsDollarGet): GaxiosPromise[Schema$ShippingSettings] = js.native
  def get(
    params: ParamsDollarResourceDollarShippingsettingsDollarGet,
    callback: BodyResponseCallback[Schema$ShippingSettings]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarShippingsettingsDollarGet,
    options: BodyResponseCallback[Schema$ShippingSettings],
    callback: BodyResponseCallback[Schema$ShippingSettings]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarShippingsettingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ShippingSettings] = js.native
  def get(
    params: ParamsDollarResourceDollarShippingsettingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShippingSettings]
  ): Unit = js.native
  /**
    * content.shippingsettings.getsupportedcarriers
    * @desc Retrieves supported carriers and carrier services for an account.
    * @alias content.shippingsettings.getsupportedcarriers
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account for which to retrieve the supported carriers.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getsupportedcarriers(): GaxiosPromise[Schema$ShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedCarriersResponse]): Unit = js.native
  def getsupportedcarriers(params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedcarriers): GaxiosPromise[Schema$ShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedcarriers,
    callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  def getsupportedcarriers(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedcarriers,
    options: BodyResponseCallback[Schema$ShippingsettingsGetSupportedCarriersResponse],
    callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  def getsupportedcarriers(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedcarriers,
    options: MethodOptions
  ): GaxiosPromise[Schema$ShippingsettingsGetSupportedCarriersResponse] = js.native
  def getsupportedcarriers(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedcarriers,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedCarriersResponse]
  ): Unit = js.native
  /**
    * content.shippingsettings.getsupportedholidays
    * @desc Retrieves supported holidays for an account.
    * @alias content.shippingsettings.getsupportedholidays
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account for which to retrieve the supported holidays.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getsupportedholidays(): GaxiosPromise[Schema$ShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedHolidaysResponse]): Unit = js.native
  def getsupportedholidays(params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedholidays): GaxiosPromise[Schema$ShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedholidays,
    callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  def getsupportedholidays(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedholidays,
    options: BodyResponseCallback[Schema$ShippingsettingsGetSupportedHolidaysResponse],
    callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  def getsupportedholidays(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedholidays,
    options: MethodOptions
  ): GaxiosPromise[Schema$ShippingsettingsGetSupportedHolidaysResponse] = js.native
  def getsupportedholidays(
    params: ParamsDollarResourceDollarShippingsettingsDollarGetsupportedholidays,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShippingsettingsGetSupportedHolidaysResponse]
  ): Unit = js.native
  /**
    * content.shippingsettings.list
    * @desc Lists the shipping settings of the sub-accounts in your Merchant
    * Center account.
    * @alias content.shippingsettings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults The maximum number of shipping settings to return in the response, used for paging.
    * @param {string} params.merchantId The ID of the managing account. This must be a multi-client account.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ShippingsettingsListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ShippingsettingsListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarShippingsettingsDollarList): GaxiosPromise[Schema$ShippingsettingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarShippingsettingsDollarList,
    callback: BodyResponseCallback[Schema$ShippingsettingsListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarShippingsettingsDollarList,
    options: BodyResponseCallback[Schema$ShippingsettingsListResponse],
    callback: BodyResponseCallback[Schema$ShippingsettingsListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarShippingsettingsDollarList, options: MethodOptions): GaxiosPromise[Schema$ShippingsettingsListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarShippingsettingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShippingsettingsListResponse]
  ): Unit = js.native
  /**
    * content.shippingsettings.update
    * @desc Updates the shipping settings of the account.
    * @alias content.shippingsettings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId The ID of the account for which to get/update shipping settings.
    * @param {string} params.merchantId The ID of the managing account. If this parameter is not the same as accountId, then this account must be a multi-client account and accountId must be the ID of a sub-account of this account.
    * @param {().ShippingSettings} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ShippingSettings] = js.native
  def update(callback: BodyResponseCallback[Schema$ShippingSettings]): Unit = js.native
  def update(params: ParamsDollarResourceDollarShippingsettingsDollarUpdate): GaxiosPromise[Schema$ShippingSettings] = js.native
  def update(
    params: ParamsDollarResourceDollarShippingsettingsDollarUpdate,
    callback: BodyResponseCallback[Schema$ShippingSettings]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarShippingsettingsDollarUpdate,
    options: BodyResponseCallback[Schema$ShippingSettings],
    callback: BodyResponseCallback[Schema$ShippingSettings]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarShippingsettingsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$ShippingSettings] = js.native
  def update(
    params: ParamsDollarResourceDollarShippingsettingsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ShippingSettings]
  ): Unit = js.native
}

