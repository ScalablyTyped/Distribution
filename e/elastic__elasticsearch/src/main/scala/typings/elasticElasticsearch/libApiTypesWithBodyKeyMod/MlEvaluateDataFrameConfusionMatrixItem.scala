package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameConfusionMatrixItem extends StObject {
  
  var actual_class: Name
  
  var actual_class_doc_count: integer
  
  var other_predicted_class_doc_count: integer
  
  var predicted_classes: js.Array[MlEvaluateDataFrameConfusionMatrixPrediction]
}
object MlEvaluateDataFrameConfusionMatrixItem {
  
  inline def apply(
    actual_class: Name,
    actual_class_doc_count: integer,
    other_predicted_class_doc_count: integer,
    predicted_classes: js.Array[MlEvaluateDataFrameConfusionMatrixPrediction]
  ): MlEvaluateDataFrameConfusionMatrixItem = {
    val __obj = js.Dynamic.literal(actual_class = actual_class.asInstanceOf[js.Any], actual_class_doc_count = actual_class_doc_count.asInstanceOf[js.Any], other_predicted_class_doc_count = other_predicted_class_doc_count.asInstanceOf[js.Any], predicted_classes = predicted_classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameConfusionMatrixItem]
  }
  
  extension [Self <: MlEvaluateDataFrameConfusionMatrixItem](x: Self) {
    
    inline def setActual_class(value: Name): Self = StObject.set(x, "actual_class", value.asInstanceOf[js.Any])
    
    inline def setActual_class_doc_count(value: integer): Self = StObject.set(x, "actual_class_doc_count", value.asInstanceOf[js.Any])
    
    inline def setOther_predicted_class_doc_count(value: integer): Self = StObject.set(x, "other_predicted_class_doc_count", value.asInstanceOf[js.Any])
    
    inline def setPredicted_classes(value: js.Array[MlEvaluateDataFrameConfusionMatrixPrediction]): Self = StObject.set(x, "predicted_classes", value.asInstanceOf[js.Any])
    
    inline def setPredicted_classesVarargs(value: MlEvaluateDataFrameConfusionMatrixPrediction*): Self = StObject.set(x, "predicted_classes", js.Array(value*))
  }
}
