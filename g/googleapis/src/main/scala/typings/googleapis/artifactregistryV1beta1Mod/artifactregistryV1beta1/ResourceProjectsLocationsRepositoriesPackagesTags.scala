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

@JSImport("googleapis/build/src/apis/artifactregistry/v1beta1", "artifactregistry_v1beta1.Resource$Projects$Locations$Repositories$Packages$Tags")
@js.native
open class ResourceProjectsLocationsRepositoriesPackagesTags protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def create(): GaxiosPromise[SchemaTag] = js.native
  def create(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def create(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  /**
    * Creates a tag.
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
    *     await artifactregistry.projects.locations.repositories.packages.tags.create(
    *       {
    *         // The name of the parent resource where the tag will be created.
    *         parent:
    *           'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package',
    *         // The tag id to use for this repository.
    *         tagId: 'placeholder-value',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "name": "my_name",
    *           //   "version": "my_version"
    *           // }
    *         },
    *       }
    *     );
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
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
  def create(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def create(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsCreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsDelete,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsDelete,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Deletes a tag.
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
    *     await artifactregistry.projects.locations.repositories.packages.tags.delete(
    *       {
    *         // The name of the tag to delete.
    *         name: 'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package/tags/my-tag',
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
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsDelete,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsDelete,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def get(): GaxiosPromise[SchemaTag] = js.native
  def get(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  /**
    * Gets a tag.
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
    *     await artifactregistry.projects.locations.repositories.packages.tags.get({
    *       // The name of the tag to retrieve.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package/tags/my-tag',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
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
  def get(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListTagsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsList): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsList,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsList,
    options: BodyResponseCallback[Readable | SchemaListTagsResponse],
    callback: BodyResponseCallback[Readable | SchemaListTagsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsList, options: MethodOptions): GaxiosPromise[SchemaListTagsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListTagsResponse]
  ): Unit = js.native
  /**
    * Lists tags.
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
    *     await artifactregistry.projects.locations.repositories.packages.tags.list({
    *       // An expression for filtering the results of the request. Filter rules are case insensitive. The fields eligible for filtering are: * `version` An example of using a filter: * `version="projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/1.0"` --\> Tags that are applied to the version `1.0` in package `pkg1`.
    *       filter: 'placeholder-value',
    *       // The maximum number of tags to return. Maximum page size is 10,000.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // The name of the parent resource whose tags will be listed.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "tags": []
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
  def list(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def patch(): GaxiosPromise[SchemaTag] = js.native
  def patch(callback: BodyResponseCallback[SchemaTag]): Unit = js.native
  def patch(params: Unit, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def patch(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsPatch): GaxiosPromise[SchemaTag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsPatch,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsPatch,
    options: BodyResponseCallback[Readable | SchemaTag],
    callback: BodyResponseCallback[Readable | SchemaTag]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsPatch, options: MethodOptions): GaxiosPromise[SchemaTag] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaTag]
  ): Unit = js.native
  /**
    * Updates a tag.
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
    *     await artifactregistry.projects.locations.repositories.packages.tags.patch({
    *       // The name of the tag, for example: "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/tags/tag1". If the package part contains slashes, the slashes are escaped. The tag part can only have characters in [a-zA-Z0-9\-._~:@], anything else must be URL encoded.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/packages/my-package/tags/my-tag',
    *       // The update mask applies to the resource. For the `FieldMask` definition, see https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
    *       updateMask: 'placeholder-value',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "name": "my_name",
    *         //   "version": "my_version"
    *         // }
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "name": "my_name",
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
  def patch(params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsPatch, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsRepositoriesPackagesTagsPatch,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
