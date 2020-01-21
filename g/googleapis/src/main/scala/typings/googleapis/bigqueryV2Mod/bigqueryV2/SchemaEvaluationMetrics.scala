package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics of a model. These are either computed on all training
  * data or just the eval data based on whether eval data was used during
  * training.
  */
@js.native
trait SchemaEvaluationMetrics extends js.Object {
  /**
    * Populated for binary classification models.
    */
  var binaryClassificationMetrics: js.UndefOr[SchemaBinaryClassificationMetrics] = js.native
  /**
    * [Beta] Populated for clustering models.
    */
  var clusteringMetrics: js.UndefOr[SchemaClusteringMetrics] = js.native
  /**
    * Populated for multi-class classification models.
    */
  var multiClassClassificationMetrics: js.UndefOr[SchemaMultiClassClassificationMetrics] = js.native
  /**
    * Populated for regression models.
    */
  var regressionMetrics: js.UndefOr[SchemaRegressionMetrics] = js.native
}

object SchemaEvaluationMetrics {
  @scala.inline
  def apply(
    binaryClassificationMetrics: SchemaBinaryClassificationMetrics = null,
    clusteringMetrics: SchemaClusteringMetrics = null,
    multiClassClassificationMetrics: SchemaMultiClassClassificationMetrics = null,
    regressionMetrics: SchemaRegressionMetrics = null
  ): SchemaEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    if (binaryClassificationMetrics != null) __obj.updateDynamic("binaryClassificationMetrics")(binaryClassificationMetrics.asInstanceOf[js.Any])
    if (clusteringMetrics != null) __obj.updateDynamic("clusteringMetrics")(clusteringMetrics.asInstanceOf[js.Any])
    if (multiClassClassificationMetrics != null) __obj.updateDynamic("multiClassClassificationMetrics")(multiClassClassificationMetrics.asInstanceOf[js.Any])
    if (regressionMetrics != null) __obj.updateDynamic("regressionMetrics")(regressionMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEvaluationMetrics]
  }
}

