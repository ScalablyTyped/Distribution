package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Stats$Index$Datasources")
@js.native
class ResourceDollarStatsDollarIndexDollarDatasources protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudsearch.stats.index.datasources.get
    * @desc Gets indexed item statistics for a single data source.
    * @alias cloudsearch.stats.index.datasources.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.fromDate.day Day of month. Must be from 1 to 31 and valid for the year and month.
    * @param {integer=} params.fromDate.month Month of date. Must be from 1 to 12.
    * @param {integer=} params.fromDate.year Year of date. Must be from 1 to 9999.
    * @param {string} params.name The resource id of the data source to retrieve statistics for, in the following format: "datasources/{source_id}"
    * @param {integer=} params.toDate.day Day of month. Must be from 1 to 31 and valid for the year and month.
    * @param {integer=} params.toDate.month Month of date. Must be from 1 to 12.
    * @param {integer=} params.toDate.year Year of date. Must be from 1 to 9999.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GetDataSourceIndexStatsResponse] = js.native
  def get(callback: BodyResponseCallback[Schema$GetDataSourceIndexStatsResponse]): Unit = js.native
  def get(params: ParamsDollarResourceDollarStatsDollarIndexDollarDatasourcesDollarGet): GaxiosPromise[Schema$GetDataSourceIndexStatsResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarStatsDollarIndexDollarDatasourcesDollarGet,
    callback: BodyResponseCallback[Schema$GetDataSourceIndexStatsResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarStatsDollarIndexDollarDatasourcesDollarGet,
    options: BodyResponseCallback[Schema$GetDataSourceIndexStatsResponse],
    callback: BodyResponseCallback[Schema$GetDataSourceIndexStatsResponse]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarStatsDollarIndexDollarDatasourcesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$GetDataSourceIndexStatsResponse] = js.native
  def get(
    params: ParamsDollarResourceDollarStatsDollarIndexDollarDatasourcesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetDataSourceIndexStatsResponse]
  ): Unit = js.native
}

