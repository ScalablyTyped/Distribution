package typings.elasticsearch.elasticsearchMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStatsResponse extends js.Object {
  var _shards: ShardsResponse
  var conflicts: js.UndefOr[StringDictionary[String]] = js.undefined
  var indices: StringDictionary[FieldStatsResponseIndex]
}

object FieldStatsResponse {
  @scala.inline
  def apply(
    _shards: ShardsResponse,
    indices: StringDictionary[FieldStatsResponseIndex],
    conflicts: StringDictionary[String] = null
  ): FieldStatsResponse = {
    val __obj = js.Dynamic.literal(_shards = _shards, indices = indices)
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts)
    __obj.asInstanceOf[FieldStatsResponse]
  }
}

