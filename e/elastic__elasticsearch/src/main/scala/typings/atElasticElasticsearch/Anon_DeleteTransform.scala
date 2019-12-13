package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.TransformDeleteTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.TransformGetTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.TransformGetTransformStats
import typings.atElasticElasticsearch.apiRequestParamsMod.TransformPreviewTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.TransformPutTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.TransformStartTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.TransformStopTransform
import typings.atElasticElasticsearch.apiRequestParamsMod.TransformUpdateTransform
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DeleteTransform extends js.Object {
  @JSName("deleteTransform")
  var deleteTransform_Original: ApiMethod[TransformDeleteTransform, _] = js.native
  @JSName("delete_transform")
  var delete_transform_Original: ApiMethod[TransformDeleteTransform, _] = js.native
  @JSName("getTransformStats")
  var getTransformStats_Original: ApiMethod[TransformGetTransformStats, _] = js.native
  @JSName("getTransform")
  var getTransform_Original: ApiMethod[TransformGetTransform, _] = js.native
  @JSName("get_transform")
  var get_transform_Original: ApiMethod[TransformGetTransform, _] = js.native
  @JSName("get_transform_stats")
  var get_transform_stats_Original: ApiMethod[TransformGetTransformStats, _] = js.native
  @JSName("previewTransform")
  var previewTransform_Original: ApiMethod[TransformPreviewTransform[_], _] = js.native
  @JSName("preview_transform")
  var preview_transform_Original: ApiMethod[TransformPreviewTransform[_], _] = js.native
  @JSName("putTransform")
  var putTransform_Original: ApiMethod[TransformPutTransform[_], _] = js.native
  @JSName("put_transform")
  var put_transform_Original: ApiMethod[TransformPutTransform[_], _] = js.native
  @JSName("startTransform")
  var startTransform_Original: ApiMethod[TransformStartTransform, _] = js.native
  @JSName("start_transform")
  var start_transform_Original: ApiMethod[TransformStartTransform, _] = js.native
  @JSName("stopTransform")
  var stopTransform_Original: ApiMethod[TransformStopTransform, _] = js.native
  @JSName("stop_transform")
  var stop_transform_Original: ApiMethod[TransformStopTransform, _] = js.native
  @JSName("updateTransform")
  var updateTransform_Original: ApiMethod[TransformUpdateTransform[_], _] = js.native
  @JSName("update_transform")
  var update_transform_Original: ApiMethod[TransformUpdateTransform[_], _] = js.native
  // Promise API
  def deleteTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteTransform(params: TransformDeleteTransform): js.Promise[ApiResponse[_, _]] = js.native
  def deleteTransform(params: TransformDeleteTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteTransform(params: TransformDeleteTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteTransform(params: TransformDeleteTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_transform(params: TransformDeleteTransform): js.Promise[ApiResponse[_, _]] = js.native
  def delete_transform(params: TransformDeleteTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_transform(params: TransformDeleteTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_transform(params: TransformDeleteTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTransform(params: TransformGetTransform): js.Promise[ApiResponse[_, _]] = js.native
  def getTransform(params: TransformGetTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTransform(params: TransformGetTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getTransform(params: TransformGetTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getTransformStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getTransformStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTransformStats(params: TransformGetTransformStats): js.Promise[ApiResponse[_, _]] = js.native
  def getTransformStats(params: TransformGetTransformStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getTransformStats(params: TransformGetTransformStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getTransformStats(params: TransformGetTransformStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_transform(params: TransformGetTransform): js.Promise[ApiResponse[_, _]] = js.native
  def get_transform(params: TransformGetTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_transform(params: TransformGetTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_transform(params: TransformGetTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_transform_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_transform_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_transform_stats(params: TransformGetTransformStats): js.Promise[ApiResponse[_, _]] = js.native
  def get_transform_stats(params: TransformGetTransformStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_transform_stats(params: TransformGetTransformStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_transform_stats(params: TransformGetTransformStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def previewTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def previewTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def previewTransform(params: TransformPreviewTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def previewTransform(params: TransformPreviewTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def previewTransform(params: TransformPreviewTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def previewTransform(params: TransformPreviewTransform[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def preview_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def preview_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def preview_transform(params: TransformPreviewTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def preview_transform(params: TransformPreviewTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def preview_transform(params: TransformPreviewTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def preview_transform(params: TransformPreviewTransform[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putTransform(params: TransformPutTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putTransform(params: TransformPutTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putTransform(params: TransformPutTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putTransform(params: TransformPutTransform[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_transform(params: TransformPutTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_transform(params: TransformPutTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_transform(params: TransformPutTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_transform(params: TransformPutTransform[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def startTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def startTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def startTransform(params: TransformStartTransform): js.Promise[ApiResponse[_, _]] = js.native
  def startTransform(params: TransformStartTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def startTransform(params: TransformStartTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def startTransform(params: TransformStartTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def start_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_transform(params: TransformStartTransform): js.Promise[ApiResponse[_, _]] = js.native
  def start_transform(params: TransformStartTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_transform(params: TransformStartTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start_transform(params: TransformStartTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stopTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stopTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopTransform(params: TransformStopTransform): js.Promise[ApiResponse[_, _]] = js.native
  def stopTransform(params: TransformStopTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopTransform(params: TransformStopTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stopTransform(params: TransformStopTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_transform(params: TransformStopTransform): js.Promise[ApiResponse[_, _]] = js.native
  def stop_transform(params: TransformStopTransform, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_transform(params: TransformStopTransform, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop_transform(params: TransformStopTransform, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateTransform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateTransform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateTransform(params: TransformUpdateTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateTransform(params: TransformUpdateTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateTransform(params: TransformUpdateTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateTransform(params: TransformUpdateTransform[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_transform(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_transform(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_transform(params: TransformUpdateTransform[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_transform(params: TransformUpdateTransform[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_transform(params: TransformUpdateTransform[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_transform(params: TransformUpdateTransform[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

