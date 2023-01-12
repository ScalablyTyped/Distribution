package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc
  extends StObject
     with MlEvaluateDataFrameDataframeEvaluationValue {
  
  var curve: js.UndefOr[js.Array[MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem]] = js.undefined
}
object MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc {
  
  inline def apply(value: double): MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc] (val x: Self) extends AnyVal {
    
    inline def setCurve(value: js.Array[MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem]): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setCurveVarargs(value: MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem*): Self = StObject.set(x, "curve", js.Array(value*))
  }
}
