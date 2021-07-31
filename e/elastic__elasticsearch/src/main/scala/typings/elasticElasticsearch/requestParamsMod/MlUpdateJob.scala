package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlUpdateJob[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var job_id: String
}
object MlUpdateJob {
  
  @scala.inline
  def apply[T](body: T, job_id: String): MlUpdateJob[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateJob[T]]
  }
  
  @scala.inline
  implicit class MlUpdateJobMutableBuilder[Self <: MlUpdateJob[?], T] (val x: Self & MlUpdateJob[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
