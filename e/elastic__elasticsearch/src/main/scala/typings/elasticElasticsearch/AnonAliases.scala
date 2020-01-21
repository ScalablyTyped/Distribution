package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.CatAliases
import typings.elasticElasticsearch.requestParamsMod.CatAllocation
import typings.elasticElasticsearch.requestParamsMod.CatCount
import typings.elasticElasticsearch.requestParamsMod.CatFielddata
import typings.elasticElasticsearch.requestParamsMod.CatHealth
import typings.elasticElasticsearch.requestParamsMod.CatHelp
import typings.elasticElasticsearch.requestParamsMod.CatIndices
import typings.elasticElasticsearch.requestParamsMod.CatMaster
import typings.elasticElasticsearch.requestParamsMod.CatNodeattrs
import typings.elasticElasticsearch.requestParamsMod.CatNodes
import typings.elasticElasticsearch.requestParamsMod.CatPendingTasks
import typings.elasticElasticsearch.requestParamsMod.CatPlugins
import typings.elasticElasticsearch.requestParamsMod.CatRecovery
import typings.elasticElasticsearch.requestParamsMod.CatRepositories
import typings.elasticElasticsearch.requestParamsMod.CatSegments
import typings.elasticElasticsearch.requestParamsMod.CatShards
import typings.elasticElasticsearch.requestParamsMod.CatSnapshots
import typings.elasticElasticsearch.requestParamsMod.CatTasks
import typings.elasticElasticsearch.requestParamsMod.CatTemplates
import typings.elasticElasticsearch.requestParamsMod.CatThreadPool
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAliases extends js.Object {
  @JSName("aliases")
  var aliases_Original: ApiMethod[CatAliases, _] = js.native
  @JSName("allocation")
  var allocation_Original: ApiMethod[CatAllocation, _] = js.native
  @JSName("count")
  var count_Original: ApiMethod[CatCount, _] = js.native
  @JSName("fielddata")
  var fielddata_Original: ApiMethod[CatFielddata, _] = js.native
  @JSName("health")
  var health_Original: ApiMethod[CatHealth, _] = js.native
  @JSName("help")
  var help_Original: ApiMethod[CatHelp, _] = js.native
  @JSName("indices")
  var indices_Original: ApiMethod[CatIndices, _] = js.native
  @JSName("master")
  var master_Original: ApiMethod[CatMaster, _] = js.native
  @JSName("nodeattrs")
  var nodeattrs_Original: ApiMethod[CatNodeattrs, _] = js.native
  @JSName("nodes")
  var nodes_Original: ApiMethod[CatNodes, _] = js.native
  @JSName("pendingTasks")
  var pendingTasks_Original: ApiMethod[CatPendingTasks, _] = js.native
  @JSName("pending_tasks")
  var pending_tasks_Original: ApiMethod[CatPendingTasks, _] = js.native
  @JSName("plugins")
  var plugins_Original: ApiMethod[CatPlugins, _] = js.native
  @JSName("recovery")
  var recovery_Original: ApiMethod[CatRecovery, _] = js.native
  @JSName("repositories")
  var repositories_Original: ApiMethod[CatRepositories, _] = js.native
  @JSName("segments")
  var segments_Original: ApiMethod[CatSegments, _] = js.native
  @JSName("shards")
  var shards_Original: ApiMethod[CatShards, _] = js.native
  @JSName("snapshots")
  var snapshots_Original: ApiMethod[CatSnapshots, _] = js.native
  @JSName("tasks")
  var tasks_Original: ApiMethod[CatTasks, _] = js.native
  @JSName("templates")
  var templates_Original: ApiMethod[CatTemplates, _] = js.native
  @JSName("threadPool")
  var threadPool_Original: ApiMethod[CatThreadPool, _] = js.native
  @JSName("thread_pool")
  var thread_pool_Original: ApiMethod[CatThreadPool, _] = js.native
  // Promise API
  def aliases(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def aliases(callback: callbackFn[_]): TransportRequestCallback = js.native
  def aliases(params: CatAliases): js.Promise[ApiResponse[_, _]] = js.native
  def aliases(params: CatAliases, callback: callbackFn[_]): TransportRequestCallback = js.native
  def aliases(params: CatAliases, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def aliases(params: CatAliases, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def allocation(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def allocation(callback: callbackFn[_]): TransportRequestCallback = js.native
  def allocation(params: CatAllocation): js.Promise[ApiResponse[_, _]] = js.native
  def allocation(params: CatAllocation, callback: callbackFn[_]): TransportRequestCallback = js.native
  def allocation(params: CatAllocation, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def allocation(params: CatAllocation, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def count(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def count(callback: callbackFn[_]): TransportRequestCallback = js.native
  def count(params: CatCount): js.Promise[ApiResponse[_, _]] = js.native
  def count(params: CatCount, callback: callbackFn[_]): TransportRequestCallback = js.native
  def count(params: CatCount, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def count(params: CatCount, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def fielddata(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def fielddata(callback: callbackFn[_]): TransportRequestCallback = js.native
  def fielddata(params: CatFielddata): js.Promise[ApiResponse[_, _]] = js.native
  def fielddata(params: CatFielddata, callback: callbackFn[_]): TransportRequestCallback = js.native
  def fielddata(params: CatFielddata, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def fielddata(params: CatFielddata, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def health(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def health(callback: callbackFn[_]): TransportRequestCallback = js.native
  def health(params: CatHealth): js.Promise[ApiResponse[_, _]] = js.native
  def health(params: CatHealth, callback: callbackFn[_]): TransportRequestCallback = js.native
  def health(params: CatHealth, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def health(params: CatHealth, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def help(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def help(callback: callbackFn[_]): TransportRequestCallback = js.native
  def help(params: CatHelp): js.Promise[ApiResponse[_, _]] = js.native
  def help(params: CatHelp, callback: callbackFn[_]): TransportRequestCallback = js.native
  def help(params: CatHelp, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def help(params: CatHelp, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def indices(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def indices(callback: callbackFn[_]): TransportRequestCallback = js.native
  def indices(params: CatIndices): js.Promise[ApiResponse[_, _]] = js.native
  def indices(params: CatIndices, callback: callbackFn[_]): TransportRequestCallback = js.native
  def indices(params: CatIndices, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def indices(params: CatIndices, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def master(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def master(callback: callbackFn[_]): TransportRequestCallback = js.native
  def master(params: CatMaster): js.Promise[ApiResponse[_, _]] = js.native
  def master(params: CatMaster, callback: callbackFn[_]): TransportRequestCallback = js.native
  def master(params: CatMaster, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def master(params: CatMaster, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def nodeattrs(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def nodeattrs(callback: callbackFn[_]): TransportRequestCallback = js.native
  def nodeattrs(params: CatNodeattrs): js.Promise[ApiResponse[_, _]] = js.native
  def nodeattrs(params: CatNodeattrs, callback: callbackFn[_]): TransportRequestCallback = js.native
  def nodeattrs(params: CatNodeattrs, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def nodeattrs(params: CatNodeattrs, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def nodes(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def nodes(callback: callbackFn[_]): TransportRequestCallback = js.native
  def nodes(params: CatNodes): js.Promise[ApiResponse[_, _]] = js.native
  def nodes(params: CatNodes, callback: callbackFn[_]): TransportRequestCallback = js.native
  def nodes(params: CatNodes, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def nodes(params: CatNodes, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pendingTasks(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pendingTasks(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pendingTasks(params: CatPendingTasks): js.Promise[ApiResponse[_, _]] = js.native
  def pendingTasks(params: CatPendingTasks, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pendingTasks(params: CatPendingTasks, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pendingTasks(params: CatPendingTasks, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pending_tasks(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pending_tasks(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pending_tasks(params: CatPendingTasks): js.Promise[ApiResponse[_, _]] = js.native
  def pending_tasks(params: CatPendingTasks, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pending_tasks(params: CatPendingTasks, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pending_tasks(params: CatPendingTasks, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def plugins(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def plugins(callback: callbackFn[_]): TransportRequestCallback = js.native
  def plugins(params: CatPlugins): js.Promise[ApiResponse[_, _]] = js.native
  def plugins(params: CatPlugins, callback: callbackFn[_]): TransportRequestCallback = js.native
  def plugins(params: CatPlugins, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def plugins(params: CatPlugins, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def recovery(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def recovery(callback: callbackFn[_]): TransportRequestCallback = js.native
  def recovery(params: CatRecovery): js.Promise[ApiResponse[_, _]] = js.native
  def recovery(params: CatRecovery, callback: callbackFn[_]): TransportRequestCallback = js.native
  def recovery(params: CatRecovery, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def recovery(params: CatRecovery, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def repositories(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def repositories(callback: callbackFn[_]): TransportRequestCallback = js.native
  def repositories(params: CatRepositories): js.Promise[ApiResponse[_, _]] = js.native
  def repositories(params: CatRepositories, callback: callbackFn[_]): TransportRequestCallback = js.native
  def repositories(params: CatRepositories, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def repositories(params: CatRepositories, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def segments(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def segments(callback: callbackFn[_]): TransportRequestCallback = js.native
  def segments(params: CatSegments): js.Promise[ApiResponse[_, _]] = js.native
  def segments(params: CatSegments, callback: callbackFn[_]): TransportRequestCallback = js.native
  def segments(params: CatSegments, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def segments(params: CatSegments, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def shards(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def shards(callback: callbackFn[_]): TransportRequestCallback = js.native
  def shards(params: CatShards): js.Promise[ApiResponse[_, _]] = js.native
  def shards(params: CatShards, callback: callbackFn[_]): TransportRequestCallback = js.native
  def shards(params: CatShards, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def shards(params: CatShards, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def snapshots(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def snapshots(callback: callbackFn[_]): TransportRequestCallback = js.native
  def snapshots(params: CatSnapshots): js.Promise[ApiResponse[_, _]] = js.native
  def snapshots(params: CatSnapshots, callback: callbackFn[_]): TransportRequestCallback = js.native
  def snapshots(params: CatSnapshots, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def snapshots(params: CatSnapshots, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def tasks(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def tasks(callback: callbackFn[_]): TransportRequestCallback = js.native
  def tasks(params: CatTasks): js.Promise[ApiResponse[_, _]] = js.native
  def tasks(params: CatTasks, callback: callbackFn[_]): TransportRequestCallback = js.native
  def tasks(params: CatTasks, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def tasks(params: CatTasks, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def templates(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def templates(callback: callbackFn[_]): TransportRequestCallback = js.native
  def templates(params: CatTemplates): js.Promise[ApiResponse[_, _]] = js.native
  def templates(params: CatTemplates, callback: callbackFn[_]): TransportRequestCallback = js.native
  def templates(params: CatTemplates, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def templates(params: CatTemplates, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def threadPool(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def threadPool(callback: callbackFn[_]): TransportRequestCallback = js.native
  def threadPool(params: CatThreadPool): js.Promise[ApiResponse[_, _]] = js.native
  def threadPool(params: CatThreadPool, callback: callbackFn[_]): TransportRequestCallback = js.native
  def threadPool(params: CatThreadPool, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def threadPool(params: CatThreadPool, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def thread_pool(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def thread_pool(callback: callbackFn[_]): TransportRequestCallback = js.native
  def thread_pool(params: CatThreadPool): js.Promise[ApiResponse[_, _]] = js.native
  def thread_pool(params: CatThreadPool, callback: callbackFn[_]): TransportRequestCallback = js.native
  def thread_pool(params: CatThreadPool, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def thread_pool(params: CatThreadPool, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

