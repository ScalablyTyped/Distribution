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

@JSImport("googleapis/build/src/apis/artifactregistry/v1beta1", "artifactregistry_v1beta1.Resource$Projects$Locations$Repositories$Packages")
@js.native
open class ResourceProjectsLocationsRepositoriesPackages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsRepositoriesPackagesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRepositoriesPackagesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a package and all of its versions and tags. The returned operation will complete once the package has been deleted.
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
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await artifactregistry.projects.locations.repositories.packages.delete({
    *       // Required. The name of the package to delete.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package',
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
  def delete(params: ParamsResourceProjectsLocationsRepositoriesPackagesDelete, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaPackage] = js.native
  def get(callback: BodyResponseCallback[SchemaPackage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaPackage] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesGet): GaxiosPromise[SchemaPackage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesGet,
    callback: BodyResponseCallback[SchemaPackage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesGet,
    options: BodyResponseCallback[Readable | SchemaPackage],
    callback: BodyResponseCallback[Readable | SchemaPackage]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesGet, options: MethodOptions): GaxiosPromise[SchemaPackage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPackage]
  ): Unit = js.native
  /**
    * Gets a package.
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
    *   const res =
    *     await artifactregistry.projects.locations.repositories.packages.get({
    *       // Required. The name of the package to retrieve.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "displayName": "my_displayName",
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListPackagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPackagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListPackagesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesList): GaxiosPromise[SchemaListPackagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesList,
    callback: BodyResponseCallback[SchemaListPackagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesList,
    options: BodyResponseCallback[Readable | SchemaListPackagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListPackagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesList, options: MethodOptions): GaxiosPromise[SchemaListPackagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPackagesResponse]
  ): Unit = js.native
  /**
    * Lists packages.
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
    *   const res =
    *     await artifactregistry.projects.locations.repositories.packages.list({
    *       // The maximum number of packages to return. Maximum page size is 1,000.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. The name of the parent resource whose packages will be listed.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "packages": []
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
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var tags: ResourceProjectsLocationsRepositoriesPackagesTags = js.native
  
  var versions: ResourceProjectsLocationsRepositoriesPackagesVersions = js.native
}
