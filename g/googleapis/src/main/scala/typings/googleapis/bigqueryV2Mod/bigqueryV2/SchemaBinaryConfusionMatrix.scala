package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Confusion matrix for binary classification models.
  */
@js.native
trait SchemaBinaryConfusionMatrix extends StObject {
  
  /**
    * Number of false samples predicted as false.
    */
  var falseNegatives: js.UndefOr[String] = js.native
  
  /**
    * Number of false samples predicted as true.
    */
  var falsePositives: js.UndefOr[String] = js.native
  
  /**
    * Threshold value used when computing each of the following metric.
    */
  var positiveClassThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Aggregate precision.
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Aggregate recall.
    */
  var recall: js.UndefOr[Double] = js.native
  
  /**
    * Number of true samples predicted as false.
    */
  var trueNegatives: js.UndefOr[String] = js.native
  
  /**
    * Number of true samples predicted as true.
    */
  var truePositives: js.UndefOr[String] = js.native
}
object SchemaBinaryConfusionMatrix {
  
  @scala.inline
  def apply(): SchemaBinaryConfusionMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryConfusionMatrix]
  }
  
  @scala.inline
  implicit class SchemaBinaryConfusionMatrixMutableBuilder[Self <: SchemaBinaryConfusionMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFalseNegatives(value: String): Self = StObject.set(x, "falseNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalseNegativesUndefined: Self = StObject.set(x, "falseNegatives", js.undefined)
    
    @scala.inline
    def setFalsePositives(value: String): Self = StObject.set(x, "falsePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFalsePositivesUndefined: Self = StObject.set(x, "falsePositives", js.undefined)
    
    @scala.inline
    def setPositiveClassThreshold(value: Double): Self = StObject.set(x, "positiveClassThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveClassThresholdUndefined: Self = StObject.set(x, "positiveClassThreshold", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setRecall(value: Double): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
    
    @scala.inline
    def setTrueNegatives(value: String): Self = StObject.set(x, "trueNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueNegativesUndefined: Self = StObject.set(x, "trueNegatives", js.undefined)
    
    @scala.inline
    def setTruePositives(value: String): Self = StObject.set(x, "truePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTruePositivesUndefined: Self = StObject.set(x, "truePositives", js.undefined)
  }
}
