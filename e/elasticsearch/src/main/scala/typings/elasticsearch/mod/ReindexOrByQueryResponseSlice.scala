package typings.elasticsearch.mod

import typings.elasticsearch.anon.Bulk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReindexOrByQueryResponseSlice extends ReindexResponseBase {
  var slice_id: Double = js.native
}

object ReindexOrByQueryResponseSlice {
  @scala.inline
  def apply(
    batches: Double,
    deleted: Double,
    noops: Double,
    requests_per_second: Double,
    retries: Bulk,
    slice_id: Double,
    throttled_millis: Double,
    throttled_until_millis: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexOrByQueryResponseSlice = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], slice_id = slice_id.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexOrByQueryResponseSlice]
  }
  @scala.inline
  implicit class ReindexOrByQueryResponseSliceOps[Self <: ReindexOrByQueryResponseSlice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSlice_id(value: Double): Self = this.set("slice_id", value.asInstanceOf[js.Any])
  }
  
}

