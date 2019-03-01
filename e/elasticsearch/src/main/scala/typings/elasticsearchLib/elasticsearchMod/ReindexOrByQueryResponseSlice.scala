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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batches")(batches)
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("noops")(noops)
    __obj.updateDynamic("requests_per_second")(requests_per_second)
    __obj.updateDynamic("retries")(retries)
    __obj.updateDynamic("slice_id")(slice_id)
    __obj.updateDynamic("throttled_millis")(throttled_millis)
    __obj.updateDynamic("throttled_until_millis")(throttled_until_millis)
    __obj.updateDynamic("total")(total)
    __obj.updateDynamic("updated")(updated)
    __obj.updateDynamic("version_conflicts")(version_conflicts)
    __obj.asInstanceOf[ReindexOrByQueryResponseSlice]
  }
}

