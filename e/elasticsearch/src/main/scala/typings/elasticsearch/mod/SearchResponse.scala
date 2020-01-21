package typings.elasticsearch.mod

import typings.elasticsearch.AnonHits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse[T] extends js.Object {
  var _scroll_id: js.UndefOr[String] = js.undefined
  var _shards: ShardsResponse
  var aggregations: js.UndefOr[js.Any] = js.undefined
  var hits: AnonHits[T]
  var timed_out: Boolean
  var took: Double
}

object SearchResponse {
  @scala.inline
  def apply[T](
    _shards: ShardsResponse,
    hits: AnonHits[T],
    timed_out: Boolean,
    took: Double,
    _scroll_id: String = null,
    aggregations: js.Any = null
  ): SearchResponse[T] = {
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any])
    if (_scroll_id != null) __obj.updateDynamic("_scroll_id")(_scroll_id.asInstanceOf[js.Any])
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResponse[T]]
  }
}

