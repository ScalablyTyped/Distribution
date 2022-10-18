package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameConfusionMatrixThreshold extends StObject {
  
  var fn: integer
  
  var fp: integer
  
  var tn: integer
  
  var tp: integer
}
object MlEvaluateDataFrameConfusionMatrixThreshold {
  
  inline def apply(fn: integer, fp: integer, tn: integer, tp: integer): MlEvaluateDataFrameConfusionMatrixThreshold = {
    val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any], fp = fp.asInstanceOf[js.Any], tn = tn.asInstanceOf[js.Any], tp = tp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameConfusionMatrixThreshold]
  }
  
  extension [Self <: MlEvaluateDataFrameConfusionMatrixThreshold](x: Self) {
    
    inline def setFn(value: integer): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    
    inline def setFp(value: integer): Self = StObject.set(x, "fp", value.asInstanceOf[js.Any])
    
    inline def setTn(value: integer): Self = StObject.set(x, "tn", value.asInstanceOf[js.Any])
    
    inline def setTp(value: integer): Self = StObject.set(x, "tp", value.asInstanceOf[js.Any])
  }
}
