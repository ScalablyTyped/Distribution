package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Vendors")
@js.native
class ResourceDollarPartnersDollarVendors protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var customers: ResourceDollarPartnersDollarVendorsDollarCustomers = js.native
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
  def list(): GaxiosPromise[Schema$ListVendorsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListVendorsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPartnersDollarVendorsDollarList): GaxiosPromise[Schema$ListVendorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPartnersDollarVendorsDollarList,
    callback: BodyResponseCallback[Schema$ListVendorsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPartnersDollarVendorsDollarList,
    options: BodyResponseCallback[Schema$ListVendorsResponse],
    callback: BodyResponseCallback[Schema$ListVendorsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPartnersDollarVendorsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListVendorsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPartnersDollarVendorsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListVendorsResponse]
  ): Unit = js.native
}

