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

@JSImport("googleapis/build/src/apis/cloudbuild/v1", "cloudbuild_v1.Resource$Projects$Locations$Bitbucketserverconfigs$Repos")
@js.native
open class ResourceProjectsLocationsBitbucketserverconfigsRepos protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListBitbucketServerRepositoriesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListBitbucketServerRepositoriesResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListBitbucketServerRepositoriesResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsBitbucketserverconfigsReposList): GaxiosPromise[SchemaListBitbucketServerRepositoriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsReposList,
    callback: BodyResponseCallback[SchemaListBitbucketServerRepositoriesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsReposList,
    options: BodyResponseCallback[Readable | SchemaListBitbucketServerRepositoriesResponse],
    callback: BodyResponseCallback[Readable | SchemaListBitbucketServerRepositoriesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsBitbucketserverconfigsReposList, options: MethodOptions): GaxiosPromise[SchemaListBitbucketServerRepositoriesResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsReposList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListBitbucketServerRepositoriesResponse]
  ): Unit = js.native
  /**
    * List all repositories for a given `BitbucketServerConfig`. This API is experimental.
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
    *     await cloudbuild.projects.locations.bitbucketServerConfigs.repos.list({
    *       // The maximum number of configs to return. The service may return fewer than this value. The maximum value is 1000; values above 1000 will be coerced to 1000.
    *       pageSize: 'placeholder-value',
    *       // A page token, received from a previous `ListBitbucketServerRepositoriesRequest` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListBitbucketServerConfigsRequest` must match the call that provided the page token.
    *       pageToken: 'placeholder-value',
    *       // Required. Name of the parent resource.
    *       parent:
    *         'projects/my-project/locations/my-location/bitbucketServerConfigs/my-bitbucketServerConfig',
    *     });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "bitbucketServerRepositories": [],
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
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsReposList,
    options: StreamMethodOptions
  ): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsLocationsBitbucketserverconfigsReposList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
