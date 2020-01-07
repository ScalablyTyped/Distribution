package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orderpayments")
@js.native
class Resource$Orderpayments protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.orderpayments.notifyauthapproved
    * @desc Notify about successfully authorizing user's payment method for a
    * given amount.
    * @alias content.orderpayments.notifyauthapproved
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for for which payment authorization is happening.
    * @param {().OrderpaymentsNotifyAuthApprovedRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifyauthapproved(): GaxiosPromise[Schema$OrderpaymentsNotifyAuthApprovedResponse] = js.native
  def notifyauthapproved(callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthApprovedResponse]): Unit = js.native
  def notifyauthapproved(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthapproved): GaxiosPromise[Schema$OrderpaymentsNotifyAuthApprovedResponse] = js.native
  def notifyauthapproved(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthapproved,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthApprovedResponse]
  ): Unit = js.native
  def notifyauthapproved(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthapproved,
    options: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthApprovedResponse],
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthApprovedResponse]
  ): Unit = js.native
  def notifyauthapproved(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthapproved, options: MethodOptions): GaxiosPromise[Schema$OrderpaymentsNotifyAuthApprovedResponse] = js.native
  def notifyauthapproved(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthapproved,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthApprovedResponse]
  ): Unit = js.native
  /**
    * content.orderpayments.notifyauthdeclined
    * @desc Notify about failure to authorize user's payment method.
    * @alias content.orderpayments.notifyauthdeclined
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for which payment authorization was declined.
    * @param {().OrderpaymentsNotifyAuthDeclinedRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifyauthdeclined(): GaxiosPromise[Schema$OrderpaymentsNotifyAuthDeclinedResponse] = js.native
  def notifyauthdeclined(callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthDeclinedResponse]): Unit = js.native
  def notifyauthdeclined(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthdeclined): GaxiosPromise[Schema$OrderpaymentsNotifyAuthDeclinedResponse] = js.native
  def notifyauthdeclined(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthdeclined,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthDeclinedResponse]
  ): Unit = js.native
  def notifyauthdeclined(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthdeclined,
    options: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthDeclinedResponse],
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthDeclinedResponse]
  ): Unit = js.native
  def notifyauthdeclined(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthdeclined, options: MethodOptions): GaxiosPromise[Schema$OrderpaymentsNotifyAuthDeclinedResponse] = js.native
  def notifyauthdeclined(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyauthdeclined,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyAuthDeclinedResponse]
  ): Unit = js.native
  /**
    * content.orderpayments.notifycharge
    * @desc Notify about charge on user's selected payments method.
    * @alias content.orderpayments.notifycharge
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for which charge is happening.
    * @param {().OrderpaymentsNotifyChargeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifycharge(): GaxiosPromise[Schema$OrderpaymentsNotifyChargeResponse] = js.native
  def notifycharge(callback: BodyResponseCallback[Schema$OrderpaymentsNotifyChargeResponse]): Unit = js.native
  def notifycharge(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifycharge): GaxiosPromise[Schema$OrderpaymentsNotifyChargeResponse] = js.native
  def notifycharge(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifycharge,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyChargeResponse]
  ): Unit = js.native
  def notifycharge(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifycharge,
    options: BodyResponseCallback[Schema$OrderpaymentsNotifyChargeResponse],
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyChargeResponse]
  ): Unit = js.native
  def notifycharge(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifycharge, options: MethodOptions): GaxiosPromise[Schema$OrderpaymentsNotifyChargeResponse] = js.native
  def notifycharge(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifycharge,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyChargeResponse]
  ): Unit = js.native
  /**
    * content.orderpayments.notifyrefund
    * @desc Notify about refund on user's selected payments method.
    * @alias content.orderpayments.notifyrefund
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order for which charge is happening.
    * @param {().OrderpaymentsNotifyRefundRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def notifyrefund(): GaxiosPromise[Schema$OrderpaymentsNotifyRefundResponse] = js.native
  def notifyrefund(callback: BodyResponseCallback[Schema$OrderpaymentsNotifyRefundResponse]): Unit = js.native
  def notifyrefund(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyrefund): GaxiosPromise[Schema$OrderpaymentsNotifyRefundResponse] = js.native
  def notifyrefund(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyrefund,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyRefundResponse]
  ): Unit = js.native
  def notifyrefund(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyrefund,
    options: BodyResponseCallback[Schema$OrderpaymentsNotifyRefundResponse],
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyRefundResponse]
  ): Unit = js.native
  def notifyrefund(params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyrefund, options: MethodOptions): GaxiosPromise[Schema$OrderpaymentsNotifyRefundResponse] = js.native
  def notifyrefund(
    params: ParamsDollarResourceDollarOrderpaymentsDollarNotifyrefund,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderpaymentsNotifyRefundResponse]
  ): Unit = js.native
}

