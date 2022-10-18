package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationClassificationMetrics
  extends StObject
     with MlDataframeEvaluationMetrics {
  
  var accuracy: js.UndefOr[Record[String, Any]] = js.undefined
  
  var multiclass_confusion_matrix: js.UndefOr[Record[String, Any]] = js.undefined
}
object MlDataframeEvaluationClassificationMetrics {
  
  inline def apply(): MlDataframeEvaluationClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationClassificationMetrics]
  }
  
  extension [Self <: MlDataframeEvaluationClassificationMetrics](x: Self) {
    
    inline def setAccuracy(value: Record[String, Any]): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setMulticlass_confusion_matrix(value: Record[String, Any]): Self = StObject.set(x, "multiclass_confusion_matrix", value.asInstanceOf[js.Any])
    
    inline def setMulticlass_confusion_matrixUndefined: Self = StObject.set(x, "multiclass_confusion_matrix", js.undefined)
  }
}
