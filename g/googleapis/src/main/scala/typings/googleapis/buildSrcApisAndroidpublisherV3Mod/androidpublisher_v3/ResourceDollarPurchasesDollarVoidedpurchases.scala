package typings.googleapis.buildSrcApisAndroidpublisherV3Mod.androidpublisher_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidpublisher/v3", "androidpublisher_v3.Resource$Purchases$Voidedpurchases")
@js.native
class ResourceDollarPurchasesDollarVoidedpurchases protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidpublisher.purchases.voidedpurchases.list
    * @desc Lists the purchases that were canceled, refunded or charged-back.
    * @alias androidpublisher.purchases.voidedpurchases.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.endTime The time, in milliseconds since the Epoch, of the newest voided in-app product purchase that you want to see in the response. The value of this parameter cannot be greater than the current time and is ignored if a pagination token is set. Default value is current time. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
    * @param {integer=} params.maxResults
    * @param {string} params.packageName The package name of the application for which voided purchases need to be returned (for example, 'com.some.thing').
    * @param {integer=} params.startIndex
    * @param {string=} params.startTime The time, in milliseconds since the Epoch, of the oldest voided in-app product purchase that you want to see in the response. The value of this parameter cannot be older than 30 days and is ignored if a pagination token is set. Default value is current time minus 30 days. Note: This filter is applied on the time at which the record is seen as voided by our systems and not the actual voided time returned in the response.
    * @param {string=} params.token
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$VoidedPurchasesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$VoidedPurchasesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPurchasesDollarVoidedpurchasesDollarList): GaxiosPromise[Schema$VoidedPurchasesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPurchasesDollarVoidedpurchasesDollarList,
    callback: BodyResponseCallback[Schema$VoidedPurchasesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPurchasesDollarVoidedpurchasesDollarList,
    options: BodyResponseCallback[Schema$VoidedPurchasesListResponse],
    callback: BodyResponseCallback[Schema$VoidedPurchasesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPurchasesDollarVoidedpurchasesDollarList, options: MethodOptions): GaxiosPromise[Schema$VoidedPurchasesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPurchasesDollarVoidedpurchasesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$VoidedPurchasesListResponse]
  ): Unit = js.native
}

