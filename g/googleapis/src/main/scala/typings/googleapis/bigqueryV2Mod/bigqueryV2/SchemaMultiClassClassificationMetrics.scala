package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for multi-class classification models.
  */
@js.native
trait SchemaMultiClassClassificationMetrics extends js.Object {
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[SchemaAggregateClassificationMetrics] = js.native
  /**
    * Confusion matrix at different thresholds.
    */
  var confusionMatrixList: js.UndefOr[js.Array[SchemaConfusionMatrix]] = js.native
}

object SchemaMultiClassClassificationMetrics {
  @scala.inline
  def apply(): SchemaMultiClassClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiClassClassificationMetrics]
  }
  @scala.inline
  implicit class SchemaMultiClassClassificationMetricsOps[Self <: SchemaMultiClassClassificationMetrics] (val x: Self) extends AnyVal {
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
    def setConfusionMatrixListVarargs(value: SchemaConfusionMatrix*): Self = this.set("confusionMatrixList", js.Array(value :_*))
    @scala.inline
    def setConfusionMatrixList(value: js.Array[SchemaConfusionMatrix]): Self = this.set("confusionMatrixList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfusionMatrixList: Self = this.set("confusionMatrixList", js.undefined)
  }
  
}

