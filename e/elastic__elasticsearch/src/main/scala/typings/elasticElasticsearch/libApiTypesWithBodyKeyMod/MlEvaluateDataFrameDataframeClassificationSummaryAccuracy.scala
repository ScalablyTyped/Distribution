package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeClassificationSummaryAccuracy extends StObject {
  
  var classes: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]
  
  var overall_accuracy: double
}
object MlEvaluateDataFrameDataframeClassificationSummaryAccuracy {
  
  inline def apply(classes: js.Array[MlEvaluateDataFrameDataframeEvaluationClass], overall_accuracy: double): MlEvaluateDataFrameDataframeClassificationSummaryAccuracy = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], overall_accuracy = overall_accuracy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeClassificationSummaryAccuracy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlEvaluateDataFrameDataframeClassificationSummaryAccuracy] (val x: Self) extends AnyVal {
    
    inline def setClasses(value: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesVarargs(value: MlEvaluateDataFrameDataframeEvaluationClass*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setOverall_accuracy(value: double): Self = StObject.set(x, "overall_accuracy", value.asInstanceOf[js.Any])
  }
}
