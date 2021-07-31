package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.SlmDeleteLifecycle
import typings.elasticElasticsearch.requestParamsMod.SlmExecuteLifecycle
import typings.elasticElasticsearch.requestParamsMod.SlmExecuteRetention
import typings.elasticElasticsearch.requestParamsMod.SlmGetLifecycle
import typings.elasticElasticsearch.requestParamsMod.SlmGetStats
import typings.elasticElasticsearch.requestParamsMod.SlmGetStatus
import typings.elasticElasticsearch.requestParamsMod.SlmPutLifecycle
import typings.elasticElasticsearch.requestParamsMod.SlmStart
import typings.elasticElasticsearch.requestParamsMod.SlmStop
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
trait ExecuteRetention extends StObject {
  
  def deleteLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteLifecycle[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: SlmDeleteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: SlmDeleteLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteLifecycle[TResponse, TContext](params: SlmDeleteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](
    params: SlmDeleteLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_lifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_lifecycle[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](params: SlmDeleteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](params: SlmDeleteLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_lifecycle[TResponse, TContext](params: SlmDeleteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](
    params: SlmDeleteLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def executeLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeLifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executeLifecycle[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeLifecycle[TResponse, TContext](params: SlmExecuteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeLifecycle[TResponse, TContext](params: SlmExecuteLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executeLifecycle[TResponse, TContext](params: SlmExecuteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeLifecycle[TResponse, TContext](
    params: SlmExecuteLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def executeRetention[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeRetention[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executeRetention[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeRetention[TResponse, TContext](params: SlmExecuteRetention): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeRetention[TResponse, TContext](params: SlmExecuteRetention, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def executeRetention[TResponse, TContext](params: SlmExecuteRetention, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def executeRetention[TResponse, TContext](
    params: SlmExecuteRetention,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def execute_lifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_lifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_lifecycle[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_lifecycle[TResponse, TContext](params: SlmExecuteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_lifecycle[TResponse, TContext](params: SlmExecuteLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_lifecycle[TResponse, TContext](params: SlmExecuteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_lifecycle[TResponse, TContext](
    params: SlmExecuteLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def execute_retention[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_retention[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_retention[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_retention[TResponse, TContext](params: SlmExecuteRetention): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_retention[TResponse, TContext](params: SlmExecuteRetention, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def execute_retention[TResponse, TContext](params: SlmExecuteRetention, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def execute_retention[TResponse, TContext](
    params: SlmExecuteRetention,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getLifecycle[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: SlmGetLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: SlmGetLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getLifecycle[TResponse, TContext](params: SlmGetLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](
    params: SlmGetLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getStats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStats[TResponse, TContext](params: SlmGetStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStats[TResponse, TContext](params: SlmGetStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getStats[TResponse, TContext](params: SlmGetStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStats[TResponse, TContext](params: SlmGetStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getStatus[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: SlmGetStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: SlmGetStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getStatus[TResponse, TContext](params: SlmGetStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: SlmGetStatus, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_lifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_lifecycle[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](params: SlmGetLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](params: SlmGetLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_lifecycle[TResponse, TContext](params: SlmGetLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](
    params: SlmGetLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_stats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_stats[TResponse, TContext](params: SlmGetStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_stats[TResponse, TContext](params: SlmGetStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_stats[TResponse, TContext](params: SlmGetStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_stats[TResponse, TContext](params: SlmGetStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_status[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_status[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](params: SlmGetStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](params: SlmGetStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_status[TResponse, TContext](params: SlmGetStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](params: SlmGetStatus, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SlmPutLifecycle[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SlmPutLifecycle[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SlmPutLifecycle[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: SlmPutLifecycle[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SlmPutLifecycle[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SlmPutLifecycle[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SlmPutLifecycle[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: SlmPutLifecycle[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def start[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: SlmStart): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: SlmStart, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start[TResponse, TContext](params: SlmStart, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: SlmStart, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def stop[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: SlmStop): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: SlmStop, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop[TResponse, TContext](params: SlmStop, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: SlmStop, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
