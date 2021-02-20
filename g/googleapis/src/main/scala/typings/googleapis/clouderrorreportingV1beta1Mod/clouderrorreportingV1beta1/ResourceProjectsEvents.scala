package typings.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects$Events")
@js.native
class ResourceProjectsEvents protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
  /**
    * clouderrorreporting.projects.events.list
    * @desc Lists the specified events.
    * @alias clouderrorreporting.projects.events.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.groupId [Required] The group for which events shall be returned.
    * @param {integer=} params.pageSize [Optional] The maximum number of results to return per response.
    * @param {string=} params.pageToken [Optional] A `next_page_token` provided by a previous response.
    * @param {string} params.projectName [Required] The resource name of the Google Cloud Platform project. Written as `projects/` plus the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`.
    * @param {string=} params.serviceFilter.resourceType [Optional] The exact value to match against [`ServiceContext.resource_type`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.resource_type).
    * @param {string=} params.serviceFilter.service [Optional] The exact value to match against [`ServiceContext.service`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.service).
    * @param {string=} params.serviceFilter.version [Optional] The exact value to match against [`ServiceContext.version`](/error-reporting/reference/rest/v1beta1/ServiceContext#FIELDS.version).
    * @param {string=} params.timeRange.period Restricts the query to the specified time range.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListEventsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(params: ParamsResourceProjectsEventsList): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(params: ParamsResourceProjectsEventsList, callback: BodyResponseCallback[SchemaListEventsResponse]): Unit = js.native
  def list(
    params: ParamsResourceProjectsEventsList,
    options: BodyResponseCallback[SchemaListEventsResponse],
    callback: BodyResponseCallback[SchemaListEventsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsEventsList, options: MethodOptions): GaxiosPromise[SchemaListEventsResponse] = js.native
  def list(
    params: ParamsResourceProjectsEventsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListEventsResponse]
  ): Unit = js.native
  
  /**
    * clouderrorreporting.projects.events.report
    * @desc Report an individual error event.  This endpoint accepts **either**
    * an OAuth token, **or** an [API
    * key](https://support.google.com/cloud/answer/6158862) for authentication.
    * To use an API key, append it to the URL as the value of a `key`
    * parameter. For example:  `POST
    * https://clouderrorreporting.googleapis.com/v1beta1/projects/example-project/events:report?key=123ABC456`
    * @alias clouderrorreporting.projects.events.report
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.projectName [Required] The resource name of the Google Cloud Platform project. Written as `projects/` plus the [Google Cloud Platform project ID](https://support.google.com/cloud/answer/6158840). Example: `projects/my-project-123`.
    * @param {().ReportedErrorEvent} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def report(): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(callback: BodyResponseCallback[SchemaReportErrorEventResponse]): Unit = js.native
  def report(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(params: ParamsResourceProjectsEventsReport): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(
    params: ParamsResourceProjectsEventsReport,
    callback: BodyResponseCallback[SchemaReportErrorEventResponse]
  ): Unit = js.native
  def report(
    params: ParamsResourceProjectsEventsReport,
    options: BodyResponseCallback[SchemaReportErrorEventResponse],
    callback: BodyResponseCallback[SchemaReportErrorEventResponse]
  ): Unit = js.native
  def report(params: ParamsResourceProjectsEventsReport, options: MethodOptions): GaxiosPromise[SchemaReportErrorEventResponse] = js.native
  def report(
    params: ParamsResourceProjectsEventsReport,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaReportErrorEventResponse]
  ): Unit = js.native
}
