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
  def apply(): SchemaEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEvaluationMetrics]
  }
  @scala.inline
  implicit class SchemaEvaluationMetricsOps[Self <: SchemaEvaluationMetrics] (val x: Self) extends AnyVal {
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
    def setBinaryClassificationMetrics(value: SchemaBinaryClassificationMetrics): Self = this.set("binaryClassificationMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryClassificationMetrics: Self = this.set("binaryClassificationMetrics", js.undefined)
    @scala.inline
    def setClusteringMetrics(value: SchemaClusteringMetrics): Self = this.set("clusteringMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusteringMetrics: Self = this.set("clusteringMetrics", js.undefined)
    @scala.inline
    def setMultiClassClassificationMetrics(value: SchemaMultiClassClassificationMetrics): Self = this.set("multiClassClassificationMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiClassClassificationMetrics: Self = this.set("multiClassClassificationMetrics", js.undefined)
    @scala.inline
    def setRegressionMetrics(value: SchemaRegressionMetrics): Self = this.set("regressionMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegressionMetrics: Self = this.set("regressionMetrics", js.undefined)
  }
  
}

