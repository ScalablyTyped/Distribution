package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.IlmDeleteLifecycle
import typings.elasticElasticsearch.requestParamsMod.IlmExplainLifecycle
import typings.elasticElasticsearch.requestParamsMod.IlmGetLifecycle
import typings.elasticElasticsearch.requestParamsMod.IlmGetStatus
import typings.elasticElasticsearch.requestParamsMod.IlmMoveToStep
import typings.elasticElasticsearch.requestParamsMod.IlmPutLifecycle
import typings.elasticElasticsearch.requestParamsMod.IlmRemovePolicy
import typings.elasticElasticsearch.requestParamsMod.IlmRetry
import typings.elasticElasticsearch.requestParamsMod.IlmStart
import typings.elasticElasticsearch.requestParamsMod.IlmStop
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deletelifecycle extends StObject {
  
  def deleteLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: IlmDeleteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](params: IlmDeleteLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteLifecycle[TResponse, TContext](params: IlmDeleteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteLifecycle[TResponse, TContext](
    params: IlmDeleteLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_lifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_lifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](params: IlmDeleteLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](params: IlmDeleteLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_lifecycle[TResponse, TContext](params: IlmDeleteLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_lifecycle[TResponse, TContext](
    params: IlmDeleteLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def explainLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainLifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explainLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainLifecycle[TResponse, TContext](params: IlmExplainLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainLifecycle[TResponse, TContext](params: IlmExplainLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explainLifecycle[TResponse, TContext](params: IlmExplainLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explainLifecycle[TResponse, TContext](
    params: IlmExplainLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def explain_lifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_lifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain_lifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_lifecycle[TResponse, TContext](params: IlmExplainLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_lifecycle[TResponse, TContext](params: IlmExplainLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain_lifecycle[TResponse, TContext](params: IlmExplainLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain_lifecycle[TResponse, TContext](
    params: IlmExplainLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getLifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getLifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: IlmGetLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](params: IlmGetLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getLifecycle[TResponse, TContext](params: IlmGetLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getLifecycle[TResponse, TContext](
    params: IlmGetLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getStatus[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: IlmGetStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: IlmGetStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getStatus[TResponse, TContext](params: IlmGetStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getStatus[TResponse, TContext](params: IlmGetStatus, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get_lifecycle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_lifecycle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](params: IlmGetLifecycle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](params: IlmGetLifecycle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_lifecycle[TResponse, TContext](params: IlmGetLifecycle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_lifecycle[TResponse, TContext](
    params: IlmGetLifecycle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_status[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_status[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](params: IlmGetStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](params: IlmGetStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_status[TResponse, TContext](params: IlmGetStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_status[TResponse, TContext](params: IlmGetStatus, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def moveToStep[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IlmMoveToStep[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def move_to_step[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def move_to_step[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def move_to_step[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def move_to_step[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def move_to_step[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def move_to_step[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmMoveToStep[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def move_to_step[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IlmMoveToStep[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putLifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IlmPutLifecycle[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: IlmPutLifecycle[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_lifecycle[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: IlmPutLifecycle[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def removePolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def removePolicy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def removePolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def removePolicy[TResponse, TContext](params: IlmRemovePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def removePolicy[TResponse, TContext](params: IlmRemovePolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def removePolicy[TResponse, TContext](params: IlmRemovePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def removePolicy[TResponse, TContext](
    params: IlmRemovePolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def remove_policy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remove_policy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remove_policy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remove_policy[TResponse, TContext](params: IlmRemovePolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remove_policy[TResponse, TContext](params: IlmRemovePolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remove_policy[TResponse, TContext](params: IlmRemovePolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remove_policy[TResponse, TContext](
    params: IlmRemovePolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def retry[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def retry[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def retry[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def retry[TResponse, TContext](params: IlmRetry): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def retry[TResponse, TContext](params: IlmRetry, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def retry[TResponse, TContext](params: IlmRetry, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def retry[TResponse, TContext](params: IlmRetry, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def start[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: IlmStart): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: IlmStart, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def start[TResponse, TContext](params: IlmStart, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def start[TResponse, TContext](params: IlmStart, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def stop[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: IlmStop): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: IlmStop, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stop[TResponse, TContext](params: IlmStop, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stop[TResponse, TContext](params: IlmStop, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
