package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.ClusterAllocationExplain
import typings.elasticElasticsearch.requestParamsMod.ClusterGetSettings
import typings.elasticElasticsearch.requestParamsMod.ClusterHealth
import typings.elasticElasticsearch.requestParamsMod.ClusterPendingTasks
import typings.elasticElasticsearch.requestParamsMod.ClusterPutSettings
import typings.elasticElasticsearch.requestParamsMod.ClusterRemoteInfo
import typings.elasticElasticsearch.requestParamsMod.ClusterReroute
import typings.elasticElasticsearch.requestParamsMod.ClusterState
import typings.elasticElasticsearch.requestParamsMod.ClusterStats
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllocationExplain extends js.Object {
  @JSName("allocationExplain")
  var allocationExplain_Original: ApiMethod[ClusterAllocationExplain[_], _] = js.native
  @JSName("allocation_explain")
  var allocation_explain_Original: ApiMethod[ClusterAllocationExplain[_], _] = js.native
  @JSName("getSettings")
  var getSettings_Original: ApiMethod[ClusterGetSettings, _] = js.native
  @JSName("get_settings")
  var get_settings_Original: ApiMethod[ClusterGetSettings, _] = js.native
  @JSName("health")
  var health_Original: ApiMethod[ClusterHealth, _] = js.native
  @JSName("pendingTasks")
  var pendingTasks_Original: ApiMethod[ClusterPendingTasks, _] = js.native
  @JSName("pending_tasks")
  var pending_tasks_Original: ApiMethod[ClusterPendingTasks, _] = js.native
  @JSName("putSettings")
  var putSettings_Original: ApiMethod[ClusterPutSettings[_], _] = js.native
  @JSName("put_settings")
  var put_settings_Original: ApiMethod[ClusterPutSettings[_], _] = js.native
  @JSName("remoteInfo")
  var remoteInfo_Original: ApiMethod[ClusterRemoteInfo, _] = js.native
  @JSName("remote_info")
  var remote_info_Original: ApiMethod[ClusterRemoteInfo, _] = js.native
  @JSName("reroute")
  var reroute_Original: ApiMethod[ClusterReroute[_], _] = js.native
  @JSName("state")
  var state_Original: ApiMethod[ClusterState, _] = js.native
  @JSName("stats")
  var stats_Original: ApiMethod[ClusterStats, _] = js.native
  // Promise API
  def allocationExplain(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def allocationExplain(callback: callbackFn[_]): TransportRequestCallback = js.native
  def allocationExplain(params: ClusterAllocationExplain[_]): js.Promise[ApiResponse[_, _]] = js.native
  def allocationExplain(params: ClusterAllocationExplain[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def allocationExplain(params: ClusterAllocationExplain[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def allocationExplain(params: ClusterAllocationExplain[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def allocation_explain(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def allocation_explain(callback: callbackFn[_]): TransportRequestCallback = js.native
  def allocation_explain(params: ClusterAllocationExplain[_]): js.Promise[ApiResponse[_, _]] = js.native
  def allocation_explain(params: ClusterAllocationExplain[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def allocation_explain(params: ClusterAllocationExplain[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def allocation_explain(params: ClusterAllocationExplain[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getSettings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getSettings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getSettings(params: ClusterGetSettings): js.Promise[ApiResponse[_, _]] = js.native
  def getSettings(params: ClusterGetSettings, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getSettings(params: ClusterGetSettings, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getSettings(params: ClusterGetSettings, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_settings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_settings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_settings(params: ClusterGetSettings): js.Promise[ApiResponse[_, _]] = js.native
  def get_settings(params: ClusterGetSettings, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_settings(params: ClusterGetSettings, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_settings(params: ClusterGetSettings, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def health(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def health(callback: callbackFn[_]): TransportRequestCallback = js.native
  def health(params: ClusterHealth): js.Promise[ApiResponse[_, _]] = js.native
  def health(params: ClusterHealth, callback: callbackFn[_]): TransportRequestCallback = js.native
  def health(params: ClusterHealth, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def health(params: ClusterHealth, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pendingTasks(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pendingTasks(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pendingTasks(params: ClusterPendingTasks): js.Promise[ApiResponse[_, _]] = js.native
  def pendingTasks(params: ClusterPendingTasks, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pendingTasks(params: ClusterPendingTasks, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pendingTasks(params: ClusterPendingTasks, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pending_tasks(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pending_tasks(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pending_tasks(params: ClusterPendingTasks): js.Promise[ApiResponse[_, _]] = js.native
  def pending_tasks(params: ClusterPendingTasks, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pending_tasks(params: ClusterPendingTasks, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pending_tasks(params: ClusterPendingTasks, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putSettings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putSettings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putSettings(params: ClusterPutSettings[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putSettings(params: ClusterPutSettings[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putSettings(params: ClusterPutSettings[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putSettings(params: ClusterPutSettings[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_settings(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_settings(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_settings(params: ClusterPutSettings[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_settings(params: ClusterPutSettings[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_settings(params: ClusterPutSettings[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_settings(params: ClusterPutSettings[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def remoteInfo(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def remoteInfo(callback: callbackFn[_]): TransportRequestCallback = js.native
  def remoteInfo(params: ClusterRemoteInfo): js.Promise[ApiResponse[_, _]] = js.native
  def remoteInfo(params: ClusterRemoteInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def remoteInfo(params: ClusterRemoteInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def remoteInfo(params: ClusterRemoteInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def remote_info(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def remote_info(callback: callbackFn[_]): TransportRequestCallback = js.native
  def remote_info(params: ClusterRemoteInfo): js.Promise[ApiResponse[_, _]] = js.native
  def remote_info(params: ClusterRemoteInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def remote_info(params: ClusterRemoteInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def remote_info(params: ClusterRemoteInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reroute(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reroute(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reroute(params: ClusterReroute[_]): js.Promise[ApiResponse[_, _]] = js.native
  def reroute(params: ClusterReroute[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def reroute(params: ClusterReroute[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reroute(params: ClusterReroute[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def state(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def state(callback: callbackFn[_]): TransportRequestCallback = js.native
  def state(params: ClusterState): js.Promise[ApiResponse[_, _]] = js.native
  def state(params: ClusterState, callback: callbackFn[_]): TransportRequestCallback = js.native
  def state(params: ClusterState, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def state(params: ClusterState, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: ClusterStats): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: ClusterStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: ClusterStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: ClusterStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

