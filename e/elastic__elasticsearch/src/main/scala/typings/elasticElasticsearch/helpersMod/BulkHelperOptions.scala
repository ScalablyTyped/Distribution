package typings.elasticElasticsearch.helpersMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent @elastic/elasticsearch.@elastic/elasticsearch/lib/Helpers.Omit<@elastic/elasticsearch.@elastic/elasticsearch/api/requestParams.Bulk<@elastic/elasticsearch.@elastic/elasticsearch/lib/Transport.RequestNDBody<std.Array<std.Record<string, any>>>>, 'body'> */
@js.native
trait BulkHelperOptions[TDocument] extends js.Object {
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
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.native
  var index: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var onDrop: js.UndefOr[js.Function1[/* doc */ OnDropDocument[TDocument], Unit]] = js.native
  var pipeline: js.UndefOr[String] = js.native
  var pretty: js.UndefOr[Boolean] = js.native
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.native
  var refreshOnCompletion: js.UndefOr[Boolean | String] = js.native
  var retries: js.UndefOr[Double] = js.native
  var routing: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  @JSName("wait")
  var wait_FBulkHelperOptions: js.UndefOr[Double] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
  def onDocument(doc: TDocument): Action = js.native
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
  implicit class BulkHelperOptionsOps[Self <: BulkHelperOptions[_], TDocument] (val x: Self with BulkHelperOptions[TDocument]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatasourceVarargs(value: TDocument*): Self = this.set("datasource", js.Array(value :_*))
    @scala.inline
    def setDatasource(
      value: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, _, js.UndefOr[scala.Nothing]])
    ): Self = this.set("datasource", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDocument(value: TDocument => Action): Self = this.set("onDocument", js.Any.fromFunction1(value))
    @scala.inline
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    @scala.inline
    def set_source(value: String | js.Array[String]): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_source_excludeVarargs(value: String*): Self = this.set("_source_exclude", js.Array(value :_*))
    @scala.inline
    def set_source_exclude(value: String | js.Array[String]): Self = this.set("_source_exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_exclude: Self = this.set("_source_exclude", js.undefined)
    @scala.inline
    def set_source_excludesVarargs(value: String*): Self = this.set("_source_excludes", js.Array(value :_*))
    @scala.inline
    def set_source_excludes(value: String | js.Array[String]): Self = this.set("_source_excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_excludes: Self = this.set("_source_excludes", js.undefined)
    @scala.inline
    def set_source_includeVarargs(value: String*): Self = this.set("_source_include", js.Array(value :_*))
    @scala.inline
    def set_source_include(value: String | js.Array[String]): Self = this.set("_source_include", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_include: Self = this.set("_source_include", js.undefined)
    @scala.inline
    def set_source_includesVarargs(value: String*): Self = this.set("_source_includes", js.Array(value :_*))
    @scala.inline
    def set_source_includes(value: String | js.Array[String]): Self = this.set("_source_includes", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_includes: Self = this.set("_source_includes", js.undefined)
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    @scala.inline
    def setError_trace(value: Boolean): Self = this.set("error_trace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_trace: Self = this.set("error_trace", js.undefined)
    @scala.inline
    def setFilter_pathVarargs(value: String*): Self = this.set("filter_path", js.Array(value :_*))
    @scala.inline
    def setFilter_path(value: String | js.Array[String]): Self = this.set("filter_path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_path: Self = this.set("filter_path", js.undefined)
    @scala.inline
    def setFlushBytes(value: Double): Self = this.set("flushBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushBytes: Self = this.set("flushBytes", js.undefined)
    @scala.inline
    def setFlushInterval(value: Double): Self = this.set("flushInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlushInterval: Self = this.set("flushInterval", js.undefined)
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: Double*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: Double | js.Array[Double]): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOnDrop(value: /* doc */ OnDropDocument[TDocument] => Unit): Self = this.set("onDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDrop: Self = this.set("onDrop", js.undefined)
    @scala.inline
    def setPipeline(value: String): Self = this.set("pipeline", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipeline: Self = this.set("pipeline", js.undefined)
    @scala.inline
    def setPretty(value: Boolean): Self = this.set("pretty", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePretty: Self = this.set("pretty", js.undefined)
    @scala.inline
    def setRefresh(value: `true` | `false` | wait_for): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setRefreshOnCompletion(value: Boolean | String): Self = this.set("refreshOnCompletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefreshOnCompletion: Self = this.set("refreshOnCompletion", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
    @scala.inline
    def setWait_for_active_shards(value: String): Self = this.set("wait_for_active_shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_active_shards: Self = this.set("wait_for_active_shards", js.undefined)
  }
  
}

