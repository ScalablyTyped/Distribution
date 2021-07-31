package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.AsyncSearchDelete
import typings.elasticElasticsearch.requestParamsMod.AsyncSearchGet
import typings.elasticElasticsearch.requestParamsMod.AsyncSearchSubmit
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delete extends StObject {
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: AsyncSearchDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: AsyncSearchDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: AsyncSearchGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: AsyncSearchGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: AsyncSearchSubmit[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def submit[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: AsyncSearchSubmit[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
