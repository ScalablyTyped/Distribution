package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexOrByQueryResponseSlice extends ReindexResponseBase {
  var slice_id: scala.Double
}

object ReindexOrByQueryResponseSlice {
  @scala.inline
  def apply(
    batches: scala.Double,
    deleted: scala.Double,
    noops: scala.Double,
    requests_per_second: scala.Double,
    retries: elasticsearchLib.Anon_Bulk,
    slice_id: scala.Double,
    throttled_millis: scala.Double,
    throttled_until_millis: scala.Double,
    total: scala.Double,
    updated: scala.Double,
    version_conflicts: scala.Double
  ): ReindexOrByQueryResponseSlice = {
    val __obj = js.Dynamic.literal(batches = batches, deleted = deleted, noops = noops, requests_per_second = requests_per_second, retries = retries, slice_id = slice_id, throttled_millis = throttled_millis, throttled_until_millis = throttled_until_millis, total = total, updated = updated, version_conflicts = version_conflicts)
  
    __obj.asInstanceOf[ReindexOrByQueryResponseSlice]
  }
}

