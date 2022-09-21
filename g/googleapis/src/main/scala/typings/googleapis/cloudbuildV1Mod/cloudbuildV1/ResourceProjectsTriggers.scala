package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Triggers")
@js.native
open class ResourceProjectsTriggers protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(params: ParamsResourceProjectsTriggersCreate): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(params: ParamsResourceProjectsTriggersCreate, callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def create(
    params: ParamsResourceProjectsTriggersCreate,
    options: BodyResponseCallback[Readable | SchemaBuildTrigger],
    callback: BodyResponseCallback[Readable | SchemaBuildTrigger]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsTriggersCreate, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def create(
    params: ParamsResourceProjectsTriggersCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  /**
    * Creates a new `BuildTrigger`. This API is experimental.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *   const res = await cloudbuild.projects.triggers.create({
    *     // The parent resource where this trigger will be created. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'placeholder-value',
    *     // Required. ID of the project for which to configure automatic builds.
    *     projectId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "approvalConfig": {},
    *       //   "autodetect": false,
    *       //   "bitbucketServerTriggerConfig": {},
    *       //   "build": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "disabled": false,
    *       //   "eventType": "my_eventType",
    *       //   "filename": "my_filename",
    *       //   "filter": "my_filter",
    *       //   "gitFileSource": {},
    *       //   "github": {},
    *       //   "id": "my_id",
    *       //   "ignoredFiles": [],
    *       //   "includeBuildLogs": "my_includeBuildLogs",
    *       //   "includedFiles": [],
    *       //   "name": "my_name",
    *       //   "pubsubConfig": {},
    *       //   "resourceName": "my_resourceName",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "sourceToBuild": {},
    *       //   "substitutions": {},
    *       //   "tags": [],
    *       //   "triggerTemplate": {},
    *       //   "webhookConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approvalConfig": {},
    *   //   "autodetect": false,
    *   //   "bitbucketServerTriggerConfig": {},
    *   //   "build": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "disabled": false,
    *   //   "eventType": "my_eventType",
    *   //   "filename": "my_filename",
    *   //   "filter": "my_filter",
    *   //   "gitFileSource": {},
    *   //   "github": {},
    *   //   "id": "my_id",
    *   //   "ignoredFiles": [],
    *   //   "includeBuildLogs": "my_includeBuildLogs",
    *   //   "includedFiles": [],
    *   //   "name": "my_name",
    *   //   "pubsubConfig": {},
    *   //   "resourceName": "my_resourceName",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "sourceToBuild": {},
    *   //   "substitutions": {},
    *   //   "tags": [],
    *   //   "triggerTemplate": {},
    *   //   "webhookConfig": {}
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
  def create(params: ParamsResourceProjectsTriggersCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsTriggersCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTriggersDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsTriggersDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsTriggersDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsTriggersDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsTriggersDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a `BuildTrigger` by its project ID and trigger ID. This API is experimental.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *   const res = await cloudbuild.projects.triggers.delete({
    *     // The name of the `Trigger` to delete. Format: `projects/{project\}/locations/{location\}/triggers/{trigger\}`
    *     name: 'placeholder-value',
    *     // Required. ID of the project that owns the trigger.
    *     projectId: 'placeholder-value',
    *     // Required. ID of the `BuildTrigger` to delete.
    *     triggerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def delete(params: ParamsResourceProjectsTriggersDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsTriggersDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(params: ParamsResourceProjectsTriggersGet): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(params: ParamsResourceProjectsTriggersGet, callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def get(
    params: ParamsResourceProjectsTriggersGet,
    options: BodyResponseCallback[Readable | SchemaBuildTrigger],
    callback: BodyResponseCallback[Readable | SchemaBuildTrigger]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsTriggersGet, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def get(
    params: ParamsResourceProjectsTriggersGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  /**
    * Returns information about a `BuildTrigger`. This API is experimental.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *   const res = await cloudbuild.projects.triggers.get({
    *     // The name of the `Trigger` to retrieve. Format: `projects/{project\}/locations/{location\}/triggers/{trigger\}`
    *     name: 'placeholder-value',
    *     // Required. ID of the project that owns the trigger.
    *     projectId: 'placeholder-value',
    *     // Required. Identifier (`id` or `name`) of the `BuildTrigger` to get.
    *     triggerId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approvalConfig": {},
    *   //   "autodetect": false,
    *   //   "bitbucketServerTriggerConfig": {},
    *   //   "build": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "disabled": false,
    *   //   "eventType": "my_eventType",
    *   //   "filename": "my_filename",
    *   //   "filter": "my_filter",
    *   //   "gitFileSource": {},
    *   //   "github": {},
    *   //   "id": "my_id",
    *   //   "ignoredFiles": [],
    *   //   "includeBuildLogs": "my_includeBuildLogs",
    *   //   "includedFiles": [],
    *   //   "name": "my_name",
    *   //   "pubsubConfig": {},
    *   //   "resourceName": "my_resourceName",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "sourceToBuild": {},
    *   //   "substitutions": {},
    *   //   "tags": [],
    *   //   "triggerTemplate": {},
    *   //   "webhookConfig": {}
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
  def get(params: ParamsResourceProjectsTriggersGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsTriggersGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBuildTriggersResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(params: ParamsResourceProjectsTriggersList): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsTriggersList,
    callback: BodyResponseCallback[SchemaListBuildTriggersResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsTriggersList,
    options: BodyResponseCallback[Readable | SchemaListBuildTriggersResponse],
    callback: BodyResponseCallback[Readable | SchemaListBuildTriggersResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsTriggersList, options: MethodOptions): GaxiosPromise[SchemaListBuildTriggersResponse] = js.native
  def list(
    params: ParamsResourceProjectsTriggersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBuildTriggersResponse]
  ): Unit = js.native
  /**
    * Lists existing `BuildTrigger`s. This API is experimental.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *   const res = await cloudbuild.projects.triggers.list({
    *     // Number of results to return in the list.
    *     pageSize: 'placeholder-value',
    *     // Token to provide to skip to a particular spot in the list.
    *     pageToken: 'placeholder-value',
    *     // The parent of the collection of `Triggers`. Format: `projects/{project\}/locations/{location\}`
    *     parent: 'placeholder-value',
    *     // Required. ID of the project for which to list BuildTriggers.
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "triggers": []
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
  def list(params: ParamsResourceProjectsTriggersList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsTriggersList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(params: ParamsResourceProjectsTriggersPatch): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(params: ParamsResourceProjectsTriggersPatch, callback: BodyResponseCallback[SchemaBuildTrigger]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsTriggersPatch,
    options: BodyResponseCallback[Readable | SchemaBuildTrigger],
    callback: BodyResponseCallback[Readable | SchemaBuildTrigger]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsTriggersPatch, options: MethodOptions): GaxiosPromise[SchemaBuildTrigger] = js.native
  def patch(
    params: ParamsResourceProjectsTriggersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBuildTrigger]
  ): Unit = js.native
  /**
    * Updates a `BuildTrigger` by its project ID and trigger ID. This API is experimental.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *   const res = await cloudbuild.projects.triggers.patch({
    *     // Required. ID of the project that owns the trigger.
    *     projectId: 'placeholder-value',
    *     // Required. ID of the `BuildTrigger` to update.
    *     triggerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "approvalConfig": {},
    *       //   "autodetect": false,
    *       //   "bitbucketServerTriggerConfig": {},
    *       //   "build": {},
    *       //   "createTime": "my_createTime",
    *       //   "description": "my_description",
    *       //   "disabled": false,
    *       //   "eventType": "my_eventType",
    *       //   "filename": "my_filename",
    *       //   "filter": "my_filter",
    *       //   "gitFileSource": {},
    *       //   "github": {},
    *       //   "id": "my_id",
    *       //   "ignoredFiles": [],
    *       //   "includeBuildLogs": "my_includeBuildLogs",
    *       //   "includedFiles": [],
    *       //   "name": "my_name",
    *       //   "pubsubConfig": {},
    *       //   "resourceName": "my_resourceName",
    *       //   "serviceAccount": "my_serviceAccount",
    *       //   "sourceToBuild": {},
    *       //   "substitutions": {},
    *       //   "tags": [],
    *       //   "triggerTemplate": {},
    *       //   "webhookConfig": {}
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "approvalConfig": {},
    *   //   "autodetect": false,
    *   //   "bitbucketServerTriggerConfig": {},
    *   //   "build": {},
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "disabled": false,
    *   //   "eventType": "my_eventType",
    *   //   "filename": "my_filename",
    *   //   "filter": "my_filter",
    *   //   "gitFileSource": {},
    *   //   "github": {},
    *   //   "id": "my_id",
    *   //   "ignoredFiles": [],
    *   //   "includeBuildLogs": "my_includeBuildLogs",
    *   //   "includedFiles": [],
    *   //   "name": "my_name",
    *   //   "pubsubConfig": {},
    *   //   "resourceName": "my_resourceName",
    *   //   "serviceAccount": "my_serviceAccount",
    *   //   "sourceToBuild": {},
    *   //   "substitutions": {},
    *   //   "tags": [],
    *   //   "triggerTemplate": {},
    *   //   "webhookConfig": {}
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
  def patch(params: ParamsResourceProjectsTriggersPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsTriggersPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def run(): GaxiosPromise[SchemaOperation] = js.native
  def run(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourceProjectsTriggersRun): GaxiosPromise[SchemaOperation] = js.native
  def run(params: ParamsResourceProjectsTriggersRun, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def run(
    params: ParamsResourceProjectsTriggersRun,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def run(params: ParamsResourceProjectsTriggersRun, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def run(
    params: ParamsResourceProjectsTriggersRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Runs a `BuildTrigger` at a particular source revision. To run a regional or global trigger, use the POST request that includes the location endpoint in the path. The POST request that does not include the location endpoint in the path can only be used when running global triggers.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *   const res = await cloudbuild.projects.triggers.run({
    *     // The name of the `Trigger` to run. Format: `projects/{project\}/locations/{location\}/triggers/{trigger\}`
    *     name: 'placeholder-value',
    *     // Required. ID of the project.
    *     projectId: 'placeholder-value',
    *     // Required. ID of the trigger.
    *     triggerId: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "branchName": "my_branchName",
    *       //   "commitSha": "my_commitSha",
    *       //   "dir": "my_dir",
    *       //   "invertRegex": false,
    *       //   "projectId": "my_projectId",
    *       //   "repoName": "my_repoName",
    *       //   "substitutions": {},
    *       //   "tagName": "my_tagName"
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
  def run(params: ParamsResourceProjectsTriggersRun, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def run(
    params: ParamsResourceProjectsTriggersRun,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def webhook(): GaxiosPromise[SchemaReceiveTriggerWebhookResponse] = js.native
  def webhook(callback: BodyResponseCallback[SchemaReceiveTriggerWebhookResponse]): Unit = js.native
  def webhook(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReceiveTriggerWebhookResponse] = js.native
  def webhook(params: ParamsResourceProjectsTriggersWebhook): GaxiosPromise[SchemaReceiveTriggerWebhookResponse] = js.native
  def webhook(
    params: ParamsResourceProjectsTriggersWebhook,
    callback: BodyResponseCallback[SchemaReceiveTriggerWebhookResponse]
  ): Unit = js.native
  def webhook(
    params: ParamsResourceProjectsTriggersWebhook,
    options: BodyResponseCallback[Readable | SchemaReceiveTriggerWebhookResponse],
    callback: BodyResponseCallback[Readable | SchemaReceiveTriggerWebhookResponse]
  ): Unit = js.native
  def webhook(params: ParamsResourceProjectsTriggersWebhook, options: MethodOptions): GaxiosPromise[SchemaReceiveTriggerWebhookResponse] = js.native
  def webhook(
    params: ParamsResourceProjectsTriggersWebhook,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReceiveTriggerWebhookResponse]
  ): Unit = js.native
  /**
    * ReceiveTriggerWebhook [Experimental] is called when the API receives a webhook request targeted at a specific trigger.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *   const res = await cloudbuild.projects.triggers.webhook({
    *     // The name of the `ReceiveTriggerWebhook` to retrieve. Format: `projects/{project\}/locations/{location\}/triggers/{trigger\}`
    *     name: 'placeholder-value',
    *     // Project in which the specified trigger lives
    *     projectId: 'placeholder-value',
    *     // Secret token used for authorization if an OAuth token isn't provided.
    *     secret: 'placeholder-value',
    *     // Name of the trigger to run the payload against
    *     trigger: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "contentType": "my_contentType",
    *       //   "data": "my_data",
    *       //   "extensions": []
    *       // }
    *     },
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {}
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
  def webhook(params: ParamsResourceProjectsTriggersWebhook, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def webhook(
    params: ParamsResourceProjectsTriggersWebhook,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
