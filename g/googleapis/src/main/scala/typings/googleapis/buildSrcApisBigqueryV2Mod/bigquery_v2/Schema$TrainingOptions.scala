package typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TrainingOptions extends js.Object {
  /**
    * The column to split data with. This column won&#39;t be used as a
    * feature. 1. When data_split_method is CUSTOM, the corresponding column
    * should be boolean. The rows with true value tag are eval data, and the
    * false are training data. 2. When data_split_method is SEQ, the first
    * DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the
    * corresponding column are used as training data, and the rest are eval
    * data. It respects the order in Orderable data types:
    * https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-properties
    */
  var dataSplitColumn: js.UndefOr[String] = js.native
  /**
    * The fraction of evaluation data over the whole input data. The rest of
    * data will be used as training data. The format should be double. Accurate
    * to two decimal places. Default value is 0.2.
    */
  var dataSplitEvalFraction: js.UndefOr[Double] = js.native
  /**
    * The data split type for training and evaluation, e.g. RANDOM.
    */
  var dataSplitMethod: js.UndefOr[String] = js.native
  /**
    * [Beta] Distance type for clustering models.
    */
  var distanceType: js.UndefOr[String] = js.native
  /**
    * Whether to stop early when the loss doesn&#39;t improve significantly any
    * more (compared to min_relative_progress).
    */
  var earlyStop: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the initial learning rate for line search to start at.
    */
  var initialLearnRate: js.UndefOr[Double] = js.native
  /**
    * Name of input label columns in training data.
    */
  var inputLabelColumns: js.UndefOr[js.Array[String]] = js.native
  /**
    * L1 regularization coefficient.
    */
  var l1Regularization: js.UndefOr[Double] = js.native
  /**
    * L2 regularization coefficient.
    */
  var l2Regularization: js.UndefOr[Double] = js.native
  /**
    * Weights associated with each label class, for rebalancing the training
    * data.
    */
  var labelClassWeights: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Learning rate in training.
    */
  var learnRate: js.UndefOr[Double] = js.native
  /**
    * The strategy to determine learning rate.
    */
  var learnRateStrategy: js.UndefOr[String] = js.native
  /**
    * Type of loss function used during training run.
    */
  var lossType: js.UndefOr[String] = js.native
  /**
    * The maximum number of iterations in training.
    */
  var maxIterations: js.UndefOr[String] = js.native
  /**
    * When early_stop is true, stops training when accuracy improvement is less
    * than &#39;min_relative_progress&#39;.
    */
  var minRelativeProgress: js.UndefOr[Double] = js.native
  /**
    * [Beta] Number of clusters for clustering models.
    */
  var numClusters: js.UndefOr[String] = js.native
  /**
    * Whether to train a model from the last checkpoint.
    */
  var warmStart: js.UndefOr[Boolean] = js.native
}

object Schema$TrainingOptions {
  @scala.inline
  def apply(
    dataSplitColumn: String = null,
    dataSplitEvalFraction: Int | Double = null,
    dataSplitMethod: String = null,
    distanceType: String = null,
    earlyStop: js.UndefOr[Boolean] = js.undefined,
    initialLearnRate: Int | Double = null,
    inputLabelColumns: js.Array[String] = null,
    l1Regularization: Int | Double = null,
    l2Regularization: Int | Double = null,
    labelClassWeights: StringDictionary[Double] = null,
    learnRate: Int | Double = null,
    learnRateStrategy: String = null,
    lossType: String = null,
    maxIterations: String = null,
    minRelativeProgress: Int | Double = null,
    numClusters: String = null,
    warmStart: js.UndefOr[Boolean] = js.undefined
  ): Schema$TrainingOptions = {
    val __obj = js.Dynamic.literal()
    if (dataSplitColumn != null) __obj.updateDynamic("dataSplitColumn")(dataSplitColumn.asInstanceOf[js.Any])
    if (dataSplitEvalFraction != null) __obj.updateDynamic("dataSplitEvalFraction")(dataSplitEvalFraction.asInstanceOf[js.Any])
    if (dataSplitMethod != null) __obj.updateDynamic("dataSplitMethod")(dataSplitMethod.asInstanceOf[js.Any])
    if (distanceType != null) __obj.updateDynamic("distanceType")(distanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(earlyStop)) __obj.updateDynamic("earlyStop")(earlyStop.asInstanceOf[js.Any])
    if (initialLearnRate != null) __obj.updateDynamic("initialLearnRate")(initialLearnRate.asInstanceOf[js.Any])
    if (inputLabelColumns != null) __obj.updateDynamic("inputLabelColumns")(inputLabelColumns.asInstanceOf[js.Any])
    if (l1Regularization != null) __obj.updateDynamic("l1Regularization")(l1Regularization.asInstanceOf[js.Any])
    if (l2Regularization != null) __obj.updateDynamic("l2Regularization")(l2Regularization.asInstanceOf[js.Any])
    if (labelClassWeights != null) __obj.updateDynamic("labelClassWeights")(labelClassWeights.asInstanceOf[js.Any])
    if (learnRate != null) __obj.updateDynamic("learnRate")(learnRate.asInstanceOf[js.Any])
    if (learnRateStrategy != null) __obj.updateDynamic("learnRateStrategy")(learnRateStrategy.asInstanceOf[js.Any])
    if (lossType != null) __obj.updateDynamic("lossType")(lossType.asInstanceOf[js.Any])
    if (maxIterations != null) __obj.updateDynamic("maxIterations")(maxIterations.asInstanceOf[js.Any])
    if (minRelativeProgress != null) __obj.updateDynamic("minRelativeProgress")(minRelativeProgress.asInstanceOf[js.Any])
    if (numClusters != null) __obj.updateDynamic("numClusters")(numClusters.asInstanceOf[js.Any])
    if (!js.isUndefined(warmStart)) __obj.updateDynamic("warmStart")(warmStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TrainingOptions]
  }
}

