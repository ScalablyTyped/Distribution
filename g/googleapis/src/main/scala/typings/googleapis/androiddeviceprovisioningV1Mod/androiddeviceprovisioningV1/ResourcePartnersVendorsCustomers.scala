package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Vendors$Customers")
@js.native
class ResourcePartnersVendorsCustomers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * androiddeviceprovisioning.partners.vendors.customers.list
    * @desc Lists the customers of the vendor.
    * @alias androiddeviceprovisioning.partners.vendors.customers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to be returned.
    * @param {string=} params.pageToken A token identifying a page of results returned by the server.
    * @param {string} params.parent Required. The resource name in the format `partners/[PARTNER_ID]/vendors/[VENDOR_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVendorCustomersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(params: ParamsResourcePartnersVendorsCustomersList): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(
    params: ParamsResourcePartnersVendorsCustomersList,
    callback: BodyResponseCallback[SchemaListVendorCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePartnersVendorsCustomersList,
    options: BodyResponseCallback[SchemaListVendorCustomersResponse],
    callback: BodyResponseCallback[SchemaListVendorCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersVendorsCustomersList, options: MethodOptions): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(
    params: ParamsResourcePartnersVendorsCustomersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVendorCustomersResponse]
  ): Unit = js.native
}
