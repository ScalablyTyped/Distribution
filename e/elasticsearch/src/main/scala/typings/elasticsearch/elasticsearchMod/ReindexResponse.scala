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
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexResponse]
  }
}

