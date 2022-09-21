package typings.googleapis.artifactregistryV1beta1Mod.artifactregistryV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/artifactregistry/v1beta1", "artifactregistry_v1beta1.Resource$Projects$Locations$Repositories$Files")
@js.native
open class ResourceProjectsLocationsRepositoriesFiles protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaFile] = js.native
  def get(callback: BodyResponseCallback[SchemaFile]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesFilesGet): GaxiosPromise[SchemaFile] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesFilesGet,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesFilesGet,
    options: BodyResponseCallback[Readable | SchemaFile],
    callback: BodyResponseCallback[Readable | SchemaFile]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesFilesGet, options: MethodOptions): GaxiosPromise[SchemaFile] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesFilesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaFile]
  ): Unit = js.native
  /**
    * Gets a file.
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
    * const artifactregistry = google.artifactregistry('v1beta1');
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
    *   const res = await artifactregistry.projects.locations.repositories.files.get({
    *     // The name of the file to retrieve.
    *     name: 'projects/my-project/locations/my-location/repositories/my-repositorie/files/.*',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "hashes": [],
    *   //   "name": "my_name",
    *   //   "owner": "my_owner",
    *   //   "sizeBytes": "my_sizeBytes",
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
  def get(params: ParamsResourceProjectsLocationsRepositoriesFilesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesFilesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListFilesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListFilesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListFilesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesFilesList): GaxiosPromise[SchemaListFilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesFilesList,
    callback: BodyResponseCallback[SchemaListFilesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesFilesList,
    options: BodyResponseCallback[Readable | SchemaListFilesResponse],
    callback: BodyResponseCallback[Readable | SchemaListFilesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesFilesList, options: MethodOptions): GaxiosPromise[SchemaListFilesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesFilesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListFilesResponse]
  ): Unit = js.native
  /**
    * Lists files.
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
    * const artifactregistry = google.artifactregistry('v1beta1');
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
    *   const res = await artifactregistry.projects.locations.repositories.files.list(
    *     {
    *       // An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `name` * `owner` An example of using a filter: * `name="projects/p1/locations/us-central1/repositories/repo1/files/a/b/x"` --\> Files with an ID starting with "a/b/". * `owner="projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0"` --\> Files owned by the version `1.0` in package `pkg1`.
    *       filter: 'placeholder-value',
    *       // The maximum number of files to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // The name of the repository whose files will be listed. For example: "projects/p1/locations/us-central1/repositories/repo1
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *     }
    *   );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "files": [],
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
  def list(params: ParamsResourceProjectsLocationsRepositoriesFilesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesFilesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
