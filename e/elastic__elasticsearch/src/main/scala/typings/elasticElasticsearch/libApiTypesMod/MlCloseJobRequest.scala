package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlCloseJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var force: js.UndefOr[Boolean] = js.undefined
  
  var job_id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object MlCloseJobRequest {
  
  inline def apply(job_id: Id): MlCloseJobRequest = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlCloseJobRequest]
  }
  
  extension [Self <: MlCloseJobRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
