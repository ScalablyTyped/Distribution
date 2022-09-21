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

@JSImport("googleapis/build/src/apis/artifactregistry/v1", "artifactregistry_v1.Resource$Projects$Locations$Repositories$Dockerimages")
@js.native
open class ResourceProjectsLocationsRepositoriesDockerimages protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def get(): GaxiosPromise[SchemaDockerImage] = js.native
  def get(callback: BodyResponseCallback[SchemaDockerImage]): Unit = js.native
  def get(params: Unit, options: MethodOptions): GaxiosPromise[SchemaDockerImage] = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesDockerimagesGet): GaxiosPromise[SchemaDockerImage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesGet,
    callback: BodyResponseCallback[SchemaDockerImage]
  ): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesGet,
    options: BodyResponseCallback[Readable | SchemaDockerImage],
    callback: BodyResponseCallback[Readable | SchemaDockerImage]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsRepositoriesDockerimagesGet, options: MethodOptions): GaxiosPromise[SchemaDockerImage] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaDockerImage]
  ): Unit = js.native
  /**
    * Gets a docker image.
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
    *     await artifactregistry.projects.locations.repositories.dockerImages.get({
    *       // Required. The name of the docker images.
    *       name: 'projects/my-project/locations/my-location/repositories/my-repositorie/dockerImages/my-dockerImage',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "buildTime": "my_buildTime",
    *   //   "imageSizeBytes": "my_imageSizeBytes",
    *   //   "mediaType": "my_mediaType",
    *   //   "name": "my_name",
    *   //   "tags": [],
    *   //   "updateTime": "my_updateTime",
    *   //   "uploadTime": "my_uploadTime",
    *   //   "uri": "my_uri"
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
  def get(params: ParamsResourceProjectsLocationsRepositoriesDockerimagesGet, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def get(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesGet,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def list(): GaxiosPromise[SchemaListDockerImagesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListDockerImagesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListDockerImagesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesDockerimagesList): GaxiosPromise[SchemaListDockerImagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesList,
    callback: BodyResponseCallback[SchemaListDockerImagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesList,
    options: BodyResponseCallback[Readable | SchemaListDockerImagesResponse],
    callback: BodyResponseCallback[Readable | SchemaListDockerImagesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsRepositoriesDockerimagesList, options: MethodOptions): GaxiosPromise[SchemaListDockerImagesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListDockerImagesResponse]
  ): Unit = js.native
  /**
    * Lists docker images.
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
    *     await artifactregistry.projects.locations.repositories.dockerImages.list({
    *       // The field to order the results by.
    *       orderBy: 'placeholder-value',
    *       // The maximum number of artifacts to return.
    *       pageSize: 'placeholder-value',
    *       // The next_page_token value returned from a previous list request, if any.
    *       pageToken: 'placeholder-value',
    *       // Required. The name of the parent resource whose docker images will be listed.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "dockerImages": [],
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
  def list(params: ParamsResourceProjectsLocationsRepositoriesDockerimagesList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsRepositoriesDockerimagesList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
