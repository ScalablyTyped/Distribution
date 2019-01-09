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

