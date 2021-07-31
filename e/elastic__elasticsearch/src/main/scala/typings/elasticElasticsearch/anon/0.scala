package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.GraphExplore
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: GraphExplore[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: GraphExplore[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: GraphExplore[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: GraphExplore[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
