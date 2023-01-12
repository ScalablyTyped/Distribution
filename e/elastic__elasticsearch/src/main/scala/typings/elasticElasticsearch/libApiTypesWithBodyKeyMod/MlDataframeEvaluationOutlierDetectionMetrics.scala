package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationOutlierDetectionMetrics
  extends StObject
     with MlDataframeEvaluationMetrics {
  
  var confusion_matrix: js.UndefOr[Record[String, Any]] = js.undefined
}
object MlDataframeEvaluationOutlierDetectionMetrics {
  
  inline def apply(): MlDataframeEvaluationOutlierDetectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationOutlierDetectionMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeEvaluationOutlierDetectionMetrics] (val x: Self) extends AnyVal {
    
    inline def setConfusion_matrix(value: Record[String, Any]): Self = StObject.set(x, "confusion_matrix", value.asInstanceOf[js.Any])
    
    inline def setConfusion_matrixUndefined: Self = StObject.set(x, "confusion_matrix", js.undefined)
  }
}
