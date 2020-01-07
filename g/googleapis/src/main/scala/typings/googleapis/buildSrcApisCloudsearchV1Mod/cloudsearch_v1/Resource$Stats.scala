package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Stats")
@js.native
class Resource$Stats protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var index: ResourceDollarStatsDollarIndex = js.native
  /**
    * cloudsearch.stats.getIndex
    * @desc Gets indexed item statistics aggreggated across all data sources.
    * This API only returns statistics for previous dates; it doesn't return
    * statistics for the current day.
    * @alias cloudsearch.stats.getIndex
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.fromDate.day Day of month. Must be from 1 to 31 and valid for the year and month.
    * @param {integer=} params.fromDate.month Month of date. Must be from 1 to 12.
    * @param {integer=} params.fromDate.year Year of date. Must be from 1 to 9999.
    * @param {integer=} params.toDate.day Day of month. Must be from 1 to 31 and valid for the year and month.
    * @param {integer=} params.toDate.month Month of date. Must be from 1 to 12.
    * @param {integer=} params.toDate.year Year of date. Must be from 1 to 9999.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIndex(): GaxiosPromise[Schema$GetCustomerIndexStatsResponse] = js.native
  def getIndex(callback: BodyResponseCallback[Schema$GetCustomerIndexStatsResponse]): Unit = js.native
  def getIndex(params: ParamsDollarResourceDollarStatsDollarGetindex): GaxiosPromise[Schema$GetCustomerIndexStatsResponse] = js.native
  def getIndex(
    params: ParamsDollarResourceDollarStatsDollarGetindex,
    callback: BodyResponseCallback[Schema$GetCustomerIndexStatsResponse]
  ): Unit = js.native
  def getIndex(
    params: ParamsDollarResourceDollarStatsDollarGetindex,
    options: BodyResponseCallback[Schema$GetCustomerIndexStatsResponse],
    callback: BodyResponseCallback[Schema$GetCustomerIndexStatsResponse]
  ): Unit = js.native
  def getIndex(params: ParamsDollarResourceDollarStatsDollarGetindex, options: MethodOptions): GaxiosPromise[Schema$GetCustomerIndexStatsResponse] = js.native
  def getIndex(
    params: ParamsDollarResourceDollarStatsDollarGetindex,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetCustomerIndexStatsResponse]
  ): Unit = js.native
}

