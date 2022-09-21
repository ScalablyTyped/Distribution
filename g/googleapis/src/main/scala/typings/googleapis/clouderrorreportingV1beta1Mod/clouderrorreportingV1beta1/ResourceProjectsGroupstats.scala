package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import typings.googleapisCommon.apiMod.StreamMethodOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects$Groupstats")
@js.native
open class ResourceProjectsGroupstats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListGroupStatsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListGroupStatsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListGroupStatsResponse] = js.native
  def list(params: ParamsResourceProjectsGroupstatsList): GaxiosPromise[SchemaListGroupStatsResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupstatsList,
    callback: BodyResponseCallback[SchemaListGroupStatsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsGroupstatsList,
    options: BodyResponseCallback[Readable | SchemaListGroupStatsResponse],
    callback: BodyResponseCallback[Readable | SchemaListGroupStatsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsGroupstatsList, options: MethodOptions): GaxiosPromise[SchemaListGroupStatsResponse] = js.native
  def list(
    params: ParamsResourceProjectsGroupstatsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListGroupStatsResponse]
  ): Unit = js.native
  /**
    * Lists the specified groups.
    * @example
    * ```js
    * // Before running the sample:
    * // - Enable the API at:
    * //   https://console.developers.google.com/apis/api/clouderrorreporting.googleapis.com
    * // - Login into gcloud by running:
    * //   `$ gcloud auth application-default login`
    * // - Install the npm module by running:
    * //   `$ npm install googleapis`
    *
    * const {google} = require('googleapis');
    * const clouderrorreporting = google.clouderrorreporting('v1beta1');
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
    *   const res = await clouderrorreporting.projects.groupStats.list({
    *     // Optional. The alignment of the timed counts to be returned. Default is `ALIGNMENT_EQUAL_AT_END`.
    *     alignment: 'placeholder-value',
    *     // Optional. Time where the timed counts shall be aligned if rounded alignment is chosen. Default is 00:00 UTC.
    *     alignmentTime: 'placeholder-value',
    *     // Optional. List all ErrorGroupStats with these IDs.
    *     groupId: 'placeholder-value',
    *     // Optional. The sort order in which the results are returned. Default is `COUNT_DESC`.
    *     order: 'placeholder-value',
    *     // Optional. The maximum number of results to return per response. Default is 20.
    *     pageSize: 'placeholder-value',
    *     // Optional. A next_page_token provided by a previous response. To view additional results, pass this token along with the identical query parameters as the first request.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the Google Cloud Platform project. Written as `projects/{projectID\}` or `projects/{projectNumber\}`, where `{projectID\}` and `{projectNumber\}` can be found in the [Google Cloud console](https://support.google.com/cloud/answer/6158840). Examples: `projects/my-project-123`, `projects/5551234`.
    *     projectName: 'projects/my-project',
    *     // Optional. The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    *     'serviceFilter.resourceType': 'placeholder-value',
    *     // Optional. The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    *     'serviceFilter.service': 'placeholder-value',
    *     // Optional. The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    *     'serviceFilter.version': 'placeholder-value',
    *     // Optional. The preferred duration for a single returned TimedCount. If not set, no timed counts are returned.
    *     timedCountDuration: 'placeholder-value',
    *     // Restricts the query to the specified time range.
    *     'timeRange.period': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errorGroupStats": [],
    *   //   "nextPageToken": "my_nextPageToken",
    *   //   "timeRangeBegin": "my_timeRangeBegin"
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
  def list(params: ParamsResourceProjectsGroupstatsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsGroupstatsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
