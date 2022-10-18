package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationClassificationMetricsAucRoc extends StObject {
  
  var class_name: js.UndefOr[Name] = js.undefined
  
  var include_curve: js.UndefOr[Boolean] = js.undefined
}
object MlDataframeEvaluationClassificationMetricsAucRoc {
  
  inline def apply(): MlDataframeEvaluationClassificationMetricsAucRoc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationClassificationMetricsAucRoc]
  }
  
  extension [Self <: MlDataframeEvaluationClassificationMetricsAucRoc](x: Self) {
    
    inline def setClass_name(value: Name): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
    
    inline def setClass_nameUndefined: Self = StObject.set(x, "class_name", js.undefined)
    
    inline def setInclude_curve(value: Boolean): Self = StObject.set(x, "include_curve", value.asInstanceOf[js.Any])
    
    inline def setInclude_curveUndefined: Self = StObject.set(x, "include_curve", js.undefined)
  }
}
