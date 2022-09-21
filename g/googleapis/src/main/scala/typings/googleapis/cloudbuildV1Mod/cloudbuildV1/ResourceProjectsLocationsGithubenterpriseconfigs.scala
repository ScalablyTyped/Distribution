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

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Locations$Githubenterpriseconfigs")
@js.native
open class ResourceProjectsLocationsGithubenterpriseconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Create an association between a GCP project and a GitHub Enterprise server.
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
    *   const res =
    *     await cloudbuild.projects.locations.githubEnterpriseConfigs.create({
    *       // Optional. The ID to use for the GithubEnterpriseConfig, which will become the final component of the GithubEnterpriseConfig's resource name. ghe_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character
    *       gheConfigId: 'placeholder-value',
    *       // Name of the parent project. For example: projects/{$project_number\} or projects/{$project_id\}
    *       parent: 'projects/my-project/locations/my-location',
    *       // ID of the project.
    *       projectId: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "appId": "my_appId",
    *         //   "createTime": "my_createTime",
    *         //   "displayName": "my_displayName",
    *         //   "hostUrl": "my_hostUrl",
    *         //   "name": "my_name",
    *         //   "peeredNetwork": "my_peeredNetwork",
    *         //   "secrets": {},
    *         //   "sslCa": "my_sslCa",
    *         //   "webhookKey": "my_webhookKey"
    *         // }
    *       },
    *     });
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
  def create(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Delete an association between a GCP project and a GitHub Enterprise server.
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
    *   const res =
    *     await cloudbuild.projects.locations.githubEnterpriseConfigs.delete({
    *       // Unique identifier of the `GitHubEnterpriseConfig`
    *       configId: 'placeholder-value',
    *       // This field should contain the name of the enterprise config resource. For example: "projects/{$project_id\}/githubEnterpriseConfigs/{$config_id\}"
    *       name: 'projects/my-project/locations/my-location/githubEnterpriseConfigs/my-githubEnterpriseConfig',
    *       // ID of the project
    *       projectId: 'placeholder-value',
    *     });
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
  def delete(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaGitHubEnterpriseConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaGitHubEnterpriseConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGitHubEnterpriseConfig] = js.native
  def get(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsGet): GaxiosPromise[SchemaGitHubEnterpriseConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsGet,
    callback: BodyResponseCallback[SchemaGitHubEnterpriseConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsGet,
    options: BodyResponseCallback[Readable | SchemaGitHubEnterpriseConfig],
    callback: BodyResponseCallback[Readable | SchemaGitHubEnterpriseConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsGet, options: MethodOptions): GaxiosPromise[SchemaGitHubEnterpriseConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGitHubEnterpriseConfig]
  ): Unit = js.native
  /**
    * Retrieve a GitHubEnterpriseConfig.
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
    *   const res = await cloudbuild.projects.locations.githubEnterpriseConfigs.get({
    *     // Unique identifier of the `GitHubEnterpriseConfig`
    *     configId: 'placeholder-value',
    *     // This field should contain the name of the enterprise config resource. For example: "projects/{$project_id\}/githubEnterpriseConfigs/{$config_id\}"
    *     name: 'projects/my-project/locations/my-location/githubEnterpriseConfigs/my-githubEnterpriseConfig',
    *     // ID of the project
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "appId": "my_appId",
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "hostUrl": "my_hostUrl",
    *   //   "name": "my_name",
    *   //   "peeredNetwork": "my_peeredNetwork",
    *   //   "secrets": {},
    *   //   "sslCa": "my_sslCa",
    *   //   "webhookKey": "my_webhookKey"
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
  def get(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListGithubEnterpriseConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGithubEnterpriseConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGithubEnterpriseConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsList): GaxiosPromise[SchemaListGithubEnterpriseConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsList,
    callback: BodyResponseCallback[SchemaListGithubEnterpriseConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsList,
    options: BodyResponseCallback[Readable | SchemaListGithubEnterpriseConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListGithubEnterpriseConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsList, options: MethodOptions): GaxiosPromise[SchemaListGithubEnterpriseConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGithubEnterpriseConfigsResponse]
  ): Unit = js.native
  /**
    * List all GitHubEnterpriseConfigs for a given project.
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
    *   const res = await cloudbuild.projects.locations.githubEnterpriseConfigs.list({
    *     // Name of the parent project. For example: projects/{$project_number\} or projects/{$project_id\}
    *     parent: 'projects/my-project/locations/my-location',
    *     // ID of the project
    *     projectId: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "configs": []
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
  def list(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Update an association between a GCP project and a GitHub Enterprise server.
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
    *   const res = await cloudbuild.projects.locations.githubEnterpriseConfigs.patch(
    *     {
    *       // Optional. The full resource name for the GitHubEnterpriseConfig For example: "projects/{$project_id\}/githubEnterpriseConfigs/{$config_id\}"
    *       name: 'projects/my-project/locations/my-location/githubEnterpriseConfigs/my-githubEnterpriseConfig',
    *       // Update mask for the resource. If this is set, the server will only update the fields specified in the field mask. Otherwise, a full update of the mutable resource fields will be performed.
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "appId": "my_appId",
    *         //   "createTime": "my_createTime",
    *         //   "displayName": "my_displayName",
    *         //   "hostUrl": "my_hostUrl",
    *         //   "name": "my_name",
    *         //   "peeredNetwork": "my_peeredNetwork",
    *         //   "secrets": {},
    *         //   "sslCa": "my_sslCa",
    *         //   "webhookKey": "my_webhookKey"
    *         // }
    *       },
    *     }
    *   );
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
  def patch(params: ParamsResourceProjectsLocationsGithubenterpriseconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsGithubenterpriseconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
