package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.AutoscalingDeleteAutoscalingPolicy
import typings.elasticElasticsearch.requestParamsMod.AutoscalingGetAutoscalingDecision
import typings.elasticElasticsearch.requestParamsMod.AutoscalingGetAutoscalingPolicy
import typings.elasticElasticsearch.requestParamsMod.AutoscalingPutAutoscalingPolicy
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deleteautoscalingpolicy extends js.Object {
  
  def deleteAutoscalingPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoscalingPolicy[TResponse, TContext](
    params: AutoscalingDeleteAutoscalingPolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_autoscaling_policy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_autoscaling_policy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_autoscaling_policy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_autoscaling_policy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_autoscaling_policy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_autoscaling_policy[TResponse, TContext](params: AutoscalingDeleteAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_autoscaling_policy[TResponse, TContext](
    params: AutoscalingDeleteAutoscalingPolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getAutoscalingDecision[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoscalingDecision[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoscalingDecision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingDecision[TResponse, TContext](
    params: AutoscalingGetAutoscalingDecision,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getAutoscalingPolicy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoscalingPolicy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoscalingPolicy[TResponse, TContext](
    params: AutoscalingGetAutoscalingPolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_autoscaling_decision[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_decision[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_autoscaling_decision[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_decision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_decision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_autoscaling_decision[TResponse, TContext](params: AutoscalingGetAutoscalingDecision, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_decision[TResponse, TContext](
    params: AutoscalingGetAutoscalingDecision,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_autoscaling_policy[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_policy[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_autoscaling_policy[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_policy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_policy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_autoscaling_policy[TResponse, TContext](params: AutoscalingGetAutoscalingPolicy, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_autoscaling_policy[TResponse, TContext](
    params: AutoscalingGetAutoscalingPolicy,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoscalingPolicy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: AutoscalingPutAutoscalingPolicy[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_autoscaling_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_autoscaling_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_autoscaling_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_autoscaling_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_autoscaling_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_autoscaling_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: AutoscalingPutAutoscalingPolicy[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_autoscaling_policy[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: AutoscalingPutAutoscalingPolicy[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
