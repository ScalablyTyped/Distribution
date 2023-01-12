package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var evaluation: MlDataframeEvaluationContainer
  
  var index: IndexName
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
}
object MlEvaluateDataFrameRequest {
  
  inline def apply(evaluation: MlDataframeEvaluationContainer, index: IndexName): MlEvaluateDataFrameRequest = {
    val __obj = js.Dynamic.literal(evaluation = evaluation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlEvaluateDataFrameRequest] (val x: Self) extends AnyVal {
    
    inline def setEvaluation(value: MlDataframeEvaluationContainer): Self = StObject.set(x, "evaluation", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
