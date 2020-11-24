package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Customers")
@js.native
class ResourcePartnersCustomers protected () extends js.Object {
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
  def create(): GaxiosPromise[SchemaCompany] = js.native
  def create(callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourcePartnersCustomersCreate): GaxiosPromise[SchemaCompany] = js.native
  def create(params: ParamsResourcePartnersCustomersCreate, callback: BodyResponseCallback[SchemaCompany]): Unit = js.native
  def create(
    params: ParamsResourcePartnersCustomersCreate,
    options: BodyResponseCallback[SchemaCompany],
    callback: BodyResponseCallback[SchemaCompany]
  ): Unit = js.native
  def create(params: ParamsResourcePartnersCustomersCreate, options: MethodOptions): GaxiosPromise[SchemaCompany] = js.native
  def create(
    params: ParamsResourcePartnersCustomersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCompany]
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
  def list(): GaxiosPromise[SchemaListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListCustomersResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListCustomersResponse] = js.native
  def list(params: ParamsResourcePartnersCustomersList): GaxiosPromise[SchemaListCustomersResponse] = js.native
  def list(
    params: ParamsResourcePartnersCustomersList,
    callback: BodyResponseCallback[SchemaListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePartnersCustomersList,
    options: BodyResponseCallback[SchemaListCustomersResponse],
    callback: BodyResponseCallback[SchemaListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersCustomersList, options: MethodOptions): GaxiosPromise[SchemaListCustomersResponse] = js.native
  def list(
    params: ParamsResourcePartnersCustomersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListCustomersResponse]
  ): Unit = js.native
}
