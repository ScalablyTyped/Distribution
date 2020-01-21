package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers")
@js.native
class ResourceCustomers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var configurations: ResourceCustomersConfigurations = js.native
  var context: APIRequestContext = js.native
  var devices: ResourceCustomersDevices = js.native
  var dpcs: ResourceCustomersDpcs = js.native
  /**
    * androiddeviceprovisioning.customers.list
    * @desc Lists the user's customer accounts.
    * @alias androiddeviceprovisioning.customers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of customers to show in a page of results. A number between 1 and 100 (inclusive).
    * @param {string=} params.pageToken A token specifying which result page to return.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaCustomerListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListCustomersResponse]): Unit = js.native
  def list(params: ParamsResourceCustomersList): GaxiosPromise[SchemaCustomerListCustomersResponse] = js.native
  def list(
    params: ParamsResourceCustomersList,
    callback: BodyResponseCallback[SchemaCustomerListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: BodyResponseCallback[SchemaCustomerListCustomersResponse],
    callback: BodyResponseCallback[SchemaCustomerListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersList, options: MethodOptions): GaxiosPromise[SchemaCustomerListCustomersResponse] = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListCustomersResponse]
  ): Unit = js.native
}

