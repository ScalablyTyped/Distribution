package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.Anon_Bulk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexResponse extends ReindexResponseBase {
  var failures: js.Array[_]
  var slices: js.UndefOr[js.Array[ReindexOrByQueryResponseSlice]] = js.undefined
  var timed_out: Boolean
  var took: Double
}

object ReindexResponse {
  @scala.inline
  def apply(
    batches: Double,
    deleted: Double,
    failures: js.Array[_],
    noops: Double,
    requests_per_second: Double,
    retries: Anon_Bulk,
    throttled_millis: Double,
    throttled_until_millis: Double,
    timed_out: Boolean,
    took: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double,
    slices: js.Array[ReindexOrByQueryResponseSlice] = null
  ): ReindexResponse = {
    val __obj = js.Dynamic.literal(batches = batches, deleted = deleted, failures = failures, noops = noops, requests_per_second = requests_per_second, retries = retries, throttled_millis = throttled_millis, throttled_until_millis = throttled_until_millis, timed_out = timed_out, took = took, total = total, updated = updated, version_conflicts = version_conflicts)
    if (slices != null) __obj.updateDynamic("slices")(slices)
    __obj.asInstanceOf[ReindexResponse]
  }
}

