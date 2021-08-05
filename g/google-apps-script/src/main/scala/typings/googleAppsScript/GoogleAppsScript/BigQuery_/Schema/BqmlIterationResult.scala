package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BqmlIterationResult extends StObject {
  
  var durationMs: js.UndefOr[String] = js.undefined
  
  var evalLoss: js.UndefOr[Double] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var learnRate: js.UndefOr[Double] = js.undefined
  
  var trainingLoss: js.UndefOr[Double] = js.undefined
}
object BqmlIterationResult {
  
  inline def apply(): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlIterationResult]
  }
  
  extension [Self <: BqmlIterationResult](x: Self) {
    
    inline def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    inline def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    inline def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    inline def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    inline def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    inline def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
  }
}
