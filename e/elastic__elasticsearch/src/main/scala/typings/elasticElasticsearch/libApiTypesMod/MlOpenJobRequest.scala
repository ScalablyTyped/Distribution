package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlOpenJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var job_id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlOpenJobRequest {
  
  inline def apply(job_id: Id): MlOpenJobRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlOpenJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlOpenJobRequest] (val x: Self) extends AnyVal {
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
