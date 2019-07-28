package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.Anon_Hits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse[T] extends js.Object {
  var _scroll_id: js.UndefOr[String] = js.undefined
  var _shards: ShardsResponse
  var aggregations: js.UndefOr[js.Any] = js.undefined
  var hits: Anon_Hits[T]
  var timed_out: Boolean
  var took: Double
}

object SearchResponse {
  @scala.inline
  def apply[T](
    _shards: ShardsResponse,
    hits: Anon_Hits[T],
    timed_out: Boolean,
    took: Double,
    _scroll_id: String = null,
    aggregations: js.Any = null
  ): SearchResponse[T] = {
    val __obj = js.Dynamic.literal(_shards = _shards, hits = hits, timed_out = timed_out, took = took)
    if (_scroll_id != null) __obj.updateDynamic("_scroll_id")(_scroll_id)
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations)
    __obj.asInstanceOf[SearchResponse[T]]
  }
}

