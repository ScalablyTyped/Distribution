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

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers")
@js.native
open class ResourceCustomers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var configurations: ResourceCustomersConfigurations = js.native
  
  var context: APIRequestContext = js.native
  
  var devices: ResourceCustomersDevices = js.native
  
  var dpcs: ResourceCustomersDpcs = js.native
  
  def list(): GaxiosPromise[SchemaCustomerListCustomersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListCustomersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomerListCustomersResponse] = js.native
  def list(params: ParamsResourceCustomersList): GaxiosPromise[SchemaCustomerListCustomersResponse] = js.native
  def list(
    params: ParamsResourceCustomersList,
    callback: BodyResponseCallback[SchemaCustomerListCustomersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: BodyResponseCallback[Readable | SchemaCustomerListCustomersResponse],
    callback: BodyResponseCallback[Readable | SchemaCustomerListCustomersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersList, options: MethodOptions): GaxiosPromise[SchemaCustomerListCustomersResponse] = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListCustomersResponse]
  ): Unit = js.native
  /**
    * Lists the user's customer accounts.
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
    *   const res = await androiddeviceprovisioning.customers.list({
    *     // The maximum number of customers to show in a page of results. A number between 1 and 100 (inclusive).
    *     pageSize: 'placeholder-value',
    *     // A token specifying which result page to return. This field has custom validations in ListCustomersRequestValidator
    *     pageToken: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "customers": [],
    *   //   "nextPageToken": "my_nextPageToken"
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
  def list(params: ParamsResourceCustomersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
