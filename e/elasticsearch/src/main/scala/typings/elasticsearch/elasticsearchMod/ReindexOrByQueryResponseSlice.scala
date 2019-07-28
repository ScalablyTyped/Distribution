package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.Anon_Bulk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexOrByQueryResponseSlice extends ReindexResponseBase {
  var slice_id: Double
}

object ReindexOrByQueryResponseSlice {
  @scala.inline
  def apply(
    batches: Double,
    deleted: Double,
    noops: Double,
    requests_per_second: Double,
    retries: Anon_Bulk,
    slice_id: Double,
    throttled_millis: Double,
    throttled_until_millis: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexOrByQueryResponseSlice = {
    val __obj = js.Dynamic.literal(batches = batches, deleted = deleted, noops = noops, requests_per_second = requests_per_second, retries = retries, slice_id = slice_id, throttled_millis = throttled_millis, throttled_until_millis = throttled_until_millis, total = total, updated = updated, version_conflicts = version_conflicts)
  
    __obj.asInstanceOf[ReindexOrByQueryResponseSlice]
  }
}

