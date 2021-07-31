package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Confusion matrix for multi-class classification models.
  */
trait SchemaConfusionMatrix extends StObject {
  
  /**
    * Confidence threshold used when computing the entries of the confusion
    * matrix.
    */
  var confidenceThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * One row per actual label.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
}
object SchemaConfusionMatrix {
  
  @scala.inline
  def apply(): SchemaConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfusionMatrix]
  }
  
  @scala.inline
  implicit class SchemaConfusionMatrixMutableBuilder[Self <: SchemaConfusionMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidenceThreshold(value: Double): Self = StObject.set(x, "confidenceThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceThresholdUndefined: Self = StObject.set(x, "confidenceThreshold", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
