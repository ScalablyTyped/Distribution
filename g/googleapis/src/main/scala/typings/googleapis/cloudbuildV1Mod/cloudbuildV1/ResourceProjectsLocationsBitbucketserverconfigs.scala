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

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Locations$Bitbucketserverconfigs")
@js.native
open class ResourceProjectsLocationsBitbucketserverconfigs protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var connectedRepositories: ResourceProjectsLocationsBitbucketserverconfigsConnectedrepositories = js.native
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Creates a new `BitbucketServerConfig`. This API is experimental.
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
    *   const res = await cloudbuild.projects.locations.bitbucketServerConfigs.create(
    *     {
    *       // Optional. The ID to use for the BitbucketServerConfig, which will become the final component of the BitbucketServerConfig's resource name. bitbucket_server_config_id must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
    *       bitbucketServerConfigId: 'placeholder-value',
    *       // Required. Name of the parent resource.
    *       parent: 'projects/my-project/locations/my-location',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "apiKey": "my_apiKey",
    *         //   "connectedRepositories": [],
    *         //   "createTime": "my_createTime",
    *         //   "hostUri": "my_hostUri",
    *         //   "name": "my_name",
    *         //   "peeredNetwork": "my_peeredNetwork",
    *         //   "secrets": {},
    *         //   "sslCa": "my_sslCa",
    *         //   "username": "my_username",
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
  def create(params: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Delete a `BitbucketServerConfig`. This API is experimental.
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
    *   const res = await cloudbuild.projects.locations.bitbucketServerConfigs.delete(
    *     {
    *       // Required. The config resource name.
    *       name: 'projects/my-project/locations/my-location/bitbucketServerConfigs/my-bitbucketServerConfig',
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
  def delete(params: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaBitbucketServerConfig] = js.native
  def get(callback: BodyResponseCallback[SchemaBitbucketServerConfig]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaBitbucketServerConfig] = js.native
  def get(params: ParamsResourceProjectsLocationsBitbucketserverconfigsGet): GaxiosPromise[SchemaBitbucketServerConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsGet,
    callback: BodyResponseCallback[SchemaBitbucketServerConfig]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsGet,
    options: BodyResponseCallback[Readable | SchemaBitbucketServerConfig],
    callback: BodyResponseCallback[Readable | SchemaBitbucketServerConfig]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsBitbucketserverconfigsGet, options: MethodOptions): GaxiosPromise[SchemaBitbucketServerConfig] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaBitbucketServerConfig]
  ): Unit = js.native
  /**
    * Retrieve a `BitbucketServerConfig`. This API is experimental.
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
    *   const res = await cloudbuild.projects.locations.bitbucketServerConfigs.get({
    *     // Required. The config resource name.
    *     name: 'projects/my-project/locations/my-location/bitbucketServerConfigs/my-bitbucketServerConfig',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "apiKey": "my_apiKey",
    *   //   "connectedRepositories": [],
    *   //   "createTime": "my_createTime",
    *   //   "hostUri": "my_hostUri",
    *   //   "name": "my_name",
    *   //   "peeredNetwork": "my_peeredNetwork",
    *   //   "secrets": {},
    *   //   "sslCa": "my_sslCa",
    *   //   "username": "my_username",
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
  def get(params: ParamsResourceProjectsLocationsBitbucketserverconfigsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListBitbucketServerConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBitbucketServerConfigsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBitbucketServerConfigsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsBitbucketserverconfigsList): GaxiosPromise[SchemaListBitbucketServerConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsList,
    callback: BodyResponseCallback[SchemaListBitbucketServerConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsList,
    options: BodyResponseCallback[Readable | SchemaListBitbucketServerConfigsResponse],
    callback: BodyResponseCallback[Readable | SchemaListBitbucketServerConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsBitbucketserverconfigsList, options: MethodOptions): GaxiosPromise[SchemaListBitbucketServerConfigsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBitbucketServerConfigsResponse]
  ): Unit = js.native
  /**
    * List all `BitbucketServerConfigs` for a given project. This API is experimental.
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
    *   const res = await cloudbuild.projects.locations.bitbucketServerConfigs.list({
    *     // The maximum number of configs to return. The service may return fewer than this value. If unspecified, at most 50 configs will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *     pageSize: 'placeholder-value',
    *     // A page token, received from a previous `ListBitbucketServerConfigsRequest` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBitbucketServerConfigsRequest` must match the call that provided the page token.
    *     pageToken: 'placeholder-value',
    *     // Required. Name of the parent resource.
    *     parent: 'projects/my-project/locations/my-location',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bitbucketServerConfigs": [],
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
  def list(params: ParamsResourceProjectsLocationsBitbucketserverconfigsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceProjectsLocationsBitbucketserverconfigsPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsPatch,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsPatch,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsBitbucketserverconfigsPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Updates an existing `BitbucketServerConfig`. This API is experimental.
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
    *   const res = await cloudbuild.projects.locations.bitbucketServerConfigs.patch({
    *     // The resource name for the config.
    *     name: 'projects/my-project/locations/my-location/bitbucketServerConfigs/my-bitbucketServerConfig',
    *     // Update mask for the resource. If this is set, the server will only update the fields specified in the field mask. Otherwise, a full update of the mutable resource fields will be performed.
    *     updateMask: 'placeholder-value',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "apiKey": "my_apiKey",
    *       //   "connectedRepositories": [],
    *       //   "createTime": "my_createTime",
    *       //   "hostUri": "my_hostUri",
    *       //   "name": "my_name",
    *       //   "peeredNetwork": "my_peeredNetwork",
    *       //   "secrets": {},
    *       //   "sslCa": "my_sslCa",
    *       //   "username": "my_username",
    *       //   "webhookKey": "my_webhookKey"
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
  def patch(params: ParamsResourceProjectsLocationsBitbucketserverconfigsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def removeBitbucketServerConnectedRepository(): GaxiosPromise[SchemaEmpty] = js.native
  def removeBitbucketServerConnectedRepository(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def removeBitbucketServerConnectedRepository(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def removeBitbucketServerConnectedRepository(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository
  ): GaxiosPromise[SchemaEmpty] = js.native
  def removeBitbucketServerConnectedRepository(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def removeBitbucketServerConnectedRepository(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def removeBitbucketServerConnectedRepository(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository,
    options: MethodOptions
  ): GaxiosPromise[SchemaEmpty] = js.native
  def removeBitbucketServerConnectedRepository(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Remove a Bitbucket Server repository from a given BitbucketServerConfig's connected repositories. This API is experimental.
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
    *     await cloudbuild.projects.locations.bitbucketServerConfigs.removeBitbucketServerConnectedRepository(
    *       {
    *         // Required. The name of the `BitbucketServerConfig` to remove a connected repository. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{config\}`
    *         config:
    *           'projects/my-project/locations/my-location/bitbucketServerConfigs/my-bitbucketServerConfig',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "connectedRepository": {}
    *           // }
    *         },
    *       }
    *     );
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
  def removeBitbucketServerConnectedRepository(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def removeBitbucketServerConnectedRepository(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsRemovebitbucketserverconnectedrepository,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var repos: ResourceProjectsLocationsBitbucketserverconfigsRepos = js.native
}
