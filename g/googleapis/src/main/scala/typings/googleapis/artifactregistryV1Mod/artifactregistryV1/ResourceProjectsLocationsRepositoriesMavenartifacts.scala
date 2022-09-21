package typings.googleapis.artifactregistryV1Mod.artifactregistryV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/artifactregistry/v1", "artifactregistry_v1.Resource$Projects$Locations$Repositories$Mavenartifacts")
@js.native
open class ResourceProjectsLocationsRepositoriesMavenartifacts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaMavenArtifact] = js.native
  def get(callback: BodyResponseCallback[SchemaMavenArtifact]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaMavenArtifact] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet): GaxiosPromise[SchemaMavenArtifact] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet,
    callback: BodyResponseCallback[SchemaMavenArtifact]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet,
    options: BodyResponseCallback[Readable | SchemaMavenArtifact],
    callback: BodyResponseCallback[Readable | SchemaMavenArtifact]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet, options: MethodOptions): GaxiosPromise[SchemaMavenArtifact] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaMavenArtifact]
  ): Unit = js.native
  /**
    * Gets a maven artifact.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/artifactregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const artifactregistry = google.artifactregistry('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res =
    *     await artifactregistry.projects.locations.repositories.mavenArtifacts.get({
    *       // Required. The name of the maven artifact.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/mavenArtifacts/my-mavenArtifact',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "artifactId": "my_artifactId",
    *   //   "createTime": "my_createTime",
    *   //   "groupId": "my_groupId",
    *   //   "name": "my_name",
    *   //   "pomUri": "my_pomUri",
    *   //   "updateTime": "my_updateTime",
    *   //   "version": "my_version"
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
  def get(params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListMavenArtifactsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListMavenArtifactsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListMavenArtifactsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsList): GaxiosPromise[SchemaListMavenArtifactsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsList,
    callback: BodyResponseCallback[SchemaListMavenArtifactsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsList,
    options: BodyResponseCallback[Readable | SchemaListMavenArtifactsResponse],
    callback: BodyResponseCallback[Readable | SchemaListMavenArtifactsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsList, options: MethodOptions): GaxiosPromise[SchemaListMavenArtifactsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListMavenArtifactsResponse]
  ): Unit = js.native
  /**
    * Lists maven artifacts.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/artifactregistry.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const artifactregistry = google.artifactregistry('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
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
    *   const res =
    *     await artifactregistry.projects.locations.repositories.mavenArtifacts.list({
    *       // The maximum number of artifacts to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. The name of the parent resource whose maven artifacts will be listed.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "mavenArtifacts": [],
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
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesMavenartifactsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
