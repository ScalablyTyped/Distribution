package typings.googleapis.buildSrcApisAndroiddeviceprovisioningV1Mod.androiddeviceprovisioning_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Customers")
@js.native
class ResourceDollarPartnersDollarCustomers protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androiddeviceprovisioning.partners.customers.create
    * @desc Creates a customer for zero-touch enrollment. After the method
    * returns successfully, admin and owner roles can manage devices and EMM
    * configs by calling API methods or using their zero-touch enrollment
    * portal. The customer receives an email that welcomes them to zero-touch
    * enrollment and explains how to sign into the portal.
    * @alias androiddeviceprovisioning.partners.customers.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The parent resource ID in the format `partners/[PARTNER_ID]` that identifies the reseller.
    * @param {().CreateCustomerRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Company] = js.native
  def create(callback: BodyResponseCallback[Schema$Company]): Unit = js.native
  def create(params: ParamsDollarResourceDollarPartnersDollarCustomersDollarCreate): GaxiosPromise[Schema$Company] = js.native
  def create(
    params: ParamsDollarResourceDollarPartnersDollarCustomersDollarCreate,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarPartnersDollarCustomersDollarCreate,
    options: BodyResponseCallback[Schema$Company],
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarPartnersDollarCustomersDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Company] = js.native
  def create(
    params: ParamsDollarResourceDollarPartnersDollarCustomersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Company]
  ): Unit = js.native
  /**
    * androiddeviceprovisioning.partners.customers.list
    * @desc Lists the customers that are enrolled to the reseller identified by
    * the `partnerId` argument. This list includes customers that the reseller
    * created and customers that enrolled themselves using the portal.
    * @alias androiddeviceprovisioning.partners.customers.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The maximum number of results to be returned. If not specified or 0, all the records are returned.
    * @param {string=} params.pageToken A token identifying a page of results returned by the server.
    * @param {string} params.partnerId Required. The ID of the reseller partner.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListCustomersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPartnersDollarCustomersDollarList): GaxiosPromise[Schema$ListCustomersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPartnersDollarCustomersDollarList,
    callback: BodyResponseCallback[Schema$ListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPartnersDollarCustomersDollarList,
    options: BodyResponseCallback[Schema$ListCustomersResponse],
    callback: BodyResponseCallback[Schema$ListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPartnersDollarCustomersDollarList, options: MethodOptions): GaxiosPromise[Schema$ListCustomersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarPartnersDollarCustomersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListCustomersResponse]
  ): Unit = js.native
}

