package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DeleteDataFrameTransform extends js.Object {
  @JSName("deleteDataFrameTransform")
  var deleteDataFrameTransform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform, _] = js.native
  @JSName("delete_data_frame_transform")
  var delete_data_frame_transform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform, _] = js.native
  @JSName("getDataFrameTransformStats")
  var getDataFrameTransformStats_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[
    atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats, 
    _
  ] = js.native
  @JSName("getDataFrameTransform")
  var getDataFrameTransform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform, _] = js.native
  @JSName("get_data_frame_transform")
  var get_data_frame_transform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform, _] = js.native
  @JSName("get_data_frame_transform_stats")
  var get_data_frame_transform_stats_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[
    atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats, 
    _
  ] = js.native
  @JSName("previewDataFrameTransform")
  var previewDataFrameTransform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[
    atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_], 
    _
  ] = js.native
  @JSName("preview_data_frame_transform")
  var preview_data_frame_transform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[
    atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_], 
    _
  ] = js.native
  @JSName("putDataFrameTransform")
  var putDataFrameTransform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_], _] = js.native
  @JSName("put_data_frame_transform")
  var put_data_frame_transform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_], _] = js.native
  @JSName("startDataFrameTransform")
  var startDataFrameTransform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform, _] = js.native
  @JSName("start_data_frame_transform")
  var start_data_frame_transform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform, _] = js.native
  @JSName("stopDataFrameTransform")
  var stopDataFrameTransform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform, _] = js.native
  @JSName("stop_data_frame_transform")
  var stop_data_frame_transform_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform, _] = js.native
  // Promise API
  def deleteDataFrameTransform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deleteDataFrameTransform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteDataFrameTransform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def delete_data_frame_transform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete_data_frame_transform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_data_frame_transform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameDeleteDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getDataFrameTransform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getDataFrameTransform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getDataFrameTransform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getDataFrameTransformStats(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getDataFrameTransformStats(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getDataFrameTransformStats(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getDataFrameTransformStats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getDataFrameTransformStats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getDataFrameTransformStats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_data_frame_transform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_data_frame_transform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_data_frame_transform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_data_frame_transform_stats(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_data_frame_transform_stats(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_data_frame_transform_stats(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_data_frame_transform_stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_data_frame_transform_stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_data_frame_transform_stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameGetDataFrameTransformStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def previewDataFrameTransform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def previewDataFrameTransform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def previewDataFrameTransform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def previewDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def previewDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def previewDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def preview_data_frame_transform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def preview_data_frame_transform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def preview_data_frame_transform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def preview_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def preview_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def preview_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePreviewDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def putDataFrameTransform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def putDataFrameTransform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putDataFrameTransform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def put_data_frame_transform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def put_data_frame_transform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_data_frame_transform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFramePutDataFrameTransform[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def startDataFrameTransform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def startDataFrameTransform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def startDataFrameTransform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def startDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def startDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def startDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def start_data_frame_transform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def start_data_frame_transform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def start_data_frame_transform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def start_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def start_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def start_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStartDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def stopDataFrameTransform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def stopDataFrameTransform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stopDataFrameTransform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stopDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stopDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stopDataFrameTransform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def stop_data_frame_transform(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def stop_data_frame_transform(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stop_data_frame_transform(params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stop_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stop_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stop_data_frame_transform(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DataFrameStopDataFrameTransform,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

