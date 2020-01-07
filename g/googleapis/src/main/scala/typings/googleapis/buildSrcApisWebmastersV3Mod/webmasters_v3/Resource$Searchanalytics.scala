package typings.googleapis.buildSrcApisWebmastersV3Mod.webmasters_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/webmasters/v3", "webmasters_v3.Resource$Searchanalytics")
@js.native
class Resource$Searchanalytics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * webmasters.searchanalytics.query
    * @desc Query your data with filters and parameters that you define.
    * Returns zero or more rows grouped by the row keys that you define. You
    * must define a date range of one or more days.  When date is one of the
    * group by values, any days without data are omitted from the result list.
    * If you need to know which days have data, issue a broad date range query
    * grouped by date for any metric, and see which day rows are returned.
    * @alias webmasters.searchanalytics.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.siteUrl The site's URL, including protocol. For example: http://www.example.com/
    * @param {().SearchAnalyticsQueryRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[Schema$SearchAnalyticsQueryResponse] = js.native
  def query(callback: BodyResponseCallback[Schema$SearchAnalyticsQueryResponse]): Unit = js.native
  def query(params: ParamsDollarResourceDollarSearchanalyticsDollarQuery): GaxiosPromise[Schema$SearchAnalyticsQueryResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarSearchanalyticsDollarQuery,
    callback: BodyResponseCallback[Schema$SearchAnalyticsQueryResponse]
  ): Unit = js.native
  def query(
    params: ParamsDollarResourceDollarSearchanalyticsDollarQuery,
    options: BodyResponseCallback[Schema$SearchAnalyticsQueryResponse],
    callback: BodyResponseCallback[Schema$SearchAnalyticsQueryResponse]
  ): Unit = js.native
  def query(params: ParamsDollarResourceDollarSearchanalyticsDollarQuery, options: MethodOptions): GaxiosPromise[Schema$SearchAnalyticsQueryResponse] = js.native
  def query(
    params: ParamsDollarResourceDollarSearchanalyticsDollarQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchAnalyticsQueryResponse]
  ): Unit = js.native
}

