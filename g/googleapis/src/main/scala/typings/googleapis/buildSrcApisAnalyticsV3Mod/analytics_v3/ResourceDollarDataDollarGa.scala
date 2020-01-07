package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Data$Ga")
@js.native
class ResourceDollarDataDollarGa protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.data.ga.get
    * @desc Returns Analytics data for a view (profile).
    * @alias analytics.data.ga.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.dimensions A comma-separated list of Analytics dimensions. E.g., 'ga:browser,ga:city'.
    * @param {string} params.end-date End date for fetching Analytics data. Request can should specify an end date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is yesterday.
    * @param {string=} params.filters A comma-separated list of dimension or metric filters to be applied to Analytics data.
    * @param {string} params.ids Unique table ID for retrieving Analytics data. Table ID is of the form ga:XXXX, where XXXX is the Analytics view (profile) ID.
    * @param {boolean=} params.include-empty-rows The response will include empty rows if this parameter is set to true, the default is true
    * @param {integer=} params.max-results The maximum number of entries to include in this feed.
    * @param {string} params.metrics A comma-separated list of Analytics metrics. E.g., 'ga:sessions,ga:pageviews'. At least one metric must be specified.
    * @param {string=} params.output The selected format for the response. Default format is JSON.
    * @param {string=} params.samplingLevel The desired sampling level.
    * @param {string=} params.segment An Analytics segment to be applied to data.
    * @param {string=} params.sort A comma-separated list of dimensions or metrics that determine the sort order for Analytics data.
    * @param {string} params.start-date Start date for fetching Analytics data. Requests can specify a start date formatted as YYYY-MM-DD, or as a relative date (e.g., today, yesterday, or 7daysAgo). The default value is 7daysAgo.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GaData] = js.native
  def get(callback: BodyResponseCallback[Schema$GaData]): Unit = js.native
  def get(params: ParamsDollarResourceDollarDataDollarGaDollarGet): GaxiosPromise[Schema$GaData] = js.native
  def get(
    params: ParamsDollarResourceDollarDataDollarGaDollarGet,
    callback: BodyResponseCallback[Schema$GaData]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarDataDollarGaDollarGet,
    options: BodyResponseCallback[Schema$GaData],
    callback: BodyResponseCallback[Schema$GaData]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarDataDollarGaDollarGet, options: MethodOptions): GaxiosPromise[Schema$GaData] = js.native
  def get(
    params: ParamsDollarResourceDollarDataDollarGaDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GaData]
  ): Unit = js.native
}

