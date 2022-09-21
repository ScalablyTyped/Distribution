package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfusionMatrix extends StObject {
  
  /**
    * Confidence threshold used when computing the entries of the confusion matrix.
    */
  var confidenceThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * One row per actual label.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
}
object SchemaConfusionMatrix {
  
  inline def apply(): SchemaConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfusionMatrix]
  }
  
  extension [Self <: SchemaConfusionMatrix](x: Self) {
    
    inline def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    inline def setConfidenceThresholdNull: Self = StObject.set(x, "confidenceThreshold", null)
    
    inline def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    inline def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
