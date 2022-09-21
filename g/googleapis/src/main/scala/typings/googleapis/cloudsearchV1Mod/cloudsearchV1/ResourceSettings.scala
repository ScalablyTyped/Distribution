package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Settings")
@js.native
open class ResourceSettings protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var datasources: ResourceSettingsDatasources = js.native
  
  def getCustomer(): GaxiosPromise[SchemaCustomerSettings] = js.native
  def getCustomer(callback: BodyResponseCallback[SchemaCustomerSettings]): Unit = js.native
  def getCustomer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaCustomerSettings] = js.native
  def getCustomer(params: ParamsResourceSettingsGetcustomer): GaxiosPromise[SchemaCustomerSettings] = js.native
  def getCustomer(params: ParamsResourceSettingsGetcustomer, callback: BodyResponseCallback[SchemaCustomerSettings]): Unit = js.native
  def getCustomer(
    params: ParamsResourceSettingsGetcustomer,
    options: BodyResponseCallback[Readable | SchemaCustomerSettings],
    callback: BodyResponseCallback[Readable | SchemaCustomerSettings]
  ): Unit = js.native
  def getCustomer(params: ParamsResourceSettingsGetcustomer, options: MethodOptions): GaxiosPromise[SchemaCustomerSettings] = js.native
  def getCustomer(
    params: ParamsResourceSettingsGetcustomer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaCustomerSettings]
  ): Unit = js.native
  /**
    * Get customer settings. **Note:** This API requires an admin account to execute.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.getCustomer({});
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "auditLoggingSettings": {},
    *   //   "vpcSettings": {}
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
  def getCustomer(params: ParamsResourceSettingsGetcustomer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def getCustomer(
    params: ParamsResourceSettingsGetcustomer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var searchapplications: ResourceSettingsSearchapplications = js.native
  
  def updateCustomer(): GaxiosPromise[SchemaOperation] = js.native
  def updateCustomer(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateCustomer(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateCustomer(params: ParamsResourceSettingsUpdatecustomer): GaxiosPromise[SchemaOperation] = js.native
  def updateCustomer(params: ParamsResourceSettingsUpdatecustomer, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def updateCustomer(
    params: ParamsResourceSettingsUpdatecustomer,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def updateCustomer(params: ParamsResourceSettingsUpdatecustomer, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def updateCustomer(
    params: ParamsResourceSettingsUpdatecustomer,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update customer settings. **Note:** This API requires an admin account to execute.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudsearch.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudsearch = google.cloudsearch('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/cloud_search',
    *       'https://www.googleapis.com/auth/cloud_search.settings',
    *       'https://www.googleapis.com/auth/cloud_search.settings.indexing',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await cloudsearch.settings.updateCustomer({
    *     // Update mask to control which fields get updated. If you specify a field in the update_mask but don't specify its value here, that field will be cleared. If the mask is not present or empty, all fields will be updated. Currently supported field paths: vpc_settings and audit_logging_settings
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "auditLoggingSettings": {},
    *       //   "vpcSettings": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "done": false,
    *   //   "error": {},
    *   //   "metadata": {},
    *   //   "name": "my_name",
    *   //   "response": {}
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
  def updateCustomer(params: ParamsResourceSettingsUpdatecustomer, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def updateCustomer(
    params: ParamsResourceSettingsUpdatecustomer,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
