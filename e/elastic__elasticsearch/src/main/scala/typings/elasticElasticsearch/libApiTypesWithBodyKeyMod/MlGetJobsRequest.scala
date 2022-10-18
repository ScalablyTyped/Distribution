package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetJobsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var exclude_generated: js.UndefOr[Boolean] = js.undefined
  
  var job_id: js.UndefOr[Ids] = js.undefined
}
object MlGetJobsRequest {
  
  inline def apply(): MlGetJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetJobsRequest]
  }
  
  extension [Self <: MlGetJobsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setExclude_generated(value: Boolean): Self = StObject.set(x, "exclude_generated", value.asInstanceOf[js.Any])
    
    inline def setExclude_generatedUndefined: Self = StObject.set(x, "exclude_generated", js.undefined)
    
    inline def setJob_id(value: Ids): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setJob_idVarargs(value: Id*): Self = StObject.set(x, "job_id", js.Array(value*))
  }
}
