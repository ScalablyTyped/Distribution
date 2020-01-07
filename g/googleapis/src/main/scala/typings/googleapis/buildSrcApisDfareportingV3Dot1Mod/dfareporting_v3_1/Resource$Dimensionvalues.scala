package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Dimensionvalues")
@js.native
class Resource$Dimensionvalues protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.dimensionValues.query
    * @desc Retrieves list of report dimension values for a list of filters.
    * @alias dfareporting.dimensionValues.query
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken The value of the nextToken from the previous result page.
    * @param {string} params.profileId The DFA user profile ID.
    * @param {().DimensionValueRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def query(): GaxiosPromise[Schema$DimensionValueList] = js.native
  def query(callback: BodyResponseCallback[Schema$DimensionValueList]): Unit = js.native
  def query(params: ParamsDollarResourceDollarDimensionvaluesDollarQuery): GaxiosPromise[Schema$DimensionValueList] = js.native
  def query(
    params: ParamsDollarResourceDollarDimensionvaluesDollarQuery,
    callback: BodyResponseCallback[Schema$DimensionValueList]
  ): Unit = js.native
  def query(
    params: ParamsDollarResourceDollarDimensionvaluesDollarQuery,
    options: BodyResponseCallback[Schema$DimensionValueList],
    callback: BodyResponseCallback[Schema$DimensionValueList]
  ): Unit = js.native
  def query(params: ParamsDollarResourceDollarDimensionvaluesDollarQuery, options: MethodOptions): GaxiosPromise[Schema$DimensionValueList] = js.native
  def query(
    params: ParamsDollarResourceDollarDimensionvaluesDollarQuery,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$DimensionValueList]
  ): Unit = js.native
}

