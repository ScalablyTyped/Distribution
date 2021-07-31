package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.LicenseDelete
import typings.elasticElasticsearch.requestParamsMod.LicenseGet
import typings.elasticElasticsearch.requestParamsMod.LicenseGetBasicStatus
import typings.elasticElasticsearch.requestParamsMod.LicenseGetTrialStatus
import typings.elasticElasticsearch.requestParamsMod.LicensePost
import typings.elasticElasticsearch.requestParamsMod.LicensePostStartBasic
import typings.elasticElasticsearch.requestParamsMod.LicensePostStartTrial
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
trait GetTrialStatus extends StObject {
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: LicenseDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: LicenseDelete, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: LicenseDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: LicenseDelete, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: LicenseGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: LicenseGet, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: LicenseGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: LicenseGet, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getBasicStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBasicStatus[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getBasicStatus[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBasicStatus[TResponse, TContext](params: LicenseGetBasicStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBasicStatus[TResponse, TContext](params: LicenseGetBasicStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getBasicStatus[TResponse, TContext](params: LicenseGetBasicStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getBasicStatus[TResponse, TContext](
    params: LicenseGetBasicStatus,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getTrialStatus[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrialStatus[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTrialStatus[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrialStatus[TResponse, TContext](params: LicenseGetTrialStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrialStatus[TResponse, TContext](params: LicenseGetTrialStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getTrialStatus[TResponse, TContext](params: LicenseGetTrialStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getTrialStatus[TResponse, TContext](
    params: LicenseGetTrialStatus,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_basic_status[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_basic_status[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_basic_status[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_basic_status[TResponse, TContext](params: LicenseGetBasicStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_basic_status[TResponse, TContext](params: LicenseGetBasicStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_basic_status[TResponse, TContext](params: LicenseGetBasicStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_basic_status[TResponse, TContext](
    params: LicenseGetBasicStatus,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_trial_status[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trial_status[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_trial_status[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trial_status[TResponse, TContext](params: LicenseGetTrialStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trial_status[TResponse, TContext](params: LicenseGetTrialStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_trial_status[TResponse, TContext](params: LicenseGetTrialStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_trial_status[TResponse, TContext](
    params: LicenseGetTrialStatus,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: LicensePost[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: LicensePost[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: LicensePost[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: LicensePost[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def postStartBasic[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartBasic[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postStartBasic[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartBasic[TResponse, TContext](params: LicensePostStartBasic): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartBasic[TResponse, TContext](params: LicensePostStartBasic, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postStartBasic[TResponse, TContext](params: LicensePostStartBasic, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartBasic[TResponse, TContext](
    params: LicensePostStartBasic,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def postStartTrial[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartTrial[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postStartTrial[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartTrial[TResponse, TContext](params: LicensePostStartTrial): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartTrial[TResponse, TContext](params: LicensePostStartTrial, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postStartTrial[TResponse, TContext](params: LicensePostStartTrial, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postStartTrial[TResponse, TContext](
    params: LicensePostStartTrial,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def post_start_basic[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_basic[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_start_basic[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_basic[TResponse, TContext](params: LicensePostStartBasic): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_basic[TResponse, TContext](params: LicensePostStartBasic, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_start_basic[TResponse, TContext](params: LicensePostStartBasic, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_basic[TResponse, TContext](
    params: LicensePostStartBasic,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def post_start_trial[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_trial[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_start_trial[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_trial[TResponse, TContext](params: LicensePostStartTrial): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_trial[TResponse, TContext](params: LicensePostStartTrial, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_start_trial[TResponse, TContext](params: LicensePostStartTrial, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_start_trial[TResponse, TContext](
    params: LicensePostStartTrial,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
