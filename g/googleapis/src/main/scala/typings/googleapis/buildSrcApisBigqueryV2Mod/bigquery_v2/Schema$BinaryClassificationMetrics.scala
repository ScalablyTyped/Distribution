package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for binary classification models.
  */
@js.native
trait Schema$BinaryClassificationMetrics extends js.Object {
  /**
    * Aggregate classification metrics.
    */
  var aggregateClassificationMetrics: js.UndefOr[Schema$AggregateClassificationMetrics] = js.native
  /**
    * Binary confusion matrix at multiple thresholds.
    */
  var binaryConfusionMatrixList: js.UndefOr[js.Array[Schema$BinaryConfusionMatrix]] = js.native
}

object Schema$BinaryClassificationMetrics {
  @scala.inline
  def apply(
    aggregateClassificationMetrics: Schema$AggregateClassificationMetrics = null,
    binaryConfusionMatrixList: js.Array[Schema$BinaryConfusionMatrix] = null
  ): Schema$BinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    if (aggregateClassificationMetrics != null) __obj.updateDynamic("aggregateClassificationMetrics")(aggregateClassificationMetrics.asInstanceOf[js.Any])
    if (binaryConfusionMatrixList != null) __obj.updateDynamic("binaryConfusionMatrixList")(binaryConfusionMatrixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BinaryClassificationMetrics]
  }
}

