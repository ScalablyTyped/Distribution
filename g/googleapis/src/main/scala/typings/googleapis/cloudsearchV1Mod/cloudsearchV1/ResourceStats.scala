package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/cloudsearch/v1", "cloudsearch_v1.Resource$Stats")
@js.native
class ResourceStats protected () extends StObject {
  def this(context: APIRequestContext) = this()
  
  var context: APIRequestContext = js.native
  
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
  def getIndex(): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(callback: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse]): Unit = js.native
  def getIndex(params: Unit, options: MethodOptions): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(params: ParamsResourceStatsGetindex): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(
    params: ParamsResourceStatsGetindex,
    callback: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse]
  ): Unit = js.native
  def getIndex(
    params: ParamsResourceStatsGetindex,
    options: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse],
    callback: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse]
  ): Unit = js.native
  def getIndex(params: ParamsResourceStatsGetindex, options: MethodOptions): GaxiosPromise[SchemaGetCustomerIndexStatsResponse] = js.native
  def getIndex(
    params: ParamsResourceStatsGetindex,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaGetCustomerIndexStatsResponse]
  ): Unit = js.native
  
  var index: ResourceStatsIndex = js.native
}
