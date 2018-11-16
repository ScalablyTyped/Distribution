package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("elasticsearch", "Client")
@js.native
class Client protected () extends js.Object {
  def this(params: ConfigOptions) = this()
  var cat: Cat = js.native
  var cluster: Cluster = js.native
  var indices: Indices = js.native
  var ingest: Ingest = js.native
  var nodes: Nodes = js.native
  var snapshot: Snapshot = js.native
  var tasks: Tasks = js.native
  def bulk(params: BulkIndexDocumentsParams): stdLib.Promise[_] = js.native
  def bulk(
    params: BulkIndexDocumentsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def clearScroll(params: ClearScrollParams): stdLib.Promise[_] = js.native
  def clearScroll(
    params: ClearScrollParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def count(params: CountParams): stdLib.Promise[CountResponse] = js.native
  def count(
    params: CountParams,
    callback: js.Function2[/* error */ js.Any, /* response */ CountResponse, scala.Unit]
  ): scala.Unit = js.native
  def create(params: CreateDocumentParams): stdLib.Promise[CreateDocumentResponse] = js.native
  def create(
    params: CreateDocumentParams,
    callback: js.Function3[
      /* err */ js.Any, 
      /* response */ CreateDocumentResponse, 
      /* status */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def delete(params: DeleteDocumentParams): stdLib.Promise[DeleteDocumentResponse] = js.native
  def delete(
    params: DeleteDocumentParams,
    callback: js.Function2[/* error */ js.Any, /* response */ DeleteDocumentResponse, scala.Unit]
  ): scala.Unit = js.native
  def deleteByQuery(params: DeleteDocumentByQueryParams): stdLib.Promise[DeleteDocumentByQueryResponse] = js.native
  def deleteByQuery(
    params: DeleteDocumentByQueryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ DeleteDocumentByQueryResponse, scala.Unit]
  ): scala.Unit = js.native
  def deleteScript(params: DeleteScriptParams): stdLib.Promise[_] = js.native
  def deleteScript(
    params: DeleteScriptParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def deleteTemplate(params: DeleteTemplateParams): stdLib.Promise[_] = js.native
  def deleteTemplate(
    params: DeleteTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def exists(params: ExistsParams): stdLib.Promise[scala.Boolean] = js.native
  def exists(
    params: ExistsParams,
    callback: js.Function3[
      /* error */ js.Any, 
      /* response */ scala.Boolean, 
      /* status */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def explain(params: ExplainParams): stdLib.Promise[ExplainResponse] = js.native
  def explain(
    params: ExplainParams,
    callback: js.Function2[/* error */ js.Any, /* response */ ExplainResponse, scala.Unit]
  ): scala.Unit = js.native
  def fieldStats(params: FieldStatsParams): stdLib.Promise[FieldStatsResponse] = js.native
  def fieldStats(
    params: FieldStatsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ FieldStatsResponse, scala.Unit]
  ): scala.Unit = js.native
  def get[T](params: GetParams): stdLib.Promise[GetResponse[T]] = js.native
  def get[T](
    params: GetParams,
    callback: js.Function2[/* error */ js.Any, /* response */ GetResponse[T], scala.Unit]
  ): scala.Unit = js.native
  def getScript(params: GetScriptParams): stdLib.Promise[_] = js.native
  def getScript(
    params: GetScriptParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getSource(params: GetSourceParams): stdLib.Promise[_] = js.native
  def getSource(
    params: GetSourceParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getTemplate(params: GetTemplateParams): stdLib.Promise[_] = js.native
  def getTemplate(
    params: GetTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def index[T](params: IndexDocumentParams[T]): stdLib.Promise[_] = js.native
  def index[T](
    params: IndexDocumentParams[T],
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def info(params: InfoParams): stdLib.Promise[_] = js.native
  def info(params: InfoParams, callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]): scala.Unit = js.native
  def mget[T](params: MGetParams): stdLib.Promise[MGetResponse[T]] = js.native
  def mget[T](
    params: MGetParams,
    callback: js.Function2[/* error */ js.Any, /* response */ MGetResponse[T], scala.Unit]
  ): scala.Unit = js.native
  def msearch[T](params: MSearchParams): stdLib.Promise[MSearchResponse[T]] = js.native
  def msearch[T](
    params: MSearchParams,
    callback: js.Function2[/* error */ js.Any, /* response */ MSearchResponse[T], scala.Unit]
  ): scala.Unit = js.native
  def msearchTemplate[T](params: MSearchTemplateParams): stdLib.Promise[MSearchResponse[T]] = js.native
  def msearchTemplate[T](
    params: MSearchTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ MSearchResponse[T], scala.Unit]
  ): scala.Unit = js.native
  def mtermvectors(params: MTermVectorsParams): stdLib.Promise[_] = js.native
  def mtermvectors(
    params: MTermVectorsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def ping(params: PingParams): stdLib.Promise[_] = js.native
  def ping(
    params: PingParams,
    callback: js.Function3[/* err */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putScript(params: PutScriptParams): stdLib.Promise[_] = js.native
  def putScript(
    params: PutScriptParams,
    callback: js.Function3[/* err */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def putTemplate(params: PutTemplateParams): stdLib.Promise[_] = js.native
  def putTemplate(
    params: PutTemplateParams,
    callback: js.Function3[/* err */ js.Any, /* response */ js.Any, /* status */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def reindex(params: ReindexParams): stdLib.Promise[ReindexResponse] = js.native
  def reindex(
    params: ReindexParams,
    callback: js.Function2[/* error */ js.Any, /* response */ ReindexResponse, scala.Unit]
  ): scala.Unit = js.native
  def reindexRethrottle(params: ReindexRethrottleParams): stdLib.Promise[_] = js.native
  def reindexRethrottle(
    params: ReindexRethrottleParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def renderSearchTemplate(params: RenderSearchTemplateParams): stdLib.Promise[_] = js.native
  def renderSearchTemplate(
    params: RenderSearchTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def scroll[T](params: ScrollParams): stdLib.Promise[SearchResponse[T]] = js.native
  def scroll[T](
    params: ScrollParams,
    callback: js.Function2[/* error */ js.Any, /* response */ SearchResponse[T], scala.Unit]
  ): scala.Unit = js.native
  def search[T](params: SearchParams): stdLib.Promise[SearchResponse[T]] = js.native
  def search[T](
    params: SearchParams,
    callback: js.Function2[/* error */ js.Any, /* response */ SearchResponse[T], scala.Unit]
  ): scala.Unit = js.native
  def searchShards(params: SearchShardsParams): stdLib.Promise[SearchShardsResponse] = js.native
  def searchShards(
    params: SearchShardsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ SearchShardsResponse, scala.Unit]
  ): scala.Unit = js.native
  def searchTemplate(params: SearchTemplateParams): stdLib.Promise[_] = js.native
  def searchTemplate(
    params: SearchTemplateParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def suggest(params: SuggestParams): stdLib.Promise[_] = js.native
  def suggest(
    params: SuggestParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def termvectors(params: TermvectorsParams): stdLib.Promise[_] = js.native
  def termvectors(
    params: TermvectorsParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def update(params: UpdateDocumentParams): stdLib.Promise[_] = js.native
  def update(
    params: UpdateDocumentParams,
    callback: js.Function2[/* error */ js.Any, /* response */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def updateByQuery(params: UpdateDocumentByQueryParams): stdLib.Promise[UpdateDocumentByQueryResponse] = js.native
  def updateByQuery(
    params: UpdateDocumentByQueryParams,
    callback: js.Function2[/* error */ js.Any, /* response */ UpdateDocumentByQueryResponse, scala.Unit]
  ): scala.Unit = js.native
}

