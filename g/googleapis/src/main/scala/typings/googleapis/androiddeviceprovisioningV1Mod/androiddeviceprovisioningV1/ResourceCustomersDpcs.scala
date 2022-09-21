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

@JSImport("googleapis/build/src/apis/androiddeviceprovisioning/v1", "androiddeviceprovisioning_v1.Resource$Customers$Dpcs")
@js.native
open class ResourceCustomersDpcs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaCustomerListDpcsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaCustomerListDpcsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomerListDpcsResponse] = js.native
  def list(params: ParamsResourceCustomersDpcsList): GaxiosPromise[SchemaCustomerListDpcsResponse] = js.native
  def list(
    params: ParamsResourceCustomersDpcsList,
    callback: BodyResponseCallback[SchemaCustomerListDpcsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceCustomersDpcsList,
    options: BodyResponseCallback[Readable | SchemaCustomerListDpcsResponse],
    callback: BodyResponseCallback[Readable | SchemaCustomerListDpcsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceCustomersDpcsList, options: MethodOptions): GaxiosPromise[SchemaCustomerListDpcsResponse] = js.native
  def list(
    params: ParamsResourceCustomersDpcsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerListDpcsResponse]
  ): Unit = js.native
  /**
    * Lists the DPCs (device policy controllers) that support zero-touch enrollment.
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
    *   const res = await androiddeviceprovisioning.customers.dpcs.list({
    *     // Required. The customer that can use the DPCs in configurations. An API resource name in the format `customers/[CUSTOMER_ID]`.
    *     parent: 'customers/my-customer',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dpcs": []
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
  def list(params: ParamsResourceCustomersDpcsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceCustomersDpcsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
