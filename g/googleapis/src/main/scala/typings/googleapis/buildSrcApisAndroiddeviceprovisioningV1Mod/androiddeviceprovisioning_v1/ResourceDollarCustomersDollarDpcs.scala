package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Dpcs")
@js.native
class ResourceDollarCustomersDollarDpcs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androiddeviceprovisioning.customers.dpcs.list
    * @desc Lists the DPCs (device policy controllers) that support zero-touch
    * enrollment.
    * @alias androiddeviceprovisioning.customers.dpcs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The customer that can use the DPCs in configurations. An API resource name in the format `customers/[CUSTOMER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CustomerListDpcsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomerListDpcsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarDpcsDollarList): GaxiosPromise[Schema$CustomerListDpcsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarDpcsDollarList,
    callback: BodyResponseCallback[Schema$CustomerListDpcsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarDpcsDollarList,
    options: BodyResponseCallback[Schema$CustomerListDpcsResponse],
    callback: BodyResponseCallback[Schema$CustomerListDpcsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarCustomersDollarDpcsDollarList, options: MethodOptions): GaxiosPromise[Schema$CustomerListDpcsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarCustomersDollarDpcsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomerListDpcsResponse]
  ): Unit = js.native
}

