package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlPutJob[T] extends Generic {
  
  var body: T = js.native
  
  var job_id: String = js.native
}
object MlPutJob {
  
  @scala.inline
  def apply[T](body: T, job_id: String): MlPutJob[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutJob[T]]
  }
  
  @scala.inline
  implicit class MlPutJobMutableBuilder[Self <: MlPutJob[_], T] (val x: Self with MlPutJob[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
  }
}
