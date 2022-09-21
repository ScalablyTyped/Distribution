package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/bigtableadmin/v2", "bigtableadmin_v2.Resource$Projects$Instances$Clusters$Hottablets")
@js.native
open class ResourceProjectsInstancesClustersHottablets protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListHotTabletsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListHotTabletsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListHotTabletsResponse] = js.native
  def list(params: ParamsResourceProjectsInstancesClustersHottabletsList): GaxiosPromise[SchemaListHotTabletsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesClustersHottabletsList,
    callback: BodyResponseCallback[SchemaListHotTabletsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsInstancesClustersHottabletsList,
    options: BodyResponseCallback[Readable | SchemaListHotTabletsResponse],
    callback: BodyResponseCallback[Readable | SchemaListHotTabletsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsInstancesClustersHottabletsList, options: MethodOptions): GaxiosPromise[SchemaListHotTabletsResponse] = js.native
  def list(
    params: ParamsResourceProjectsInstancesClustersHottabletsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListHotTabletsResponse]
  ): Unit = js.native
  /**
    * Lists hot tablets in a cluster, within the time range provided. Hot tablets are ordered based on CPU usage.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/bigtableadmin.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const bigtableadmin = google.bigtableadmin('v2');
    *
    * async function main() {
    *   const auth = new google.auth.GoogleAuth({
    *     // Scopes can be specified either as an array or as a single, space-delimited string.
    *     scopes: [
    *       'https://www.googleapis.com/auth/bigtable.admin',
    *       'https://www.googleapis.com/auth/bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/bigtable.admin.instance',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin',
    *       'https://www.googleapis.com/auth/cloud-bigtable.admin.cluster',
    *       'https://www.googleapis.com/auth/cloud-platform',
    *     ],
    *   });
    *
    *   // Acquire an auth client, and bind it to all future calls
    *   const authClient = await auth.getClient();
    *   google.options({auth: authClient});
    *
    *   // Do the magic
    *   const res = await bigtableadmin.projects.instances.clusters.hotTablets.list({
    *     // The end time to list hot tablets.
    *     endTime: 'placeholder-value',
    *     // Maximum number of results per page. A page_size that is empty or zero lets the server choose the number of items to return. A page_size which is strictly positive will return at most that many items. A negative page_size will cause an error. Following the first request, subsequent paginated calls do not need a page_size field. If a page_size is set in subsequent calls, it must match the page_size given in the first request.
    *     pageSize: 'placeholder-value',
    *     // The value of `next_page_token` returned by a previous call.
    *     pageToken: 'placeholder-value',
    *     // Required. The cluster name to list hot tablets. Value is in the following form: `projects/{project\}/instances/{instance\}/clusters/{cluster\}`.
    *     parent: 'projects/my-project/instances/my-instance/clusters/my-cluster',
    *     // The start time to list hot tablets. The hot tablets in the response will have start times between the requested start time and end time. Start time defaults to Now if it is unset, and end time defaults to Now - 24 hours if it is unset. The start time should be less than the end time, and the maximum allowed time range between start time and end time is 48 hours. Start time and end time should have values between Now and Now - 14 days.
    *     startTime: 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "hotTablets": [],
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
  def list(params: ParamsResourceProjectsInstancesClustersHottabletsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsInstancesClustersHottabletsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
