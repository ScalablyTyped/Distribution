package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIterationResult extends StObject {
  
  /**
    * Time taken to run the iteration in milliseconds.
    */
  var durationMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Loss computed on the eval data at the end of iteration.
    */
  var evalLoss: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Index of the iteration, 0 based.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Learn rate used for this iteration.
    */
  var learnRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Loss computed on the training data at the end of iteration.
    */
  var trainingLoss: js.UndefOr[Double | Null] = js.undefined
}
object SchemaIterationResult {
  
  inline def apply(): SchemaIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIterationResult]
  }
  
  extension [Self <: SchemaIterationResult](x: Self) {
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsNull: Self = StObject.set(x, "durationMs", null)
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    inline def setEvalLossNull: Self = StObject.set(x, "evalLoss", null)
    
    inline def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    inline def setLearnRateNull: Self = StObject.set(x, "learnRate", null)
    
    inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    inline def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    inline def setTrainingLossNull: Self = StObject.set(x, "trainingLoss", null)
    
    inline def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
  }
}
