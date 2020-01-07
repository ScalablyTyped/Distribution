package typings.googleapis.buildSrcApisAnalyticsV2Dot4Mod.analytics_v2_4

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v2.4", "analytics_v2_4.Resource$Data")
@js.native
class Resource$Data protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.data.get
    * @desc Returns Analytics report data for a view (profile).
    * @alias analytics.data.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dimensions A comma-separated list of Analytics dimensions. E.g., 'ga:browser,ga:city'.
    * @param {string} params.end-date End date for fetching report data. All requests should specify an end date formatted as YYYY-MM-DD.
    * @param {string=} params.filters A comma-separated list of dimension or metric filters to be applied to the report data.
    * @param {string} params.ids Unique table ID for retrieving report data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    * @param {integer=} params.max-results The maximum number of entries to include in this feed.
    * @param {string} params.metrics A comma-separated list of Analytics metrics. E.g., 'ga:sessions,ga:pageviews'. At least one metric must be specified to retrieve a valid Analytics report.
    * @param {string=} params.segment An Analytics advanced segment to be applied to the report data.
    * @param {string=} params.sort A comma-separated list of dimensions or metrics that determine the sort order for the report data.
    * @param {string} params.start-date Start date for fetching report data. All requests should specify a start date formatted as YYYY-MM-DD.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Unit] = js.native
  def get(callback: BodyResponseCallback[Unit]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDataDollarGet): GaxiosPromise[Unit] = js.native
  def get(params: ParamsDollarResourceDollarDataDollarGet, callback: BodyResponseCallback[Unit]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDataDollarGet,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDataDollarGet, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def get(
    params: ParamsDollarResourceDollarDataDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

