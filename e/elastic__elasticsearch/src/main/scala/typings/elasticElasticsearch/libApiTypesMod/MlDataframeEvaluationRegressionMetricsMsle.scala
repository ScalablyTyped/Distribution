package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationRegressionMetricsMsle extends StObject {
  
  var offset: js.UndefOr[double] = js.undefined
}
object MlDataframeEvaluationRegressionMetricsMsle {
  
  inline def apply(): MlDataframeEvaluationRegressionMetricsMsle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationRegressionMetricsMsle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeEvaluationRegressionMetricsMsle] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
