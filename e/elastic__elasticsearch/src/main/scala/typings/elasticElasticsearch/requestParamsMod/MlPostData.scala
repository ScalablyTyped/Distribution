package typings.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPostData[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var job_id: String
  
  var reset_end: js.UndefOr[String] = js.undefined
  
  var reset_start: js.UndefOr[String] = js.undefined
}
object MlPostData {
  
  inline def apply[T](body: T, job_id: String): MlPostData[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostData[T]]
  }
  
  extension [Self <: MlPostData[?], T](x: Self & MlPostData[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setReset_end(value: String): Self = StObject.set(x, "reset_end", value.asInstanceOf[js.Any])
    
    inline def setReset_endUndefined: Self = StObject.set(x, "reset_end", js.undefined)
    
    inline def setReset_start(value: String): Self = StObject.set(x, "reset_start", value.asInstanceOf[js.Any])
    
    inline def setReset_startUndefined: Self = StObject.set(x, "reset_start", js.undefined)
  }
}
