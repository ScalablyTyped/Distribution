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
  def apply(
    aggregateClassificationMetrics: SchemaAggregateClassificationMetrics = null,
    confusionMatrixList: js.Array[SchemaConfusionMatrix] = null
  ): SchemaMultiClassClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    if (aggregateClassificationMetrics != null) __obj.updateDynamic("aggregateClassificationMetrics")(aggregateClassificationMetrics.asInstanceOf[js.Any])
    if (confusionMatrixList != null) __obj.updateDynamic("confusionMatrixList")(confusionMatrixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMultiClassClassificationMetrics]
  }
}

