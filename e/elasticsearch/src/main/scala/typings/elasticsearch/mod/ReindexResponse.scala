package typings.elasticsearch.mod

import typings.elasticsearch.anon.Bulk
import org.scalablytyped.runtime.StObject
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
  implicit class ReindexResponseMutableBuilder[Self <: ReindexResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: js.Array[_]): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresVarargs(value: js.Any*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setSlices(value: js.Array[ReindexOrByQueryResponseSlice]): Self = StObject.set(x, "slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "slices", js.undefined)
    
    @scala.inline
    def setSlicesVarargs(value: ReindexOrByQueryResponseSlice*): Self = StObject.set(x, "slices", js.Array(value :_*))
    
    @scala.inline
    def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTook(value: Double): Self = StObject.set(x, "took", value.asInstanceOf[js.Any])
  }
}
