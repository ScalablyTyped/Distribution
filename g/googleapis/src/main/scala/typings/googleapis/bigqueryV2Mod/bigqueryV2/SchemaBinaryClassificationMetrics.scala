package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    aggregateClassificationMetrics: SchemaAggregateClassificationMetrics = null,
    binaryConfusionMatrixList: js.Array[SchemaBinaryConfusionMatrix] = null
  ): SchemaBinaryClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    if (aggregateClassificationMetrics != null) __obj.updateDynamic("aggregateClassificationMetrics")(aggregateClassificationMetrics.asInstanceOf[js.Any])
    if (binaryConfusionMatrixList != null) __obj.updateDynamic("binaryConfusionMatrixList")(binaryConfusionMatrixList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBinaryClassificationMetrics]
  }
}

