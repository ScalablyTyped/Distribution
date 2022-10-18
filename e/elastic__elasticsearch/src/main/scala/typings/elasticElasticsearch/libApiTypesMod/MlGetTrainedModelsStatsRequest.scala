package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlGetTrainedModelsStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  
  var from: js.UndefOr[integer] = js.undefined
  
  var model_id: js.UndefOr[Ids] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object MlGetTrainedModelsStatsRequest {
  
  inline def apply(): MlGetTrainedModelsStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlGetTrainedModelsStatsRequest]
  }
  
  extension [Self <: MlGetTrainedModelsStatsRequest](x: Self) {
    
    inline def setAllow_no_match(value: Boolean): Self = StObject.set(x, "allow_no_match", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_matchUndefined: Self = StObject.set(x, "allow_no_match", js.undefined)
    
    inline def setFrom(value: integer): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setModel_id(value: Ids): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setModel_idUndefined: Self = StObject.set(x, "model_id", js.undefined)
    
    inline def setModel_idVarargs(value: Id*): Self = StObject.set(x, "model_id", js.Array(value*))
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
