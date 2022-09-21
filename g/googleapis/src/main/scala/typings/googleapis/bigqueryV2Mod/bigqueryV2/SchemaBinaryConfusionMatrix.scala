package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBinaryConfusionMatrix extends StObject {
  
  /**
    * The fraction of predictions given the correct label.
    */
  var accuracy: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The equally weighted average of recall and precision.
    */
  var f1Score: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of false samples predicted as false.
    */
  var falseNegatives: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of false samples predicted as true.
    */
  var falsePositives: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Threshold value used when computing each of the following metric.
    */
  var positiveClassThreshold: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The fraction of actual positive predictions that had positive actual labels.
    */
  var precision: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The fraction of actual positive labels that were given a positive prediction.
    */
  var recall: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Number of true samples predicted as false.
    */
  var trueNegatives: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of true samples predicted as true.
    */
  var truePositives: js.UndefOr[String | Null] = js.undefined
}
object SchemaBinaryConfusionMatrix {
  
  inline def apply(): SchemaBinaryConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryConfusionMatrix]
  }
  
  extension [Self <: SchemaBinaryConfusionMatrix](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setF1Score(value: Double): Self = StObject.set(x, "f1Score", value.asInstanceOf[js.Any])
    
    inline def setF1ScoreNull: Self = StObject.set(x, "f1Score", null)
    
    inline def setF1ScoreUndefined: Self = StObject.set(x, "f1Score", js.undefined)
    
    inline def setFalseNegatives(value: String): Self = StObject.set(x, "falseNegatives", value.asInstanceOf[js.Any])
    
    inline def setFalseNegativesNull: Self = StObject.set(x, "falseNegatives", null)
    
    inline def setFalseNegativesUndefined: Self = StObject.set(x, "falseNegatives", js.undefined)
    
    inline def setFalsePositives(value: String): Self = StObject.set(x, "falsePositives", value.asInstanceOf[js.Any])
    
    inline def setFalsePositivesNull: Self = StObject.set(x, "falsePositives", null)
    
    inline def setFalsePositivesUndefined: Self = StObject.set(x, "falsePositives", js.undefined)
    
    inline def setPositiveClassThreshold(value: Double): Self = StObject.set(x, "positiveClassThreshold", value.asInstanceOf[js.Any])
    
    inline def setPositiveClassThresholdNull: Self = StObject.set(x, "positiveClassThreshold", null)
    
    inline def setPositiveClassThresholdUndefined: Self = StObject.set(x, "positiveClassThreshold", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallNull: Self = StObject.set(x, "recall", null)
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
    
    inline def setTrueNegatives(value: String): Self = StObject.set(x, "trueNegatives", value.asInstanceOf[js.Any])
    
    inline def setTrueNegativesNull: Self = StObject.set(x, "trueNegatives", null)
    
    inline def setTrueNegativesUndefined: Self = StObject.set(x, "trueNegatives", js.undefined)
    
    inline def setTruePositives(value: String): Self = StObject.set(x, "truePositives", value.asInstanceOf[js.Any])
    
    inline def setTruePositivesNull: Self = StObject.set(x, "truePositives", null)
    
    inline def setTruePositivesUndefined: Self = StObject.set(x, "truePositives", js.undefined)
  }
}
