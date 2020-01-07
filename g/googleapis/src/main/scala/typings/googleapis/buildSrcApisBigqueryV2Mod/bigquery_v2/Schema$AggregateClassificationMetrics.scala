package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

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
trait Schema$AggregateClassificationMetrics extends js.Object {
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

object Schema$AggregateClassificationMetrics {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    f1Score: Int | Double = null,
    logLoss: Int | Double = null,
    precision: Int | Double = null,
    recall: Int | Double = null,
    rocAuc: Int | Double = null,
    threshold: Int | Double = null
  ): Schema$AggregateClassificationMetrics = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (f1Score != null) __obj.updateDynamic("f1Score")(f1Score.asInstanceOf[js.Any])
    if (logLoss != null) __obj.updateDynamic("logLoss")(logLoss.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (recall != null) __obj.updateDynamic("recall")(recall.asInstanceOf[js.Any])
    if (rocAuc != null) __obj.updateDynamic("rocAuc")(rocAuc.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AggregateClassificationMetrics]
  }
}

