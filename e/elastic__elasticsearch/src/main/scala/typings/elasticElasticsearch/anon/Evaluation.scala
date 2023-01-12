package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDataframeEvaluationContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Evaluation extends StObject {
  
  var evaluation: MlDataframeEvaluationContainer
  
  var index: IndexName
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
}
object Evaluation {
  
  inline def apply(evaluation: MlDataframeEvaluationContainer, index: IndexName): Evaluation = {
    val __obj = js.Dynamic.literal(evaluation = evaluation.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Evaluation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Evaluation] (val x: Self) extends AnyVal {
    
    inline def setEvaluation(value: MlDataframeEvaluationContainer): Self = StObject.set(x, "evaluation", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
