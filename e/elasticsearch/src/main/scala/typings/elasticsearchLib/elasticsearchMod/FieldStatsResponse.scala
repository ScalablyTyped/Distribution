package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldStatsResponse extends js.Object {
  var _shards: ShardsResponse
  var conflicts: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var indices: org.scalablytyped.runtime.StringDictionary[FieldStatsResponseIndex]
}

object FieldStatsResponse {
  @scala.inline
  def apply(
    _shards: ShardsResponse,
    indices: org.scalablytyped.runtime.StringDictionary[FieldStatsResponseIndex],
    conflicts: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): FieldStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_shards")(_shards)
    __obj.updateDynamic("indices")(indices)
    if (conflicts != null) __obj.updateDynamic("conflicts")(conflicts)
    __obj.asInstanceOf[FieldStatsResponse]
  }
}

