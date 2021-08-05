package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrainingOptions extends StObject {
  
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
  var dataSplitColumn: js.UndefOr[String] = js.undefined
  
  /**
    * The fraction of evaluation data over the whole input data. The rest of
    * data will be used as training data. The format should be double. Accurate
    * to two decimal places. Default value is 0.2.
    */
  var dataSplitEvalFraction: js.UndefOr[Double] = js.undefined
  
  /**
    * The data split type for training and evaluation, e.g. RANDOM.
    */
  var dataSplitMethod: js.UndefOr[String] = js.undefined
  
  /**
    * [Beta] Distance type for clustering models.
    */
  var distanceType: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to stop early when the loss doesn&#39;t improve significantly any
    * more (compared to min_relative_progress).
    */
  var earlyStop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the initial learning rate for line search to start at.
    */
  var initialLearnRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of input label columns in training data.
    */
  var inputLabelColumns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * L1 regularization coefficient.
    */
  var l1Regularization: js.UndefOr[Double] = js.undefined
  
  /**
    * L2 regularization coefficient.
    */
  var l2Regularization: js.UndefOr[Double] = js.undefined
  
  /**
    * Weights associated with each label class, for rebalancing the training
    * data.
    */
  var labelClassWeights: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  /**
    * Learning rate in training.
    */
  var learnRate: js.UndefOr[Double] = js.undefined
  
  /**
    * The strategy to determine learning rate.
    */
  var learnRateStrategy: js.UndefOr[String] = js.undefined
  
  /**
    * Type of loss function used during training run.
    */
  var lossType: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of iterations in training.
    */
  var maxIterations: js.UndefOr[String] = js.undefined
  
  /**
    * When early_stop is true, stops training when accuracy improvement is less
    * than &#39;min_relative_progress&#39;.
    */
  var minRelativeProgress: js.UndefOr[Double] = js.undefined
  
  /**
    * [Beta] Number of clusters for clustering models.
    */
  var numClusters: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to train a model from the last checkpoint.
    */
  var warmStart: js.UndefOr[Boolean] = js.undefined
}
object SchemaTrainingOptions {
  
  inline def apply(): SchemaTrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingOptions]
  }
  
  extension [Self <: SchemaTrainingOptions](x: Self) {
    
    inline def setDataSplitColumn(value: String): Self = StObject.set(x, "dataSplitColumn", value.asInstanceOf[js.Any])
    
    inline def setDataSplitColumnUndefined: Self = StObject.set(x, "dataSplitColumn", js.undefined)
    
    inline def setDataSplitEvalFraction(value: Double): Self = StObject.set(x, "dataSplitEvalFraction", value.asInstanceOf[js.Any])
    
    inline def setDataSplitEvalFractionUndefined: Self = StObject.set(x, "dataSplitEvalFraction", js.undefined)
    
    inline def setDataSplitMethod(value: String): Self = StObject.set(x, "dataSplitMethod", value.asInstanceOf[js.Any])
    
    inline def setDataSplitMethodUndefined: Self = StObject.set(x, "dataSplitMethod", js.undefined)
    
    inline def setDistanceType(value: String): Self = StObject.set(x, "distanceType", value.asInstanceOf[js.Any])
    
    inline def setDistanceTypeUndefined: Self = StObject.set(x, "distanceType", js.undefined)
    
    inline def setEarlyStop(value: Boolean): Self = StObject.set(x, "earlyStop", value.asInstanceOf[js.Any])
    
    inline def setEarlyStopUndefined: Self = StObject.set(x, "earlyStop", js.undefined)
    
    inline def setInitialLearnRate(value: Double): Self = StObject.set(x, "initialLearnRate", value.asInstanceOf[js.Any])
    
    inline def setInitialLearnRateUndefined: Self = StObject.set(x, "initialLearnRate", js.undefined)
    
    inline def setInputLabelColumns(value: js.Array[String]): Self = StObject.set(x, "inputLabelColumns", value.asInstanceOf[js.Any])
    
    inline def setInputLabelColumnsUndefined: Self = StObject.set(x, "inputLabelColumns", js.undefined)
    
    inline def setInputLabelColumnsVarargs(value: String*): Self = StObject.set(x, "inputLabelColumns", js.Array(value :_*))
    
    inline def setL1Regularization(value: Double): Self = StObject.set(x, "l1Regularization", value.asInstanceOf[js.Any])
    
    inline def setL1RegularizationUndefined: Self = StObject.set(x, "l1Regularization", js.undefined)
    
    inline def setL2Regularization(value: Double): Self = StObject.set(x, "l2Regularization", value.asInstanceOf[js.Any])
    
    inline def setL2RegularizationUndefined: Self = StObject.set(x, "l2Regularization", js.undefined)
    
    inline def setLabelClassWeights(value: StringDictionary[Double]): Self = StObject.set(x, "labelClassWeights", value.asInstanceOf[js.Any])
    
    inline def setLabelClassWeightsUndefined: Self = StObject.set(x, "labelClassWeights", js.undefined)
    
    inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    inline def setLearnRateStrategy(value: String): Self = StObject.set(x, "learnRateStrategy", value.asInstanceOf[js.Any])
    
    inline def setLearnRateStrategyUndefined: Self = StObject.set(x, "learnRateStrategy", js.undefined)
    
    inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    inline def setLossType(value: String): Self = StObject.set(x, "lossType", value.asInstanceOf[js.Any])
    
    inline def setLossTypeUndefined: Self = StObject.set(x, "lossType", js.undefined)
    
    inline def setMaxIterations(value: String): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    inline def setMinRelativeProgress(value: Double): Self = StObject.set(x, "minRelativeProgress", value.asInstanceOf[js.Any])
    
    inline def setMinRelativeProgressUndefined: Self = StObject.set(x, "minRelativeProgress", js.undefined)
    
    inline def setNumClusters(value: String): Self = StObject.set(x, "numClusters", value.asInstanceOf[js.Any])
    
    inline def setNumClustersUndefined: Self = StObject.set(x, "numClusters", js.undefined)
    
    inline def setWarmStart(value: Boolean): Self = StObject.set(x, "warmStart", value.asInstanceOf[js.Any])
    
    inline def setWarmStartUndefined: Self = StObject.set(x, "warmStart", js.undefined)
  }
}
