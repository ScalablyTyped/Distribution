package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutJob[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var job_id: String
}
object MlPutJob {
  
  @scala.inline
  def apply[T](body: T, job_id: String): MlPutJob[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutJob[T]]
  }
  
  @scala.inline
  implicit class MlPutJobMutableBuilder[Self <: MlPutJob[?], T] (val x: Self & MlPutJob[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
