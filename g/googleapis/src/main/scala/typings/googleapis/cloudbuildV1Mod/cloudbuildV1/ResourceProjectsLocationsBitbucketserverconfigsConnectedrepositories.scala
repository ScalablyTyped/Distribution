package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Locations$Bitbucketserverconfigs$Connectedrepositories")
@js.native
open class ResourceProjectsLocationsBitbucketserverconfigsConnectedrepositories protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  def batchCreate(): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def batchCreate(params: Unit, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(params: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate,
    options: BodyResponseCallback[Readable | SchemaOperation],
    callback: BodyResponseCallback[Readable | SchemaOperation]
  ): Unit = js.native
  def batchCreate(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate,
    options: MethodOptions
  ): GaxiosPromise[SchemaOperation] = js.native
  def batchCreate(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  /**
    * Batch connecting Bitbucket Server repositories to Cloud Build.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/cloudbuild.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const cloudbuild = google.cloudbuild('v1');
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
    *     await cloudbuild.projects.locations.bitbucketServerConfigs.connectedRepositories.batchCreate(
    *       {
    *         // The name of the `BitbucketServerConfig` that added connected repository. Format: `projects/{project\}/locations/{location\}/bitbucketServerConfigs/{config\}`
    *         parent:
    *           'projects/my-project/locations/my-location/bitbucketServerConfigs/my-bitbucketServerConfig',
    *
    *         // Request body metadata
    *         requestBody: {
    *           // request body parameters
    *           // {
    *           //   "requests": []
    *           // }
    *         },
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
  def batchCreate(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def batchCreate(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsConnectedrepositoriesBatchcreate,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var context: APIRequestContext = js.native
}
