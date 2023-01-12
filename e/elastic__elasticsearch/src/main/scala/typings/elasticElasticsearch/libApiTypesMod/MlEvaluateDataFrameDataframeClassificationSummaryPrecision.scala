package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeClassificationSummaryPrecision extends StObject {
  
  var avg_precision: double
  
  var classes: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]
}
object MlEvaluateDataFrameDataframeClassificationSummaryPrecision {
  
  inline def apply(avg_precision: double, classes: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]): MlEvaluateDataFrameDataframeClassificationSummaryPrecision = {
    val __obj = js.Dynamic.literal(avg_precision = avg_precision.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeClassificationSummaryPrecision]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlEvaluateDataFrameDataframeClassificationSummaryPrecision] (val x: Self) extends AnyVal {
    
    inline def setAvg_precision(value: double): Self = StObject.set(x, "avg_precision", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: js.Array[MlEvaluateDataFrameDataframeEvaluationClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesVarargs(value: MlEvaluateDataFrameDataframeEvaluationClass*): Self = StObject.set(x, "classes", js.Array(value*))
  }
}
