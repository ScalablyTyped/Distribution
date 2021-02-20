package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BqmlIterationResult extends StObject {
  
  var durationMs: js.UndefOr[String] = js.native
  
  var evalLoss: js.UndefOr[Double] = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var learnRate: js.UndefOr[Double] = js.native
  
  var trainingLoss: js.UndefOr[Double] = js.native
}
object BqmlIterationResult {
  
  @scala.inline
  def apply(): BqmlIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BqmlIterationResult]
  }
  
  @scala.inline
  implicit class BqmlIterationResultMutableBuilder[Self <: BqmlIterationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDurationMs(value: String): Self = StObject.set(x, "durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationMsUndefined: Self = StObject.set(x, "durationMs", js.undefined)
    
    @scala.inline
    def setEvalLoss(value: Double): Self = StObject.set(x, "evalLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvalLossUndefined: Self = StObject.set(x, "evalLoss", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    @scala.inline
    def setTrainingLoss(value: Double): Self = StObject.set(x, "trainingLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrainingLossUndefined: Self = StObject.set(x, "trainingLoss", js.undefined)
  }
}
