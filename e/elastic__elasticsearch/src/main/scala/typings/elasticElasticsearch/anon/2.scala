package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.MonitoringBulk
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestNDBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends StObject {
  
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MonitoringBulk[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MonitoringBulk[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MonitoringBulk[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: MonitoringBulk[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
