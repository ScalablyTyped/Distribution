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

@JSImport("googleapis/build/src/apis/artifactregistry/v1beta1", "artifactregistry_v1beta1.Resource$Projects$Locations$Repositories$Packages$Versions")
@js.native
open class ResourceProjectsLocationsRepositoriesPackagesVersions protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Deletes a version and all of its content. The returned operation will complete once the version has been deleted.
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
    *     await artifactregistry.projects.locations.repositories.packages.versions.delete(
    *       {
    *         // By default, a version that is tagged may not be deleted. If force=true, the version and any tags pointing to the version are deleted.
    *         force: 'placeholder-value',
    *         // The name of the version to delete.
    *         name: 'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package/versions/my-version',
    *       }
    *     );
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
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaVersion] = js.native
  def get(callback: BodyResponseCallback[SchemaVersion]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsGet): GaxiosPromise[SchemaVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsGet,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsGet,
    options: BodyResponseCallback[Readable | SchemaVersion],
    callback: BodyResponseCallback[Readable | SchemaVersion]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsGet, options: MethodOptions): GaxiosPromise[SchemaVersion] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaVersion]
  ): Unit = js.native
  /**
    * Gets a version
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
    *     await artifactregistry.projects.locations.repositories.packages.versions.get(
    *       {
    *         // The name of the version to retrieve.
    *         name: 'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package/versions/my-version',
    *         // The view that should be returned in the response.
    *         view: 'placeholder-value',
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "createTime": "my_createTime",
    *   //   "description": "my_description",
    *   //   "name": "my_name",
    *   //   "relatedTags": [],
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
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsGet,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListVersionsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsList): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsList,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsList,
    options: BodyResponseCallback[Readable | SchemaListVersionsResponse],
    callback: BodyResponseCallback[Readable | SchemaListVersionsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsList, options: MethodOptions): GaxiosPromise[SchemaListVersionsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListVersionsResponse]
  ): Unit = js.native
  /**
    * Lists versions.
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
    *     await artifactregistry.projects.locations.repositories.packages.versions.list(
    *       {
    *         // Optional. The field to order the results by.
    *         orderBy: 'placeholder-value',
    *         // The maximum number of versions to return. Maximum page size is 1,000.
    *         pageSize: 'placeholder-value',
    *         // The next_page_token value returned from a previous list request, if any.
    *         pageToken: 'placeholder-value',
    *         // The name of the parent resource whose versions will be listed.
    *         parent:
    *           'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package',
    *         // The view that should be returned in the response.
    *         view: 'placeholder-value',
    *       }
    *     );
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
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesVersionsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
