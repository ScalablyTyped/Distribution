package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.SqlClearCursor
import typings.elasticElasticsearch.requestParamsMod.SqlQuery
import typings.elasticElasticsearch.requestParamsMod.SqlTranslate
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCursor_ extends StObject {
  
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SqlClearCursor[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCursor[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SqlClearCursor[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SqlQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def query[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SqlQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SqlTranslate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def translate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SqlTranslate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
