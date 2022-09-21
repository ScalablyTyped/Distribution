package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrainingOptions extends StObject {
  
  /**
    * If true, detect step changes and make data adjustment in the input time series.
    */
  var adjustStepChanges: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether to enable auto ARIMA or not.
    */
  var autoArima: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The max value of non-seasonal p and q.
    */
  var autoArimaMaxOrder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Batch size for dnn models.
    */
  var batchSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Booster type for boosted tree models.
    */
  var boosterType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not p-value test should be computed for this model. Only available for linear and logistic regression models.
    */
  var calculatePValues: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, clean spikes and dips in the input time series.
    */
  var cleanSpikesAndDips: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enums for color space, used for processing images in Object Table. See more details at https://www.tensorflow.org/io/tutorials/colorspace.
    */
  var colorSpace: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subsample ratio of columns for each level for boosted tree models.
    */
  var colsampleBylevel: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Subsample ratio of columns for each node(split) for boosted tree models.
    */
  var colsampleBynode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Subsample ratio of columns when constructing each tree for boosted tree models.
    */
  var colsampleBytree: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Type of normalization algorithm for boosted tree models using dart booster.
    */
  var dartNormalizeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The data frequency of a time series.
    */
  var dataFrequency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The column to split data with. This column won't be used as a feature. 1. When data_split_method is CUSTOM, the corresponding column should be boolean. The rows with true value tag are eval data, and the false are training data. 2. When data_split_method is SEQ, the first DATA_SPLIT_EVAL_FRACTION rows (from smallest to largest) in the corresponding column are used as training data, and the rest are eval data. It respects the order in Orderable data types: https://cloud.google.com/bigquery/docs/reference/standard-sql/data-types#data-type-properties
    */
  var dataSplitColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fraction of evaluation data over the whole input data. The rest of data will be used as training data. The format should be double. Accurate to two decimal places. Default value is 0.2.
    */
  var dataSplitEvalFraction: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The data split type for training and evaluation, e.g. RANDOM.
    */
  var dataSplitMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, perform decompose time series and save the results.
    */
  var decomposeTimeSeries: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Distance type for clustering models.
    */
  var distanceType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Dropout probability for dnn models.
    */
  var dropout: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether to stop early when the loss doesn't improve significantly any more (compared to min_relative_progress). Used only for iterative training algorithms.
    */
  var earlyStop: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, enable global explanation during training.
    */
  var enableGlobalExplain: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Feedback type that specifies which algorithm to run for matrix factorization.
    */
  var feedbackType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hidden units for dnn models.
    */
  var hiddenUnits: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The geographical region based on which the holidays are considered in time series modeling. If a valid value is specified, then holiday effects modeling is enabled.
    */
  var holidayRegion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of periods ahead that need to be forecasted.
    */
  var horizon: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target evaluation metrics to optimize the hyperparameters for.
    */
  var hparamTuningObjectives: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Include drift when fitting an ARIMA model.
    */
  var includeDrift: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies the initial learning rate for the line search learn rate strategy.
    */
  var initialLearnRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Name of input label columns in training data.
    */
  var inputLabelColumns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Number of integral steps for the integrated gradients explain method.
    */
  var integratedGradientsNumSteps: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Item column specified for matrix factorization models.
    */
  var itemColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The column used to provide the initial centroids for kmeans algorithm when kmeans_initialization_method is CUSTOM.
    */
  var kmeansInitializationColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The method used to initialize the centroids for kmeans algorithm.
    */
  var kmeansInitializationMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * L1 regularization coefficient.
    */
  var l1Regularization: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * L2 regularization coefficient.
    */
  var l2Regularization: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Weights associated with each label class, for rebalancing the training data. Only applicable for classification models.
    */
  var labelClassWeights: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  
  /**
    * Learning rate in training. Used only for iterative training algorithms.
    */
  var learnRate: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The strategy to determine learn rate for the current iteration.
    */
  var learnRateStrategy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of loss function used during training run.
    */
  var lossType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of iterations in training. Used only for iterative training algorithms.
    */
  var maxIterations: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum number of trials to run in parallel.
    */
  var maxParallelTrials: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Get truncated length by last n points in time series. Use separately from time_series_length_fraction and min_time_series_length.
    */
  var maxTimeSeriesLength: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Maximum depth of a tree for boosted tree models.
    */
  var maxTreeDepth: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When early_stop is true, stops training when accuracy improvement is less than 'min_relative_progress'. Used only for iterative training algorithms.
    */
  var minRelativeProgress: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Minimum split loss for boosted tree models.
    */
  var minSplitLoss: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Set fast trend ARIMA_PLUS model minimum training length. Use in pair with time_series_length_fraction.
    */
  var minTimeSeriesLength: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum sum of instance weight needed in a child for boosted tree models.
    */
  var minTreeChildWeight: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Google Cloud Storage URI from which the model was imported. Only applicable for imported models.
    */
  var modelUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A specification of the non-seasonal part of the ARIMA model: the three components (p, d, q) are the AR order, the degree of differencing, and the MA order.
    */
  var nonSeasonalOrder: js.UndefOr[SchemaArimaOrder] = js.undefined
  
  /**
    * Number of clusters for clustering models.
    */
  var numClusters: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Num factors specified for matrix factorization models.
    */
  var numFactors: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of parallel trees constructed during each iteration for boosted tree models.
    */
  var numParallelTree: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of trials to run this hyperparameter tuning job.
    */
  var numTrials: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optimization strategy for training linear regression models.
    */
  var optimizationStrategy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether to preserve the input structs in output feature names. Suppose there is a struct A with field b. When false (default), the output feature name is A_b. When true, the output feature name is A.b.
    */
  var preserveInputStructs: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Number of paths for the sampled Shapley explain method.
    */
  var sampledShapleyNumPaths: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subsample fraction of the training data to grow tree to prevent overfitting for boosted tree models.
    */
  var subsample: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Column to be designated as time series data for ARIMA model.
    */
  var timeSeriesDataColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time series id column that was used during ARIMA model training.
    */
  var timeSeriesIdColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time series id columns that were used during ARIMA model training.
    */
  var timeSeriesIdColumns: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Get truncated length by fraction in time series.
    */
  var timeSeriesLengthFraction: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Column to be designated as time series timestamp for ARIMA model.
    */
  var timeSeriesTimestampColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Tree construction algorithm for boosted tree models.
    */
  var treeMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The smoothing window size for the trend component of the time series.
    */
  var trendSmoothingWindowSize: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User column specified for matrix factorization models.
    */
  var userColumn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Hyperparameter for matrix factoration when implicit feedback type is specified.
    */
  var walsAlpha: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Whether to train a model from the last checkpoint.
    */
  var warmStart: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaTrainingOptions {
  
  inline def apply(): SchemaTrainingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrainingOptions]
  }
  
  extension [Self <: SchemaTrainingOptions](x: Self) {
    
    inline def setAdjustStepChanges(value: Boolean): Self = StObject.set(x, "adjustStepChanges", value.asInstanceOf[js.Any])
    
    inline def setAdjustStepChangesNull: Self = StObject.set(x, "adjustStepChanges", null)
    
    inline def setAdjustStepChangesUndefined: Self = StObject.set(x, "adjustStepChanges", js.undefined)
    
    inline def setAutoArima(value: Boolean): Self = StObject.set(x, "autoArima", value.asInstanceOf[js.Any])
    
    inline def setAutoArimaMaxOrder(value: String): Self = StObject.set(x, "autoArimaMaxOrder", value.asInstanceOf[js.Any])
    
    inline def setAutoArimaMaxOrderNull: Self = StObject.set(x, "autoArimaMaxOrder", null)
    
    inline def setAutoArimaMaxOrderUndefined: Self = StObject.set(x, "autoArimaMaxOrder", js.undefined)
    
    inline def setAutoArimaNull: Self = StObject.set(x, "autoArima", null)
    
    inline def setAutoArimaUndefined: Self = StObject.set(x, "autoArima", js.undefined)
    
    inline def setBatchSize(value: String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeNull: Self = StObject.set(x, "batchSize", null)
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setBoosterType(value: String): Self = StObject.set(x, "boosterType", value.asInstanceOf[js.Any])
    
    inline def setBoosterTypeNull: Self = StObject.set(x, "boosterType", null)
    
    inline def setBoosterTypeUndefined: Self = StObject.set(x, "boosterType", js.undefined)
    
    inline def setCalculatePValues(value: Boolean): Self = StObject.set(x, "calculatePValues", value.asInstanceOf[js.Any])
    
    inline def setCalculatePValuesNull: Self = StObject.set(x, "calculatePValues", null)
    
    inline def setCalculatePValuesUndefined: Self = StObject.set(x, "calculatePValues", js.undefined)
    
    inline def setCleanSpikesAndDips(value: Boolean): Self = StObject.set(x, "cleanSpikesAndDips", value.asInstanceOf[js.Any])
    
    inline def setCleanSpikesAndDipsNull: Self = StObject.set(x, "cleanSpikesAndDips", null)
    
    inline def setCleanSpikesAndDipsUndefined: Self = StObject.set(x, "cleanSpikesAndDips", js.undefined)
    
    inline def setColorSpace(value: String): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceNull: Self = StObject.set(x, "colorSpace", null)
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setColsampleBylevel(value: Double): Self = StObject.set(x, "colsampleBylevel", value.asInstanceOf[js.Any])
    
    inline def setColsampleBylevelNull: Self = StObject.set(x, "colsampleBylevel", null)
    
    inline def setColsampleBylevelUndefined: Self = StObject.set(x, "colsampleBylevel", js.undefined)
    
    inline def setColsampleBynode(value: Double): Self = StObject.set(x, "colsampleBynode", value.asInstanceOf[js.Any])
    
    inline def setColsampleBynodeNull: Self = StObject.set(x, "colsampleBynode", null)
    
    inline def setColsampleBynodeUndefined: Self = StObject.set(x, "colsampleBynode", js.undefined)
    
    inline def setColsampleBytree(value: Double): Self = StObject.set(x, "colsampleBytree", value.asInstanceOf[js.Any])
    
    inline def setColsampleBytreeNull: Self = StObject.set(x, "colsampleBytree", null)
    
    inline def setColsampleBytreeUndefined: Self = StObject.set(x, "colsampleBytree", js.undefined)
    
    inline def setDartNormalizeType(value: String): Self = StObject.set(x, "dartNormalizeType", value.asInstanceOf[js.Any])
    
    inline def setDartNormalizeTypeNull: Self = StObject.set(x, "dartNormalizeType", null)
    
    inline def setDartNormalizeTypeUndefined: Self = StObject.set(x, "dartNormalizeType", js.undefined)
    
    inline def setDataFrequency(value: String): Self = StObject.set(x, "dataFrequency", value.asInstanceOf[js.Any])
    
    inline def setDataFrequencyNull: Self = StObject.set(x, "dataFrequency", null)
    
    inline def setDataFrequencyUndefined: Self = StObject.set(x, "dataFrequency", js.undefined)
    
    inline def setDataSplitColumn(value: String): Self = StObject.set(x, "dataSplitColumn", value.asInstanceOf[js.Any])
    
    inline def setDataSplitColumnNull: Self = StObject.set(x, "dataSplitColumn", null)
    
    inline def setDataSplitColumnUndefined: Self = StObject.set(x, "dataSplitColumn", js.undefined)
    
    inline def setDataSplitEvalFraction(value: Double): Self = StObject.set(x, "dataSplitEvalFraction", value.asInstanceOf[js.Any])
    
    inline def setDataSplitEvalFractionNull: Self = StObject.set(x, "dataSplitEvalFraction", null)
    
    inline def setDataSplitEvalFractionUndefined: Self = StObject.set(x, "dataSplitEvalFraction", js.undefined)
    
    inline def setDataSplitMethod(value: String): Self = StObject.set(x, "dataSplitMethod", value.asInstanceOf[js.Any])
    
    inline def setDataSplitMethodNull: Self = StObject.set(x, "dataSplitMethod", null)
    
    inline def setDataSplitMethodUndefined: Self = StObject.set(x, "dataSplitMethod", js.undefined)
    
    inline def setDecomposeTimeSeries(value: Boolean): Self = StObject.set(x, "decomposeTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setDecomposeTimeSeriesNull: Self = StObject.set(x, "decomposeTimeSeries", null)
    
    inline def setDecomposeTimeSeriesUndefined: Self = StObject.set(x, "decomposeTimeSeries", js.undefined)
    
    inline def setDistanceType(value: String): Self = StObject.set(x, "distanceType", value.asInstanceOf[js.Any])
    
    inline def setDistanceTypeNull: Self = StObject.set(x, "distanceType", null)
    
    inline def setDistanceTypeUndefined: Self = StObject.set(x, "distanceType", js.undefined)
    
    inline def setDropout(value: Double): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
    
    inline def setDropoutNull: Self = StObject.set(x, "dropout", null)
    
    inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
    
    inline def setEarlyStop(value: Boolean): Self = StObject.set(x, "earlyStop", value.asInstanceOf[js.Any])
    
    inline def setEarlyStopNull: Self = StObject.set(x, "earlyStop", null)
    
    inline def setEarlyStopUndefined: Self = StObject.set(x, "earlyStop", js.undefined)
    
    inline def setEnableGlobalExplain(value: Boolean): Self = StObject.set(x, "enableGlobalExplain", value.asInstanceOf[js.Any])
    
    inline def setEnableGlobalExplainNull: Self = StObject.set(x, "enableGlobalExplain", null)
    
    inline def setEnableGlobalExplainUndefined: Self = StObject.set(x, "enableGlobalExplain", js.undefined)
    
    inline def setFeedbackType(value: String): Self = StObject.set(x, "feedbackType", value.asInstanceOf[js.Any])
    
    inline def setFeedbackTypeNull: Self = StObject.set(x, "feedbackType", null)
    
    inline def setFeedbackTypeUndefined: Self = StObject.set(x, "feedbackType", js.undefined)
    
    inline def setHiddenUnits(value: js.Array[String]): Self = StObject.set(x, "hiddenUnits", value.asInstanceOf[js.Any])
    
    inline def setHiddenUnitsNull: Self = StObject.set(x, "hiddenUnits", null)
    
    inline def setHiddenUnitsUndefined: Self = StObject.set(x, "hiddenUnits", js.undefined)
    
    inline def setHiddenUnitsVarargs(value: String*): Self = StObject.set(x, "hiddenUnits", js.Array(value*))
    
    inline def setHolidayRegion(value: String): Self = StObject.set(x, "holidayRegion", value.asInstanceOf[js.Any])
    
    inline def setHolidayRegionNull: Self = StObject.set(x, "holidayRegion", null)
    
    inline def setHolidayRegionUndefined: Self = StObject.set(x, "holidayRegion", js.undefined)
    
    inline def setHorizon(value: String): Self = StObject.set(x, "horizon", value.asInstanceOf[js.Any])
    
    inline def setHorizonNull: Self = StObject.set(x, "horizon", null)
    
    inline def setHorizonUndefined: Self = StObject.set(x, "horizon", js.undefined)
    
    inline def setHparamTuningObjectives(value: js.Array[String]): Self = StObject.set(x, "hparamTuningObjectives", value.asInstanceOf[js.Any])
    
    inline def setHparamTuningObjectivesNull: Self = StObject.set(x, "hparamTuningObjectives", null)
    
    inline def setHparamTuningObjectivesUndefined: Self = StObject.set(x, "hparamTuningObjectives", js.undefined)
    
    inline def setHparamTuningObjectivesVarargs(value: String*): Self = StObject.set(x, "hparamTuningObjectives", js.Array(value*))
    
    inline def setIncludeDrift(value: Boolean): Self = StObject.set(x, "includeDrift", value.asInstanceOf[js.Any])
    
    inline def setIncludeDriftNull: Self = StObject.set(x, "includeDrift", null)
    
    inline def setIncludeDriftUndefined: Self = StObject.set(x, "includeDrift", js.undefined)
    
    inline def setInitialLearnRate(value: Double): Self = StObject.set(x, "initialLearnRate", value.asInstanceOf[js.Any])
    
    inline def setInitialLearnRateNull: Self = StObject.set(x, "initialLearnRate", null)
    
    inline def setInitialLearnRateUndefined: Self = StObject.set(x, "initialLearnRate", js.undefined)
    
    inline def setInputLabelColumns(value: js.Array[String]): Self = StObject.set(x, "inputLabelColumns", value.asInstanceOf[js.Any])
    
    inline def setInputLabelColumnsNull: Self = StObject.set(x, "inputLabelColumns", null)
    
    inline def setInputLabelColumnsUndefined: Self = StObject.set(x, "inputLabelColumns", js.undefined)
    
    inline def setInputLabelColumnsVarargs(value: String*): Self = StObject.set(x, "inputLabelColumns", js.Array(value*))
    
    inline def setIntegratedGradientsNumSteps(value: String): Self = StObject.set(x, "integratedGradientsNumSteps", value.asInstanceOf[js.Any])
    
    inline def setIntegratedGradientsNumStepsNull: Self = StObject.set(x, "integratedGradientsNumSteps", null)
    
    inline def setIntegratedGradientsNumStepsUndefined: Self = StObject.set(x, "integratedGradientsNumSteps", js.undefined)
    
    inline def setItemColumn(value: String): Self = StObject.set(x, "itemColumn", value.asInstanceOf[js.Any])
    
    inline def setItemColumnNull: Self = StObject.set(x, "itemColumn", null)
    
    inline def setItemColumnUndefined: Self = StObject.set(x, "itemColumn", js.undefined)
    
    inline def setKmeansInitializationColumn(value: String): Self = StObject.set(x, "kmeansInitializationColumn", value.asInstanceOf[js.Any])
    
    inline def setKmeansInitializationColumnNull: Self = StObject.set(x, "kmeansInitializationColumn", null)
    
    inline def setKmeansInitializationColumnUndefined: Self = StObject.set(x, "kmeansInitializationColumn", js.undefined)
    
    inline def setKmeansInitializationMethod(value: String): Self = StObject.set(x, "kmeansInitializationMethod", value.asInstanceOf[js.Any])
    
    inline def setKmeansInitializationMethodNull: Self = StObject.set(x, "kmeansInitializationMethod", null)
    
    inline def setKmeansInitializationMethodUndefined: Self = StObject.set(x, "kmeansInitializationMethod", js.undefined)
    
    inline def setL1Regularization(value: Double): Self = StObject.set(x, "l1Regularization", value.asInstanceOf[js.Any])
    
    inline def setL1RegularizationNull: Self = StObject.set(x, "l1Regularization", null)
    
    inline def setL1RegularizationUndefined: Self = StObject.set(x, "l1Regularization", js.undefined)
    
    inline def setL2Regularization(value: Double): Self = StObject.set(x, "l2Regularization", value.asInstanceOf[js.Any])
    
    inline def setL2RegularizationNull: Self = StObject.set(x, "l2Regularization", null)
    
    inline def setL2RegularizationUndefined: Self = StObject.set(x, "l2Regularization", js.undefined)
    
    inline def setLabelClassWeights(value: StringDictionary[Double]): Self = StObject.set(x, "labelClassWeights", value.asInstanceOf[js.Any])
    
    inline def setLabelClassWeightsNull: Self = StObject.set(x, "labelClassWeights", null)
    
    inline def setLabelClassWeightsUndefined: Self = StObject.set(x, "labelClassWeights", js.undefined)
    
    inline def setLearnRate(value: Double): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    inline def setLearnRateNull: Self = StObject.set(x, "learnRate", null)
    
    inline def setLearnRateStrategy(value: String): Self = StObject.set(x, "learnRateStrategy", value.asInstanceOf[js.Any])
    
    inline def setLearnRateStrategyNull: Self = StObject.set(x, "learnRateStrategy", null)
    
    inline def setLearnRateStrategyUndefined: Self = StObject.set(x, "learnRateStrategy", js.undefined)
    
    inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    inline def setLossType(value: String): Self = StObject.set(x, "lossType", value.asInstanceOf[js.Any])
    
    inline def setLossTypeNull: Self = StObject.set(x, "lossType", null)
    
    inline def setLossTypeUndefined: Self = StObject.set(x, "lossType", js.undefined)
    
    inline def setMaxIterations(value: String): Self = StObject.set(x, "maxIterations", value.asInstanceOf[js.Any])
    
    inline def setMaxIterationsNull: Self = StObject.set(x, "maxIterations", null)
    
    inline def setMaxIterationsUndefined: Self = StObject.set(x, "maxIterations", js.undefined)
    
    inline def setMaxParallelTrials(value: String): Self = StObject.set(x, "maxParallelTrials", value.asInstanceOf[js.Any])
    
    inline def setMaxParallelTrialsNull: Self = StObject.set(x, "maxParallelTrials", null)
    
    inline def setMaxParallelTrialsUndefined: Self = StObject.set(x, "maxParallelTrials", js.undefined)
    
    inline def setMaxTimeSeriesLength(value: String): Self = StObject.set(x, "maxTimeSeriesLength", value.asInstanceOf[js.Any])
    
    inline def setMaxTimeSeriesLengthNull: Self = StObject.set(x, "maxTimeSeriesLength", null)
    
    inline def setMaxTimeSeriesLengthUndefined: Self = StObject.set(x, "maxTimeSeriesLength", js.undefined)
    
    inline def setMaxTreeDepth(value: String): Self = StObject.set(x, "maxTreeDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxTreeDepthNull: Self = StObject.set(x, "maxTreeDepth", null)
    
    inline def setMaxTreeDepthUndefined: Self = StObject.set(x, "maxTreeDepth", js.undefined)
    
    inline def setMinRelativeProgress(value: Double): Self = StObject.set(x, "minRelativeProgress", value.asInstanceOf[js.Any])
    
    inline def setMinRelativeProgressNull: Self = StObject.set(x, "minRelativeProgress", null)
    
    inline def setMinRelativeProgressUndefined: Self = StObject.set(x, "minRelativeProgress", js.undefined)
    
    inline def setMinSplitLoss(value: Double): Self = StObject.set(x, "minSplitLoss", value.asInstanceOf[js.Any])
    
    inline def setMinSplitLossNull: Self = StObject.set(x, "minSplitLoss", null)
    
    inline def setMinSplitLossUndefined: Self = StObject.set(x, "minSplitLoss", js.undefined)
    
    inline def setMinTimeSeriesLength(value: String): Self = StObject.set(x, "minTimeSeriesLength", value.asInstanceOf[js.Any])
    
    inline def setMinTimeSeriesLengthNull: Self = StObject.set(x, "minTimeSeriesLength", null)
    
    inline def setMinTimeSeriesLengthUndefined: Self = StObject.set(x, "minTimeSeriesLength", js.undefined)
    
    inline def setMinTreeChildWeight(value: String): Self = StObject.set(x, "minTreeChildWeight", value.asInstanceOf[js.Any])
    
    inline def setMinTreeChildWeightNull: Self = StObject.set(x, "minTreeChildWeight", null)
    
    inline def setMinTreeChildWeightUndefined: Self = StObject.set(x, "minTreeChildWeight", js.undefined)
    
    inline def setModelUri(value: String): Self = StObject.set(x, "modelUri", value.asInstanceOf[js.Any])
    
    inline def setModelUriNull: Self = StObject.set(x, "modelUri", null)
    
    inline def setModelUriUndefined: Self = StObject.set(x, "modelUri", js.undefined)
    
    inline def setNonSeasonalOrder(value: SchemaArimaOrder): Self = StObject.set(x, "nonSeasonalOrder", value.asInstanceOf[js.Any])
    
    inline def setNonSeasonalOrderUndefined: Self = StObject.set(x, "nonSeasonalOrder", js.undefined)
    
    inline def setNumClusters(value: String): Self = StObject.set(x, "numClusters", value.asInstanceOf[js.Any])
    
    inline def setNumClustersNull: Self = StObject.set(x, "numClusters", null)
    
    inline def setNumClustersUndefined: Self = StObject.set(x, "numClusters", js.undefined)
    
    inline def setNumFactors(value: String): Self = StObject.set(x, "numFactors", value.asInstanceOf[js.Any])
    
    inline def setNumFactorsNull: Self = StObject.set(x, "numFactors", null)
    
    inline def setNumFactorsUndefined: Self = StObject.set(x, "numFactors", js.undefined)
    
    inline def setNumParallelTree(value: String): Self = StObject.set(x, "numParallelTree", value.asInstanceOf[js.Any])
    
    inline def setNumParallelTreeNull: Self = StObject.set(x, "numParallelTree", null)
    
    inline def setNumParallelTreeUndefined: Self = StObject.set(x, "numParallelTree", js.undefined)
    
    inline def setNumTrials(value: String): Self = StObject.set(x, "numTrials", value.asInstanceOf[js.Any])
    
    inline def setNumTrialsNull: Self = StObject.set(x, "numTrials", null)
    
    inline def setNumTrialsUndefined: Self = StObject.set(x, "numTrials", js.undefined)
    
    inline def setOptimizationStrategy(value: String): Self = StObject.set(x, "optimizationStrategy", value.asInstanceOf[js.Any])
    
    inline def setOptimizationStrategyNull: Self = StObject.set(x, "optimizationStrategy", null)
    
    inline def setOptimizationStrategyUndefined: Self = StObject.set(x, "optimizationStrategy", js.undefined)
    
    inline def setPreserveInputStructs(value: Boolean): Self = StObject.set(x, "preserveInputStructs", value.asInstanceOf[js.Any])
    
    inline def setPreserveInputStructsNull: Self = StObject.set(x, "preserveInputStructs", null)
    
    inline def setPreserveInputStructsUndefined: Self = StObject.set(x, "preserveInputStructs", js.undefined)
    
    inline def setSampledShapleyNumPaths(value: String): Self = StObject.set(x, "sampledShapleyNumPaths", value.asInstanceOf[js.Any])
    
    inline def setSampledShapleyNumPathsNull: Self = StObject.set(x, "sampledShapleyNumPaths", null)
    
    inline def setSampledShapleyNumPathsUndefined: Self = StObject.set(x, "sampledShapleyNumPaths", js.undefined)
    
    inline def setSubsample(value: Double): Self = StObject.set(x, "subsample", value.asInstanceOf[js.Any])
    
    inline def setSubsampleNull: Self = StObject.set(x, "subsample", null)
    
    inline def setSubsampleUndefined: Self = StObject.set(x, "subsample", js.undefined)
    
    inline def setTimeSeriesDataColumn(value: String): Self = StObject.set(x, "timeSeriesDataColumn", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesDataColumnNull: Self = StObject.set(x, "timeSeriesDataColumn", null)
    
    inline def setTimeSeriesDataColumnUndefined: Self = StObject.set(x, "timeSeriesDataColumn", js.undefined)
    
    inline def setTimeSeriesIdColumn(value: String): Self = StObject.set(x, "timeSeriesIdColumn", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdColumnNull: Self = StObject.set(x, "timeSeriesIdColumn", null)
    
    inline def setTimeSeriesIdColumnUndefined: Self = StObject.set(x, "timeSeriesIdColumn", js.undefined)
    
    inline def setTimeSeriesIdColumns(value: js.Array[String]): Self = StObject.set(x, "timeSeriesIdColumns", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesIdColumnsNull: Self = StObject.set(x, "timeSeriesIdColumns", null)
    
    inline def setTimeSeriesIdColumnsUndefined: Self = StObject.set(x, "timeSeriesIdColumns", js.undefined)
    
    inline def setTimeSeriesIdColumnsVarargs(value: String*): Self = StObject.set(x, "timeSeriesIdColumns", js.Array(value*))
    
    inline def setTimeSeriesLengthFraction(value: Double): Self = StObject.set(x, "timeSeriesLengthFraction", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesLengthFractionNull: Self = StObject.set(x, "timeSeriesLengthFraction", null)
    
    inline def setTimeSeriesLengthFractionUndefined: Self = StObject.set(x, "timeSeriesLengthFraction", js.undefined)
    
    inline def setTimeSeriesTimestampColumn(value: String): Self = StObject.set(x, "timeSeriesTimestampColumn", value.asInstanceOf[js.Any])
    
    inline def setTimeSeriesTimestampColumnNull: Self = StObject.set(x, "timeSeriesTimestampColumn", null)
    
    inline def setTimeSeriesTimestampColumnUndefined: Self = StObject.set(x, "timeSeriesTimestampColumn", js.undefined)
    
    inline def setTreeMethod(value: String): Self = StObject.set(x, "treeMethod", value.asInstanceOf[js.Any])
    
    inline def setTreeMethodNull: Self = StObject.set(x, "treeMethod", null)
    
    inline def setTreeMethodUndefined: Self = StObject.set(x, "treeMethod", js.undefined)
    
    inline def setTrendSmoothingWindowSize(value: String): Self = StObject.set(x, "trendSmoothingWindowSize", value.asInstanceOf[js.Any])
    
    inline def setTrendSmoothingWindowSizeNull: Self = StObject.set(x, "trendSmoothingWindowSize", null)
    
    inline def setTrendSmoothingWindowSizeUndefined: Self = StObject.set(x, "trendSmoothingWindowSize", js.undefined)
    
    inline def setUserColumn(value: String): Self = StObject.set(x, "userColumn", value.asInstanceOf[js.Any])
    
    inline def setUserColumnNull: Self = StObject.set(x, "userColumn", null)
    
    inline def setUserColumnUndefined: Self = StObject.set(x, "userColumn", js.undefined)
    
    inline def setWalsAlpha(value: Double): Self = StObject.set(x, "walsAlpha", value.asInstanceOf[js.Any])
    
    inline def setWalsAlphaNull: Self = StObject.set(x, "walsAlpha", null)
    
    inline def setWalsAlphaUndefined: Self = StObject.set(x, "walsAlpha", js.undefined)
    
    inline def setWarmStart(value: Boolean): Self = StObject.set(x, "warmStart", value.asInstanceOf[js.Any])
    
    inline def setWarmStartNull: Self = StObject.set(x, "warmStart", null)
    
    inline def setWarmStartUndefined: Self = StObject.set(x, "warmStart", js.undefined)
  }
}
