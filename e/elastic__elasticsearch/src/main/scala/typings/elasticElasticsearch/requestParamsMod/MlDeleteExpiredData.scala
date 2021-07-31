package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDeleteExpiredData[T]
  extends StObject
     with Generic {
  
  var body: js.UndefOr[T] = js.undefined
  
  var job_id: js.UndefOr[String] = js.undefined
  
  var requests_per_second: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
}
object MlDeleteExpiredData {
  
  @scala.inline
  def apply[T](): MlDeleteExpiredData[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDeleteExpiredData[T]]
  }
  
  @scala.inline
  implicit class MlDeleteExpiredDataMutableBuilder[Self <: MlDeleteExpiredData[?], T] (val x: Self & MlDeleteExpiredData[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    @scala.inline
    def setRequests_per_second(value: Double): Self = StObject.set(x, "requests_per_second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequests_per_secondUndefined: Self = StObject.set(x, "requests_per_second", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
