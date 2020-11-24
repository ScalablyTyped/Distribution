package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.CatAliases
import typings.elasticElasticsearch.requestParamsMod.CatAllocation
import typings.elasticElasticsearch.requestParamsMod.CatCount
import typings.elasticElasticsearch.requestParamsMod.CatFielddata
import typings.elasticElasticsearch.requestParamsMod.CatHealth
import typings.elasticElasticsearch.requestParamsMod.CatHelp
import typings.elasticElasticsearch.requestParamsMod.CatIndices
import typings.elasticElasticsearch.requestParamsMod.CatMaster
import typings.elasticElasticsearch.requestParamsMod.CatMlDataFrameAnalytics
import typings.elasticElasticsearch.requestParamsMod.CatMlDatafeeds
import typings.elasticElasticsearch.requestParamsMod.CatMlJobs
import typings.elasticElasticsearch.requestParamsMod.CatMlTrainedModels
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
import typings.elasticElasticsearch.requestParamsMod.CatTransforms
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aliases extends js.Object {
  
  def aliases[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def aliases[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def aliases[TResponse, TContext](params: CatAliases): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def aliases[TResponse, TContext](params: CatAliases, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def allocation[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation[TResponse, TContext](params: CatAllocation): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def allocation[TResponse, TContext](params: CatAllocation, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def count[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TContext](params: CatCount): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TContext](params: CatCount, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def fielddata[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fielddata[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fielddata[TResponse, TContext](params: CatFielddata): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fielddata[TResponse, TContext](params: CatFielddata, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def health[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: CatHealth): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def health[TResponse, TContext](params: CatHealth, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def help[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def help[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def help[TResponse, TContext](params: CatHelp): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def help[TResponse, TContext](params: CatHelp, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def indices[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def indices[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def indices[TResponse, TContext](params: CatIndices): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def indices[TResponse, TContext](params: CatIndices, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def master[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def master[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def master[TResponse, TContext](params: CatMaster): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def master[TResponse, TContext](params: CatMaster, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def mlDataFrameAnalytics[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDataFrameAnalytics[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDataFrameAnalytics[TResponse, TContext](params: CatMlDataFrameAnalytics): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDataFrameAnalytics[TResponse, TContext](params: CatMlDataFrameAnalytics, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def mlDatafeeds[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDatafeeds[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDatafeeds[TResponse, TContext](params: CatMlDatafeeds): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlDatafeeds[TResponse, TContext](params: CatMlDatafeeds, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def mlJobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlJobs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlJobs[TResponse, TContext](params: CatMlJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlJobs[TResponse, TContext](params: CatMlJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def mlTrainedModels[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlTrainedModels[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlTrainedModels[TResponse, TContext](params: CatMlTrainedModels): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mlTrainedModels[TResponse, TContext](params: CatMlTrainedModels, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def nodeattrs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodeattrs[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodeattrs[TResponse, TContext](params: CatNodeattrs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodeattrs[TResponse, TContext](params: CatNodeattrs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def nodes[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodes[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodes[TResponse, TContext](params: CatNodes): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def nodes[TResponse, TContext](params: CatNodes, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def pendingTasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: CatPendingTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pendingTasks[TResponse, TContext](params: CatPendingTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def plugins[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def plugins[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def plugins[TResponse, TContext](params: CatPlugins): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def plugins[TResponse, TContext](params: CatPlugins, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def recovery[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: CatRecovery): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def recovery[TResponse, TContext](params: CatRecovery, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def repositories[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositories[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositories[TResponse, TContext](params: CatRepositories): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositories[TResponse, TContext](params: CatRepositories, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def segments[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: CatSegments): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def segments[TResponse, TContext](params: CatSegments, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def shards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shards[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shards[TResponse, TContext](params: CatShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def shards[TResponse, TContext](params: CatShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def snapshots[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def snapshots[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def snapshots[TResponse, TContext](params: CatSnapshots): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def snapshots[TResponse, TContext](params: CatSnapshots, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def tasks[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def tasks[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def tasks[TResponse, TContext](params: CatTasks): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def tasks[TResponse, TContext](params: CatTasks, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def templates[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def templates[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def templates[TResponse, TContext](params: CatTemplates): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def templates[TResponse, TContext](params: CatTemplates, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def threadPool[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def threadPool[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def threadPool[TResponse, TContext](params: CatThreadPool): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def threadPool[TResponse, TContext](params: CatThreadPool, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def transforms[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def transforms[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def transforms[TResponse, TContext](params: CatTransforms): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def transforms[TResponse, TContext](params: CatTransforms, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
