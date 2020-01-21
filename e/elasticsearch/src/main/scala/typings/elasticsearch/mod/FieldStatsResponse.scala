package typings.elasticsearch.mod

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
    val __obj = js.Dynamic.literal(_shards = _shards.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any])
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldStatsResponse]
  }
}

