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

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects$Events")
@js.native
open class ResourceProjectsEvents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  def list(): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEventsResponse]): Unit = js.native
  def list(params: Unit, options: MethodOptions): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(params: ParamsResourceProjectsEventsList): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(params: ParamsResourceProjectsEventsList, callback: BodyResponseCallback[SchemaListEventsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsEventsList,
    options: BodyResponseCallback[Readable | SchemaListEventsResponse],
    callback: BodyResponseCallback[Readable | SchemaListEventsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsEventsList, options: MethodOptions): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(
    params: ParamsResourceProjectsEventsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEventsResponse]
  ): Unit = js.native
  /**
    * Lists the specified events.
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
    *   const res = await clouderrorreporting.projects.events.list({
    *     // Required. The group for which events shall be returned.
    *     groupId: 'placeholder-value',
    *     // Optional. The maximum number of results to return per response.
    *     pageSize: 'placeholder-value',
    *     // Optional. A `next_page_token` provided by a previous response.
    *     pageToken: 'placeholder-value',
    *     // Required. The resource name of the Google Cloud Platform project. Written as `projects/{projectID\}`, where `{projectID\}` is the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`.
    *     projectName: 'projects/my-project',
    *     // Optional. The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    *     'serviceFilter.resourceType': 'placeholder-value',
    *     // Optional. The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    *     'serviceFilter.service': 'placeholder-value',
    *     // Optional. The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    *     'serviceFilter.version': 'placeholder-value',
    *     // Restricts the query to the specified time range.
    *     'timeRange.period': 'placeholder-value',
    *   });
    *   console.log(res.data);
    *
    *   // Example response
    *   // {
    *   //   "errorEvents": [],
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
  def list(params: ParamsResourceProjectsEventsList, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def list(
    params: ParamsResourceProjectsEventsList,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
  
  def report(): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(callback: BodyResponseCallback[SchemaReportErrorEventResponse]): Unit = js.native
  def report(params: Unit, options: MethodOptions): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(params: ParamsResourceProjectsEventsReport): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(
    params: ParamsResourceProjectsEventsReport,
    callback: BodyResponseCallback[SchemaReportErrorEventResponse]
  ): Unit = js.native
  def report(
    params: ParamsResourceProjectsEventsReport,
    options: BodyResponseCallback[Readable | SchemaReportErrorEventResponse],
    callback: BodyResponseCallback[Readable | SchemaReportErrorEventResponse]
  ): Unit = js.native
  def report(params: ParamsResourceProjectsEventsReport, options: MethodOptions): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(
    params: ParamsResourceProjectsEventsReport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportErrorEventResponse]
  ): Unit = js.native
  /**
    * Report an individual error event and record the event to a log. This endpoint accepts **either** an OAuth token, **or** an [API key](https://support.google.com/cloud/answer/6158862) for authentication. To use an API key, append it to the URL as the value of a `key` parameter. For example: `POST https://clouderrorreporting.googleapis.com/v1beta1/{projectName\}/events:report?key=123ABC456` **Note:** [Error Reporting] (https://cloud.google.com/error-reporting) is a global service built on Cloud Logging and doesn't analyze logs stored in regional log buckets or logs routed to other Google Cloud projects. For more information, see [Using Error Reporting with regionalized logs] (https://cloud.google.com/error-reporting/docs/regionalization).
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
    *   const res = await clouderrorreporting.projects.events.report({
    *     // Required. The resource name of the Google Cloud Platform project. Written as `projects/{projectId\}`, where `{projectId\}` is the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: // `projects/my-project-123`.
    *     projectName: 'projects/my-project',
    *
    *     // Request body metadata
    *     requestBody: {
    *       // request body parameters
    *       // {
    *       //   "context": {},
    *       //   "eventTime": "my_eventTime",
    *       //   "message": "my_message",
    *       //   "serviceContext": {}
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
  def report(params: ParamsResourceProjectsEventsReport, options: StreamMethodOptions): GaxiosPromise[Readable] = js.native
  def report(
    params: ParamsResourceProjectsEventsReport,
    options: StreamMethodOptions,
    callback: BodyResponseCallback[Readable]
  ): Unit = js.native
}
