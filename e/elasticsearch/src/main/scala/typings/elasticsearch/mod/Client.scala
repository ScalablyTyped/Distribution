package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticsearch", "Client")
@js.native
class Client protected () extends StObject {
  def this(params: ConfigOptions) = this()
  
  def bulk(params: BulkIndexDocumentsParams): js.Promise[_] = js.native
  def bulk(
    params: BulkIndexDocumentsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  var cat: Cat = js.native
  
  def clearScroll(params: ClearScrollParams): js.Promise[_] = js.native
  def clearScroll(params: ClearScrollParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
  
  def close(): Unit = js.native
  
  var cluster: Cluster = js.native
  
  def count(params: CountParams): js.Promise[CountResponse] = js.native
  def count(
    params: CountParams,
    callback: js.Function2[/* error */ js.Any, /* response */ CountResponse, Unit]
  ): Unit = js.native
  
  def create(params: CreateDocumentParams): js.Promise[CreateDocumentResponse] = js.native
  def create(
    params: CreateDocumentParams,
    callback: js.Function3[/* err */ js.Any, /* response */ CreateDocumentResponse, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def delete(params: DeleteDocumentParams): js.Promise[DeleteDocumentResponse] = js.native
  def delete(
    params: DeleteDocumentParams,
    callback: js.Function2[/* error */ js.Any, /* response */ DeleteDocumentResponse, Unit]
  ): Unit = js.native
  
  def deleteByQuery(params: DeleteDocumentByQueryParams): js.Promise[DeleteDocumentByQueryResponse] = js.native
  def deleteByQuery(
    params: DeleteDocumentByQueryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ DeleteDocumentByQueryResponse, Unit]
  ): Unit = js.native
  
  def deleteScript(params: DeleteScriptParams): js.Promise[_] = js.native
  def deleteScript(
    params: DeleteScriptParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def deleteTemplate(params: DeleteTemplateParams): js.Promise[_] = js.native
  def deleteTemplate(
    params: DeleteTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def exists(params: ExistsParams): js.Promise[Boolean] = js.native
  def exists(
    params: ExistsParams,
    callback: js.Function3[/* error */ js.Any, /* response */ Boolean, /* status */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  
  def explain(params: ExplainParams): js.Promise[ExplainResponse] = js.native
  def explain(
    params: ExplainParams,
    callback: js.Function2[/* error */ js.Any, /* response */ ExplainResponse, Unit]
  ): Unit = js.native
  
  def fieldStats(params: FieldStatsParams): js.Promise[FieldStatsResponse] = js.native
  def fieldStats(
    params: FieldStatsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ FieldStatsResponse, Unit]
  ): Unit = js.native
  
  def get[T](params: GetParams): js.Promise[GetResponse[T]] = js.native
  def get[T](params: GetParams, callback: js.Function2[/* error */ js.Any, /* response */ GetResponse[T], Unit]): Unit = js.native
  
  def getScript(params: GetScriptParams): js.Promise[_] = js.native
  def getScript(params: GetScriptParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
  
  def getSource(params: GetSourceParams): js.Promise[_] = js.native
  def getSource(params: GetSourceParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
  
  def getTemplate(params: GetTemplateParams): js.Promise[_] = js.native
  def getTemplate(params: GetTemplateParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
  
  def index[T](params: IndexDocumentParams[T]): js.Promise[_] = js.native
  def index[T](
    params: IndexDocumentParams[T],
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  var indices: Indices = js.native
  
  def info(params: InfoParams): js.Promise[_] = js.native
  def info(params: InfoParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
  
  var ingest: Ingest = js.native
  
  def mget[T](params: MGetParams): js.Promise[MGetResponse[T]] = js.native
  def mget[T](
    params: MGetParams,
    callback: js.Function2[/* error */ js.Any, /* response */ MGetResponse[T], Unit]
  ): Unit = js.native
  
  def msearch[T](params: MSearchParams): js.Promise[MSearchResponse[T]] = js.native
  def msearch[T](
    params: MSearchParams,
    callback: js.Function2[/* error */ js.Any, /* response */ MSearchResponse[T], Unit]
  ): Unit = js.native
  
  def msearchTemplate[T](params: MSearchTemplateParams): js.Promise[MSearchResponse[T]] = js.native
  def msearchTemplate[T](
    params: MSearchTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ MSearchResponse[T], Unit]
  ): Unit = js.native
  
  def mtermvectors(params: MTermVectorsParams): js.Promise[_] = js.native
  def mtermvectors(
    params: MTermVectorsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  var nodes: Nodes = js.native
  
  def ping(params: PingParams): js.Promise[_] = js.native
  def ping(
    params: PingParams,
    callback: js.Function3[/* err */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def putScript(params: PutScriptParams): js.Promise[_] = js.native
  def putScript(
    params: PutScriptParams,
    callback: js.Function3[/* err */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def putTemplate(params: PutTemplateParams): js.Promise[_] = js.native
  def putTemplate(
    params: PutTemplateParams,
    callback: js.Function3[/* err */ js.Any, /* response */ js.Any, /* status */ js.Any, Unit]
  ): Unit = js.native
  
  def reindex(params: ReindexParams): js.Promise[ReindexResponse] = js.native
  def reindex(
    params: ReindexParams,
    callback: js.Function2[/* error */ js.Any, /* response */ ReindexResponse, Unit]
  ): Unit = js.native
  
  def reindexRethrottle(params: ReindexRethrottleParams): js.Promise[_] = js.native
  def reindexRethrottle(
    params: ReindexRethrottleParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def renderSearchTemplate(params: RenderSearchTemplateParams): js.Promise[_] = js.native
  def renderSearchTemplate(
    params: RenderSearchTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def scroll[T](params: ScrollParams): js.Promise[SearchResponse[T]] = js.native
  def scroll[T](
    params: ScrollParams,
    callback: js.Function2[/* error */ js.Any, /* response */ SearchResponse[T], Unit]
  ): Unit = js.native
  
  def search[T](params: SearchParams): js.Promise[SearchResponse[T]] = js.native
  def search[T](
    params: SearchParams,
    callback: js.Function2[/* error */ js.Any, /* response */ SearchResponse[T], Unit]
  ): Unit = js.native
  
  def searchShards(params: SearchShardsParams): js.Promise[SearchShardsResponse] = js.native
  def searchShards(
    params: SearchShardsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ SearchShardsResponse, Unit]
  ): Unit = js.native
  
  def searchTemplate(params: SearchTemplateParams): js.Promise[_] = js.native
  def searchTemplate(
    params: SearchTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  var snapshot: Snapshot = js.native
  
  def suggest(params: SuggestParams): js.Promise[_] = js.native
  def suggest(params: SuggestParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
  
  var tasks: Tasks = js.native
  
  def termvectors(params: TermvectorsParams): js.Promise[_] = js.native
  def termvectors(params: TermvectorsParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]): Unit = js.native
  
  def update(params: UpdateDocumentParams): js.Promise[_] = js.native
  def update(
    params: UpdateDocumentParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, Unit]
  ): Unit = js.native
  
  def updateByQuery(params: UpdateDocumentByQueryParams): js.Promise[UpdateDocumentByQueryResponse] = js.native
  def updateByQuery(
    params: UpdateDocumentByQueryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ UpdateDocumentByQueryResponse, Unit]
  ): Unit = js.native
}
