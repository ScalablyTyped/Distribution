package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.DataFrameDeleteDataFrameTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.DataFrameGetDataFrameTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.DataFrameGetDataFrameTransformStats
import typings.atElasticElasticsearch.apiRequestParamsMod.DataFramePreviewDataFrameTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.DataFramePutDataFrameTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.DataFrameStartDataFrameTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.DataFrameStopDataFrameTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.DataFrameUpdateDataFrameTransform
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DeleteDataFrameTransform extends js.Object {
  @JSName("deleteDataFrameTransform")
  var deleteDataFrameTransform_Original: ApiMethod[DataFrameDeleteDataFrameTransform, _] = js.native
  @JSName("delete_data_frame_transform")
  var delete_data_frame_transform_Original: ApiMethod[DataFrameDeleteDataFrameTransform, _] = js.native
  @JSName("getDataFrameTransformStats")
  var getDataFrameTransformStats_Original: ApiMethod[DataFrameGetDataFrameTransformStats, _] = js.native
  @JSName("getDataFrameTransform")
  var getDataFrameTransform_Original: ApiMethod[DataFrameGetDataFrameTransform, _] = js.native
  @JSName("get_data_frame_transform")
  var get_data_frame_transform_Original: ApiMethod[DataFrameGetDataFrameTransform, _] = js.native
  @JSName("get_data_frame_transform_stats")
  var get_data_frame_transform_stats_Original: ApiMethod[DataFrameGetDataFrameTransformStats, _] = js.native
  @JSName("previewDataFrameTransform")
  var previewDataFrameTransform_Original: ApiMethod[DataFramePreviewDataFrameTransform[_], _] = js.native
  @JSName("preview_data_frame_transform")
  var preview_data_frame_transform_Original: ApiMethod[DataFramePreviewDataFrameTransform[_], _] = js.native
  @JSName("putDataFrameTransform")
  var putDataFrameTransform_Original: ApiMethod[DataFramePutDataFrameTransform[_], _] = js.native
  @JSName("put_data_frame_transform")
  var put_data_frame_transform_Original: ApiMethod[DataFramePutDataFrameTransform[_], _] = js.native
  @JSName("startDataFrameTransform")
  var startDataFrameTransform_Original: ApiMethod[DataFrameStartDataFrameTransform, _] = js.native
  @JSName("start_data_frame_transform")
  var start_data_frame_transform_Original: ApiMethod[DataFrameStartDataFrameTransform, _] = js.native
  @JSName("stopDataFrameTransform")
  var stopDataFrameTransform_Original: ApiMethod[DataFrameStopDataFrameTransform, _] = js.native
  @JSName("stop_data_frame_transform")
  var stop_data_frame_transform_Original: ApiMethod[DataFrameStopDataFrameTransform, _] = js.native
  @JSName("updateDataFrameTransform")
  var updateDataFrameTransform_Original: ApiMethod[DataFrameUpdateDataFrameTransform[_], _] = js.native
  @JSName("update_data_frame_transform")
  var update_data_frame_transform_Original: ApiMethod[DataFrameUpdateDataFrameTransform[_], _] = js.native
  // Promise API
  def deleteDataFrameTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteDataFrameTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteDataFrameTransform(params: DataFrameDeleteDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def deleteDataFrameTransform(params: DataFrameDeleteDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteDataFrameTransform(params: DataFrameDeleteDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteDataFrameTransform(
    params: DataFrameDeleteDataFrameTransform,
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def delete_data_frame_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_data_frame_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_data_frame_transform(params: DataFrameDeleteDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def delete_data_frame_transform(params: DataFrameDeleteDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_data_frame_transform(params: DataFrameDeleteDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_data_frame_transform(
    params: DataFrameDeleteDataFrameTransform,
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def getDataFrameTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getDataFrameTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameTransform(params: DataFrameGetDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameTransform(params: DataFrameGetDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameTransform(params: DataFrameGetDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameTransform(params: DataFrameGetDataFrameTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getDataFrameTransformStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getDataFrameTransformStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameTransformStats(params: DataFrameGetDataFrameTransformStats): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameTransformStats(params: DataFrameGetDataFrameTransformStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getDataFrameTransformStats(params: DataFrameGetDataFrameTransformStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getDataFrameTransformStats(
    params: DataFrameGetDataFrameTransformStats,
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def get_data_frame_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_data_frame_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_transform(params: DataFrameGetDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_transform(params: DataFrameGetDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_transform(params: DataFrameGetDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_transform(params: DataFrameGetDataFrameTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_data_frame_transform_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_data_frame_transform_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_transform_stats(params: DataFrameGetDataFrameTransformStats): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_transform_stats(params: DataFrameGetDataFrameTransformStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_data_frame_transform_stats(params: DataFrameGetDataFrameTransformStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_data_frame_transform_stats(
    params: DataFrameGetDataFrameTransformStats,
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def previewDataFrameTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def previewDataFrameTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def previewDataFrameTransform(params: DataFramePreviewDataFrameTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def previewDataFrameTransform(params: DataFramePreviewDataFrameTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def previewDataFrameTransform(params: DataFramePreviewDataFrameTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def previewDataFrameTransform(
    params: DataFramePreviewDataFrameTransform[_],
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def preview_data_frame_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def preview_data_frame_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def preview_data_frame_transform(params: DataFramePreviewDataFrameTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def preview_data_frame_transform(params: DataFramePreviewDataFrameTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def preview_data_frame_transform(params: DataFramePreviewDataFrameTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def preview_data_frame_transform(
    params: DataFramePreviewDataFrameTransform[_],
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def putDataFrameTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putDataFrameTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putDataFrameTransform(params: DataFramePutDataFrameTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putDataFrameTransform(params: DataFramePutDataFrameTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putDataFrameTransform(params: DataFramePutDataFrameTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putDataFrameTransform(
    params: DataFramePutDataFrameTransform[_],
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def put_data_frame_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_data_frame_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_data_frame_transform(params: DataFramePutDataFrameTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_data_frame_transform(params: DataFramePutDataFrameTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_data_frame_transform(params: DataFramePutDataFrameTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_data_frame_transform(
    params: DataFramePutDataFrameTransform[_],
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def startDataFrameTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def startDataFrameTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def startDataFrameTransform(params: DataFrameStartDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def startDataFrameTransform(params: DataFrameStartDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def startDataFrameTransform(params: DataFrameStartDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def startDataFrameTransform(
    params: DataFrameStartDataFrameTransform,
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def start_data_frame_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start_data_frame_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_data_frame_transform(params: DataFrameStartDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def start_data_frame_transform(params: DataFrameStartDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_data_frame_transform(params: DataFrameStartDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start_data_frame_transform(
    params: DataFrameStartDataFrameTransform,
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def stopDataFrameTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stopDataFrameTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopDataFrameTransform(params: DataFrameStopDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def stopDataFrameTransform(params: DataFrameStopDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopDataFrameTransform(params: DataFrameStopDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stopDataFrameTransform(params: DataFrameStopDataFrameTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop_data_frame_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop_data_frame_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_data_frame_transform(params: DataFrameStopDataFrameTransform): js.Promise[ApiResponse[_, _]] = js.native
  def stop_data_frame_transform(params: DataFrameStopDataFrameTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_data_frame_transform(params: DataFrameStopDataFrameTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop_data_frame_transform(params: DataFrameStopDataFrameTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateDataFrameTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateDataFrameTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateDataFrameTransform(params: DataFrameUpdateDataFrameTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateDataFrameTransform(params: DataFrameUpdateDataFrameTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateDataFrameTransform(params: DataFrameUpdateDataFrameTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateDataFrameTransform(
    params: DataFrameUpdateDataFrameTransform[_],
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
  // Promise API
  def update_data_frame_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_data_frame_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_data_frame_transform(params: DataFrameUpdateDataFrameTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_data_frame_transform(params: DataFrameUpdateDataFrameTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_data_frame_transform(params: DataFrameUpdateDataFrameTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_data_frame_transform(
    params: DataFrameUpdateDataFrameTransform[_],
    options: TransportRequestOptions,
    callback: callbackFn[_]
  ): TransportRequestCallback = js.native
}

