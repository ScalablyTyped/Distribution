package typings.elasticElasticsearch

import org.scalablytyped.runtime.TopLevel
import typings.elasticElasticsearch.anon.Aborted
import typings.elasticElasticsearch.anon.Causedby
import typings.elasticElasticsearch.anon.Dictkey
import typings.elasticElasticsearch.anon.OmitSearchRequestBodyReco
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import typings.elasticElasticsearch.requestParamsMod.Search
import typings.elasticElasticsearch.transportMod.ApiError
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.RequestEvent
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.AsyncIterable
import typings.std.AsyncIterator
import typings.std.Error
import typings.std.Exclude
import typings.std.Pick
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("@elastic/elasticsearch/lib/Helpers", JSImport.Default)
  @js.native
  class default () extends Helpers
  
  /* Rewritten from type alias, can be one of: 
    - typings.elasticElasticsearch.helpersMod.IndexAction
    - typings.elasticElasticsearch.helpersMod.CreateAction
    - typings.elasticElasticsearch.helpersMod.UpdateAction
    - typings.elasticElasticsearch.helpersMod.DeleteAction
  */
  type Action = _Action | UpdateAction
  
  @js.native
  trait BulkHelper[T]
    extends js.Promise[T] {
    
    def abort(): BulkHelper[T] = js.native
  }
  
  /* Inlined parent @elastic/elasticsearch.@elastic/elasticsearch/lib/Helpers.Omit<@elastic/elasticsearch.@elastic/elasticsearch/api/requestParams.Bulk<@elastic/elasticsearch.@elastic/elasticsearch/lib/Transport.RequestNDBody<std.Array<std.Record<string, any>>>>, 'body'> */
  @js.native
  trait BulkHelperOptions[TDocument] extends StObject {
    
    var _source: js.UndefOr[String | js.Array[String]] = js.native
    
    var _source_exclude: js.UndefOr[String | js.Array[String]] = js.native
    
    var _source_excludes: js.UndefOr[String | js.Array[String]] = js.native
    
    var _source_include: js.UndefOr[String | js.Array[String]] = js.native
    
    var _source_includes: js.UndefOr[String | js.Array[String]] = js.native
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var datasource: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, _, js.UndefOr[scala.Nothing]]) = js.native
    
    var error_trace: js.UndefOr[Boolean] = js.native
    
    var filter_path: js.UndefOr[String | js.Array[String]] = js.native
    
    var flushBytes: js.UndefOr[Double] = js.native
    
    var flushInterval: js.UndefOr[Double] = js.native
    
    var human: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    def onDocument(doc: TDocument): Action = js.native
    
    var onDrop: js.UndefOr[js.Function1[/* doc */ OnDropDocument[TDocument], Unit]] = js.native
    
    var pipeline: js.UndefOr[String] = js.native
    
    var pretty: js.UndefOr[Boolean] = js.native
    
    var refresh: js.UndefOr[wait_for | Boolean] = js.native
    
    var refreshOnCompletion: js.UndefOr[Boolean | String] = js.native
    
    var require_alias: js.UndefOr[Boolean] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var routing: js.UndefOr[String] = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    @JSName("wait")
    var wait_FBulkHelperOptions: js.UndefOr[Double] = js.native
    
    var wait_for_active_shards: js.UndefOr[String] = js.native
  }
  object BulkHelperOptions {
    
    @scala.inline
    def apply[TDocument](
      datasource: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, _, js.UndefOr[scala.Nothing]]),
      onDocument: TDocument => Action
    ): BulkHelperOptions[TDocument] = {
      val __obj = js.Dynamic.literal(datasource = datasource.asInstanceOf[js.Any], onDocument = js.Any.fromFunction1(onDocument))
      __obj.asInstanceOf[BulkHelperOptions[TDocument]]
    }
    
    @scala.inline
    implicit class BulkHelperOptionsMutableBuilder[Self <: BulkHelperOptions[_], TDocument] (val x: Self with BulkHelperOptions[TDocument]) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setDatasource(
        value: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, _, js.UndefOr[scala.Nothing]])
      ): Self = StObject.set(x, "datasource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatasourceVarargs(value: TDocument*): Self = StObject.set(x, "datasource", js.Array(value :_*))
      
      @scala.inline
      def setError_trace(value: Boolean): Self = StObject.set(x, "error_trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_traceUndefined: Self = StObject.set(x, "error_trace", js.undefined)
      
      @scala.inline
      def setFilter_path(value: String | js.Array[String]): Self = StObject.set(x, "filter_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_pathUndefined: Self = StObject.set(x, "filter_path", js.undefined)
      
      @scala.inline
      def setFilter_pathVarargs(value: String*): Self = StObject.set(x, "filter_path", js.Array(value :_*))
      
      @scala.inline
      def setFlushBytes(value: Double): Self = StObject.set(x, "flushBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushBytesUndefined: Self = StObject.set(x, "flushBytes", js.undefined)
      
      @scala.inline
      def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      @scala.inline
      def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
      
      @scala.inline
      def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOnDocument(value: TDocument => Action): Self = StObject.set(x, "onDocument", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDrop(value: /* doc */ OnDropDocument[TDocument] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshOnCompletion(value: Boolean | String): Self = StObject.set(x, "refreshOnCompletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshOnCompletionUndefined: Self = StObject.set(x, "refreshOnCompletion", js.undefined)
      
      @scala.inline
      def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
      
      @scala.inline
      def setRequire_alias(value: Boolean): Self = StObject.set(x, "require_alias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequire_aliasUndefined: Self = StObject.set(x, "require_alias", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
      
      @scala.inline
      def setWait_for_active_shards(value: String): Self = StObject.set(x, "wait_for_active_shards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_for_active_shardsUndefined: Self = StObject.set(x, "wait_for_active_shards", js.undefined)
      
      @scala.inline
      def set_source(value: String | js.Array[String]): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
      
      @scala.inline
      def set_sourceVarargs(value: String*): Self = StObject.set(x, "_source", js.Array(value :_*))
      
      @scala.inline
      def set_source_exclude(value: String | js.Array[String]): Self = StObject.set(x, "_source_exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_source_excludeUndefined: Self = StObject.set(x, "_source_exclude", js.undefined)
      
      @scala.inline
      def set_source_excludeVarargs(value: String*): Self = StObject.set(x, "_source_exclude", js.Array(value :_*))
      
      @scala.inline
      def set_source_excludes(value: String | js.Array[String]): Self = StObject.set(x, "_source_excludes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_source_excludesUndefined: Self = StObject.set(x, "_source_excludes", js.undefined)
      
      @scala.inline
      def set_source_excludesVarargs(value: String*): Self = StObject.set(x, "_source_excludes", js.Array(value :_*))
      
      @scala.inline
      def set_source_include(value: String | js.Array[String]): Self = StObject.set(x, "_source_include", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_source_includeUndefined: Self = StObject.set(x, "_source_include", js.undefined)
      
      @scala.inline
      def set_source_includeVarargs(value: String*): Self = StObject.set(x, "_source_include", js.Array(value :_*))
      
      @scala.inline
      def set_source_includes(value: String | js.Array[String]): Self = StObject.set(x, "_source_includes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_source_includesUndefined: Self = StObject.set(x, "_source_includes", js.undefined)
      
      @scala.inline
      def set_source_includesVarargs(value: String*): Self = StObject.set(x, "_source_includes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BulkStats extends StObject {
    
    var aborted: Boolean = js.native
    
    var bytes: Double = js.native
    
    var failed: Double = js.native
    
    var retry: Double = js.native
    
    var successful: Double = js.native
    
    var time: Double = js.native
    
    var total: Double = js.native
  }
  object BulkStats {
    
    @scala.inline
    def apply(
      aborted: Boolean,
      bytes: Double,
      failed: Double,
      retry: Double,
      successful: Double,
      time: Double,
      total: Double
    ): BulkStats = {
      val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulkStats]
    }
    
    @scala.inline
    implicit class BulkStatsMutableBuilder[Self <: BulkStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAborted(value: Boolean): Self = StObject.set(x, "aborted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytes(value: Double): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailed(value: Double): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessful(value: Double): Self = StObject.set(x, "successful", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreateAction extends _Action {
    
    var create: Dictkey = js.native
  }
  object CreateAction {
    
    @scala.inline
    def apply(create: Dictkey): CreateAction = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateAction]
    }
    
    @scala.inline
    implicit class CreateActionMutableBuilder[Self <: CreateAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: Dictkey): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeleteAction extends _Action {
    
    var delete: Dictkey = js.native
  }
  object DeleteAction {
    
    @scala.inline
    def apply(delete: Dictkey): DeleteAction = {
      val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteAction]
    }
    
    @scala.inline
    implicit class DeleteActionMutableBuilder[Self <: DeleteAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: Dictkey): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Helpers extends StObject {
    
    def bulk[TDocument](options: BulkHelperOptions[TDocument]): BulkHelper[BulkStats] = js.native
    
    def msearch(): MsearchHelper = js.native
    def msearch(options: MsearchHelperOptions): MsearchHelper = js.native
    
    def scrollDocuments[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody]): AsyncIterable[TDocument] = js.native
    def scrollDocuments[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody], options: TransportRequestOptions): AsyncIterable[TDocument] = js.native
    
    def scrollSearch[TDocument, TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody]): AsyncIterable[ScrollSearchResponse[TDocument, TResponse, TContext]] = js.native
    def scrollSearch[TDocument, TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody], options: TransportRequestOptions): AsyncIterable[ScrollSearchResponse[TDocument, TResponse, TContext]] = js.native
    
    def search[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody]): js.Promise[js.Array[TDocument]] = js.native
    def search[TDocument, TRequestBody /* <: RequestBody[Record[String, _]] */](params: Search[TRequestBody], options: TransportRequestOptions): js.Promise[js.Array[TDocument]] = js.native
  }
  
  @js.native
  trait IndexAction extends _Action {
    
    var index: Dictkey = js.native
  }
  object IndexAction {
    
    @scala.inline
    def apply(index: Dictkey): IndexAction = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IndexAction]
    }
    
    @scala.inline
    implicit class IndexActionMutableBuilder[Self <: IndexAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Dictkey): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MsearchHelper
    extends js.Promise[Unit] {
    
    def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: String): js.Promise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: String, callback: callbackFn[TResponse, TContext]): Unit = js.native
    def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Buffer): js.Promise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Buffer, callback: callbackFn[TResponse, TContext]): Unit = js.native
    def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Readable): js.Promise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TContext](header: OmitSearchRequestBodyReco, body: Readable, callback: callbackFn[TResponse, TContext]): Unit = js.native
    def search[TResponse, TRequestBody /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.elasticElasticsearch.elasticElasticsearchStrings.MsearchHelper with TopLevel[js.Any] */, TContext](header: OmitSearchRequestBodyReco, body: TRequestBody): js.Promise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TRequestBody /* <: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.elasticElasticsearch.elasticElasticsearchStrings.MsearchHelper with TopLevel[js.Any] */, TContext](header: OmitSearchRequestBodyReco, body: TRequestBody, callback: callbackFn[TResponse, TContext]): Unit = js.native
    
    def stop(): Unit = js.native
    def stop(error: Error): Unit = js.native
  }
  
  /* Inlined parent @elastic/elasticsearch.@elastic/elasticsearch/lib/Helpers.Omit<@elastic/elasticsearch.@elastic/elasticsearch/api/requestParams.Msearch<@elastic/elasticsearch.@elastic/elasticsearch/lib/Transport.RequestNDBody<std.Array<std.Record<string, any>>>>, 'body'> */
  @js.native
  trait MsearchHelperOptions extends StObject {
    
    var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.native
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var error_trace: js.UndefOr[Boolean] = js.native
    
    var filter_path: js.UndefOr[String | js.Array[String]] = js.native
    
    var flushInterval: js.UndefOr[Double] = js.native
    
    var human: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[String | js.Array[String]] = js.native
    
    var max_concurrent_searches: js.UndefOr[Double] = js.native
    
    var max_concurrent_shard_requests: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var operations: js.UndefOr[Double] = js.native
    
    var pre_filter_shard_size: js.UndefOr[Double] = js.native
    
    var pretty: js.UndefOr[Boolean] = js.native
    
    var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
    
    var retries: js.UndefOr[Double] = js.native
    
    var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
    
    var source: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String | js.Array[String]] = js.native
    
    var typed_keys: js.UndefOr[Boolean] = js.native
    
    @JSName("wait")
    var wait_FMsearchHelperOptions: js.UndefOr[Double] = js.native
  }
  object MsearchHelperOptions {
    
    @scala.inline
    def apply(): MsearchHelperOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MsearchHelperOptions]
    }
    
    @scala.inline
    implicit class MsearchHelperOptionsMutableBuilder[Self <: MsearchHelperOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCcs_minimize_roundtrips(value: Boolean): Self = StObject.set(x, "ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCcs_minimize_roundtripsUndefined: Self = StObject.set(x, "ccs_minimize_roundtrips", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setError_trace(value: Boolean): Self = StObject.set(x, "error_trace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_traceUndefined: Self = StObject.set(x, "error_trace", js.undefined)
      
      @scala.inline
      def setFilter_path(value: String | js.Array[String]): Self = StObject.set(x, "filter_path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilter_pathUndefined: Self = StObject.set(x, "filter_path", js.undefined)
      
      @scala.inline
      def setFilter_pathVarargs(value: String*): Self = StObject.set(x, "filter_path", js.Array(value :_*))
      
      @scala.inline
      def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      @scala.inline
      def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
      
      @scala.inline
      def setIndex(value: String | js.Array[String]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value :_*))
      
      @scala.inline
      def setMax_concurrent_searches(value: Double): Self = StObject.set(x, "max_concurrent_searches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_concurrent_searchesUndefined: Self = StObject.set(x, "max_concurrent_searches", js.undefined)
      
      @scala.inline
      def setMax_concurrent_shard_requests(value: Double): Self = StObject.set(x, "max_concurrent_shard_requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_concurrent_shard_requestsUndefined: Self = StObject.set(x, "max_concurrent_shard_requests", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOperations(value: Double): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      @scala.inline
      def setPre_filter_shard_size(value: Double): Self = StObject.set(x, "pre_filter_shard_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPre_filter_shard_sizeUndefined: Self = StObject.set(x, "pre_filter_shard_size", js.undefined)
      
      @scala.inline
      def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
      
      @scala.inline
      def setRest_total_hits_as_int(value: Boolean): Self = StObject.set(x, "rest_total_hits_as_int", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRest_total_hits_as_intUndefined: Self = StObject.set(x, "rest_total_hits_as_int", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = StObject.set(x, "search_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch_typeUndefined: Self = StObject.set(x, "search_type", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(value: String | js.Array[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: String*): Self = StObject.set(x, "type", js.Array(value :_*))
      
      @scala.inline
      def setTyped_keys(value: Boolean): Self = StObject.set(x, "typed_keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTyped_keysUndefined: Self = StObject.set(x, "typed_keys", js.undefined)
      
      @scala.inline
      def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
    }
  }
  
  type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]
  
  @js.native
  trait OnDropDocument[TDocument] extends StObject {
    
    var document: TDocument = js.native
    
    var error: Causedby = js.native
    
    var retried: Boolean = js.native
    
    var status: Double = js.native
  }
  object OnDropDocument {
    
    @scala.inline
    def apply[TDocument](document: TDocument, error: Causedby, retried: Boolean, status: Double): OnDropDocument[TDocument] = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], retried = retried.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnDropDocument[TDocument]]
    }
    
    @scala.inline
    implicit class OnDropDocumentMutableBuilder[Self <: OnDropDocument[_], TDocument] (val x: Self with OnDropDocument[TDocument]) extends AnyVal {
      
      @scala.inline
      def setDocument(value: TDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Causedby): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetried(value: Boolean): Self = StObject.set(x, "retried", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ScrollSearchResponse[TDocument, TResponse, TContext] extends RequestEvent[TResponse, TContext] {
    
    def clear(): js.Promise[Unit] = js.native
    
    var documents: js.Array[TDocument] = js.native
  }
  object ScrollSearchResponse {
    
    @scala.inline
    def apply[TDocument, TResponse, TContext](
      body: TResponse,
      clear: () => js.Promise[Unit],
      documents: js.Array[TDocument],
      meta: Aborted[TContext]
    ): ScrollSearchResponse[TDocument, TResponse, TContext] = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), documents = documents.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollSearchResponse[TDocument, TResponse, TContext]]
    }
    
    @scala.inline
    implicit class ScrollSearchResponseMutableBuilder[Self <: ScrollSearchResponse[_, _, _], TDocument, TResponse, TContext] (val x: Self with (ScrollSearchResponse[TDocument, TResponse, TContext])) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDocuments(value: js.Array[TDocument]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentsVarargs(value: TDocument*): Self = StObject.set(x, "documents", js.Array(value :_*))
    }
  }
  
  type UpdateAction = js.Tuple2[UpdateActionOperation, Record[String, js.Any]]
  
  @js.native
  trait UpdateActionOperation extends StObject {
    
    var update: Dictkey = js.native
  }
  object UpdateActionOperation {
    
    @scala.inline
    def apply(update: Dictkey): UpdateActionOperation = {
      val __obj = js.Dynamic.literal(update = update.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateActionOperation]
    }
    
    @scala.inline
    implicit class UpdateActionOperationMutableBuilder[Self <: UpdateActionOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdate(value: Dictkey): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Action extends StObject
  object _Action {
    
    @scala.inline
    def CreateAction(create: Dictkey): typings.elasticElasticsearch.helpersMod.CreateAction = {
      val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.elasticElasticsearch.helpersMod.CreateAction]
    }
    
    @scala.inline
    def DeleteAction(delete: Dictkey): typings.elasticElasticsearch.helpersMod.DeleteAction = {
      val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.elasticElasticsearch.helpersMod.DeleteAction]
    }
    
    @scala.inline
    def IndexAction(index: Dictkey): typings.elasticElasticsearch.helpersMod.IndexAction = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.elasticElasticsearch.helpersMod.IndexAction]
    }
  }
  
  type callbackFn[Response, Context] = js.Function2[/* err */ ApiError, /* result */ ApiResponse[Response, Context], Unit]
}
