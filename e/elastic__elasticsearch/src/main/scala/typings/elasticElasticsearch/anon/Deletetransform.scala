package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.TransformDeleteTransform
import typings.elasticElasticsearch.requestParamsMod.TransformGetTransform
import typings.elasticElasticsearch.requestParamsMod.TransformGetTransformStats
import typings.elasticElasticsearch.requestParamsMod.TransformPreviewTransform
import typings.elasticElasticsearch.requestParamsMod.TransformPutTransform
import typings.elasticElasticsearch.requestParamsMod.TransformStartTransform
import typings.elasticElasticsearch.requestParamsMod.TransformStopTransform
import typings.elasticElasticsearch.requestParamsMod.TransformUpdateTransform
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deletetransform extends js.Object {
  
  def deleteTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTransform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteTransform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTransform[TResponse, TContext](params: TransformDeleteTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTransform[TResponse, TContext](params: TransformDeleteTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteTransform[TResponse, TContext](params: TransformDeleteTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTransform[TResponse, TContext](
    params: TransformDeleteTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_transform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_transform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_transform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_transform[TResponse, TContext](params: TransformDeleteTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_transform[TResponse, TContext](params: TransformDeleteTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_transform[TResponse, TContext](params: TransformDeleteTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_transform[TResponse, TContext](
    params: TransformDeleteTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTransform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransform[TResponse, TContext](params: TransformGetTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransform[TResponse, TContext](params: TransformGetTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTransform[TResponse, TContext](params: TransformGetTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransform[TResponse, TContext](
    params: TransformGetTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getTransformStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransformStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTransformStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransformStats[TResponse, TContext](params: TransformGetTransformStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransformStats[TResponse, TContext](params: TransformGetTransformStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTransformStats[TResponse, TContext](params: TransformGetTransformStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransformStats[TResponse, TContext](
    params: TransformGetTransformStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_transform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_transform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform[TResponse, TContext](params: TransformGetTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform[TResponse, TContext](params: TransformGetTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_transform[TResponse, TContext](params: TransformGetTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform[TResponse, TContext](
    params: TransformGetTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_transform_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_transform_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform_stats[TResponse, TContext](params: TransformGetTransformStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform_stats[TResponse, TContext](params: TransformGetTransformStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_transform_stats[TResponse, TContext](params: TransformGetTransformStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_transform_stats[TResponse, TContext](
    params: TransformGetTransformStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPreviewTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPreviewTransform[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPreviewTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: TransformPreviewTransform[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def preview_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def preview_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPreviewTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPreviewTransform[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def preview_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPreviewTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def preview_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: TransformPreviewTransform[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPutTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPutTransform[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPutTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: TransformPutTransform[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPutTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPutTransform[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformPutTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: TransformPutTransform[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def startTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startTransform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startTransform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startTransform[TResponse, TContext](params: TransformStartTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startTransform[TResponse, TContext](params: TransformStartTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def startTransform[TResponse, TContext](params: TransformStartTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startTransform[TResponse, TContext](
    params: TransformStartTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def start_transform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_transform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_transform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_transform[TResponse, TContext](params: TransformStartTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_transform[TResponse, TContext](params: TransformStartTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start_transform[TResponse, TContext](params: TransformStartTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start_transform[TResponse, TContext](
    params: TransformStartTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stopTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopTransform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopTransform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopTransform[TResponse, TContext](params: TransformStopTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopTransform[TResponse, TContext](params: TransformStopTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stopTransform[TResponse, TContext](params: TransformStopTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopTransform[TResponse, TContext](
    params: TransformStopTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stop_transform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_transform[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_transform[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_transform[TResponse, TContext](params: TransformStopTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_transform[TResponse, TContext](params: TransformStopTransform, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop_transform[TResponse, TContext](params: TransformStopTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop_transform[TResponse, TContext](
    params: TransformStopTransform,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformUpdateTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformUpdateTransform[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformUpdateTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: TransformUpdateTransform[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def update_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformUpdateTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformUpdateTransform[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: TransformUpdateTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_transform[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: TransformUpdateTransform[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
