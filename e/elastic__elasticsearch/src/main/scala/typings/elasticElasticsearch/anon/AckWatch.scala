package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.WatcherAckWatch
import typings.elasticElasticsearch.requestParamsMod.WatcherActivateWatch
import typings.elasticElasticsearch.requestParamsMod.WatcherDeactivateWatch
import typings.elasticElasticsearch.requestParamsMod.WatcherDeleteWatch
import typings.elasticElasticsearch.requestParamsMod.WatcherExecuteWatch
import typings.elasticElasticsearch.requestParamsMod.WatcherGetWatch
import typings.elasticElasticsearch.requestParamsMod.WatcherPutWatch
import typings.elasticElasticsearch.requestParamsMod.WatcherStart
import typings.elasticElasticsearch.requestParamsMod.WatcherStats
import typings.elasticElasticsearch.requestParamsMod.WatcherStop
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
trait AckWatch extends js.Object {
  def ackWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ackWatch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ackWatch[TResponse, TContext](params: WatcherAckWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ackWatch[TResponse, TContext](params: WatcherAckWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ackWatch[TResponse, TContext](params: WatcherAckWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ackWatch[TResponse, TContext](
    params: WatcherAckWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def ack_watch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ack_watch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ack_watch[TResponse, TContext](params: WatcherAckWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ack_watch[TResponse, TContext](params: WatcherAckWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ack_watch[TResponse, TContext](params: WatcherAckWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ack_watch[TResponse, TContext](
    params: WatcherAckWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def activateWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activateWatch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def activateWatch[TResponse, TContext](params: WatcherActivateWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activateWatch[TResponse, TContext](params: WatcherActivateWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def activateWatch[TResponse, TContext](params: WatcherActivateWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activateWatch[TResponse, TContext](
    params: WatcherActivateWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def activate_watch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activate_watch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def activate_watch[TResponse, TContext](params: WatcherActivateWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activate_watch[TResponse, TContext](params: WatcherActivateWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def activate_watch[TResponse, TContext](params: WatcherActivateWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def activate_watch[TResponse, TContext](
    params: WatcherActivateWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deactivateWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivateWatch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deactivateWatch[TResponse, TContext](params: WatcherDeactivateWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivateWatch[TResponse, TContext](params: WatcherDeactivateWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deactivateWatch[TResponse, TContext](params: WatcherDeactivateWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivateWatch[TResponse, TContext](
    params: WatcherDeactivateWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deactivate_watch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivate_watch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deactivate_watch[TResponse, TContext](params: WatcherDeactivateWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivate_watch[TResponse, TContext](params: WatcherDeactivateWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deactivate_watch[TResponse, TContext](params: WatcherDeactivateWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deactivate_watch[TResponse, TContext](
    params: WatcherDeactivateWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deleteWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteWatch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteWatch[TResponse, TContext](params: WatcherDeleteWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteWatch[TResponse, TContext](params: WatcherDeleteWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteWatch[TResponse, TContext](params: WatcherDeleteWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteWatch[TResponse, TContext](
    params: WatcherDeleteWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_watch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_watch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_watch[TResponse, TContext](params: WatcherDeleteWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_watch[TResponse, TContext](params: WatcherDeleteWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_watch[TResponse, TContext](params: WatcherDeleteWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_watch[TResponse, TContext](
    params: WatcherDeleteWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: WatcherExecuteWatch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def execute_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherExecuteWatch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: WatcherExecuteWatch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getWatch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getWatch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getWatch[TResponse, TContext](params: WatcherGetWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getWatch[TResponse, TContext](params: WatcherGetWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getWatch[TResponse, TContext](params: WatcherGetWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getWatch[TResponse, TContext](
    params: WatcherGetWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_watch[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_watch[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_watch[TResponse, TContext](params: WatcherGetWatch): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_watch[TResponse, TContext](params: WatcherGetWatch, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_watch[TResponse, TContext](params: WatcherGetWatch, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_watch[TResponse, TContext](
    params: WatcherGetWatch,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putWatch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: WatcherPutWatch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def put_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: WatcherPutWatch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_watch[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: WatcherPutWatch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def start[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start[TResponse, TContext](params: WatcherStart): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: WatcherStart, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start[TResponse, TContext](params: WatcherStart, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: WatcherStart, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: WatcherStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: WatcherStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: WatcherStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: WatcherStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop[TResponse, TContext](params: WatcherStop): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: WatcherStop, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop[TResponse, TContext](params: WatcherStop, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: WatcherStop, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}

