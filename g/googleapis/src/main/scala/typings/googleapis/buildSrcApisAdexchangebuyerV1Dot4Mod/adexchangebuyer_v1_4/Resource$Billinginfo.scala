package typings.googleapis.buildSrcApisAdexchangebuyerV1Dot4Mod.adexchangebuyer_v1_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/adexchangebuyer/v1.4", "adexchangebuyer_v1_4.Resource$Billinginfo")
@js.native
class Resource$Billinginfo protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * adexchangebuyer.billingInfo.get
    * @desc Returns the billing information for one account specified by
    * account ID.
    * @alias adexchangebuyer.billingInfo.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer} params.accountId The account id.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$BillingInfo] = js.native
  def get(callback: BodyResponseCallback[Schema$BillingInfo]): Unit = js.native
  def get(params: ParamsDollarResourceDollarBillinginfoDollarGet): GaxiosPromise[Schema$BillingInfo] = js.native
  def get(
    params: ParamsDollarResourceDollarBillinginfoDollarGet,
    callback: BodyResponseCallback[Schema$BillingInfo]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarBillinginfoDollarGet,
    options: BodyResponseCallback[Schema$BillingInfo],
    callback: BodyResponseCallback[Schema$BillingInfo]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarBillinginfoDollarGet, options: MethodOptions): GaxiosPromise[Schema$BillingInfo] = js.native
  def get(
    params: ParamsDollarResourceDollarBillinginfoDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BillingInfo]
  ): Unit = js.native
  /**
    * adexchangebuyer.billingInfo.list
    * @desc Retrieves a list of billing information for all accounts of the
    * authenticated user.
    * @alias adexchangebuyer.billingInfo.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$BillingInfoList] = js.native
  def list(callback: BodyResponseCallback[Schema$BillingInfoList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarBillinginfoDollarList): GaxiosPromise[Schema$BillingInfoList] = js.native
  def list(
    params: ParamsDollarResourceDollarBillinginfoDollarList,
    callback: BodyResponseCallback[Schema$BillingInfoList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarBillinginfoDollarList,
    options: BodyResponseCallback[Schema$BillingInfoList],
    callback: BodyResponseCallback[Schema$BillingInfoList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarBillinginfoDollarList, options: MethodOptions): GaxiosPromise[Schema$BillingInfoList] = js.native
  def list(
    params: ParamsDollarResourceDollarBillinginfoDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$BillingInfoList]
  ): Unit = js.native
}

