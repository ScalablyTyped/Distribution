package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.GraphExplore
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Explore extends js.Object {
  
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: GraphExplore[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: GraphExplore[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
