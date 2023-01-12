package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationRegressionMetricsHuber extends StObject {
  
  var delta: js.UndefOr[double] = js.undefined
}
object MlDataframeEvaluationRegressionMetricsHuber {
  
  inline def apply(): MlDataframeEvaluationRegressionMetricsHuber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationRegressionMetricsHuber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeEvaluationRegressionMetricsHuber] (val x: Self) extends AnyVal {
    
    inline def setDelta(value: double): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setDeltaUndefined: Self = StObject.set(x, "delta", js.undefined)
  }
}
