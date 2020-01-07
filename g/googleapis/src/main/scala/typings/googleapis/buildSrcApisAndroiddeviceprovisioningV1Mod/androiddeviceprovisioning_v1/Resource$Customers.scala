package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers")
@js.native
class Resource$Customers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var configurations: ResourceDollarCustomersDollarConfigurations = js.native
  var context: APIRequestContext = js.native
  var devices: ResourceDollarCustomersDollarDevices = js.native
  var dpcs: ResourceDollarCustomersDollarDpcs = js.native
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
  def list(): GaxiosPromise[Schema$CustomerListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomerListCustomersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarList): GaxiosPromise[Schema$CustomerListCustomersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarList,
    callback: BodyResponseCallback[Schema$CustomerListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarList,
    options: BodyResponseCallback[Schema$CustomerListCustomersResponse],
    callback: BodyResponseCallback[Schema$CustomerListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarList, options: MethodOptions): GaxiosPromise[Schema$CustomerListCustomersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomerListCustomersResponse]
  ): Unit = js.native
}

