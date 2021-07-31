package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlFlushJob[T]
  extends StObject
     with Generic {
  
  var advance_time: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[T] = js.undefined
  
  var calc_interim: js.UndefOr[Boolean] = js.undefined
  
  var end: js.UndefOr[String] = js.undefined
  
  var job_id: String
  
  var skip_time: js.UndefOr[String] = js.undefined
  
  var start: js.UndefOr[String] = js.undefined
}
object MlFlushJob {
  
  @scala.inline
  def apply[T](job_id: String): MlFlushJob[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFlushJob[T]]
  }
  
  @scala.inline
  implicit class MlFlushJobMutableBuilder[Self <: MlFlushJob[?], T] (val x: Self & MlFlushJob[T]) extends AnyVal {
    
    @scala.inline
    def setAdvance_time(value: String): Self = StObject.set(x, "advance_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvance_timeUndefined: Self = StObject.set(x, "advance_time", js.undefined)
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCalc_interim(value: Boolean): Self = StObject.set(x, "calc_interim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalc_interimUndefined: Self = StObject.set(x, "calc_interim", js.undefined)
    
    @scala.inline
    def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_time(value: String): Self = StObject.set(x, "skip_time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip_timeUndefined: Self = StObject.set(x, "skip_time", js.undefined)
    
    @scala.inline
    def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
