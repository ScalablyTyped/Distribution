package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.ClusterAllocationExplain
import typings.elasticElasticsearch.requestParamsMod.ClusterDeleteComponentTemplate
import typings.elasticElasticsearch.requestParamsMod.ClusterDeleteVotingConfigExclusions
import typings.elasticElasticsearch.requestParamsMod.ClusterExistsComponentTemplate
import typings.elasticElasticsearch.requestParamsMod.ClusterGetComponentTemplate
import typings.elasticElasticsearch.requestParamsMod.ClusterGetSettings
import typings.elasticElasticsearch.requestParamsMod.ClusterHealth
import typings.elasticElasticsearch.requestParamsMod.ClusterPendingTasks
import typings.elasticElasticsearch.requestParamsMod.ClusterPostVotingConfigExclusions
import typings.elasticElasticsearch.requestParamsMod.ClusterPutComponentTemplate
import typings.elasticElasticsearch.requestParamsMod.ClusterPutSettings
import typings.elasticElasticsearch.requestParamsMod.ClusterRemoteInfo
import typings.elasticElasticsearch.requestParamsMod.ClusterReroute
import typings.elasticElasticsearch.requestParamsMod.ClusterState
import typings.elasticElasticsearch.requestParamsMod.ClusterStats
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
trait Allocationexplain extends StObject {
  
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterAllocationExplain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterAllocationExplain[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterAllocationExplain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: ClusterAllocationExplain[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterAllocationExplain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterAllocationExplain[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterAllocationExplain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation_explain[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: ClusterAllocationExplain[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteComponentTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](
    params: ClusterDeleteComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](
    params: ClusterDeleteVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_component_template[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_component_template[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](params: ClusterDeleteComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](params: ClusterDeleteComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_component_template[TResponse, TContext](params: ClusterDeleteComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_component_template[TResponse, TContext](
    params: ClusterDeleteComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_voting_config_exclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_voting_config_exclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_voting_config_exclusions[TResponse, TContext](
    params: ClusterDeleteVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def existsComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsComponentTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](
    params: ClusterExistsComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def exists_component_template[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_component_template[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](params: ClusterExistsComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](params: ClusterExistsComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_component_template[TResponse, TContext](params: ClusterExistsComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_component_template[TResponse, TContext](
    params: ClusterExistsComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getComponentTemplate[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](
    params: ClusterGetComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getSettings[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSettings[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](
    params: ClusterGetSettings,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_component_template[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_component_template[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](params: ClusterGetComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](params: ClusterGetComponentTemplate, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_component_template[TResponse, TContext](params: ClusterGetComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_component_template[TResponse, TContext](
    params: ClusterGetComponentTemplate,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_settings[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_settings[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](params: ClusterGetSettings): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](params: ClusterGetSettings, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_settings[TResponse, TContext](params: ClusterGetSettings, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_settings[TResponse, TContext](
    params: ClusterGetSettings,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def health[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def health[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def health[TResponse, TContext](params: ClusterHealth, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def pendingTasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pendingTasks[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](
    params: ClusterPendingTasks,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pending_tasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pending_tasks[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](params: ClusterPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](params: ClusterPendingTasks, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pending_tasks[TResponse, TContext](params: ClusterPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pending_tasks[TResponse, TContext](
    params: ClusterPendingTasks,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def postVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](
    params: ClusterPostVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def post_voting_config_exclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def post_voting_config_exclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def post_voting_config_exclusions[TResponse, TContext](
    params: ClusterPostVotingConfigExclusions,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: ClusterPutComponentTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutSettings[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: ClusterPutSettings[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_component_template[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: ClusterPutComponentTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutSettings[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterPutSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_settings[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: ClusterPutSettings[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def remoteInfo[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remoteInfo[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](
    params: ClusterRemoteInfo,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def remote_info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remote_info[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](params: ClusterRemoteInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](params: ClusterRemoteInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def remote_info[TResponse, TContext](params: ClusterRemoteInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remote_info[TResponse, TContext](
    params: ClusterRemoteInfo,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterReroute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterReroute[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: ClusterReroute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](
    params: ClusterReroute[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def state[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def state[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def state[TResponse, TContext](params: ClusterState, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: ClusterStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
