package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.AutoscalingDeleteAutoscalingPolicy
import typings.elasticElasticsearch.requestParamsMod.AutoscalingGetAutoscalingDecision
import typings.elasticElasticsearch.requestParamsMod.AutoscalingGetAutoscalingPolicy
import typings.elasticElasticsearch.requestParamsMod.AutoscalingPutAutoscalingPolicy
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAutoscalingPolicy_ extends StObject {
  
  def deleteAutoscalingPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getAutoscalingDecision[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getAutoscalingPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
