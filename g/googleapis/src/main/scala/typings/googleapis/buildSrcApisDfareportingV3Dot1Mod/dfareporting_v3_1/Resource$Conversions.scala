package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.1", "dfareporting_v3_1.Resource$Conversions")
@js.native
class Resource$Conversions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.conversions.batchinsert
    * @desc Inserts conversions.
    * @alias dfareporting.conversions.batchinsert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ConversionsBatchInsertRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchinsert(): GaxiosPromise[Schema$ConversionsBatchInsertResponse] = js.native
  def batchinsert(callback: BodyResponseCallback[Schema$ConversionsBatchInsertResponse]): Unit = js.native
  def batchinsert(params: ParamsDollarResourceDollarConversionsDollarBatchinsert): GaxiosPromise[Schema$ConversionsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsDollarResourceDollarConversionsDollarBatchinsert,
    callback: BodyResponseCallback[Schema$ConversionsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(
    params: ParamsDollarResourceDollarConversionsDollarBatchinsert,
    options: BodyResponseCallback[Schema$ConversionsBatchInsertResponse],
    callback: BodyResponseCallback[Schema$ConversionsBatchInsertResponse]
  ): Unit = js.native
  def batchinsert(params: ParamsDollarResourceDollarConversionsDollarBatchinsert, options: MethodOptions): GaxiosPromise[Schema$ConversionsBatchInsertResponse] = js.native
  def batchinsert(
    params: ParamsDollarResourceDollarConversionsDollarBatchinsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConversionsBatchInsertResponse]
  ): Unit = js.native
  /**
    * dfareporting.conversions.batchupdate
    * @desc Updates existing conversions.
    * @alias dfareporting.conversions.batchupdate
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().ConversionsBatchUpdateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchupdate(): GaxiosPromise[Schema$ConversionsBatchUpdateResponse] = js.native
  def batchupdate(callback: BodyResponseCallback[Schema$ConversionsBatchUpdateResponse]): Unit = js.native
  def batchupdate(params: ParamsDollarResourceDollarConversionsDollarBatchupdate): GaxiosPromise[Schema$ConversionsBatchUpdateResponse] = js.native
  def batchupdate(
    params: ParamsDollarResourceDollarConversionsDollarBatchupdate,
    callback: BodyResponseCallback[Schema$ConversionsBatchUpdateResponse]
  ): Unit = js.native
  def batchupdate(
    params: ParamsDollarResourceDollarConversionsDollarBatchupdate,
    options: BodyResponseCallback[Schema$ConversionsBatchUpdateResponse],
    callback: BodyResponseCallback[Schema$ConversionsBatchUpdateResponse]
  ): Unit = js.native
  def batchupdate(params: ParamsDollarResourceDollarConversionsDollarBatchupdate, options: MethodOptions): GaxiosPromise[Schema$ConversionsBatchUpdateResponse] = js.native
  def batchupdate(
    params: ParamsDollarResourceDollarConversionsDollarBatchupdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ConversionsBatchUpdateResponse]
  ): Unit = js.native
}

