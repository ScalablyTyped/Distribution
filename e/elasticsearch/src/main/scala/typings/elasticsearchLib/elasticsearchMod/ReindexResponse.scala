package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexResponse extends ReindexResponseBase {
  var failures: js.Array[_]
  var slices: js.UndefOr[js.Array[ReindexOrByQueryResponseSlice]] = js.undefined
  var timed_out: scala.Boolean
  var took: scala.Double
}

object ReindexResponse {
  @scala.inline
  def apply(
    batches: scala.Double,
    deleted: scala.Double,
    failures: js.Array[_],
    noops: scala.Double,
    requests_per_second: scala.Double,
    retries: elasticsearchLib.Anon_Bulk,
    throttled_millis: scala.Double,
    throttled_until_millis: scala.Double,
    timed_out: scala.Boolean,
    took: scala.Double,
    total: scala.Double,
    updated: scala.Double,
    version_conflicts: scala.Double,
    slices: js.Array[ReindexOrByQueryResponseSlice] = null
  ): ReindexResponse = {
    val __obj = js.Dynamic.literal(batches = batches, deleted = deleted, failures = failures, noops = noops, requests_per_second = requests_per_second, retries = retries, throttled_millis = throttled_millis, throttled_until_millis = throttled_until_millis, timed_out = timed_out, took = took, total = total, updated = updated, version_conflicts = version_conflicts)
    if (slices != null) __obj.updateDynamic("slices")(slices)
    __obj.asInstanceOf[ReindexResponse]
  }
}

