package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetOverallBuckets[T] extends Generic {
  
  var allow_no_jobs: js.UndefOr[Boolean] = js.native
  
  var allow_no_match: js.UndefOr[Boolean] = js.native
  
  var body: js.UndefOr[T] = js.native
  
  var bucket_span: js.UndefOr[String] = js.native
  
  var end: js.UndefOr[String] = js.native
  
  var exclude_interim: js.UndefOr[Boolean] = js.native
  
  var job_id: String = js.native
  
  var overall_score: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[String] = js.native
  
  var top_n: js.UndefOr[Double] = js.native
}
object MlGetOverallBuckets {
  
  @scala.inline
  def apply[T](job_id: String): MlGetOverallBuckets[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetOverallBuckets[T]]
  }
  
  @scala.inline
  implicit class MlGetOverallBucketsOps[Self <: MlGetOverallBuckets[_], T] (val x: Self with MlGetOverallBuckets[T]) extends AnyVal {
    
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
    def setJob_id(value: String): Self = this.set("job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_jobs(value: Boolean): Self = this.set("allow_no_jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_jobs: Self = this.set("allow_no_jobs", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = this.set("allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow_no_match: Self = this.set("allow_no_match", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBucket_span(value: String): Self = this.set("bucket_span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucket_span: Self = this.set("bucket_span", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setExclude_interim(value: Boolean): Self = this.set("exclude_interim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude_interim: Self = this.set("exclude_interim", js.undefined)
    
    @scala.inline
    def setOverall_score(value: Double): Self = this.set("overall_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverall_score: Self = this.set("overall_score", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setTop_n(value: Double): Self = this.set("top_n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop_n: Self = this.set("top_n", js.undefined)
  }
}
