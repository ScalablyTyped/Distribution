package typings.googleapis.apigeeregistryV1Mod.apigeeregistryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/apigeeregistry/v1", "apigeeregistry_v1.Resource$Projects$Locations$Apis$Deployments$Artifacts")
@js.native
open class ResourceProjectsLocationsApisDeploymentsArtifacts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaArtifact] = js.native
  def create(callback: BodyResponseCallback[SchemaArtifact]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaArtifact] = js.native
  def create(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsCreate): GaxiosPromise[SchemaArtifact] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsCreate,
    callback: BodyResponseCallback[SchemaArtifact]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsCreate,
    options: BodyResponseCallback[Readable | SchemaArtifact],
    callback: BodyResponseCallback[Readable | SchemaArtifact]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsCreate, options: MethodOptions): GaxiosPromise[SchemaArtifact] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaArtifact]
  ): Unit = js.native
  /**
    * CreateArtifact creates a specified artifact.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *     await apigeeregistry.projects.locations.apis.deployments.artifacts.create({
    *       // Required. The ID to use for the artifact, which will become the final component of the artifact's resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
    *       artifactId: 'placeholder-value',
    *       // Required. The parent, which owns this collection of artifacts. Format: {parent\}
    *       parent:
    *         'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "contents": "my_contents",
    *         //   "createTime": "my_createTime",
    *         //   "hash": "my_hash",
    *         //   "mimeType": "my_mimeType",
    *         //   "name": "my_name",
    *         //   "sizeBytes": 0,
    *         //   "updateTime": "my_updateTime"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "hash": "my_hash",
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "sizeBytes": 0,
    *   //   "updateTime": "my_updateTime"
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
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * DeleteArtifact removes a specified artifact.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *     await apigeeregistry.projects.locations.apis.deployments.artifacts.delete({
    *       // Required. The name of the artifact to delete. Format: {parent\}/artifacts/x
    *       name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment/artifacts/my-artifact',
    *     });
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
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaArtifact] = js.native
  def get(callback: BodyResponseCallback[SchemaArtifact]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaArtifact] = js.native
  def get(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGet): GaxiosPromise[SchemaArtifact] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGet,
    callback: BodyResponseCallback[SchemaArtifact]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGet,
    options: BodyResponseCallback[Readable | SchemaArtifact],
    callback: BodyResponseCallback[Readable | SchemaArtifact]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGet, options: MethodOptions): GaxiosPromise[SchemaArtifact] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaArtifact]
  ): Unit = js.native
  /**
    * GetArtifact returns a specified artifact.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *     await apigeeregistry.projects.locations.apis.deployments.artifacts.get({
    *       // Required. The name of the artifact to retrieve. Format: {parent\}/artifacts/x
    *       name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment/artifacts/my-artifact',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "hash": "my_hash",
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "sizeBytes": 0,
    *   //   "updateTime": "my_updateTime"
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
  def get(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def getContents(): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(callback: BodyResponseCallback[SchemaHttpBody]): Unit = js.native
  def getContents(params: Unit, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGetcontents): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGetcontents,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGetcontents,
    options: BodyResponseCallback[Readable | SchemaHttpBody],
    callback: BodyResponseCallback[Readable | SchemaHttpBody]
  ): Unit = js.native
  def getContents(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGetcontents, options: MethodOptions): GaxiosPromise[SchemaHttpBody] = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGetcontents,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaHttpBody]
  ): Unit = js.native
  /**
    * GetArtifactContents returns the contents of a specified artifact. If artifacts are stored with GZip compression, the default behavior is to return the artifact uncompressed (the mime_type response field indicates the exact format returned).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *     await apigeeregistry.projects.locations.apis.deployments.artifacts.getContents(
    *       {
    *         // Required. The name of the artifact whose contents should be retrieved. Format: {parent\}/artifacts/x
    *         name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment/artifacts/my-artifact',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contentType": "my_contentType",
    *   //   "data": "my_data",
    *   //   "extensions": []
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
  def getContents(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGetcontents,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def getContents(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsGetcontents,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListArtifactsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListArtifactsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListArtifactsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsList): GaxiosPromise[SchemaListArtifactsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsList,
    callback: BodyResponseCallback[SchemaListArtifactsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsList,
    options: BodyResponseCallback[Readable | SchemaListArtifactsResponse],
    callback: BodyResponseCallback[Readable | SchemaListArtifactsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsList, options: MethodOptions): GaxiosPromise[SchemaListArtifactsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListArtifactsResponse]
  ): Unit = js.native
  /**
    * ListArtifacts returns matching artifacts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *     await apigeeregistry.projects.locations.apis.deployments.artifacts.list({
    *       // An expression that can be used to filter the list. Filters use the Common Expression Language and can refer to all message fields except contents.
    *       filter: 'placeholder-value',
    *       // The maximum number of artifacts to return. The service may return fewer than this value. If unspecified, at most 50 values will be returned. The maximum is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListArtifacts` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListArtifacts` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. The parent, which owns this collection of artifacts. Format: {parent\}
    *       parent:
    *         'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "artifacts": [],
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
  def list(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def replaceArtifact(): GaxiosPromise[SchemaArtifact] = js.native
  def replaceArtifact(callback: BodyResponseCallback[SchemaArtifact]): Unit = js.native
  def replaceArtifact(params: Unit, options: MethodOptions): GaxiosPromise[SchemaArtifact] = js.native
  def replaceArtifact(params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsReplaceartifact): GaxiosPromise[SchemaArtifact] = js.native
  def replaceArtifact(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsReplaceartifact,
    callback: BodyResponseCallback[SchemaArtifact]
  ): Unit = js.native
  def replaceArtifact(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsReplaceartifact,
    options: BodyResponseCallback[Readable | SchemaArtifact],
    callback: BodyResponseCallback[Readable | SchemaArtifact]
  ): Unit = js.native
  def replaceArtifact(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsReplaceartifact,
    options: MethodOptions
  ): GaxiosPromise[SchemaArtifact] = js.native
  def replaceArtifact(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsReplaceartifact,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaArtifact]
  ): Unit = js.native
  /**
    * ReplaceArtifact can be used to replace a specified artifact.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/apigeeregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const apigeeregistry = google.apigeeregistry('v1');
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
    *     await apigeeregistry.projects.locations.apis.deployments.artifacts.replaceArtifact(
    *       {
    *         // Resource name.
    *         name: 'projects/my-project/locations/my-location/apis/my-api/deployments/my-deployment/artifacts/my-artifact',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "contents": "my_contents",
    *           //   "createTime": "my_createTime",
    *           //   "hash": "my_hash",
    *           //   "mimeType": "my_mimeType",
    *           //   "name": "my_name",
    *           //   "sizeBytes": 0,
    *           //   "updateTime": "my_updateTime"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "contents": "my_contents",
    *   //   "createTime": "my_createTime",
    *   //   "hash": "my_hash",
    *   //   "mimeType": "my_mimeType",
    *   //   "name": "my_name",
    *   //   "sizeBytes": 0,
    *   //   "updateTime": "my_updateTime"
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
  def replaceArtifact(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsReplaceartifact,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def replaceArtifact(
    params: ParamsResourceProjectsLocationsApisDeploymentsArtifactsReplaceartifact,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
