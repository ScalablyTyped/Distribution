package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeClassificationSummaryMulticlassConfusionMatrix extends StObject {
  
  var confusion_matrix: js.Array[MlEvaluateDataFrameConfusionMatrixItem]
  
  var other_actual_class_count: integer
}
object MlEvaluateDataFrameDataframeClassificationSummaryMulticlassConfusionMatrix {
  
  inline def apply(
    confusion_matrix: js.Array[MlEvaluateDataFrameConfusionMatrixItem],
    other_actual_class_count: integer
  ): MlEvaluateDataFrameDataframeClassificationSummaryMulticlassConfusionMatrix = {
    val __obj = js.Dynamic.literal(confusion_matrix = confusion_matrix.asInstanceOf[js.Any], other_actual_class_count = other_actual_class_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeClassificationSummaryMulticlassConfusionMatrix]
  }
  
  extension [Self <: MlEvaluateDataFrameDataframeClassificationSummaryMulticlassConfusionMatrix](x: Self) {
    
    inline def setConfusion_matrix(value: js.Array[MlEvaluateDataFrameConfusionMatrixItem]): Self = StObject.set(x, "confusion_matrix", value.asInstanceOf[js.Any])
    
    inline def setConfusion_matrixVarargs(value: MlEvaluateDataFrameConfusionMatrixItem*): Self = StObject.set(x, "confusion_matrix", js.Array(value*))
    
    inline def setOther_actual_class_count(value: integer): Self = StObject.set(x, "other_actual_class_count", value.asInstanceOf[js.Any])
  }
}
