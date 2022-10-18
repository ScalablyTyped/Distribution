package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeEvaluationClass
  extends StObject
     with MlEvaluateDataFrameDataframeEvaluationValue {
  
  var class_name: Name
}
object MlEvaluateDataFrameDataframeEvaluationClass {
  
  inline def apply(class_name: Name, value: double): MlEvaluateDataFrameDataframeEvaluationClass = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeEvaluationClass]
  }
  
  extension [Self <: MlEvaluateDataFrameDataframeEvaluationClass](x: Self) {
    
    inline def setClass_name(value: Name): Self = StObject.set(x, "class_name", value.asInstanceOf[js.Any])
  }
}
