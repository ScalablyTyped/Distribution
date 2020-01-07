package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics of a model. These are either computed on all training
  * data or just the eval data based on whether eval data was used during
  * training.
  */
@js.native
trait Schema$EvaluationMetrics extends js.Object {
  /**
    * Populated for binary classification models.
    */
  var binaryClassificationMetrics: js.UndefOr[Schema$BinaryClassificationMetrics] = js.native
  /**
    * [Beta] Populated for clustering models.
    */
  var clusteringMetrics: js.UndefOr[Schema$ClusteringMetrics] = js.native
  /**
    * Populated for multi-class classification models.
    */
  var multiClassClassificationMetrics: js.UndefOr[Schema$MultiClassClassificationMetrics] = js.native
  /**
    * Populated for regression models.
    */
  var regressionMetrics: js.UndefOr[Schema$RegressionMetrics] = js.native
}

object Schema$EvaluationMetrics {
  @scala.inline
  def apply(
    binaryClassificationMetrics: Schema$BinaryClassificationMetrics = null,
    clusteringMetrics: Schema$ClusteringMetrics = null,
    multiClassClassificationMetrics: Schema$MultiClassClassificationMetrics = null,
    regressionMetrics: Schema$RegressionMetrics = null
  ): Schema$EvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    if (binaryClassificationMetrics != null) __obj.updateDynamic("binaryClassificationMetrics")(binaryClassificationMetrics.asInstanceOf[js.Any])
    if (clusteringMetrics != null) __obj.updateDynamic("clusteringMetrics")(clusteringMetrics.asInstanceOf[js.Any])
    if (multiClassClassificationMetrics != null) __obj.updateDynamic("multiClassClassificationMetrics")(multiClassClassificationMetrics.asInstanceOf[js.Any])
    if (regressionMetrics != null) __obj.updateDynamic("regressionMetrics")(regressionMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EvaluationMetrics]
  }
}

