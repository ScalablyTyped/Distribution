package typings.elasticElasticsearch.mod

import typings.elasticElasticsearch.AnonAckWatch
import typings.elasticElasticsearch.AnonAliases
import typings.elasticElasticsearch.AnonAllocationExplain
import typings.elasticElasticsearch.AnonAnalyze
import typings.elasticElasticsearch.AnonAuthenticate
import typings.elasticElasticsearch.AnonBulk
import typings.elasticElasticsearch.AnonCancel
import typings.elasticElasticsearch.AnonCertificates
import typings.elasticElasticsearch.AnonCleanupRepository
import typings.elasticElasticsearch.AnonClearCursor
import typings.elasticElasticsearch.AnonCloseJob
import typings.elasticElasticsearch.AnonDelete
import typings.elasticElasticsearch.AnonDeleteAutoFollowPattern
import typings.elasticElasticsearch.AnonDeleteJob
import typings.elasticElasticsearch.AnonDeleteLifecycle
import typings.elasticElasticsearch.AnonDeleteLifecycleDeletelifecycle
import typings.elasticElasticsearch.AnonDeletePipeline
import typings.elasticElasticsearch.AnonDeletePolicy
import typings.elasticElasticsearch.AnonDeleteTransform
import typings.elasticElasticsearch.AnonDeprecations
import typings.elasticElasticsearch.AnonExplore
import typings.elasticElasticsearch.AnonForce
import typings.elasticElasticsearch.AnonHotThreads
import typings.elasticElasticsearch.AnonInfo
import typings.elasticElasticsearch.requestParamsMod.Bulk
import typings.elasticElasticsearch.requestParamsMod.ClearScroll
import typings.elasticElasticsearch.requestParamsMod.Count
import typings.elasticElasticsearch.requestParamsMod.Create
import typings.elasticElasticsearch.requestParamsMod.Delete
import typings.elasticElasticsearch.requestParamsMod.DeleteByQuery
import typings.elasticElasticsearch.requestParamsMod.DeleteByQueryRethrottle
import typings.elasticElasticsearch.requestParamsMod.DeleteScript
import typings.elasticElasticsearch.requestParamsMod.Exists
import typings.elasticElasticsearch.requestParamsMod.ExistsSource
import typings.elasticElasticsearch.requestParamsMod.Explain
import typings.elasticElasticsearch.requestParamsMod.FieldCaps
import typings.elasticElasticsearch.requestParamsMod.Get
import typings.elasticElasticsearch.requestParamsMod.GetScript
import typings.elasticElasticsearch.requestParamsMod.GetSource
import typings.elasticElasticsearch.requestParamsMod.Index
import typings.elasticElasticsearch.requestParamsMod.Info
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
import typings.elasticElasticsearch.requestParamsMod.Search
import typings.elasticElasticsearch.requestParamsMod.SearchShards
import typings.elasticElasticsearch.requestParamsMod.SearchTemplate
import typings.elasticElasticsearch.requestParamsMod.Termvectors
import typings.elasticElasticsearch.requestParamsMod.Update
import typings.elasticElasticsearch.requestParamsMod.UpdateByQuery
import typings.elasticElasticsearch.requestParamsMod.UpdateByQueryRethrottle
import typings.elasticElasticsearch.serializerMod.default
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "Client")
@js.native
class Client () extends EventEmitter {
  def this(opts: ClientOptions) = this()
  /* GENERATED */
  @JSName("bulk")
  var bulk_Original: ApiMethod[Bulk[_], _] = js.native
  var cat: AnonAliases = js.native
  var ccr: AnonDeleteAutoFollowPattern = js.native
  @JSName("clearScroll")
  var clearScroll_Original: ApiMethod[ClearScroll[_], _] = js.native
  @JSName("clear_scroll")
  var clear_scroll_Original: ApiMethod[ClearScroll[_], _] = js.native
  var cluster: AnonAllocationExplain = js.native
  var connectionPool: typings.elasticElasticsearch.poolMod.ConnectionPool = js.native
  @JSName("count")
  var count_Original: ApiMethod[Count[_], _] = js.native
  @JSName("create")
  var create_Original: ApiMethod[Create[_], _] = js.native
  @JSName("deleteByQueryRethrottle")
  var deleteByQueryRethrottle_Original: ApiMethod[DeleteByQueryRethrottle, _] = js.native
  @JSName("deleteByQuery")
  var deleteByQuery_Original: ApiMethod[DeleteByQuery[_], _] = js.native
  @JSName("deleteScript")
  var deleteScript_Original: ApiMethod[DeleteScript, _] = js.native
  @JSName("delete")
  var delete_Original: ApiMethod[Delete, _] = js.native
  @JSName("delete_by_query")
  var delete_by_query_Original: ApiMethod[DeleteByQuery[_], _] = js.native
  @JSName("delete_by_query_rethrottle")
  var delete_by_query_rethrottle_Original: ApiMethod[DeleteByQueryRethrottle, _] = js.native
  @JSName("delete_script")
  var delete_script_Original: ApiMethod[DeleteScript, _] = js.native
  var enrich: AnonDeletePolicy = js.native
  @JSName("existsSource")
  var existsSource_Original: ApiMethod[ExistsSource, _] = js.native
  @JSName("exists")
  var exists_Original: ApiMethod[Exists, _] = js.native
  @JSName("exists_source")
  var exists_source_Original: ApiMethod[ExistsSource, _] = js.native
  @JSName("explain")
  var explain_Original: ApiMethod[Explain[_], _] = js.native
  @JSName("extend")
  var extend_Original: ClientExtends = js.native
  @JSName("fieldCaps")
  var fieldCaps_Original: ApiMethod[FieldCaps, _] = js.native
  @JSName("field_caps")
  var field_caps_Original: ApiMethod[FieldCaps, _] = js.native
  @JSName("getScript")
  var getScript_Original: ApiMethod[GetScript, _] = js.native
  @JSName("getSource")
  var getSource_Original: ApiMethod[GetSource, _] = js.native
  @JSName("get")
  var get_Original: ApiMethod[Get, _] = js.native
  @JSName("get_script")
  var get_script_Original: ApiMethod[GetScript, _] = js.native
  @JSName("get_source")
  var get_source_Original: ApiMethod[GetSource, _] = js.native
  var graph: AnonExplore = js.native
  var ilm: AnonDeleteLifecycle = js.native
  @JSName("index")
  var index_Original: ApiMethod[Index[_], _] = js.native
  var indices: AnonAnalyze = js.native
  @JSName("info")
  var info_Original: ApiMethod[Info, _] = js.native
  var ingest: AnonDeletePipeline = js.native
  var license: AnonDelete = js.native
  @JSName("mget")
  var mget_Original: ApiMethod[Mget[_], _] = js.native
  var migration: AnonDeprecations = js.native
  var ml: AnonCloseJob = js.native
  var monitoring: AnonBulk = js.native
  @JSName("msearchTemplate")
  var msearchTemplate_Original: ApiMethod[MsearchTemplate[_], _] = js.native
  @JSName("msearch")
  var msearch_Original: ApiMethod[Msearch[_], _] = js.native
  @JSName("msearch_template")
  var msearch_template_Original: ApiMethod[MsearchTemplate[_], _] = js.native
  @JSName("mtermvectors")
  var mtermvectors_Original: ApiMethod[Mtermvectors[_], _] = js.native
  var nodes: AnonHotThreads = js.native
  @JSName("ping")
  var ping_Original: ApiMethod[Ping, _] = js.native
  @JSName("putScript")
  var putScript_Original: ApiMethod[PutScript[_], _] = js.native
  @JSName("put_script")
  var put_script_Original: ApiMethod[PutScript[_], _] = js.native
  @JSName("rankEval")
  var rankEval_Original: ApiMethod[RankEval[_], _] = js.native
  @JSName("rank_eval")
  var rank_eval_Original: ApiMethod[RankEval[_], _] = js.native
  @JSName("reindexRethrottle")
  var reindexRethrottle_Original: ApiMethod[ReindexRethrottle, _] = js.native
  @JSName("reindex")
  var reindex_Original: ApiMethod[Reindex[_], _] = js.native
  @JSName("reindex_rethrottle")
  var reindex_rethrottle_Original: ApiMethod[ReindexRethrottle, _] = js.native
  @JSName("renderSearchTemplate")
  var renderSearchTemplate_Original: ApiMethod[RenderSearchTemplate[_], _] = js.native
  @JSName("render_search_template")
  var render_search_template_Original: ApiMethod[RenderSearchTemplate[_], _] = js.native
  var rollup: AnonDeleteJob = js.native
  @JSName("scriptsPainlessExecute")
  var scriptsPainlessExecute_Original: ApiMethod[ScriptsPainlessExecute[_], _] = js.native
  @JSName("scripts_painless_execute")
  var scripts_painless_execute_Original: ApiMethod[ScriptsPainlessExecute[_], _] = js.native
  @JSName("scroll")
  var scroll_Original: ApiMethod[Scroll[_], _] = js.native
  @JSName("searchShards")
  var searchShards_Original: ApiMethod[SearchShards, _] = js.native
  @JSName("searchTemplate")
  var searchTemplate_Original: ApiMethod[SearchTemplate[_], _] = js.native
  @JSName("search")
  var search_Original: ApiMethod[Search[_], _] = js.native
  @JSName("search_shards")
  var search_shards_Original: ApiMethod[SearchShards, _] = js.native
  @JSName("search_template")
  var search_template_Original: ApiMethod[SearchTemplate[_], _] = js.native
  var security: AnonAuthenticate = js.native
  var serializer: default = js.native
  var slm: AnonDeleteLifecycleDeletelifecycle = js.native
  var snapshot: AnonCleanupRepository = js.native
  var sql: AnonClearCursor = js.native
  var ssl: AnonCertificates = js.native
  var tasks: AnonCancel = js.native
  @JSName("termvectors")
  var termvectors_Original: ApiMethod[Termvectors[_], _] = js.native
  var transform: AnonDeleteTransform = js.native
  var transport: typings.elasticElasticsearch.transportMod.default = js.native
  @JSName("updateByQueryRethrottle")
  var updateByQueryRethrottle_Original: ApiMethod[UpdateByQueryRethrottle, _] = js.native
  @JSName("updateByQuery")
  var updateByQuery_Original: ApiMethod[UpdateByQuery[_], _] = js.native
  @JSName("update")
  var update_Original: ApiMethod[Update[_], _] = js.native
  @JSName("update_by_query")
  var update_by_query_Original: ApiMethod[UpdateByQuery[_], _] = js.native
  @JSName("update_by_query_rethrottle")
  var update_by_query_rethrottle_Original: ApiMethod[UpdateByQueryRethrottle, _] = js.native
  var watcher: AnonAckWatch = js.native
  var xpack: AnonInfo = js.native
  // Promise API
  /* GENERATED */
  def bulk(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  /* GENERATED */
  def bulk(callback: callbackFn[_]): TransportRequestCallback = js.native
  /* GENERATED */
  def bulk(params: Bulk[_]): js.Promise[ApiResponse[_, _]] = js.native
  /* GENERATED */
  def bulk(params: Bulk[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  /* GENERATED */
  def bulk(params: Bulk[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  /* GENERATED */
  def bulk(params: Bulk[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  def child(): Client = js.native
  def child(opts: ClientOptions): Client = js.native
  // Promise API
  def clearScroll(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clearScroll(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearScroll(params: ClearScroll[_]): js.Promise[ApiResponse[_, _]] = js.native
  def clearScroll(params: ClearScroll[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def clearScroll(params: ClearScroll[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clearScroll(params: ClearScroll[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def clear_scroll(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def clear_scroll(callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_scroll(params: ClearScroll[_]): js.Promise[ApiResponse[_, _]] = js.native
  def clear_scroll(params: ClearScroll[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def clear_scroll(params: ClearScroll[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def clear_scroll(params: ClearScroll[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  def close(): js.Promise[Unit] | Unit = js.native
  def close(callback: js.Function): js.Promise[Unit] | Unit = js.native
  // Promise API
  def count(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def count(callback: callbackFn[_]): TransportRequestCallback = js.native
  def count(params: Count[_]): js.Promise[ApiResponse[_, _]] = js.native
  def count(params: Count[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def count(params: Count[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def count(params: Count[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def create(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def create(callback: callbackFn[_]): TransportRequestCallback = js.native
  def create(params: Create[_]): js.Promise[ApiResponse[_, _]] = js.native
  def create(params: Create[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def create(params: Create[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def create(params: Create[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: Delete): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: Delete, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: Delete, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: Delete, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteByQuery(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteByQuery(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteByQuery(params: DeleteByQuery[_]): js.Promise[ApiResponse[_, _]] = js.native
  def deleteByQuery(params: DeleteByQuery[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteByQuery(params: DeleteByQuery[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteByQuery(params: DeleteByQuery[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteByQueryRethrottle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteByQueryRethrottle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteByQueryRethrottle(params: DeleteByQueryRethrottle): js.Promise[ApiResponse[_, _]] = js.native
  def deleteByQueryRethrottle(params: DeleteByQueryRethrottle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteByQueryRethrottle(params: DeleteByQueryRethrottle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteByQueryRethrottle(params: DeleteByQueryRethrottle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteScript(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteScript(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteScript(params: DeleteScript): js.Promise[ApiResponse[_, _]] = js.native
  def deleteScript(params: DeleteScript, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteScript(params: DeleteScript, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteScript(params: DeleteScript, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_by_query(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_by_query(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_by_query(params: DeleteByQuery[_]): js.Promise[ApiResponse[_, _]] = js.native
  def delete_by_query(params: DeleteByQuery[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_by_query(params: DeleteByQuery[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_by_query(params: DeleteByQuery[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_by_query_rethrottle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_by_query_rethrottle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_by_query_rethrottle(params: DeleteByQueryRethrottle): js.Promise[ApiResponse[_, _]] = js.native
  def delete_by_query_rethrottle(params: DeleteByQueryRethrottle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_by_query_rethrottle(params: DeleteByQueryRethrottle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_by_query_rethrottle(params: DeleteByQueryRethrottle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_script(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_script(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_script(params: DeleteScript): js.Promise[ApiResponse[_, _]] = js.native
  def delete_script(params: DeleteScript, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_script(params: DeleteScript, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_script(params: DeleteScript, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def exists(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def exists(callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists(params: Exists): js.Promise[ApiResponse[_, _]] = js.native
  def exists(params: Exists, callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists(params: Exists, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def exists(params: Exists, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def existsSource(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def existsSource(callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsSource(params: ExistsSource): js.Promise[ApiResponse[_, _]] = js.native
  def existsSource(params: ExistsSource, callback: callbackFn[_]): TransportRequestCallback = js.native
  def existsSource(params: ExistsSource, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def existsSource(params: ExistsSource, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def exists_source(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def exists_source(callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_source(params: ExistsSource): js.Promise[ApiResponse[_, _]] = js.native
  def exists_source(params: ExistsSource, callback: callbackFn[_]): TransportRequestCallback = js.native
  def exists_source(params: ExistsSource, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def exists_source(params: ExistsSource, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def explain(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explain(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explain(params: Explain[_]): js.Promise[ApiResponse[_, _]] = js.native
  def explain(params: Explain[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def explain(params: Explain[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explain(params: Explain[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  def extend(method: String, fn: extendsCallback): Unit = js.native
  def extend(method: String, opts: AnonForce, fn: extendsCallback): Unit = js.native
  // Promise API
  def fieldCaps(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def fieldCaps(callback: callbackFn[_]): TransportRequestCallback = js.native
  def fieldCaps(params: FieldCaps): js.Promise[ApiResponse[_, _]] = js.native
  def fieldCaps(params: FieldCaps, callback: callbackFn[_]): TransportRequestCallback = js.native
  def fieldCaps(params: FieldCaps, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def fieldCaps(params: FieldCaps, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def field_caps(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def field_caps(callback: callbackFn[_]): TransportRequestCallback = js.native
  def field_caps(params: FieldCaps): js.Promise[ApiResponse[_, _]] = js.native
  def field_caps(params: FieldCaps, callback: callbackFn[_]): TransportRequestCallback = js.native
  def field_caps(params: FieldCaps, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def field_caps(params: FieldCaps, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: Get): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: Get, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: Get, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: Get, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getScript(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getScript(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getScript(params: GetScript): js.Promise[ApiResponse[_, _]] = js.native
  def getScript(params: GetScript, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getScript(params: GetScript, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getScript(params: GetScript, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getSource(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getSource(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getSource(params: GetSource): js.Promise[ApiResponse[_, _]] = js.native
  def getSource(params: GetSource, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getSource(params: GetSource, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getSource(params: GetSource, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_script(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_script(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_script(params: GetScript): js.Promise[ApiResponse[_, _]] = js.native
  def get_script(params: GetScript, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_script(params: GetScript, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_script(params: GetScript, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_source(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_source(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_source(params: GetSource): js.Promise[ApiResponse[_, _]] = js.native
  def get_source(params: GetSource, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_source(params: GetSource, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_source(params: GetSource, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def index(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def index(callback: callbackFn[_]): TransportRequestCallback = js.native
  def index(params: Index[_]): js.Promise[ApiResponse[_, _]] = js.native
  def index(params: Index[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def index(params: Index[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def index(params: Index[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def info(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def info(callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: Info): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: Info, callback: callbackFn[_]): TransportRequestCallback = js.native
  def info(params: Info, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def info(params: Info, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def mget(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def mget(callback: callbackFn[_]): TransportRequestCallback = js.native
  def mget(params: Mget[_]): js.Promise[ApiResponse[_, _]] = js.native
  def mget(params: Mget[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def mget(params: Mget[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def mget(params: Mget[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def msearch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def msearch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def msearch(params: Msearch[_]): js.Promise[ApiResponse[_, _]] = js.native
  def msearch(params: Msearch[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def msearch(params: Msearch[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def msearch(params: Msearch[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def msearchTemplate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def msearchTemplate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def msearchTemplate(params: MsearchTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def msearchTemplate(params: MsearchTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def msearchTemplate(params: MsearchTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def msearchTemplate(params: MsearchTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def msearch_template(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def msearch_template(callback: callbackFn[_]): TransportRequestCallback = js.native
  def msearch_template(params: MsearchTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def msearch_template(params: MsearchTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def msearch_template(params: MsearchTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def msearch_template(params: MsearchTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def mtermvectors(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def mtermvectors(callback: callbackFn[_]): TransportRequestCallback = js.native
  def mtermvectors(params: Mtermvectors[_]): js.Promise[ApiResponse[_, _]] = js.native
  def mtermvectors(params: Mtermvectors[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def mtermvectors(params: Mtermvectors[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def mtermvectors(params: Mtermvectors[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def ping(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def ping(callback: callbackFn[_]): TransportRequestCallback = js.native
  def ping(params: Ping): js.Promise[ApiResponse[_, _]] = js.native
  def ping(params: Ping, callback: callbackFn[_]): TransportRequestCallback = js.native
  def ping(params: Ping, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def ping(params: Ping, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putScript(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putScript(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putScript(params: PutScript[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putScript(params: PutScript[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putScript(params: PutScript[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putScript(params: PutScript[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_script(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_script(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_script(params: PutScript[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_script(params: PutScript[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_script(params: PutScript[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_script(params: PutScript[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def rankEval(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def rankEval(callback: callbackFn[_]): TransportRequestCallback = js.native
  def rankEval(params: RankEval[_]): js.Promise[ApiResponse[_, _]] = js.native
  def rankEval(params: RankEval[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def rankEval(params: RankEval[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def rankEval(params: RankEval[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def rank_eval(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def rank_eval(callback: callbackFn[_]): TransportRequestCallback = js.native
  def rank_eval(params: RankEval[_]): js.Promise[ApiResponse[_, _]] = js.native
  def rank_eval(params: RankEval[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def rank_eval(params: RankEval[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def rank_eval(params: RankEval[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reindex(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reindex(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reindex(params: Reindex[_]): js.Promise[ApiResponse[_, _]] = js.native
  def reindex(params: Reindex[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def reindex(params: Reindex[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reindex(params: Reindex[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reindexRethrottle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reindexRethrottle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reindexRethrottle(params: ReindexRethrottle): js.Promise[ApiResponse[_, _]] = js.native
  def reindexRethrottle(params: ReindexRethrottle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def reindexRethrottle(params: ReindexRethrottle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reindexRethrottle(params: ReindexRethrottle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def reindex_rethrottle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def reindex_rethrottle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def reindex_rethrottle(params: ReindexRethrottle): js.Promise[ApiResponse[_, _]] = js.native
  def reindex_rethrottle(params: ReindexRethrottle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def reindex_rethrottle(params: ReindexRethrottle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def reindex_rethrottle(params: ReindexRethrottle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def renderSearchTemplate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def renderSearchTemplate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def renderSearchTemplate(params: RenderSearchTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def renderSearchTemplate(params: RenderSearchTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def renderSearchTemplate(params: RenderSearchTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def renderSearchTemplate(params: RenderSearchTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def render_search_template(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def render_search_template(callback: callbackFn[_]): TransportRequestCallback = js.native
  def render_search_template(params: RenderSearchTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def render_search_template(params: RenderSearchTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def render_search_template(params: RenderSearchTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def render_search_template(params: RenderSearchTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def scriptsPainlessExecute(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def scriptsPainlessExecute(callback: callbackFn[_]): TransportRequestCallback = js.native
  def scriptsPainlessExecute(params: ScriptsPainlessExecute[_]): js.Promise[ApiResponse[_, _]] = js.native
  def scriptsPainlessExecute(params: ScriptsPainlessExecute[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def scriptsPainlessExecute(params: ScriptsPainlessExecute[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def scriptsPainlessExecute(params: ScriptsPainlessExecute[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def scripts_painless_execute(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def scripts_painless_execute(callback: callbackFn[_]): TransportRequestCallback = js.native
  def scripts_painless_execute(params: ScriptsPainlessExecute[_]): js.Promise[ApiResponse[_, _]] = js.native
  def scripts_painless_execute(params: ScriptsPainlessExecute[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def scripts_painless_execute(params: ScriptsPainlessExecute[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def scripts_painless_execute(params: ScriptsPainlessExecute[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def scroll(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def scroll(callback: callbackFn[_]): TransportRequestCallback = js.native
  def scroll(params: Scroll[_]): js.Promise[ApiResponse[_, _]] = js.native
  def scroll(params: Scroll[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def scroll(params: Scroll[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def scroll(params: Scroll[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def search(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def search(callback: callbackFn[_]): TransportRequestCallback = js.native
  def search(params: Search[_]): js.Promise[ApiResponse[_, _]] = js.native
  def search(params: Search[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def search(params: Search[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def search(params: Search[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def searchShards(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def searchShards(callback: callbackFn[_]): TransportRequestCallback = js.native
  def searchShards(params: SearchShards): js.Promise[ApiResponse[_, _]] = js.native
  def searchShards(params: SearchShards, callback: callbackFn[_]): TransportRequestCallback = js.native
  def searchShards(params: SearchShards, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def searchShards(params: SearchShards, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def searchTemplate(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def searchTemplate(callback: callbackFn[_]): TransportRequestCallback = js.native
  def searchTemplate(params: SearchTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def searchTemplate(params: SearchTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def searchTemplate(params: SearchTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def searchTemplate(params: SearchTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def search_shards(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def search_shards(callback: callbackFn[_]): TransportRequestCallback = js.native
  def search_shards(params: SearchShards): js.Promise[ApiResponse[_, _]] = js.native
  def search_shards(params: SearchShards, callback: callbackFn[_]): TransportRequestCallback = js.native
  def search_shards(params: SearchShards, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def search_shards(params: SearchShards, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def search_template(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def search_template(callback: callbackFn[_]): TransportRequestCallback = js.native
  def search_template(params: SearchTemplate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def search_template(params: SearchTemplate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def search_template(params: SearchTemplate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def search_template(params: SearchTemplate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def termvectors(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def termvectors(callback: callbackFn[_]): TransportRequestCallback = js.native
  def termvectors(params: Termvectors[_]): js.Promise[ApiResponse[_, _]] = js.native
  def termvectors(params: Termvectors[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def termvectors(params: Termvectors[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def termvectors(params: Termvectors[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update(params: Update[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update(params: Update[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update(params: Update[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update(params: Update[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateByQuery(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateByQuery(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateByQuery(params: UpdateByQuery[_]): js.Promise[ApiResponse[_, _]] = js.native
  def updateByQuery(params: UpdateByQuery[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateByQuery(params: UpdateByQuery[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateByQuery(params: UpdateByQuery[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def updateByQueryRethrottle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def updateByQueryRethrottle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateByQueryRethrottle(params: UpdateByQueryRethrottle): js.Promise[ApiResponse[_, _]] = js.native
  def updateByQueryRethrottle(params: UpdateByQueryRethrottle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def updateByQueryRethrottle(params: UpdateByQueryRethrottle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def updateByQueryRethrottle(params: UpdateByQueryRethrottle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_by_query(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_by_query(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_by_query(params: UpdateByQuery[_]): js.Promise[ApiResponse[_, _]] = js.native
  def update_by_query(params: UpdateByQuery[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_by_query(params: UpdateByQuery[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_by_query(params: UpdateByQuery[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def update_by_query_rethrottle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def update_by_query_rethrottle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_by_query_rethrottle(params: UpdateByQueryRethrottle): js.Promise[ApiResponse[_, _]] = js.native
  def update_by_query_rethrottle(params: UpdateByQueryRethrottle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def update_by_query_rethrottle(params: UpdateByQueryRethrottle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def update_by_query_rethrottle(params: UpdateByQueryRethrottle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

