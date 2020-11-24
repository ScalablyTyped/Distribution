package typings.elasticElasticsearch.anon

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
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllocationExplain_ extends js.Object {
  
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocationExplain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterAllocationExplain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteComponentTemplate[TResponse, TContext](params: ClusterDeleteComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def deleteVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteVotingConfigExclusions[TResponse, TContext](params: ClusterDeleteVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def existsComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsComponentTemplate[TResponse, TContext](params: ClusterExistsComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getComponentTemplate[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getComponentTemplate[TResponse, TContext](params: ClusterGetComponentTemplate, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getSettings[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSettings[TResponse, TContext](params: ClusterGetSettings, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def health[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: ClusterHealth, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def pendingTasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: ClusterPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def postVotingConfigExclusions[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def postVotingConfigExclusions[TResponse, TContext](params: ClusterPostVotingConfigExclusions, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putComponentTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutComponentTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putSettings[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterPutSettings[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def remoteInfo[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def remoteInfo[TResponse, TContext](params: ClusterRemoteInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterReroute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reroute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClusterReroute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def state[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def state[TResponse, TContext](params: ClusterState, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: ClusterStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
