package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for multi-class classification models.
  */
@js.native
trait Schema$MultiClassClassificationMetrics extends js.Object {
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[Schema$AggregateClassificationMetrics] = js.native
  /**
    * Confusion matrix at different thresholds.
    */
  var confusionMatrixList: js.UndefOr[js.Array[Schema$ConfusionMatrix]] = js.native
}

object Schema$MultiClassClassificationMetrics {
  @scala.inline
  def apply(
    aggregateClassificationMetrics: Schema$AggregateClassificationMetrics = null,
    confusionMatrixList: js.Array[Schema$ConfusionMatrix] = null
  ): Schema$MultiClassClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    if (aggregateClassificationMetrics != null) __obj.updateDynamic("aggregateClassificationMetrics")(aggregateClassificationMetrics.asInstanceOf[js.Any])
    if (confusionMatrixList != null) __obj.updateDynamic("confusionMatrixList")(confusionMatrixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$MultiClassClassificationMetrics]
  }
}

