package typings
package atElasticElasticsearchLib.atElasticElasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@elastic/elasticsearch", "Client")
@js.native
class Client ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(opts: ClientOptions) = this()
  @JSName("bulk")
  var bulk_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Bulk[_], _] = js.native
  var cat: atElasticElasticsearchLib.Anon_Aliases = js.native
  var ccr: atElasticElasticsearchLib.Anon_DeleteAutoFollowPattern = js.native
  @JSName("clearScroll")
  var clearScroll_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_], _] = js.native
  @JSName("clear_scroll")
  var clear_scroll_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_], _] = js.native
  var cluster: atElasticElasticsearchLib.Anon_AllocationExplain = js.native
  var connectionPool: atElasticElasticsearchLib.libConnectionPoolMod.default = js.native
  @JSName("count")
  var count_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Count[_], _] = js.native
  @JSName("create")
  var create_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Create[_], _] = js.native
  var dataFrame: atElasticElasticsearchLib.Anon_DeleteDataFrameTransform = js.native
  var data_frame: atElasticElasticsearchLib.Anon_DeleteDataFrameTransform = js.native
  @JSName("deleteByQueryRethrottle")
  var deleteByQueryRethrottle_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle, _] = js.native
  @JSName("deleteByQuery")
  var deleteByQuery_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_], _] = js.native
  @JSName("deleteScript")
  var deleteScript_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript, _] = js.native
  @JSName("delete")
  var delete_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Delete, _] = js.native
  @JSName("delete_by_query")
  var delete_by_query_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_], _] = js.native
  @JSName("delete_by_query_rethrottle")
  var delete_by_query_rethrottle_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle, _] = js.native
  @JSName("delete_script")
  var delete_script_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript, _] = js.native
  @JSName("existsSource")
  var existsSource_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource, _] = js.native
  @JSName("exists")
  var exists_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Exists, _] = js.native
  @JSName("exists_source")
  var exists_source_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource, _] = js.native
  @JSName("explain")
  var explain_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Explain[_], _] = js.native
  @JSName("extend")
  var extend_Original: ClientExtends = js.native
  @JSName("fieldCaps")
  var fieldCaps_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps, _] = js.native
  @JSName("field_caps")
  var field_caps_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps, _] = js.native
  @JSName("getScript")
  var getScript_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.GetScript, _] = js.native
  @JSName("getSource")
  var getSource_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.GetSource, _] = js.native
  @JSName("get")
  var get_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Get, _] = js.native
  @JSName("get_script")
  var get_script_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.GetScript, _] = js.native
  @JSName("get_source")
  var get_source_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.GetSource, _] = js.native
  var graph: atElasticElasticsearchLib.Anon_Explore = js.native
  var ilm: atElasticElasticsearchLib.Anon_DeleteLifecycle = js.native
  @JSName("index")
  var index_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Index[_], _] = js.native
  var indices: atElasticElasticsearchLib.Anon_Analyze = js.native
  @JSName("info")
  var info_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Info, _] = js.native
  var ingest: atElasticElasticsearchLib.Anon_DeletePipeline = js.native
  var license: atElasticElasticsearchLib.Anon_Delete = js.native
  @JSName("mget")
  var mget_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Mget[_], _] = js.native
  var migration: atElasticElasticsearchLib.Anon_Deprecations = js.native
  var ml: atElasticElasticsearchLib.Anon_CloseJob = js.native
  var monitoring: atElasticElasticsearchLib.Anon_Bulk = js.native
  @JSName("msearchTemplate")
  var msearchTemplate_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_], _] = js.native
  @JSName("msearch")
  var msearch_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Msearch[_], _] = js.native
  @JSName("msearch_template")
  var msearch_template_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_], _] = js.native
  @JSName("mtermvectors")
  var mtermvectors_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Mtermvectors[_], _] = js.native
  var nodes: atElasticElasticsearchLib.Anon_HotThreads = js.native
  @JSName("ping")
  var ping_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Ping, _] = js.native
  @JSName("putScript")
  var putScript_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_], _] = js.native
  @JSName("put_script")
  var put_script_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_], _] = js.native
  @JSName("rankEval")
  var rankEval_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_], _] = js.native
  @JSName("rank_eval")
  var rank_eval_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_], _] = js.native
  @JSName("reindexRethrottle")
  var reindexRethrottle_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle, _] = js.native
  @JSName("reindex")
  var reindex_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Reindex[_], _] = js.native
  @JSName("reindex_rethrottle")
  var reindex_rethrottle_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle, _] = js.native
  @JSName("renderSearchTemplate")
  var renderSearchTemplate_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_], _] = js.native
  @JSName("render_search_template")
  var render_search_template_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_], _] = js.native
  var rollup: atElasticElasticsearchLib.Anon_DeleteJob = js.native
  @JSName("scriptsPainlessContext")
  var scriptsPainlessContext_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext, _] = js.native
  @JSName("scriptsPainlessExecute")
  var scriptsPainlessExecute_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_], _] = js.native
  @JSName("scripts_painless_context")
  var scripts_painless_context_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext, _] = js.native
  @JSName("scripts_painless_execute")
  var scripts_painless_execute_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_], _] = js.native
  @JSName("scroll")
  var scroll_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Scroll[_], _] = js.native
  @JSName("searchShards")
  var searchShards_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.SearchShards, _] = js.native
  @JSName("searchTemplate")
  var searchTemplate_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_], _] = js.native
  @JSName("search")
  var search_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Search[_], _] = js.native
  @JSName("search_shards")
  var search_shards_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.SearchShards, _] = js.native
  @JSName("search_template")
  var search_template_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_], _] = js.native
  var security: atElasticElasticsearchLib.Anon_Authenticate = js.native
  var serializer: atElasticElasticsearchLib.libSerializerMod.default = js.native
  var snapshot: atElasticElasticsearchLib.Anon_Create = js.native
  var sql: atElasticElasticsearchLib.Anon_ClearCursor = js.native
  var ssl: atElasticElasticsearchLib.Anon_Certificates = js.native
  var tasks: atElasticElasticsearchLib.Anon_Cancel = js.native
  @JSName("termvectors")
  var termvectors_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Termvectors[_], _] = js.native
  var transport: atElasticElasticsearchLib.libTransportMod.default = js.native
  @JSName("updateByQueryRethrottle")
  var updateByQueryRethrottle_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle, _] = js.native
  @JSName("updateByQuery")
  var updateByQuery_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_], _] = js.native
  @JSName("update")
  var update_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.Update[_], _] = js.native
  @JSName("update_by_query")
  var update_by_query_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_], _] = js.native
  @JSName("update_by_query_rethrottle")
  var update_by_query_rethrottle_Original: ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle, _] = js.native
  var watcher: atElasticElasticsearchLib.Anon_AckWatch = js.native
  var xpack: atElasticElasticsearchLib.Anon_Info = js.native
  // Promise API
  def bulk(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def bulk(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def bulk(params: atElasticElasticsearchLib.apiRequestParamsMod.Bulk[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def bulk(params: atElasticElasticsearchLib.apiRequestParamsMod.Bulk[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def bulk(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Bulk[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def bulk(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Bulk[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def child(): Client = js.native
  def child(opts: ClientOptions): Client = js.native
  // Promise API
  def clearScroll(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def clearScroll(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def clearScroll(params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def clearScroll(params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def clearScroll(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def clearScroll(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def clear_scroll(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def clear_scroll(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def clear_scroll(params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def clear_scroll(params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def clear_scroll(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def clear_scroll(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ClearScroll[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def close(): js.Promise[scala.Unit] | scala.Unit = js.native
  def close(callback: js.Function): js.Promise[scala.Unit] | scala.Unit = js.native
  // Promise API
  def count(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def count(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def count(params: atElasticElasticsearchLib.apiRequestParamsMod.Count[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def count(params: atElasticElasticsearchLib.apiRequestParamsMod.Count[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def count(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Count[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def count(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Count[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def create(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def create(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def create(params: atElasticElasticsearchLib.apiRequestParamsMod.Create[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def create(params: atElasticElasticsearchLib.apiRequestParamsMod.Create[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def create(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Create[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def create(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Create[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def delete(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete(params: atElasticElasticsearchLib.apiRequestParamsMod.Delete): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete(params: atElasticElasticsearchLib.apiRequestParamsMod.Delete, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Delete,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Delete,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def deleteByQuery(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deleteByQuery(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteByQuery(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteByQuery(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteByQuery(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteByQuery(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def deleteByQueryRethrottle(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deleteByQueryRethrottle(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteByQueryRethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteByQueryRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteByQueryRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteByQueryRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def deleteScript(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deleteScript(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteScript(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteScript(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteScript(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteScript(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def delete_by_query(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete_by_query(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_by_query(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_by_query(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_by_query(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_by_query(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def delete_by_query_rethrottle(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete_by_query_rethrottle(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_by_query_rethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_by_query_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_by_query_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_by_query_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def delete_script(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete_script(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_script(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_script(params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_script(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_script(
    params: atElasticElasticsearchLib.apiRequestParamsMod.DeleteScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def exists(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def exists(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def exists(params: atElasticElasticsearchLib.apiRequestParamsMod.Exists): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def exists(params: atElasticElasticsearchLib.apiRequestParamsMod.Exists, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def exists(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Exists,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def exists(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Exists,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def existsSource(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def existsSource(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def existsSource(params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def existsSource(params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def existsSource(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def existsSource(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def exists_source(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def exists_source(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def exists_source(params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def exists_source(params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def exists_source(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def exists_source(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ExistsSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def explain(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def explain(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def explain(params: atElasticElasticsearchLib.apiRequestParamsMod.Explain[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def explain(params: atElasticElasticsearchLib.apiRequestParamsMod.Explain[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def explain(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Explain[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def explain(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Explain[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def extend(method: java.lang.String, fn: extendsCallback): scala.Unit = js.native
  def extend(method: java.lang.String, opts: atElasticElasticsearchLib.Anon_Force, fn: extendsCallback): scala.Unit = js.native
  // Promise API
  def fieldCaps(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def fieldCaps(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def fieldCaps(params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def fieldCaps(params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def fieldCaps(
    params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def fieldCaps(
    params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def field_caps(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def field_caps(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def field_caps(params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def field_caps(params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def field_caps(
    params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def field_caps(
    params: atElasticElasticsearchLib.apiRequestParamsMod.FieldCaps,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get(params: atElasticElasticsearchLib.apiRequestParamsMod.Get): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get(params: atElasticElasticsearchLib.apiRequestParamsMod.Get, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Get,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Get,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getScript(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getScript(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getScript(params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getScript(params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getScript(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getScript(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getSource(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getSource(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getSource(params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getSource(params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getSource(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getSource(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_script(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_script(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_script(params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_script(params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_script(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_script(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetScript,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_source(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_source(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_source(params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_source(params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_source(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_source(
    params: atElasticElasticsearchLib.apiRequestParamsMod.GetSource,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def index(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def index(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def index(params: atElasticElasticsearchLib.apiRequestParamsMod.Index[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def index(params: atElasticElasticsearchLib.apiRequestParamsMod.Index[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def index(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Index[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def index(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Index[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def info(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def info(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def info(params: atElasticElasticsearchLib.apiRequestParamsMod.Info): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def info(params: atElasticElasticsearchLib.apiRequestParamsMod.Info, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Info,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Info,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def mget(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def mget(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def mget(params: atElasticElasticsearchLib.apiRequestParamsMod.Mget[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def mget(params: atElasticElasticsearchLib.apiRequestParamsMod.Mget[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def mget(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Mget[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def mget(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Mget[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def msearch(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def msearch(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def msearch(params: atElasticElasticsearchLib.apiRequestParamsMod.Msearch[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def msearch(params: atElasticElasticsearchLib.apiRequestParamsMod.Msearch[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def msearch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Msearch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def msearch(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Msearch[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def msearchTemplate(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def msearchTemplate(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def msearchTemplate(params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def msearchTemplate(params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def msearchTemplate(
    params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def msearchTemplate(
    params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def msearch_template(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def msearch_template(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def msearch_template(params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def msearch_template(params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def msearch_template(
    params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def msearch_template(
    params: atElasticElasticsearchLib.apiRequestParamsMod.MsearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def mtermvectors(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def mtermvectors(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def mtermvectors(params: atElasticElasticsearchLib.apiRequestParamsMod.Mtermvectors[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def mtermvectors(params: atElasticElasticsearchLib.apiRequestParamsMod.Mtermvectors[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def mtermvectors(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Mtermvectors[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def mtermvectors(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Mtermvectors[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def ping(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def ping(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def ping(params: atElasticElasticsearchLib.apiRequestParamsMod.Ping): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def ping(params: atElasticElasticsearchLib.apiRequestParamsMod.Ping, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def ping(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Ping,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def ping(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Ping,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def putScript(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def putScript(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putScript(params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putScript(params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putScript(
    params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putScript(
    params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def put_script(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def put_script(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_script(params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_script(params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_script(
    params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_script(
    params: atElasticElasticsearchLib.apiRequestParamsMod.PutScript[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def rankEval(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def rankEval(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def rankEval(params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def rankEval(params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def rankEval(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def rankEval(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def rank_eval(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def rank_eval(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def rank_eval(params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def rank_eval(params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def rank_eval(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def rank_eval(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RankEval[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def reindex(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def reindex(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def reindex(params: atElasticElasticsearchLib.apiRequestParamsMod.Reindex[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def reindex(params: atElasticElasticsearchLib.apiRequestParamsMod.Reindex[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def reindex(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Reindex[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def reindex(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Reindex[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def reindexRethrottle(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def reindexRethrottle(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def reindexRethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def reindexRethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def reindexRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def reindexRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def reindex_rethrottle(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def reindex_rethrottle(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def reindex_rethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def reindex_rethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def reindex_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def reindex_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ReindexRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def renderSearchTemplate(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def renderSearchTemplate(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def renderSearchTemplate(params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def renderSearchTemplate(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_],
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def renderSearchTemplate(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def renderSearchTemplate(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def render_search_template(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def render_search_template(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def render_search_template(params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def render_search_template(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_],
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def render_search_template(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def render_search_template(
    params: atElasticElasticsearchLib.apiRequestParamsMod.RenderSearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def scriptsPainlessContext(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def scriptsPainlessContext(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scriptsPainlessContext(params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scriptsPainlessContext(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scriptsPainlessContext(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scriptsPainlessContext(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def scriptsPainlessExecute(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def scriptsPainlessExecute(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scriptsPainlessExecute(params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scriptsPainlessExecute(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_],
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scriptsPainlessExecute(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scriptsPainlessExecute(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def scripts_painless_context(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def scripts_painless_context(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scripts_painless_context(params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scripts_painless_context(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scripts_painless_context(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scripts_painless_context(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessContext,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def scripts_painless_execute(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def scripts_painless_execute(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scripts_painless_execute(params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scripts_painless_execute(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_],
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scripts_painless_execute(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scripts_painless_execute(
    params: atElasticElasticsearchLib.apiRequestParamsMod.ScriptsPainlessExecute[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def scroll(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def scroll(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scroll(params: atElasticElasticsearchLib.apiRequestParamsMod.Scroll[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scroll(params: atElasticElasticsearchLib.apiRequestParamsMod.Scroll[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def scroll(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Scroll[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def scroll(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Scroll[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def search(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def search(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def search(params: atElasticElasticsearchLib.apiRequestParamsMod.Search[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def search(params: atElasticElasticsearchLib.apiRequestParamsMod.Search[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def search(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Search[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def search(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Search[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def searchShards(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def searchShards(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def searchShards(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def searchShards(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def searchShards(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def searchShards(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def searchTemplate(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def searchTemplate(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def searchTemplate(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def searchTemplate(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def searchTemplate(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def searchTemplate(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def search_shards(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def search_shards(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def search_shards(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def search_shards(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards, callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def search_shards(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def search_shards(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchShards,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def search_template(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def search_template(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def search_template(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def search_template(params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def search_template(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def search_template(
    params: atElasticElasticsearchLib.apiRequestParamsMod.SearchTemplate[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def termvectors(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def termvectors(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def termvectors(params: atElasticElasticsearchLib.apiRequestParamsMod.Termvectors[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def termvectors(params: atElasticElasticsearchLib.apiRequestParamsMod.Termvectors[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def termvectors(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Termvectors[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def termvectors(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Termvectors[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def update(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def update(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def update(params: atElasticElasticsearchLib.apiRequestParamsMod.Update[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def update(params: atElasticElasticsearchLib.apiRequestParamsMod.Update[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def update(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Update[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def update(
    params: atElasticElasticsearchLib.apiRequestParamsMod.Update[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def updateByQuery(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def updateByQuery(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def updateByQuery(params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def updateByQuery(params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def updateByQuery(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def updateByQuery(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def updateByQueryRethrottle(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def updateByQueryRethrottle(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def updateByQueryRethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def updateByQueryRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def updateByQueryRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def updateByQueryRethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def update_by_query(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def update_by_query(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def update_by_query(params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def update_by_query(params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_], callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def update_by_query(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def update_by_query(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQuery[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def update_by_query_rethrottle(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def update_by_query_rethrottle(callback: callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def update_by_query_rethrottle(params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def update_by_query_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def update_by_query_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def update_by_query_rethrottle(
    params: atElasticElasticsearchLib.apiRequestParamsMod.UpdateByQueryRethrottle,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

