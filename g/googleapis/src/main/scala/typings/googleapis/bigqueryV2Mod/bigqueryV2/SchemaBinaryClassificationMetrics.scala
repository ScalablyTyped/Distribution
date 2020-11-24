package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Evaluation metrics for binary classification models.
  */
@js.native
trait SchemaBinaryClassificationMetrics extends js.Object {
  
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[SchemaAggregateClassificationMetrics] = js.native
  
  /**
    * Binary confusion matrix at multiple thresholds.
    */
  var binaryConfusionMatrixList: js.UndefOr[js.Array[SchemaBinaryConfusionMatrix]] = js.native
}
object SchemaBinaryClassificationMetrics {
  
  @scala.inline
  def apply(): SchemaBinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBinaryClassificationMetrics]
  }
  
  @scala.inline
  implicit class SchemaBinaryClassificationMetricsOps[Self <: SchemaBinaryClassificationMetrics] (val x: Self) extends AnyVal {
    
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
    def setAggregateClassificationMetrics(value: SchemaAggregateClassificationMetrics): Self = this.set("aggregateClassificationMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregateClassificationMetrics: Self = this.set("aggregateClassificationMetrics", js.undefined)
    
    @scala.inline
    def setBinaryConfusionMatrixListVarargs(value: SchemaBinaryConfusionMatrix*): Self = this.set("binaryConfusionMatrixList", js.Array(value :_*))
    
    @scala.inline
    def setBinaryConfusionMatrixList(value: js.Array[SchemaBinaryConfusionMatrix]): Self = this.set("binaryConfusionMatrixList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryConfusionMatrixList: Self = this.set("binaryConfusionMatrixList", js.undefined)
  }
}
