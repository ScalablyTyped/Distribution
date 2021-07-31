package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetBuckets[T]
  extends StObject
     with Generic {
  
  var anomaly_score: js.UndefOr[Double] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var desc: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[String] = js.undefined
  
  var exclude_interim: js.UndefOr[Boolean] = js.undefined
  
  var expand: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[Double] = js.undefined
  
  var job_id: String
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sort: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
  
  var timestamp: js.UndefOr[String] = js.undefined
}
object MlGetBuckets {
  
  @scala.inline
  def apply[T](job_id: String): MlGetBuckets[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetBuckets[T]]
  }
  
  @scala.inline
  implicit class MlGetBucketsMutableBuilder[Self <: MlGetBuckets[?], T] (val x: Self & MlGetBuckets[T]) extends AnyVal {
    
    @scala.inline
    def setAnomaly_score(value: Double): Self = StObject.set(x, "anomaly_score", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnomaly_scoreUndefined: Self = StObject.set(x, "anomaly_score", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setExclude_interim(value: Boolean): Self = StObject.set(x, "exclude_interim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclude_interimUndefined: Self = StObject.set(x, "exclude_interim", js.undefined)
    
    @scala.inline
    def setExpand(value: Boolean): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
