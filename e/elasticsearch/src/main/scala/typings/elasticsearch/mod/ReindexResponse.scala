package typings.elasticsearch.mod

import typings.elasticsearch.anon.Bulk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReindexResponse extends ReindexResponseBase {
  
  var failures: js.Array[_] = js.native
  
  var slices: js.UndefOr[js.Array[ReindexOrByQueryResponseSlice]] = js.native
  
  var timed_out: Boolean = js.native
  
  var took: Double = js.native
}
object ReindexResponse {
  
  @scala.inline
  def apply(
    batches: Double,
    deleted: Double,
    failures: js.Array[_],
    noops: Double,
    requests_per_second: Double,
    retries: Bulk,
    throttled_millis: Double,
    throttled_until_millis: Double,
    timed_out: Boolean,
    took: Double,
    total: Double,
    updated: Double,
    version_conflicts: Double
  ): ReindexResponse = {
    val __obj = js.Dynamic.literal(batches = batches.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], noops = noops.asInstanceOf[js.Any], requests_per_second = requests_per_second.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], throttled_millis = throttled_millis.asInstanceOf[js.Any], throttled_until_millis = throttled_until_millis.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], took = took.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], version_conflicts = version_conflicts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexResponse]
  }
  
  @scala.inline
  implicit class ReindexResponseOps[Self <: ReindexResponse] (val x: Self) extends AnyVal {
    
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
    def setFailuresVarargs(value: js.Any*): Self = this.set("failures", js.Array(value :_*))
    
    @scala.inline
    def setFailures(value: js.Array[_]): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimed_out(value: Boolean): Self = this.set("timed_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTook(value: Double): Self = this.set("took", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesVarargs(value: ReindexOrByQueryResponseSlice*): Self = this.set("slices", js.Array(value :_*))
    
    @scala.inline
    def setSlices(value: js.Array[ReindexOrByQueryResponseSlice]): Self = this.set("slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlices: Self = this.set("slices", js.undefined)
  }
}
