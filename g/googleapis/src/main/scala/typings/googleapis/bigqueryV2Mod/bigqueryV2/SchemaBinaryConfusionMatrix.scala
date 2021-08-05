package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Confusion matrix for binary classification models.
  */
trait SchemaBinaryConfusionMatrix extends StObject {
  
  /**
    * Number of false samples predicted as false.
    */
  var falseNegatives: js.UndefOr[String] = js.undefined
  
  /**
    * Number of false samples predicted as true.
    */
  var falsePositives: js.UndefOr[String] = js.undefined
  
  /**
    * Threshold value used when computing each of the following metric.
    */
  var positiveClassThreshold: js.UndefOr[Double] = js.undefined
  
  /**
    * Aggregate precision.
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * Aggregate recall.
    */
  var recall: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of true samples predicted as false.
    */
  var trueNegatives: js.UndefOr[String] = js.undefined
  
  /**
    * Number of true samples predicted as true.
    */
  var truePositives: js.UndefOr[String] = js.undefined
}
object SchemaBinaryConfusionMatrix {
  
  inline def apply(): SchemaBinaryConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryConfusionMatrix]
  }
  
  extension [Self <: SchemaBinaryConfusionMatrix](x: Self) {
    
    inline def setFalseNegatives(value: String): Self = StObject.set(x, "falseNegatives", value.asInstanceOf[js.Any])
    
    inline def setFalseNegativesUndefined: Self = StObject.set(x, "falseNegatives", js.undefined)
    
    inline def setFalsePositives(value: String): Self = StObject.set(x, "falsePositives", value.asInstanceOf[js.Any])
    
    inline def setFalsePositivesUndefined: Self = StObject.set(x, "falsePositives", js.undefined)
    
    inline def setPositiveClassThreshold(value: Double): Self = StObject.set(x, "positiveClassThreshold", value.asInstanceOf[js.Any])
    
    inline def setPositiveClassThresholdUndefined: Self = StObject.set(x, "positiveClassThreshold", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
    
    inline def setTrueNegatives(value: String): Self = StObject.set(x, "trueNegatives", value.asInstanceOf[js.Any])
    
    inline def setTrueNegativesUndefined: Self = StObject.set(x, "trueNegatives", js.undefined)
    
    inline def setTruePositives(value: String): Self = StObject.set(x, "truePositives", value.asInstanceOf[js.Any])
    
    inline def setTruePositivesUndefined: Self = StObject.set(x, "truePositives", js.undefined)
  }
}
