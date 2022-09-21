package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/baremetalsolution/v2", "baremetalsolution_v2.Resource$Projects$Locations$Provisioningconfigs")
@js.native
open class ResourceProjectsLocationsProvisioningconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def create(callback: BodyResponseCallback[SchemaProvisioningConfig]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def create(params: ParamsResourceProjectsLocationsProvisioningconfigsCreate): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProvisioningconfigsCreate,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsProvisioningconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaProvisioningConfig],
    callback: BodyResponseCallback[Readable | SchemaProvisioningConfig]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsProvisioningconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProvisioningconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  /**
    * Create new ProvisioningConfig.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await baremetalsolution.projects.locations.provisioningConfigs.create({
    *       // Optional. Email provided to send a confirmation with provisioning config to.
    *       email: 'placeholder-value',
    *       // Required. The parent project and location containing the ProvisioningConfig.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "cloudConsoleUri": "my_cloudConsoleUri",
    *         //   "email": "my_email",
    *         //   "handoverServiceAccount": "my_handoverServiceAccount",
    *         //   "instances": [],
    *         //   "location": "my_location",
    *         //   "name": "my_name",
    *         //   "networks": [],
    *         //   "state": "my_state",
    *         //   "statusMessage": "my_statusMessage",
    *         //   "ticketId": "my_ticketId",
    *         //   "updateTime": "my_updateTime",
    *         //   "volumes": [],
    *         //   "vpcScEnabled": false
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudConsoleUri": "my_cloudConsoleUri",
    *   //   "email": "my_email",
    *   //   "handoverServiceAccount": "my_handoverServiceAccount",
    *   //   "instances": [],
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "networks": [],
    *   //   "state": "my_state",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "ticketId": "my_ticketId",
    *   //   "updateTime": "my_updateTime",
    *   //   "volumes": [],
    *   //   "vpcScEnabled": false
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
  def create(params: ParamsResourceProjectsLocationsProvisioningconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsProvisioningconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaProvisioningConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def get(params: ParamsResourceProjectsLocationsProvisioningconfigsGet): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvisioningconfigsGet,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvisioningconfigsGet,
    options: BodyResponseCallback[Readable | SchemaProvisioningConfig],
    callback: BodyResponseCallback[Readable | SchemaProvisioningConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsProvisioningconfigsGet, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvisioningconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  /**
    * Get ProvisioningConfig by name.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await baremetalsolution.projects.locations.provisioningConfigs.get({
    *       // Required. Name of the ProvisioningConfig.
    *       name: 'projects/my-project/locations/my-location/provisioningConfigs/my-provisioningConfig',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudConsoleUri": "my_cloudConsoleUri",
    *   //   "email": "my_email",
    *   //   "handoverServiceAccount": "my_handoverServiceAccount",
    *   //   "instances": [],
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "networks": [],
    *   //   "state": "my_state",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "ticketId": "my_ticketId",
    *   //   "updateTime": "my_updateTime",
    *   //   "volumes": [],
    *   //   "vpcScEnabled": false
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
  def get(params: ParamsResourceProjectsLocationsProvisioningconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsProvisioningconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def patch(callback: BodyResponseCallback[SchemaProvisioningConfig]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def patch(params: ParamsResourceProjectsLocationsProvisioningconfigsPatch): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProvisioningconfigsPatch,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProvisioningconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaProvisioningConfig],
    callback: BodyResponseCallback[Readable | SchemaProvisioningConfig]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsProvisioningconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaProvisioningConfig] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProvisioningconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProvisioningConfig]
  ): Unit = js.native
  /**
    * Update existing ProvisioningConfig.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await baremetalsolution.projects.locations.provisioningConfigs.patch({
    *       // Optional. Email provided to send a confirmation with provisioning config to.
    *       email: 'placeholder-value',
    *       // Output only. The name of the provisioning config.
    *       name: 'projects/my-project/locations/my-location/provisioningConfigs/my-provisioningConfig',
    *       // Required. The list of fields to update.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "cloudConsoleUri": "my_cloudConsoleUri",
    *         //   "email": "my_email",
    *         //   "handoverServiceAccount": "my_handoverServiceAccount",
    *         //   "instances": [],
    *         //   "location": "my_location",
    *         //   "name": "my_name",
    *         //   "networks": [],
    *         //   "state": "my_state",
    *         //   "statusMessage": "my_statusMessage",
    *         //   "ticketId": "my_ticketId",
    *         //   "updateTime": "my_updateTime",
    *         //   "volumes": [],
    *         //   "vpcScEnabled": false
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "cloudConsoleUri": "my_cloudConsoleUri",
    *   //   "email": "my_email",
    *   //   "handoverServiceAccount": "my_handoverServiceAccount",
    *   //   "instances": [],
    *   //   "location": "my_location",
    *   //   "name": "my_name",
    *   //   "networks": [],
    *   //   "state": "my_state",
    *   //   "statusMessage": "my_statusMessage",
    *   //   "ticketId": "my_ticketId",
    *   //   "updateTime": "my_updateTime",
    *   //   "volumes": [],
    *   //   "vpcScEnabled": false
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
  def patch(params: ParamsResourceProjectsLocationsProvisioningconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsProvisioningconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def submit(): GaxiosPromise[SchemaSubmitProvisioningConfigResponse] = js.native
  def submit(callback: BodyResponseCallback[SchemaSubmitProvisioningConfigResponse]): Unit = js.native
  def submit(params: Unit, options: MethodOptions): GaxiosPromise[SchemaSubmitProvisioningConfigResponse] = js.native
  def submit(params: ParamsResourceProjectsLocationsProvisioningconfigsSubmit): GaxiosPromise[SchemaSubmitProvisioningConfigResponse] = js.native
  def submit(
    params: ParamsResourceProjectsLocationsProvisioningconfigsSubmit,
    callback: BodyResponseCallback[SchemaSubmitProvisioningConfigResponse]
  ): Unit = js.native
  def submit(
    params: ParamsResourceProjectsLocationsProvisioningconfigsSubmit,
    options: BodyResponseCallback[Readable | SchemaSubmitProvisioningConfigResponse],
    callback: BodyResponseCallback[Readable | SchemaSubmitProvisioningConfigResponse]
  ): Unit = js.native
  def submit(params: ParamsResourceProjectsLocationsProvisioningconfigsSubmit, options: MethodOptions): GaxiosPromise[SchemaSubmitProvisioningConfigResponse] = js.native
  def submit(
    params: ParamsResourceProjectsLocationsProvisioningconfigsSubmit,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaSubmitProvisioningConfigResponse]
  ): Unit = js.native
  /**
    * Submit a provisiong configuration for a given project.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/baremetalsolution.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const baremetalsolution = google.baremetalsolution('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await baremetalsolution.projects.locations.provisioningConfigs.submit({
    *       // Required. The parent project and location containing the ProvisioningConfig.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "email": "my_email",
    *         //   "provisioningConfig": {}
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "provisioningConfig": {}
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
  def submit(params: ParamsResourceProjectsLocationsProvisioningconfigsSubmit, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def submit(
    params: ParamsResourceProjectsLocationsProvisioningconfigsSubmit,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
