package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Custommetrics")
@js.native
class ResourceDollarManagementDollarCustommetrics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.customMetrics.get
    * @desc Get a custom metric to which the user has access.
    * @alias analytics.management.customMetrics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to retrieve.
    * @param {string} params.customMetricId The ID of the custom metric to retrieve.
    * @param {string} params.webPropertyId Web property ID for the custom metric to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$CustomMetric] = js.native
  def get(callback: BodyResponseCallback[Schema$CustomMetric]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarGet): GaxiosPromise[Schema$CustomMetric] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarGet,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarGet,
    options: BodyResponseCallback[Schema$CustomMetric],
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarGet, options: MethodOptions): GaxiosPromise[Schema$CustomMetric] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.insert
    * @desc Create a new custom metric.
    * @alias analytics.management.customMetrics.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to create.
    * @param {string} params.webPropertyId Web property ID for the custom dimension to create.
    * @param {().CustomMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$CustomMetric] = js.native
  def insert(callback: BodyResponseCallback[Schema$CustomMetric]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarInsert): GaxiosPromise[Schema$CustomMetric] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarInsert,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarInsert,
    options: BodyResponseCallback[Schema$CustomMetric],
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomMetric] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.list
    * @desc Lists custom metrics to which the user has access.
    * @alias analytics.management.customMetrics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metrics to retrieve.
    * @param {integer=} params.max-results The maximum number of custom metrics to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID for the custom metrics to retrieve.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$CustomMetrics] = js.native
  def list(callback: BodyResponseCallback[Schema$CustomMetrics]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarList): GaxiosPromise[Schema$CustomMetrics] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarList,
    callback: BodyResponseCallback[Schema$CustomMetrics]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarList,
    options: BodyResponseCallback[Schema$CustomMetrics],
    callback: BodyResponseCallback[Schema$CustomMetrics]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarList, options: MethodOptions): GaxiosPromise[Schema$CustomMetrics] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomMetrics]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.patch
    * @desc Updates an existing custom metric. This method supports patch
    * semantics.
    * @alias analytics.management.customMetrics.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to update.
    * @param {string} params.customMetricId Custom metric ID for the custom metric to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom metric to update.
    * @param {().CustomMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$CustomMetric] = js.native
  def patch(callback: BodyResponseCallback[Schema$CustomMetric]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarPatch): GaxiosPromise[Schema$CustomMetric] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarPatch,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarPatch,
    options: BodyResponseCallback[Schema$CustomMetric],
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$CustomMetric] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  /**
    * analytics.management.customMetrics.update
    * @desc Updates an existing custom metric.
    * @alias analytics.management.customMetrics.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the custom metric to update.
    * @param {string} params.customMetricId Custom metric ID for the custom metric to update.
    * @param {boolean=} params.ignoreCustomDataSourceLinks Force the update and ignore any warnings related to the custom metric being linked to a custom data source / data set.
    * @param {string} params.webPropertyId Web property ID for the custom metric to update.
    * @param {().CustomMetric} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$CustomMetric] = js.native
  def update(callback: BodyResponseCallback[Schema$CustomMetric]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarUpdate): GaxiosPromise[Schema$CustomMetric] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarUpdate,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarUpdate,
    options: BodyResponseCallback[Schema$CustomMetric],
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$CustomMetric] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarCustommetricsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CustomMetric]
  ): Unit = js.native
}

