package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEstimateModelMemoryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var analysis_config: js.UndefOr[MlAnalysisConfig] = js.undefined
  
  var max_bucket_cardinality: js.UndefOr[Record[Field, long]] = js.undefined
  
  var overall_cardinality: js.UndefOr[Record[Field, long]] = js.undefined
}
object MlEstimateModelMemoryRequest {
  
  inline def apply(): MlEstimateModelMemoryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlEstimateModelMemoryRequest]
  }
  
  extension [Self <: MlEstimateModelMemoryRequest](x: Self) {
    
    inline def setAnalysis_config(value: MlAnalysisConfig): Self = StObject.set(x, "analysis_config", value.asInstanceOf[js.Any])
    
    inline def setAnalysis_configUndefined: Self = StObject.set(x, "analysis_config", js.undefined)
    
    inline def setMax_bucket_cardinality(value: Record[Field, long]): Self = StObject.set(x, "max_bucket_cardinality", value.asInstanceOf[js.Any])
    
    inline def setMax_bucket_cardinalityUndefined: Self = StObject.set(x, "max_bucket_cardinality", js.undefined)
    
    inline def setOverall_cardinality(value: Record[Field, long]): Self = StObject.set(x, "overall_cardinality", value.asInstanceOf[js.Any])
    
    inline def setOverall_cardinalityUndefined: Self = StObject.set(x, "overall_cardinality", js.undefined)
  }
}
