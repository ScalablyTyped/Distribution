package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.EnrichDeletePolicy
import typings.elasticElasticsearch.requestParamsMod.EnrichExecutePolicy
import typings.elasticElasticsearch.requestParamsMod.EnrichGetPolicy
import typings.elasticElasticsearch.requestParamsMod.EnrichPutPolicy
import typings.elasticElasticsearch.requestParamsMod.EnrichStats
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletePolicy_ extends StObject {
  
  def deletePolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePolicy[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePolicy[TResponse, TContext](params: EnrichDeletePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deletePolicy[TResponse, TContext](params: EnrichDeletePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def executePolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executePolicy[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executePolicy[TResponse, TContext](params: EnrichExecutePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executePolicy[TResponse, TContext](params: EnrichExecutePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPolicy[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPolicy[TResponse, TContext](params: EnrichGetPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getPolicy[TResponse, TContext](params: EnrichGetPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: EnrichPutPolicy[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: EnrichPutPolicy[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: EnrichStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: EnrichStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
