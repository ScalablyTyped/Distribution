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
trait BulkHelperOptions[TDocument] extends js.Object {
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  var concurrency: js.UndefOr[Double] = js.undefined
  var datasource: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, _, js.UndefOr[scala.Nothing]])
  var error_trace: js.UndefOr[Boolean] = js.undefined
  var filter_path: js.UndefOr[String | js.Array[String]] = js.undefined
  var flushBytes: js.UndefOr[Double] = js.undefined
  var flushInterval: js.UndefOr[Double] = js.undefined
  var human: js.UndefOr[Boolean] = js.undefined
  var ignore: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var onDrop: js.UndefOr[js.Function1[/* doc */ OnDropDocument[TDocument], Unit]] = js.undefined
  var pipeline: js.UndefOr[String] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.undefined
  var refreshOnCompletion: js.UndefOr[Boolean | String] = js.undefined
  var retries: js.UndefOr[Double] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  @JSName("wait")
  var wait_FBulkHelperOptions: js.UndefOr[Double] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
  def onDocument(doc: TDocument): Action
}

object BulkHelperOptions {
  @scala.inline
  def apply[TDocument](
    datasource: js.Array[TDocument] | Buffer | Readable | (AsyncIterator[TDocument, _, js.UndefOr[scala.Nothing]]),
    onDocument: TDocument => Action,
    _source: String | js.Array[String] = null,
    _source_exclude: String | js.Array[String] = null,
    _source_excludes: String | js.Array[String] = null,
    _source_include: String | js.Array[String] = null,
    _source_includes: String | js.Array[String] = null,
    concurrency: js.UndefOr[Double] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    flushBytes: js.UndefOr[Double] = js.undefined,
    flushInterval: js.UndefOr[Double] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: String = null,
    method: String = null,
    onDrop: /* doc */ OnDropDocument[TDocument] => Unit = null,
    pipeline: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    refresh: `true` | `false` | wait_for = null,
    refreshOnCompletion: Boolean | String = null,
    retries: js.UndefOr[Double] = js.undefined,
    routing: String = null,
    source: String = null,
    timeout: String = null,
    `type`: String = null,
    wait: js.UndefOr[Double] = js.undefined,
    wait_for_active_shards: String = null
  ): BulkHelperOptions[TDocument] = {
    val __obj = js.Dynamic.literal(datasource = datasource.asInstanceOf[js.Any], onDocument = js.Any.fromFunction1(onDocument))
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrency)) __obj.updateDynamic("concurrency")(concurrency.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(flushBytes)) __obj.updateDynamic("flushBytes")(flushBytes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flushInterval)) __obj.updateDynamic("flushInterval")(flushInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (onDrop != null) __obj.updateDynamic("onDrop")(js.Any.fromFunction1(onDrop))
    if (pipeline != null) __obj.updateDynamic("pipeline")(pipeline.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (refreshOnCompletion != null) __obj.updateDynamic("refreshOnCompletion")(refreshOnCompletion.asInstanceOf[js.Any])
    if (!js.isUndefined(retries)) __obj.updateDynamic("retries")(retries.get.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkHelperOptions[TDocument]]
  }
}

