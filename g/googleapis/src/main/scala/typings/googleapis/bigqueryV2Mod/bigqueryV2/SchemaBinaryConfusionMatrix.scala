package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Confusion matrix for binary classification models.
  */
@js.native
trait SchemaBinaryConfusionMatrix extends js.Object {
  
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
  implicit class SchemaBinaryConfusionMatrixOps[Self <: SchemaBinaryConfusionMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFalseNegatives(value: String): Self = this.set("falseNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFalseNegatives: Self = this.set("falseNegatives", js.undefined)
    
    @scala.inline
    def setFalsePositives(value: String): Self = this.set("falsePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFalsePositives: Self = this.set("falsePositives", js.undefined)
    
    @scala.inline
    def setPositiveClassThreshold(value: Double): Self = this.set("positiveClassThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePositiveClassThreshold: Self = this.set("positiveClassThreshold", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRecall(value: Double): Self = this.set("recall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecall: Self = this.set("recall", js.undefined)
    
    @scala.inline
    def setTrueNegatives(value: String): Self = this.set("trueNegatives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrueNegatives: Self = this.set("trueNegatives", js.undefined)
    
    @scala.inline
    def setTruePositives(value: String): Self = this.set("truePositives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruePositives: Self = this.set("truePositives", js.undefined)
  }
}
