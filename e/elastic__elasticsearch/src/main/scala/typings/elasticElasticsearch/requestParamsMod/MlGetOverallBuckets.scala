package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetOverallBuckets[T]
  extends StObject
     with Generic {
  
  var allow_no_jobs: js.UndefOr[Boolean] = js.undefined
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var bucket_span: js.UndefOr[String] = js.undefined
  
  var end: js.UndefOr[String] = js.undefined
  
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  
  var job_id: String
  
  var overall_score: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var top_n: js.UndefOr[Double] = js.undefined
}
object MlGetOverallBuckets {
  
  @scala.inline
  def apply[T](job_id: String): MlGetOverallBuckets[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetOverallBuckets[T]]
  }
  
  @scala.inline
  implicit class MlGetOverallBucketsMutableBuilder[Self <: MlGetOverallBuckets[?], T] (val x: Self & MlGetOverallBuckets[T]) extends AnyVal {
    
    @scala.inline
    def setAllow_no_jobs(value: Boolean): Self = StObject.set(x, "allow_no_jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_jobsUndefined: Self = StObject.set(x, "allow_no_jobs", js.undefined)
    
    @scala.inline
    def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setBucket_span(value: String): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket_spanUndefined: Self = StObject.set(x, "bucket_span", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setExclude_interim(value: Boolean): Self = StObject.set(x, "exclude_interim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_interimUndefined: Self = StObject.set(x, "exclude_interim", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverall_score(value: Double): Self = StObject.set(x, "overall_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverall_scoreUndefined: Self = StObject.set(x, "overall_score", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTop_n(value: Double): Self = StObject.set(x, "top_n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_nUndefined: Self = StObject.set(x, "top_n", js.undefined)
  }
}
