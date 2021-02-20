package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Stats$Index$Datasources")
@js.native
class ResourceStatsIndexDatasources protected () extends StObject {
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
  def get(): GaxiosPromise[SchemaGetDataSourceIndexStatsResponse] = js.native
  def get(callback: BodyResponseCallback[SchemaGetDataSourceIndexStatsResponse]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaGetDataSourceIndexStatsResponse] = js.native
  def get(params: ParamsResourceStatsIndexDatasourcesGet): GaxiosPromise[SchemaGetDataSourceIndexStatsResponse] = js.native
  def get(
    params: ParamsResourceStatsIndexDatasourcesGet,
    callback: BodyResponseCallback[SchemaGetDataSourceIndexStatsResponse]
  ): Unit = js.native
  def get(
    params: ParamsResourceStatsIndexDatasourcesGet,
    options: BodyResponseCallback[SchemaGetDataSourceIndexStatsResponse],
    callback: BodyResponseCallback[SchemaGetDataSourceIndexStatsResponse]
  ): Unit = js.native
  def get(params: ParamsResourceStatsIndexDatasourcesGet, options: MethodOptions): GaxiosPromise[SchemaGetDataSourceIndexStatsResponse] = js.native
  def get(
    params: ParamsResourceStatsIndexDatasourcesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetDataSourceIndexStatsResponse]
  ): Unit = js.native
}
