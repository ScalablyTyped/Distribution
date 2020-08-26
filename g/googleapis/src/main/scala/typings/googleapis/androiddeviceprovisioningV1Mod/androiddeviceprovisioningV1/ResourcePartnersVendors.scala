package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Vendors")
@js.native
class ResourcePartnersVendors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var customers: ResourcePartnersVendorsCustomers = js.native
  /**
    * androiddeviceprovisioning.partners.vendors.list
    * @desc Lists the vendors of the partner.
    * @alias androiddeviceprovisioning.partners.vendors.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to be returned.
    * @param {string=} params.pageToken A token identifying a page of results returned by the server.
    * @param {string} params.parent Required. The resource name in the format `partners/[PARTNER_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListVendorsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVendorsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListVendorsResponse] = js.native
  def list(params: ParamsResourcePartnersVendorsList): GaxiosPromise[SchemaListVendorsResponse] = js.native
  def list(
    params: ParamsResourcePartnersVendorsList,
    callback: BodyResponseCallback[SchemaListVendorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePartnersVendorsList,
    options: BodyResponseCallback[SchemaListVendorsResponse],
    callback: BodyResponseCallback[SchemaListVendorsResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersVendorsList, options: MethodOptions): GaxiosPromise[SchemaListVendorsResponse] = js.native
  def list(
    params: ParamsResourcePartnersVendorsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVendorsResponse]
  ): Unit = js.native
}

