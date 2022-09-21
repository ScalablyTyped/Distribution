package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Partners$Vendors$Customers")
@js.native
open class ResourcePartnersVendorsCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVendorCustomersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(params: ParamsResourcePartnersVendorsCustomersList): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(
    params: ParamsResourcePartnersVendorsCustomersList,
    callback: BodyResponseCallback[SchemaListVendorCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourcePartnersVendorsCustomersList,
    options: BodyResponseCallback[Readable | SchemaListVendorCustomersResponse],
    callback: BodyResponseCallback[Readable | SchemaListVendorCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourcePartnersVendorsCustomersList, options: MethodOptions): GaxiosPromise[SchemaListVendorCustomersResponse] = js.native
  def list(
    params: ParamsResourcePartnersVendorsCustomersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVendorCustomersResponse]
  ): Unit = js.native
  /**
    * Lists the customers of the vendor.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/androiddeviceprovisioning.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const androiddeviceprovisioning = google.androiddeviceprovisioning('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await androiddeviceprovisioning.partners.vendors.customers.list({
    *     // The maximum number of results to be returned.
    *     pageSize: 'placeholder-value',
    *     // A token identifying a page of results returned by the server.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name in the format `partners/[PARTNER_ID]/vendors/[VENDOR_ID]`.
    *     parent: 'partners/my-partner/vendors/my-vendor',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customers": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "totalSize": 0
    *   // }
    * }
    *
    * main().catch(e => {
    *   console.error(e);
    *   throw e;
    * });
    *
    * ```
    *
    * @param params - Parameters for request
    * @param options - Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param callback - Optional callback that handles the response.
    * @returns A promise if used with async/await, or void if used with a callback.
    */
  def list(params: ParamsResourcePartnersVendorsCustomersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourcePartnersVendorsCustomersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
