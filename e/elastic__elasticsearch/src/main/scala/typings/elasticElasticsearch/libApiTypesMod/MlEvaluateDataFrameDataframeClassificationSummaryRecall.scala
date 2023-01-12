package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeClassificationSummaryRecall extends StObject {
  
  var avg_recall: double
  
  var classes: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]
}
object MlEvaluateDataFrameDataframeClassificationSummaryRecall {
  
  inline def apply(avg_recall: double, classes: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]): MlEvaluateDataFrameDataframeClassificationSummaryRecall = {
    val __obj = js.Dynamic.literal(avg_recall = avg_recall.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeClassificationSummaryRecall]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlEvaluateDataFrameDataframeClassificationSummaryRecall] (val x: Self) extends AnyVal {
    
    inline def setAvg_recall(value: double): Self = StObject.set(x, "avg_recall", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesVarargs(value: MlEvaluateDataFrameDataframeEvaluationClass*): Self = StObject.set(x, "classes", js.Array(value*))
  }
}
