package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.NodesHotThreads
import typings.elasticElasticsearch.requestParamsMod.NodesInfo
import typings.elasticElasticsearch.requestParamsMod.NodesReloadSecureSettings
import typings.elasticElasticsearch.requestParamsMod.NodesStats
import typings.elasticElasticsearch.requestParamsMod.NodesUsage
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HotThreads extends js.Object {
  def hotThreads[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hotThreads[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def hotThreads[TResponse, TContext](params: NodesHotThreads): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hotThreads[TResponse, TContext](params: NodesHotThreads, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def hotThreads[TResponse, TContext](params: NodesHotThreads, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hotThreads[TResponse, TContext](
    params: NodesHotThreads,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def hot_threads[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hot_threads[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def hot_threads[TResponse, TContext](params: NodesHotThreads): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hot_threads[TResponse, TContext](params: NodesHotThreads, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def hot_threads[TResponse, TContext](params: NodesHotThreads, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def hot_threads[TResponse, TContext](
    params: NodesHotThreads,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: NodesInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: NodesInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: NodesInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](params: NodesInfo, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reloadSecureSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: NodesReloadSecureSettings[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def reload_secure_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reload_secure_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reload_secure_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reload_secure_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reload_secure_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: NodesReloadSecureSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reload_secure_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: NodesReloadSecureSettings[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: NodesStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: NodesStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: NodesStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: NodesStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def usage[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def usage[TResponse, TContext](params: NodesUsage): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: NodesUsage, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def usage[TResponse, TContext](params: NodesUsage, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def usage[TResponse, TContext](params: NodesUsage, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}

