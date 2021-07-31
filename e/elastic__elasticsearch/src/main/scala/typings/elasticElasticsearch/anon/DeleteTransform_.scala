package typings.elasticElasticsearch.anon

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
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTransform_ extends StObject {
  
  def deleteTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTransform[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTransform[TResponse, TContext](params: TransformDeleteTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteTransform[TResponse, TContext](params: TransformDeleteTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransform[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransform[TResponse, TContext](params: TransformGetTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransform[TResponse, TContext](params: TransformGetTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getTransformStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransformStats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransformStats[TResponse, TContext](params: TransformGetTransformStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTransformStats[TResponse, TContext](params: TransformGetTransformStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: TransformPreviewTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def previewTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: TransformPreviewTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: TransformPutTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: TransformPutTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def startTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startTransform[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startTransform[TResponse, TContext](params: TransformStartTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startTransform[TResponse, TContext](params: TransformStartTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stopTransform[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopTransform[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopTransform[TResponse, TContext](params: TransformStopTransform): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopTransform[TResponse, TContext](params: TransformStopTransform, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: TransformUpdateTransform[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateTransform[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: TransformUpdateTransform[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
