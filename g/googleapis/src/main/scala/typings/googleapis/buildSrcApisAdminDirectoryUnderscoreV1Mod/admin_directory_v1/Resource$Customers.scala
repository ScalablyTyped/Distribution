package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Customers")
@js.native
class Resource$Customers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.customers.get
    * @desc Retrieves a customer.
    * @alias directory.customers.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerKey Id of the customer to be retrieved
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
    * directory.customers.patch
    * @desc Updates a customer. This method supports patch semantics.
    * @alias directory.customers.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerKey Id of the customer to be updated
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
    * directory.customers.update
    * @desc Updates a customer.
    * @alias directory.customers.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerKey Id of the customer to be updated
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

