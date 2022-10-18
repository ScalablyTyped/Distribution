package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisClassification
  extends StObject
     with MlDataframeAnalysis {
  
  var class_assignment_objective: js.UndefOr[String] = js.undefined
  
  var num_top_classes: js.UndefOr[integer] = js.undefined
}
object MlDataframeAnalysisClassification {
  
  inline def apply(dependent_variable: String): MlDataframeAnalysisClassification = {
    val __obj = js.Dynamic.literal(dependent_variable = dependent_variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisClassification]
  }
  
  extension [Self <: MlDataframeAnalysisClassification](x: Self) {
    
    inline def setClass_assignment_objective(value: String): Self = StObject.set(x, "class_assignment_objective", value.asInstanceOf[js.Any])
    
    inline def setClass_assignment_objectiveUndefined: Self = StObject.set(x, "class_assignment_objective", js.undefined)
    
    inline def setNum_top_classes(value: integer): Self = StObject.set(x, "num_top_classes", value.asInstanceOf[js.Any])
    
    inline def setNum_top_classesUndefined: Self = StObject.set(x, "num_top_classes", js.undefined)
  }
}
