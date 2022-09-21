package typings.googleapis.appengineV1Mod.appengineV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/appengine/v1", "appengine_v1.Resource$Apps$Services$Versions")
@js.native
open class ResourceAppsServicesVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsServicesVersionsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAppsServicesVersionsCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceAppsServicesVersionsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAppsServicesVersionsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAppsServicesVersionsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deploys code and resource files to a new version.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
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
    *   const res = await appengine.apps.services.versions.create({
    *     // Part of `parent`. Name of the parent resource to create this version under. Example: apps/myapp/services/default.
    *     appsId: 'placeholder-value',
    *     // Part of `parent`. See documentation of `appsId`.
    *     servicesId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiConfig": {},
    *       //   "appEngineApis": false,
    *       //   "automaticScaling": {},
    *       //   "basicScaling": {},
    *       //   "betaSettings": {},
    *       //   "buildEnvVariables": {},
    *       //   "createTime": "my_createTime",
    *       //   "createdBy": "my_createdBy",
    *       //   "defaultExpiration": "my_defaultExpiration",
    *       //   "deployment": {},
    *       //   "diskUsageBytes": "my_diskUsageBytes",
    *       //   "endpointsApiService": {},
    *       //   "entrypoint": {},
    *       //   "env": "my_env",
    *       //   "envVariables": {},
    *       //   "errorHandlers": [],
    *       //   "handlers": [],
    *       //   "healthCheck": {},
    *       //   "id": "my_id",
    *       //   "inboundServices": [],
    *       //   "instanceClass": "my_instanceClass",
    *       //   "libraries": [],
    *       //   "livenessCheck": {},
    *       //   "manualScaling": {},
    *       //   "name": "my_name",
    *       //   "network": {},
    *       //   "nobuildFilesRegex": "my_nobuildFilesRegex",
    *       //   "readinessCheck": {},
    *       //   "resources": {},
    *       //   "runtime": "my_runtime",
    *       //   "runtimeApiVersion": "my_runtimeApiVersion",
    *       //   "runtimeChannel": "my_runtimeChannel",
    *       //   "runtimeMainExecutablePath": "my_runtimeMainExecutablePath",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "servingStatus": "my_servingStatus",
    *       //   "threadsafe": false,
    *       //   "versionUrl": "my_versionUrl",
    *       //   "vm": false,
    *       //   "vpcAccessConnector": {},
    *       //   "zones": []
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
  def create(params: ParamsResourceAppsServicesVersionsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceAppsServicesVersionsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsServicesVersionsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAppsServicesVersionsDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAppsServicesVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes an existing Version resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
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
    *   const res = await appengine.apps.services.versions.delete({
    *     // Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     servicesId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     versionsId: 'placeholder-value',
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
  def delete(params: ParamsResourceAppsServicesVersionsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceAppsServicesVersionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceAppsServicesVersionsGet): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceAppsServicesVersionsGet, callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsGet,
    options: BodyResponseCallback[Readable | SchemaVersion],
    callback: BodyResponseCallback[Readable | SchemaVersion]
  ): Unit = js.native
  def get(params: ParamsResourceAppsServicesVersionsGet, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/appengine.admin',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await appengine.apps.services.versions.get({
    *     // Part of `name`. Name of the resource requested. Example: apps/myapp/services/default/versions/v1.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     servicesId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     versionsId: 'placeholder-value',
    *     // Controls the set of fields returned in the Get response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiConfig": {},
    *   //   "appEngineApis": false,
    *   //   "automaticScaling": {},
    *   //   "basicScaling": {},
    *   //   "betaSettings": {},
    *   //   "buildEnvVariables": {},
    *   //   "createTime": "my_createTime",
    *   //   "createdBy": "my_createdBy",
    *   //   "defaultExpiration": "my_defaultExpiration",
    *   //   "deployment": {},
    *   //   "diskUsageBytes": "my_diskUsageBytes",
    *   //   "endpointsApiService": {},
    *   //   "entrypoint": {},
    *   //   "env": "my_env",
    *   //   "envVariables": {},
    *   //   "errorHandlers": [],
    *   //   "handlers": [],
    *   //   "healthCheck": {},
    *   //   "id": "my_id",
    *   //   "inboundServices": [],
    *   //   "instanceClass": "my_instanceClass",
    *   //   "libraries": [],
    *   //   "livenessCheck": {},
    *   //   "manualScaling": {},
    *   //   "name": "my_name",
    *   //   "network": {},
    *   //   "nobuildFilesRegex": "my_nobuildFilesRegex",
    *   //   "readinessCheck": {},
    *   //   "resources": {},
    *   //   "runtime": "my_runtime",
    *   //   "runtimeApiVersion": "my_runtimeApiVersion",
    *   //   "runtimeChannel": "my_runtimeChannel",
    *   //   "runtimeMainExecutablePath": "my_runtimeMainExecutablePath",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "servingStatus": "my_servingStatus",
    *   //   "threadsafe": false,
    *   //   "versionUrl": "my_versionUrl",
    *   //   "vm": false,
    *   //   "vpcAccessConnector": {},
    *   //   "zones": []
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
  def get(params: ParamsResourceAppsServicesVersionsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceAppsServicesVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var instances: ResourceAppsServicesVersionsInstances = js.native
  
  def list(): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(params: ParamsResourceAppsServicesVersionsList): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsList,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsList,
    options: BodyResponseCallback[Readable | SchemaListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAppsServicesVersionsList, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  /**
    * Lists the versions of a service.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/appengine.admin',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *       'https://www.googleapis.com/auth/cloud-platform.read-only',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await appengine.apps.services.versions.list({
    *     // Part of `parent`. Name of the parent Service resource. Example: apps/myapp/services/default.
    *     appsId: 'placeholder-value',
    *     // Maximum results to return per page.
    *     pageSize: 'placeholder-value',
    *     // Continuation token for fetching the next page of results.
    *     pageToken: 'placeholder-value',
    *     // Part of `parent`. See documentation of `appsId`.
    *     servicesId: 'placeholder-value',
    *     // Controls the set of fields returned in the List response.
    *     view: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "versions": []
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
  def list(params: ParamsResourceAppsServicesVersionsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceAppsServicesVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsServicesVersionsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAppsServicesVersionsPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAppsServicesVersionsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAppsServicesVersionsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAppsServicesVersionsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates the specified Version resource. You can specify the following fields depending on the App Engine environment and type of scaling that the version resource uses:Standard environment instance_class (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.instance_class)automatic scaling in the standard environment: automatic_scaling.min_idle_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling) automatic_scaling.max_idle_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling) automaticScaling.standard_scheduler_settings.max_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings) automaticScaling.standard_scheduler_settings.min_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings) automaticScaling.standard_scheduler_settings.target_cpu_utilization (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings) automaticScaling.standard_scheduler_settings.target_throughput_utilization (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#StandardSchedulerSettings)basic scaling or manual scaling in the standard environment: serving_status (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status) manual_scaling.instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#manualscaling)Flexible environment serving_status (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.serving_status)automatic scaling in the flexible environment: automatic_scaling.min_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling) automatic_scaling.max_total_instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling) automatic_scaling.cool_down_period_sec (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling) automatic_scaling.cpu_utilization.target_utilization (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#Version.FIELDS.automatic_scaling)manual scaling in the flexible environment: manual_scaling.instances (https://cloud.google.com/appengine/docs/admin-api/reference/rest/v1/apps.services.versions#manualscaling)
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/appengine.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const appengine = google.appengine('v1');
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
    *   const res = await appengine.apps.services.versions.patch({
    *     // Part of `name`. Name of the resource to update. Example: apps/myapp/services/default/versions/1.
    *     appsId: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     servicesId: 'placeholder-value',
    *     // Standard field mask for the set of fields to be updated.
    *     updateMask: 'placeholder-value',
    *     // Part of `name`. See documentation of `appsId`.
    *     versionsId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiConfig": {},
    *       //   "appEngineApis": false,
    *       //   "automaticScaling": {},
    *       //   "basicScaling": {},
    *       //   "betaSettings": {},
    *       //   "buildEnvVariables": {},
    *       //   "createTime": "my_createTime",
    *       //   "createdBy": "my_createdBy",
    *       //   "defaultExpiration": "my_defaultExpiration",
    *       //   "deployment": {},
    *       //   "diskUsageBytes": "my_diskUsageBytes",
    *       //   "endpointsApiService": {},
    *       //   "entrypoint": {},
    *       //   "env": "my_env",
    *       //   "envVariables": {},
    *       //   "errorHandlers": [],
    *       //   "handlers": [],
    *       //   "healthCheck": {},
    *       //   "id": "my_id",
    *       //   "inboundServices": [],
    *       //   "instanceClass": "my_instanceClass",
    *       //   "libraries": [],
    *       //   "livenessCheck": {},
    *       //   "manualScaling": {},
    *       //   "name": "my_name",
    *       //   "network": {},
    *       //   "nobuildFilesRegex": "my_nobuildFilesRegex",
    *       //   "readinessCheck": {},
    *       //   "resources": {},
    *       //   "runtime": "my_runtime",
    *       //   "runtimeApiVersion": "my_runtimeApiVersion",
    *       //   "runtimeChannel": "my_runtimeChannel",
    *       //   "runtimeMainExecutablePath": "my_runtimeMainExecutablePath",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "servingStatus": "my_servingStatus",
    *       //   "threadsafe": false,
    *       //   "versionUrl": "my_versionUrl",
    *       //   "vm": false,
    *       //   "vpcAccessConnector": {},
    *       //   "zones": []
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
  def patch(params: ParamsResourceAppsServicesVersionsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceAppsServicesVersionsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
