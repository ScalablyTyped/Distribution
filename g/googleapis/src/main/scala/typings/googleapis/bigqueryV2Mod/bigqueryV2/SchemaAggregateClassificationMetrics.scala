package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Aggregate metrics for classification models. For multi-class models, the
  * metrics are either macro-averaged: metrics are calculated for each label
  * and then an unweighted average is taken of those values or micro-averaged:
  * the metric is calculated globally by counting the total number of correctly
  * predicted rows.
  */
@js.native
trait SchemaAggregateClassificationMetrics extends js.Object {
  /**
    * Accuracy is the fraction of predictions given the correct label. For
    * multiclass this is a micro-averaged metric.
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * The F1 score is an average of recall and precision. For multiclass this
    * is a macro-averaged metric.
    */
  var f1Score: js.UndefOr[Double] = js.native
  /**
    * Logarithmic Loss. For multiclass this is a macro-averaged metric.
    */
  var logLoss: js.UndefOr[Double] = js.native
  /**
    * Precision is the fraction of actual positive predictions that had
    * positive actual labels. For multiclass this is a macro-averaged metric
    * treating each class as a binary classifier.
    */
  var precision: js.UndefOr[Double] = js.native
  /**
    * Recall is the fraction of actual positive labels that were given a
    * positive prediction. For multiclass this is a macro-averaged metric.
    */
  var recall: js.UndefOr[Double] = js.native
  /**
    * Area Under a ROC Curve. For multiclass this is a macro-averaged metric.
    */
  var rocAuc: js.UndefOr[Double] = js.native
  /**
    * Threshold at which the metrics are computed. For binary classification
    * models this is the positive class threshold. For multi-class
    * classfication models this is the confidence threshold.
    */
  var threshold: js.UndefOr[Double] = js.native
}

object SchemaAggregateClassificationMetrics {
  @scala.inline
  def apply(
    accuracy: js.UndefOr[Double] = js.undefined,
    f1Score: js.UndefOr[Double] = js.undefined,
    logLoss: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    recall: js.UndefOr[Double] = js.undefined,
    rocAuc: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): SchemaAggregateClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accuracy)) __obj.updateDynamic("accuracy")(accuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(f1Score)) __obj.updateDynamic("f1Score")(f1Score.get.asInstanceOf[js.Any])
    if (!js.isUndefined(logLoss)) __obj.updateDynamic("logLoss")(logLoss.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recall)) __obj.updateDynamic("recall")(recall.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rocAuc)) __obj.updateDynamic("rocAuc")(rocAuc.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAggregateClassificationMetrics]
  }
}

