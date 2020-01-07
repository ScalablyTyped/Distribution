package typings.googleapis.buildSrcApisResellerV1Mod.reseller_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/reseller/v1", "reseller_v1.Resource$Customers")
@js.native
class Resource$Customers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * reseller.customers.get
    * @desc Get a customer account.
    * @alias reseller.customers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Customer] = js.native
  def get(callback: BodyResponseCallback[Schema$Customer]): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomersDollarGet): GaxiosPromise[Schema$Customer] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarGet,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarGet,
    options: BodyResponseCallback[Schema$Customer],
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarCustomersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Customer] = js.native
  def get(
    params: ParamsDollarResourceDollarCustomersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  /**
    * reseller.customers.insert
    * @desc Order a new customer's account.
    * @alias reseller.customers.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.customerAuthToken The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer. For more information, see the administrator help center.
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Customer] = js.native
  def insert(callback: BodyResponseCallback[Schema$Customer]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCustomersDollarInsert): GaxiosPromise[Schema$Customer] = js.native
  def insert(
    params: ParamsDollarResourceDollarCustomersDollarInsert,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarCustomersDollarInsert,
    options: BodyResponseCallback[Schema$Customer],
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarCustomersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Customer] = js.native
  def insert(
    params: ParamsDollarResourceDollarCustomersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  /**
    * reseller.customers.patch
    * @desc Update a customer account's settings. This method supports patch
    * semantics.
    * @alias reseller.customers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Customer] = js.native
  def patch(callback: BodyResponseCallback[Schema$Customer]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCustomersDollarPatch): GaxiosPromise[Schema$Customer] = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomersDollarPatch,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomersDollarPatch,
    options: BodyResponseCallback[Schema$Customer],
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarCustomersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Customer] = js.native
  def patch(
    params: ParamsDollarResourceDollarCustomersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  /**
    * reseller.customers.update
    * @desc Update a customer account's settings.
    * @alias reseller.customers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    * @param {().Customer} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Customer] = js.native
  def update(callback: BodyResponseCallback[Schema$Customer]): Unit = js.native
  def update(params: ParamsDollarResourceDollarCustomersDollarUpdate): GaxiosPromise[Schema$Customer] = js.native
  def update(
    params: ParamsDollarResourceDollarCustomersDollarUpdate,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarCustomersDollarUpdate,
    options: BodyResponseCallback[Schema$Customer],
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarCustomersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Customer] = js.native
  def update(
    params: ParamsDollarResourceDollarCustomersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Customer]
  ): Unit = js.native
}

