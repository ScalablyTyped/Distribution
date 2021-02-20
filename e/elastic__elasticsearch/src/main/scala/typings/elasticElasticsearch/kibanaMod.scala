package typings.elasticElasticsearch

import typings.elasticElasticsearch.anon.AckWatch_
import typings.elasticElasticsearch.anon.AddBlock_
import typings.elasticElasticsearch.anon.Aliases
import typings.elasticElasticsearch.anon.AllocationExplain_
import typings.elasticElasticsearch.anon.Authenticate
import typings.elasticElasticsearch.anon.Body
import typings.elasticElasticsearch.anon.Cancel
import typings.elasticElasticsearch.anon.Certificates
import typings.elasticElasticsearch.anon.CleanupRepository_
import typings.elasticElasticsearch.anon.ClearCache_
import typings.elasticElasticsearch.anon.ClearCursor_
import typings.elasticElasticsearch.anon.CloseJob_
import typings.elasticElasticsearch.anon.Delete
import typings.elasticElasticsearch.anon.DeleteAutoFollowPattern_
import typings.elasticElasticsearch.anon.DeleteAutoscalingPolicy_
import typings.elasticElasticsearch.anon.DeleteDanglingIndex_
import typings.elasticElasticsearch.anon.DeleteJob_
import typings.elasticElasticsearch.anon.DeleteLifecycle_
import typings.elasticElasticsearch.anon.DeletePipeline_
import typings.elasticElasticsearch.anon.DeletePolicy_
import typings.elasticElasticsearch.anon.DeleteTransform_
import typings.elasticElasticsearch.anon.Deprecations
import typings.elasticElasticsearch.anon.ExecuteLifecycle
import typings.elasticElasticsearch.anon.Explore
import typings.elasticElasticsearch.anon.Force
import typings.elasticElasticsearch.anon.Get
import typings.elasticElasticsearch.anon.GetBasicStatus
import typings.elasticElasticsearch.anon.HotThreads_
import typings.elasticElasticsearch.elasticElasticsearchStrings.request
import typings.elasticElasticsearch.elasticElasticsearchStrings.response
import typings.elasticElasticsearch.elasticElasticsearchStrings.resurrect
import typings.elasticElasticsearch.elasticElasticsearchStrings.sniff
import typings.elasticElasticsearch.helpersMod.default
import typings.elasticElasticsearch.mod.ClientOptions
import typings.elasticElasticsearch.mod.ConnectionPool
import typings.elasticElasticsearch.mod.Serializer
import typings.elasticElasticsearch.mod.Transport
import typings.elasticElasticsearch.poolMod.ResurrectEvent
import typings.elasticElasticsearch.requestParamsMod.Bulk
import typings.elasticElasticsearch.requestParamsMod.ClearScroll
import typings.elasticElasticsearch.requestParamsMod.ClosePointInTime
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
import typings.elasticElasticsearch.requestParamsMod.Info
import typings.elasticElasticsearch.requestParamsMod.Mget
import typings.elasticElasticsearch.requestParamsMod.Msearch
import typings.elasticElasticsearch.requestParamsMod.MsearchTemplate
import typings.elasticElasticsearch.requestParamsMod.Mtermvectors
import typings.elasticElasticsearch.requestParamsMod.OpenPointInTime
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
import typings.elasticElasticsearch.transportMod.ApiError
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.Context
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.RequestEvent
import typings.elasticElasticsearch.transportMod.RequestNDBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestParams
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kibanaMod {
  
  // Extend API
  @js.native
  trait ClientExtendsCallbackOptions extends StObject {
    
    var ConfigurationError: typings.elasticElasticsearch.mod.errors.ConfigurationError = js.native
    
    def makeRequest(params: TransportRequestParams): js.Promise[Unit] | Unit = js.native
    def makeRequest(params: TransportRequestParams, options: TransportRequestOptions): js.Promise[Unit] | Unit = js.native
    
    var result: Body = js.native
  }
  
  // /Extend API
  @js.native
  trait KibanaClient extends StObject {
    
    /* GENERATED */
    var asyncSearch: Delete = js.native
    
    var autoscaling: DeleteAutoscalingPolicy_ = js.native
    
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Bulk[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def bulk[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Bulk[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var cat: Aliases = js.native
    
    var ccr: DeleteAutoFollowPattern_ = js.native
    
    def child(): KibanaClient = js.native
    def child(opts: ClientOptions): KibanaClient = js.native
    
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def clearScroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClearScroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def closePointInTime[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ClosePointInTime[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var cluster: AllocationExplain_ = js.native
    
    var connectionPool: ConnectionPool = js.native
    
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def count[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Count[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Create[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var danglingIndices: DeleteDanglingIndex_ = js.native
    
    def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Delete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def delete[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Delete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: DeleteByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def deleteByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQueryRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteByQueryRethrottle[TResponse, TContext](params: DeleteByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def deleteScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteScript[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteScript[TResponse, TContext](params: DeleteScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def deleteScript[TResponse, TContext](params: DeleteScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def emit(event: String, args: js.Any*): Boolean = js.native
    def emit(event: js.Symbol, args: js.Any*): Boolean = js.native
    
    var enrich: DeletePolicy_ = js.native
    
    var eql: Get = js.native
    
    def exists[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def exists[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def exists[TResponse, TContext](params: Exists): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def exists[TResponse, TContext](params: Exists, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def existsSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def existsSource[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def existsSource[TResponse, TContext](params: ExistsSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def existsSource[TResponse, TContext](params: ExistsSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def explain[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Explain[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def extend(method: String, fn: extendsCallback): Unit = js.native
    def extend(method: String, opts: Force, fn: extendsCallback): Unit = js.native
    
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def fieldCaps[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: FieldCaps[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def get[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def get[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Get): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def get[TResponse, TContext](params: typings.elasticElasticsearch.requestParamsMod.Get, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getScript[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScript[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScript[TResponse, TContext](params: GetScript): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScript[TResponse, TContext](params: GetScript, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getScriptContext[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptContext[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptContext[TResponse, TContext](params: GetScriptContext): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptContext[TResponse, TContext](params: GetScriptContext, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getScriptLanguages[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptLanguages[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getScriptLanguages[TResponse, TContext](params: GetScriptLanguages, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def getSource[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getSource[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getSource[TResponse, TContext](params: GetSource): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def getSource[TResponse, TContext](params: GetSource, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var graph: Explore = js.native
    
    var helpers: default = js.native
    
    var ilm: DeleteLifecycle_ = js.native
    
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def index[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Index[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var indices: AddBlock_ = js.native
    
    def info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: Info): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def info[TResponse, TContext](params: Info, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var ingest: DeletePipeline_ = js.native
    
    var license: GetBasicStatus = js.native
    
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mget[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mget[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var migration: Deprecations = js.native
    
    var ml: CloseJob_ = js.native
    
    var monitoring: typings.elasticElasticsearch.anon.Bulk = js.native
    
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearch[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: Msearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def msearchTemplate[TResponse, TRequestBody /* <: RequestNDBody[js.Array[Record[String, _]]] */, TContext](params: MsearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def mtermvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Mtermvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var nodes: HotThreads_ = js.native
    
    def off(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
    
    @JSName("on")
    def on_request(
      event: request,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_response(
      event: response,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_resurrect(event: resurrect, listener: js.Function2[/* err */ Null, /* meta */ ResurrectEvent, Unit]): this.type = js.native
    @JSName("on")
    def on_sniff(
      event: sniff,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    
    @JSName("once")
    def once_request(
      event: request,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_response(
      event: response,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    @JSName("once")
    def once_resurrect(event: resurrect, listener: js.Function2[/* err */ Null, /* meta */ ResurrectEvent, Unit]): this.type = js.native
    @JSName("once")
    def once_sniff(
      event: sniff,
      listener: js.Function2[/* err */ ApiError, /* meta */ RequestEvent[Record[String, _], Context], Unit]
    ): this.type = js.native
    
    def openPointInTime[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](params: OpenPointInTime): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def openPointInTime[TResponse, TContext](params: OpenPointInTime, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def ping[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def ping[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def ping[TResponse, TContext](params: Ping): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def ping[TResponse, TContext](params: Ping, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def putScript[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: PutScript[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def rankEval[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RankEval[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindex[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Reindex[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def reindexRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindexRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def reindexRethrottle[TResponse, TContext](params: ReindexRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def renderSearchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: RenderSearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var rollup: DeleteJob_ = js.native
    
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scriptsPainlessExecute[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: ScriptsPainlessExecute[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def scroll[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Scroll[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def search[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Search[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def searchShards[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchShards[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchShards[TResponse, TContext](params: SearchShards): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchShards[TResponse, TContext](params: SearchShards, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def searchTemplate[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchTemplate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var searchableSnapshots: ClearCache_ = js.native
    
    var security: Authenticate = js.native
    
    var serializer: Serializer = js.native
    
    var slm: ExecuteLifecycle = js.native
    
    var snapshot: CleanupRepository_ = js.native
    
    var sql: ClearCursor_ = js.native
    
    var ssl: Certificates = js.native
    
    var tasks: Cancel = js.native
    
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def termvectors[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Termvectors[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var transform: DeleteTransform_ = js.native
    
    var transport: Transport = js.native
    
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def update[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: Update[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQuery[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: UpdateByQuery[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    def updateByQueryRethrottle[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQueryRethrottle[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    def updateByQueryRethrottle[TResponse, TContext](params: UpdateByQueryRethrottle, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
    
    var watcher: AckWatch_ = js.native
    
    var xpack: typings.elasticElasticsearch.anon.Info = js.native
  }
  
  type extendsCallback = js.Function1[/* options */ ClientExtendsCallbackOptions, js.Any]
}
