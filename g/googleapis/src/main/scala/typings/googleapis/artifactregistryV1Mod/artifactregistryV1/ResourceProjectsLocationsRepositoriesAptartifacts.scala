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

@JSImport("googleapis/build/src/apis/artifactregistry/v1", "artifactregistry_v1.Resource$Projects$Locations$Repositories$Aptartifacts")
@js.native
open class ResourceProjectsLocationsRepositoriesAptartifacts protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def `import`(): GaxiosPromise[SchemaOperation] = js.native
  def `import`(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def `import`(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(params: ParamsResourceProjectsLocationsRepositoriesAptartifactsImport): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsImport,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsImport,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def `import`(params: ParamsResourceProjectsLocationsRepositoriesAptartifactsImport, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsImport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Imports Apt artifacts. The returned Operation will complete once the resources are imported. Package, Version, and File resources are created based on the imported artifacts. Imported artifacts that conflict with existing resources are ignored.
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
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await artifactregistry.projects.locations.repositories.aptArtifacts.import({
    *       // The name of the parent resource where the artifacts will be imported.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {
    *         //   "gcsSource": {}
    *         // }
    *       },
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
  def `import`(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsImport,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def `import`(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsImport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def upload(): GaxiosPromise[SchemaUploadAptArtifactMediaResponse] = js.native
  def upload(callback: BodyResponseCallback[SchemaUploadAptArtifactMediaResponse]): Unit = js.native
  def upload(params: Unit, options: MethodOptions): GaxiosPromise[SchemaUploadAptArtifactMediaResponse] = js.native
  def upload(params: ParamsResourceProjectsLocationsRepositoriesAptartifactsUpload): GaxiosPromise[SchemaUploadAptArtifactMediaResponse] = js.native
  def upload(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsUpload,
    callback: BodyResponseCallback[SchemaUploadAptArtifactMediaResponse]
  ): Unit = js.native
  def upload(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsUpload,
    options: BodyResponseCallback[Readable | SchemaUploadAptArtifactMediaResponse],
    callback: BodyResponseCallback[Readable | SchemaUploadAptArtifactMediaResponse]
  ): Unit = js.native
  def upload(params: ParamsResourceProjectsLocationsRepositoriesAptartifactsUpload, options: MethodOptions): GaxiosPromise[SchemaUploadAptArtifactMediaResponse] = js.native
  def upload(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsUpload,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUploadAptArtifactMediaResponse]
  ): Unit = js.native
  /**
    * Directly uploads an Apt artifact. The returned Operation will complete once the resources are uploaded. Package, Version, and File resources are created based on the imported artifact. Imported artifacts that conflict with existing resources are ignored.
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
    *     scopes: ['https://www.googleapis.com/auth/cloud-platform'],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res =
    *     await artifactregistry.projects.locations.repositories.aptArtifacts.upload({
    *       // The name of the parent resource where the artifacts will be uploaded.
    *       parent:
    *         'projects/my-project/locations/my-location/repositories/my-repositorie',
    *
    *       // Request body metadata
    *       requestBody: {
    *         // request body parameters
    *         // {}
    *       },
    *       media: {
    *         mimeType: 'placeholder-value',
    *         body: 'placeholder-value',
    *       },
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "operation": {}
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
  def upload(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsUpload,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def upload(
    params: ParamsResourceProjectsLocationsRepositoriesAptartifactsUpload,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
