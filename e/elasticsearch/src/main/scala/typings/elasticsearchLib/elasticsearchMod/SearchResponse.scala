package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResponse[T] extends js.Object {
  var _scroll_id: js.UndefOr[java.lang.String] = js.undefined
  var _shards: ShardsResponse
  var aggregations: js.UndefOr[js.Any] = js.undefined
  var hits: elasticsearchLib.Anon_Hits[T]
  var timed_out: scala.Boolean
  var took: scala.Double
}

object SearchResponse {
  @scala.inline
  def apply[T](
    _shards: ShardsResponse,
    hits: elasticsearchLib.Anon_Hits[T],
    timed_out: scala.Boolean,
    took: scala.Double,
    _scroll_id: java.lang.String = null,
    aggregations: js.Any = null
  ): SearchResponse[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_shards")(_shards)
    __obj.updateDynamic("hits")(hits)
    __obj.updateDynamic("timed_out")(timed_out)
    __obj.updateDynamic("took")(took)
    if (_scroll_id != null) __obj.updateDynamic("_scroll_id")(_scroll_id)
    if (aggregations != null) __obj.updateDynamic("aggregations")(aggregations)
    __obj.asInstanceOf[SearchResponse[T]]
  }
}

