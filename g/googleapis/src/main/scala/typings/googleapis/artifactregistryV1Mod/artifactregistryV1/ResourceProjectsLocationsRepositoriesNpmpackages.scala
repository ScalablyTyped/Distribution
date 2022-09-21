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

@JSImport("googleapis/build/src/apis/artifactregistry/v1", "artifactregistry_v1.Resource$Projects$Locations$Repositories$Npmpackages")
@js.native
open class ResourceProjectsLocationsRepositoriesNpmpackages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaNpmPackage] = js.native
  def get(callback: BodyResponseCallback[SchemaNpmPackage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaNpmPackage] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesGet): GaxiosPromise[SchemaNpmPackage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesGet,
    callback: BodyResponseCallback[SchemaNpmPackage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesGet,
    options: BodyResponseCallback[Readable | SchemaNpmPackage],
    callback: BodyResponseCallback[Readable | SchemaNpmPackage]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesGet, options: MethodOptions): GaxiosPromise[SchemaNpmPackage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaNpmPackage]
  ): Unit = js.native
  /**
    * Gets a npm package.
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
    *     await artifactregistry.projects.locations.repositories.npmPackages.get({
    *       // Required. The name of the npm package.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/npmPackages/my-npmPackage',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "name": "my_name",
    *   //   "packageName": "my_packageName",
    *   //   "tags": [],
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
  def get(params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListNpmPackagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListNpmPackagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListNpmPackagesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList): GaxiosPromise[SchemaListNpmPackagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList,
    callback: BodyResponseCallback[SchemaListNpmPackagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList,
    options: BodyResponseCallback[Readable | SchemaListNpmPackagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListNpmPackagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList, options: MethodOptions): GaxiosPromise[SchemaListNpmPackagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListNpmPackagesResponse]
  ): Unit = js.native
  /**
    * Lists npm packages.
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
    *     await artifactregistry.projects.locations.repositories.npmPackages.list({
    *       // The maximum number of artifacts to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. The name of the parent resource whose npm packages will be listed.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "npmPackages": []
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
  def list(params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesNpmpackagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
