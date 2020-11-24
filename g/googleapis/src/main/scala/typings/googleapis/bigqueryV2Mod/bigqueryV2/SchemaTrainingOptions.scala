package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaTrainingOptions extends js.Object {
  
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
object SchemaTrainingOptions {
  
  @scala.inline
  def apply(): SchemaTrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingOptions]
  }
  
  @scala.inline
  implicit class SchemaTrainingOptionsOps[Self <: SchemaTrainingOptions] (val x: Self) extends AnyVal {
    
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
    def setDataSplitColumn(value: String): Self = this.set("dataSplitColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSplitColumn: Self = this.set("dataSplitColumn", js.undefined)
    
    @scala.inline
    def setDataSplitEvalFraction(value: Double): Self = this.set("dataSplitEvalFraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSplitEvalFraction: Self = this.set("dataSplitEvalFraction", js.undefined)
    
    @scala.inline
    def setDataSplitMethod(value: String): Self = this.set("dataSplitMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSplitMethod: Self = this.set("dataSplitMethod", js.undefined)
    
    @scala.inline
    def setDistanceType(value: String): Self = this.set("distanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistanceType: Self = this.set("distanceType", js.undefined)
    
    @scala.inline
    def setEarlyStop(value: Boolean): Self = this.set("earlyStop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEarlyStop: Self = this.set("earlyStop", js.undefined)
    
    @scala.inline
    def setInitialLearnRate(value: Double): Self = this.set("initialLearnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialLearnRate: Self = this.set("initialLearnRate", js.undefined)
    
    @scala.inline
    def setInputLabelColumnsVarargs(value: String*): Self = this.set("inputLabelColumns", js.Array(value :_*))
    
    @scala.inline
    def setInputLabelColumns(value: js.Array[String]): Self = this.set("inputLabelColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputLabelColumns: Self = this.set("inputLabelColumns", js.undefined)
    
    @scala.inline
    def setL1Regularization(value: Double): Self = this.set("l1Regularization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL1Regularization: Self = this.set("l1Regularization", js.undefined)
    
    @scala.inline
    def setL2Regularization(value: Double): Self = this.set("l2Regularization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteL2Regularization: Self = this.set("l2Regularization", js.undefined)
    
    @scala.inline
    def setLabelClassWeights(value: StringDictionary[Double]): Self = this.set("labelClassWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelClassWeights: Self = this.set("labelClassWeights", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = this.set("learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnRate: Self = this.set("learnRate", js.undefined)
    
    @scala.inline
    def setLearnRateStrategy(value: String): Self = this.set("learnRateStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnRateStrategy: Self = this.set("learnRateStrategy", js.undefined)
    
    @scala.inline
    def setLossType(value: String): Self = this.set("lossType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossType: Self = this.set("lossType", js.undefined)
    
    @scala.inline
    def setMaxIterations(value: String): Self = this.set("maxIterations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxIterations: Self = this.set("maxIterations", js.undefined)
    
    @scala.inline
    def setMinRelativeProgress(value: Double): Self = this.set("minRelativeProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRelativeProgress: Self = this.set("minRelativeProgress", js.undefined)
    
    @scala.inline
    def setNumClusters(value: String): Self = this.set("numClusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumClusters: Self = this.set("numClusters", js.undefined)
    
    @scala.inline
    def setWarmStart(value: Boolean): Self = this.set("warmStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarmStart: Self = this.set("warmStart", js.undefined)
  }
}
