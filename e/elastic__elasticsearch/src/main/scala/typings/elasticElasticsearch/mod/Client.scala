package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.anon.AckWatch
import typings.elasticElasticsearch.anon.Aliases
import typings.elasticElasticsearch.anon.AllocationExplain
import typings.elasticElasticsearch.anon.Analyze
import typings.elasticElasticsearch.anon.Authenticate
import typings.elasticElasticsearch.anon.Bulk
import typings.elasticElasticsearch.anon.Cancel
import typings.elasticElasticsearch.anon.Certificates
import typings.elasticElasticsearch.anon.CleanupRepository
import typings.elasticElasticsearch.anon.ClearCursor
import typings.elasticElasticsearch.anon.CloseJob
import typings.elasticElasticsearch.anon.Delete
import typings.elasticElasticsearch.anon.DeleteAutoFollowPattern
import typings.elasticElasticsearch.anon.DeleteJob
import typings.elasticElasticsearch.anon.DeleteLifecycle_
import typings.elasticElasticsearch.anon.DeletePipeline
import typings.elasticElasticsearch.anon.DeletePolicy
import typings.elasticElasticsearch.anon.DeleteTransform
import typings.elasticElasticsearch.anon.Deletelifecycle
import typings.elasticElasticsearch.anon.Deprecations
import typings.elasticElasticsearch.anon.Explore
import typings.elasticElasticsearch.anon.Force
import typings.elasticElasticsearch.anon.Get
import typings.elasticElasticsearch.anon.GetAutoscalingDecision
import typings.elasticElasticsearch.anon.HotThreads
import typings.elasticElasticsearch.anon.Info
import typings.elasticElasticsearch.anon.Search
import typings.elasticElasticsearch.helpersMod.default
import typings.elasticElasticsearch.requestParamsMod.ClearScroll
import typings.elasticElasticsearch.requestParamsMod.Count
import typings.elasticElasticsearch.requestParamsMod.Create
import typings.elasticElasticsearch.requestParamsMod.DeleteByQuery
import typings.elasticElasticsearch.requestParamsMod.DeleteByQueryRethrottle
import typings.elasticElasticsearch.requestParamsMod.DeleteScript
import typings.elasticElasticsearch.requestParamsMod.Exists
import typings.elasticElasticsearch.requestParamsMod.ExistsSource
import typings.elasticElasticsearch.requestParamsMod.Explain
import typings.elasticElasticsearch.requestParamsMod.FieldCaps
import typings.elasticElasticsearch.requestParamsMod.GetScript
import typings.elasticElasticsearch.requestParamsMod.GetScriptContext
import typings.elasticElasticsearch.requestParamsMod.GetScriptLanguages
import typings.elasticElasticsearch.requestParamsMod.GetSource
import typings.elasticElasticsearch.requestParamsMod.Index
import typings.elasticElasticsearch.requestParamsMod.Mget
import typings.elasticElasticsearch.requestParamsMod.Msearch
import typings.elasticElasticsearch.requestParamsMod.MsearchTemplate
import typings.elasticElasticsearch.requestParamsMod.Mtermvectors
import typings.elasticElasticsearch.requestParamsMod.Ping
import typings.elasticElasticsearch.requestParamsMod.PutScript
import typings.elasticElasticsearch.requestParamsMod.RankEval
import typings.elasticElasticsearch.requestParamsMod.Reindex
import typings.elasticElasticsearch.requestParamsMod.ReindexRethrottle
import typings.elasticElasticsearch.requestParamsMod.RenderSearchTemplate
import typings.elasticElasticsearch.requestParamsMod.ScriptsPainlessExecute
import typings.elasticElasticsearch.requestParamsMod.Scroll
import typings.elasticElasticsearch.requestParamsMod.SearchShards
import typings.elasticElasticsearch.requestParamsMod.SearchTemplate
import typings.elasticElasticsearch.requestParamsMod.Termvectors
import typings.elasticElasticsearch.requestParamsMod.Update
import typings.elasticElasticsearch.requestParamsMod.UpdateByQuery
import typings.elasticElasticsearch.requestParamsMod.UpdateByQueryRethrottle
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.RequestNDBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "Client")
@js.native
class Client () extends EventEmitter {
  def this(opts: ClientOptions) = this()
  var asyncSearch: Delete = js.native
  /* GENERATED */
  var async_search: Delete = js.native
  var autoscaling: GetAutoscalingDecision = js.native
  var cat: Aliases = js.native
  var ccr: DeleteAutoFollowPattern = js.native
  var cluster: AllocationExplain = js.native
  var connectionPool: typings.elasticElasticsearch.poolMod.ConnectionPool = js.native
  var enrich: DeletePolicy = js.native
  var eql: Search = js.native
  @JSName("extend")
  var extend_Original: ClientExtends = js.native
  var graph: Explore = js.native
  var helpers: default = js.native
  var ilm: DeleteLifecycle_ = js.native
  var indices: Analyze = js.native
  var ingest: DeletePipeline = js.native
  var license: Get = js.native
  var migration: Deprecations = js.native
  var ml: CloseJob = js.native
  var monitoring: Bulk = js.native
  var nodes: HotThreads = js.native
  var rollup: DeleteJob = js.native
  var security: Authenticate = js.native
  var serializer: typings.elasticElasticsearch.serializerMod.default = js.native
  var slm: Deletelifecycle = js.native
  var snapshot: CleanupRepository = js.native
  var sql: ClearCursor = js.native
  var ssl: Certificates = js.native
  var tasks: Cancel = js.native
  var transform: DeleteTransform = js.native
  var transport: typings.elasticElasticsearch.transportMod.default = js.native
  var watcher: AckWatch = js.native
  var xpack: Info = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: typings.elasticElasticsearch.requestParamsMod.Bulk[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Bulk[TRequestBody],
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Bulk[TRequestBody],
    options: TransportRequestOptions
  ): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Bulk[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def child(): Client = js.native
  def child(opts: ClientOptions): Client = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClearScroll[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ClearScroll[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def close(): js.Promise[Unit] | Unit = js.native
  def close(callback: js.Function): js.Promise[Unit] | Unit = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Count[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Create[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Delete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Delete,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Delete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Delete,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: DeleteByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deleteByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQueryRethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteByQueryRethrottle[TResponse, TContext](
    params: DeleteByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def deleteScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteScript[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteScript[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: DeleteByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_by_query_rethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query_rethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query_rethrottle[TResponse, TContext](params: DeleteByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query_rethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_by_query_rethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_by_query_rethrottle[TResponse, TContext](
    params: DeleteByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def delete_script[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_script[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_script[TResponse, TContext](params: DeleteScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_script[TResponse, TContext](params: DeleteScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_script[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_script[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists[TResponse, TContext](params: Exists): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: Exists, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists[TResponse, TContext](params: Exists, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists[TResponse, TContext](params: Exists, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsSource[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsSource[TResponse, TContext](params: ExistsSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsSource[TResponse, TContext](params: ExistsSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def existsSource[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def existsSource[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_source[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_source[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_source[TResponse, TContext](params: ExistsSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_source[TResponse, TContext](params: ExistsSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def exists_source[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def exists_source[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Explain[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def extend(method: String, fn: extendsCallback): Unit = js.native
  def extend(method: String, opts: Force, fn: extendsCallback): Unit = js.native
  def fieldCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fieldCaps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def fieldCaps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def field_caps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def field_caps[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def field_caps[TResponse, TContext](params: FieldCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def field_caps[TResponse, TContext](params: FieldCaps, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def field_caps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def field_caps[TResponse, TContext](params: FieldCaps, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Get): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Get,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Get, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Get,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScript[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScript[TResponse, TContext](params: GetScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScript[TResponse, TContext](params: GetScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScript[TResponse, TContext](params: GetScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScript[TResponse, TContext](params: GetScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptContext[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptContext[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptContext[TResponse, TContext](params: GetScriptContext): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptContext[TResponse, TContext](params: GetScriptContext, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptContext[TResponse, TContext](params: GetScriptContext, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptContext[TResponse, TContext](
    params: GetScriptContext,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getScriptLanguages[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptLanguages[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getScriptLanguages[TResponse, TContext](
    params: GetScriptLanguages,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def getSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSource[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSource[TResponse, TContext](params: GetSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSource[TResponse, TContext](params: GetSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getSource[TResponse, TContext](params: GetSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getSource[TResponse, TContext](params: GetSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script[TResponse, TContext](params: GetScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script[TResponse, TContext](params: GetScript, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script[TResponse, TContext](params: GetScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script[TResponse, TContext](params: GetScript, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_context[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_context[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_context[TResponse, TContext](params: GetScriptContext): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_context[TResponse, TContext](params: GetScriptContext, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_context[TResponse, TContext](params: GetScriptContext, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_context[TResponse, TContext](
    params: GetScriptContext,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_script_languages[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_languages[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_languages[TResponse, TContext](params: GetScriptLanguages): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_languages[TResponse, TContext](params: GetScriptLanguages, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_script_languages[TResponse, TContext](params: GetScriptLanguages, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_script_languages[TResponse, TContext](
    params: GetScriptLanguages,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def get_source[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_source[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_source[TResponse, TContext](params: GetSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_source[TResponse, TContext](params: GetSource, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_source[TResponse, TContext](params: GetSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_source[TResponse, TContext](params: GetSource, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Index[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Info): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Info,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def info[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Info, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def info[TResponse, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Info,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Mget[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: Msearch[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: MsearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def msearch_template[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](
    params: MsearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Mtermvectors[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def ping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ping[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ping[TResponse, TContext](params: Ping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ping[TResponse, TContext](params: Ping, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def ping[TResponse, TContext](params: Ping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def ping[TResponse, TContext](params: Ping, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: PutScript[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_script[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: PutScript[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RankEval[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rank_eval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RankEval[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Reindex[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def reindexRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindexRethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindexRethrottle[TResponse, TContext](
    params: ReindexRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def reindex_rethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex_rethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex_rethrottle[TResponse, TContext](params: ReindexRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex_rethrottle[TResponse, TContext](params: ReindexRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def reindex_rethrottle[TResponse, TContext](params: ReindexRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def reindex_rethrottle[TResponse, TContext](
    params: ReindexRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RenderSearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def render_search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: RenderSearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ScriptsPainlessExecute[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scripts_painless_execute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: ScriptsPainlessExecute[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Scroll[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: typings.elasticElasticsearch.requestParamsMod.Search[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Search[TRequestBody],
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Search[TRequestBody],
    options: TransportRequestOptions
  ): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: typings.elasticElasticsearch.requestParamsMod.Search[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def searchShards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchShards[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchShards[TResponse, TContext](params: SearchShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchShards[TResponse, TContext](params: SearchShards, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchShards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchShards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def search_shards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_shards[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_shards[TResponse, TContext](params: SearchShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_shards[TResponse, TContext](params: SearchShards, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_shards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_shards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def search_template[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SearchTemplate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Termvectors[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: Update[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: UpdateByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def updateByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQueryRethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def updateByQueryRethrottle[TResponse, TContext](
    params: UpdateByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: UpdateByQuery[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def update_by_query_rethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query_rethrottle[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query_rethrottle[TResponse, TContext](params: UpdateByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query_rethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def update_by_query_rethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def update_by_query_rethrottle[TResponse, TContext](
    params: UpdateByQueryRethrottle,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

