package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/clouderrorreporting/v1beta1", "clouderrorreporting_v1beta1.Resource$Projects$Events")
@js.native
class ResourceDollarProjectsDollarEvents protected () extends js.Object {
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
  def list(): GaxiosPromise[Schema$ListEventsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListEventsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarEventsDollarList): GaxiosPromise[Schema$ListEventsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarEventsDollarList,
    callback: BodyResponseCallback[Schema$ListEventsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarEventsDollarList,
    options: BodyResponseCallback[Schema$ListEventsResponse],
    callback: BodyResponseCallback[Schema$ListEventsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarEventsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListEventsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarEventsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListEventsResponse]
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
  def report(): GaxiosPromise[Schema$ReportErrorEventResponse] = js.native
  def report(callback: BodyResponseCallback[Schema$ReportErrorEventResponse]): Unit = js.native
  def report(params: ParamsDollarResourceDollarProjectsDollarEventsDollarReport): GaxiosPromise[Schema$ReportErrorEventResponse] = js.native
  def report(
    params: ParamsDollarResourceDollarProjectsDollarEventsDollarReport,
    callback: BodyResponseCallback[Schema$ReportErrorEventResponse]
  ): Unit = js.native
  def report(
    params: ParamsDollarResourceDollarProjectsDollarEventsDollarReport,
    options: BodyResponseCallback[Schema$ReportErrorEventResponse],
    callback: BodyResponseCallback[Schema$ReportErrorEventResponse]
  ): Unit = js.native
  def report(params: ParamsDollarResourceDollarProjectsDollarEventsDollarReport, options: MethodOptions): GaxiosPromise[Schema$ReportErrorEventResponse] = js.native
  def report(
    params: ParamsDollarResourceDollarProjectsDollarEventsDollarReport,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReportErrorEventResponse]
  ): Unit = js.native
}

