package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigquerydatatransfer/v1", "bigquerydatatransfer_v1.Resource$Projects")
@js.native
open class ResourceProjects protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  var dataSources: ResourceProjectsDatasources = js.native
  
  def enrollDataSources(): GaxiosPromise[SchemaEmpty] = js.native
  def enrollDataSources(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def enrollDataSources(params: Unit, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def enrollDataSources(params: ParamsResourceProjectsEnrolldatasources): GaxiosPromise[SchemaEmpty] = js.native
  def enrollDataSources(params: ParamsResourceProjectsEnrolldatasources, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def enrollDataSources(
    params: ParamsResourceProjectsEnrolldatasources,
    options: BodyResponseCallback[Readable | SchemaEmpty],
    callback: BodyResponseCallback[Readable | SchemaEmpty]
  ): Unit = js.native
  def enrollDataSources(params: ParamsResourceProjectsEnrolldatasources, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def enrollDataSources(
    params: ParamsResourceProjectsEnrolldatasources,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * Enroll data sources in a user project. This allows users to create transfer configurations for these data sources. They will also appear in the ListDataSources RPC and as such, will appear in the [BigQuery UI](https://console.cloud.google.com/bigquery), and the documents can be found in the public guide for [BigQuery Web UI](https://cloud.google.com/bigquery/bigquery-web-ui) and [Data Transfer Service](https://cloud.google.com/bigquery/docs/working-with-transfers).
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigquerydatatransfer.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigquerydatatransfer = google.bigquerydatatransfer('v1');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigquery',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigquerydatatransfer.projects.enrollDataSources({
    *     // The name of the project resource in the form: `projects/{project_id\}`
    *     name: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "dataSourceIds": []
    *       // }
    *     },
    *   });
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
  def enrollDataSources(params: ParamsResourceProjectsEnrolldatasources, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def enrollDataSources(
    params: ParamsResourceProjectsEnrolldatasources,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  var locations: ResourceProjectsLocations = js.native
  
  var transferConfigs: ResourceProjectsTransferconfigs = js.native
}
