package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/logging/v2", "logging_v2.Resource$Projects$Metrics")
@js.native
class ResourceDollarProjectsDollarMetrics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * logging.projects.metrics.create
    * @desc Creates a logs-based metric.
    * @alias logging.projects.metrics.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The resource name of the project in which to create the metric: "projects/[PROJECT_ID]" The new metric must be provided in the request.
    * @param {().LogMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$LogMetric] = js.native
  def create(callback: BodyResponseCallback[Schema$LogMetric]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarCreate): GaxiosPromise[Schema$LogMetric] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarCreate,
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarCreate,
    options: BodyResponseCallback[Schema$LogMetric],
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$LogMetric] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  /**
    * logging.projects.metrics.delete
    * @desc Deletes a logs-based metric.
    * @alias logging.projects.metrics.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.metricName The resource name of the metric to delete: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * logging.projects.metrics.get
    * @desc Gets a logs-based metric.
    * @alias logging.projects.metrics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.metricName The resource name of the desired metric: "projects/[PROJECT_ID]/metrics/[METRIC_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$LogMetric] = js.native
  def get(callback: BodyResponseCallback[Schema$LogMetric]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarGet): GaxiosPromise[Schema$LogMetric] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarGet,
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarGet,
    options: BodyResponseCallback[Schema$LogMetric],
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarGet, options: MethodOptions): GaxiosPromise[Schema$LogMetric] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  /**
    * logging.projects.metrics.list
    * @desc Lists logs-based metrics.
    * @alias logging.projects.metrics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return from this request. Non-positive values are ignored. The presence of nextPageToken in the response indicates that more results might be available.
    * @param {string=} params.pageToken Optional. If present, then retrieve the next batch of results from the preceding call to this method. pageToken must be the value of nextPageToken from the previous response. The values of other method parameters should be identical to those in the previous call.
    * @param {string} params.parent Required. The name of the project containing the metrics: "projects/[PROJECT_ID]"
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListLogMetricsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListLogMetricsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarList): GaxiosPromise[Schema$ListLogMetricsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarList,
    callback: BodyResponseCallback[Schema$ListLogMetricsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarList,
    options: BodyResponseCallback[Schema$ListLogMetricsResponse],
    callback: BodyResponseCallback[Schema$ListLogMetricsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListLogMetricsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListLogMetricsResponse]
  ): Unit = js.native
  /**
    * logging.projects.metrics.update
    * @desc Creates or updates a logs-based metric.
    * @alias logging.projects.metrics.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.metricName The resource name of the metric to update: "projects/[PROJECT_ID]/metrics/[METRIC_ID]" The updated metric must be provided in the request and it's name field must be the same as [METRIC_ID] If the metric does not exist in [PROJECT_ID], then a new metric is created.
    * @param {().LogMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$LogMetric] = js.native
  def update(callback: BodyResponseCallback[Schema$LogMetric]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarUpdate): GaxiosPromise[Schema$LogMetric] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarUpdate,
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarUpdate,
    options: BodyResponseCallback[Schema$LogMetric],
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarMetricsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$LogMetric] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarMetricsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$LogMetric]
  ): Unit = js.native
}

