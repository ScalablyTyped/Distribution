package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Dpcs")
@js.native
class ResourceCustomersDpcs protected () extends js.Object {
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
  def list(): GaxiosPromise[SchemaCustomerListDpcsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListDpcsResponse]): Unit = js.native
  def list(params: ParamsResourceCustomersDpcsList): GaxiosPromise[SchemaCustomerListDpcsResponse] = js.native
  def list(
    params: ParamsResourceCustomersDpcsList,
    callback: BodyResponseCallback[SchemaCustomerListDpcsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersDpcsList,
    options: BodyResponseCallback[SchemaCustomerListDpcsResponse],
    callback: BodyResponseCallback[SchemaCustomerListDpcsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersDpcsList, options: MethodOptions): GaxiosPromise[SchemaCustomerListDpcsResponse] = js.native
  def list(
    params: ParamsResourceCustomersDpcsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListDpcsResponse]
  ): Unit = js.native
}

