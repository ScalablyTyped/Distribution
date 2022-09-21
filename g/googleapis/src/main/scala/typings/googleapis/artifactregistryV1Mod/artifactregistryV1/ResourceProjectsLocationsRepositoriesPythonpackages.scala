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

@JSImport("googleapis/build/src/apis/artifactregistry/v1", "artifactregistry_v1.Resource$Projects$Locations$Repositories$Pythonpackages")
@js.native
open class ResourceProjectsLocationsRepositoriesPythonpackages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaPythonPackage] = js.native
  def get(callback: BodyResponseCallback[SchemaPythonPackage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPythonPackage] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesGet): GaxiosPromise[SchemaPythonPackage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesGet,
    callback: BodyResponseCallback[SchemaPythonPackage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesGet,
    options: BodyResponseCallback[Readable | SchemaPythonPackage],
    callback: BodyResponseCallback[Readable | SchemaPythonPackage]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesGet, options: MethodOptions): GaxiosPromise[SchemaPythonPackage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPythonPackage]
  ): Unit = js.native
  /**
    * Gets a python package.
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
    *     await artifactregistry.projects.locations.repositories.pythonPackages.get({
    *       // Required. The name of the python package.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/pythonPackages/my-pythonPackage',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "packageName": "my_packageName",
    *   //   "updateTime": "my_updateTime",
    *   //   "uri": "my_uri",
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
  def get(params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPythonPackagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPythonPackagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPythonPackagesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesList): GaxiosPromise[SchemaListPythonPackagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesList,
    callback: BodyResponseCallback[SchemaListPythonPackagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesList,
    options: BodyResponseCallback[Readable | SchemaListPythonPackagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPythonPackagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesList, options: MethodOptions): GaxiosPromise[SchemaListPythonPackagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPythonPackagesResponse]
  ): Unit = js.native
  /**
    * Lists python packages.
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
    *     await artifactregistry.projects.locations.repositories.pythonPackages.list({
    *       // The maximum number of artifacts to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. The name of the parent resource whose python packages will be listed.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "pythonPackages": []
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
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPythonpackagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
