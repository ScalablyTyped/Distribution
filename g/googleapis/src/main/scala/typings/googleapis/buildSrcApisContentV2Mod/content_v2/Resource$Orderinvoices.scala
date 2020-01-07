package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/content/v2", "content_v2.Resource$Orderinvoices")
@js.native
class Resource$Orderinvoices protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * content.orderinvoices.createchargeinvoice
    * @desc Creates a charge invoice for a shipment group, and triggers a
    * charge capture for non-facilitated payment orders.
    * @alias content.orderinvoices.createchargeinvoice
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrderinvoicesCreateChargeInvoiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createchargeinvoice(): GaxiosPromise[Schema$OrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(callback: BodyResponseCallback[Schema$OrderinvoicesCreateChargeInvoiceResponse]): Unit = js.native
  def createchargeinvoice(params: ParamsDollarResourceDollarOrderinvoicesDollarCreatechargeinvoice): GaxiosPromise[Schema$OrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(
    params: ParamsDollarResourceDollarOrderinvoicesDollarCreatechargeinvoice,
    callback: BodyResponseCallback[Schema$OrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  def createchargeinvoice(
    params: ParamsDollarResourceDollarOrderinvoicesDollarCreatechargeinvoice,
    options: BodyResponseCallback[Schema$OrderinvoicesCreateChargeInvoiceResponse],
    callback: BodyResponseCallback[Schema$OrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  def createchargeinvoice(params: ParamsDollarResourceDollarOrderinvoicesDollarCreatechargeinvoice, options: MethodOptions): GaxiosPromise[Schema$OrderinvoicesCreateChargeInvoiceResponse] = js.native
  def createchargeinvoice(
    params: ParamsDollarResourceDollarOrderinvoicesDollarCreatechargeinvoice,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderinvoicesCreateChargeInvoiceResponse]
  ): Unit = js.native
  /**
    * content.orderinvoices.createrefundinvoice
    * @desc Creates a refund invoice for one or more shipment groups, and
    * triggers a refund for non-facilitated payment orders. This can only be
    * used for line items that have previously been charged using
    * createChargeInvoice. All amounts (except for the summary) are incremental
    * with respect to the previous invoice.
    * @alias content.orderinvoices.createrefundinvoice
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.merchantId The ID of the account that manages the order. This cannot be a multi-client account.
    * @param {string} params.orderId The ID of the order.
    * @param {().OrderinvoicesCreateRefundInvoiceRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def createrefundinvoice(): GaxiosPromise[Schema$OrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(callback: BodyResponseCallback[Schema$OrderinvoicesCreateRefundInvoiceResponse]): Unit = js.native
  def createrefundinvoice(params: ParamsDollarResourceDollarOrderinvoicesDollarCreaterefundinvoice): GaxiosPromise[Schema$OrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(
    params: ParamsDollarResourceDollarOrderinvoicesDollarCreaterefundinvoice,
    callback: BodyResponseCallback[Schema$OrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
  def createrefundinvoice(
    params: ParamsDollarResourceDollarOrderinvoicesDollarCreaterefundinvoice,
    options: BodyResponseCallback[Schema$OrderinvoicesCreateRefundInvoiceResponse],
    callback: BodyResponseCallback[Schema$OrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
  def createrefundinvoice(params: ParamsDollarResourceDollarOrderinvoicesDollarCreaterefundinvoice, options: MethodOptions): GaxiosPromise[Schema$OrderinvoicesCreateRefundInvoiceResponse] = js.native
  def createrefundinvoice(
    params: ParamsDollarResourceDollarOrderinvoicesDollarCreaterefundinvoice,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrderinvoicesCreateRefundInvoiceResponse]
  ): Unit = js.native
}

