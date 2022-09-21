package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHparamSearchSpaces extends StObject {
  
  /**
    * Activation functions of neural network models.
    */
  var activationFn: js.UndefOr[SchemaStringHparamSearchSpace] = js.undefined
  
  /**
    * Mini batch sample size.
    */
  var batchSize: js.UndefOr[SchemaIntHparamSearchSpace] = js.undefined
  
  /**
    * Booster type for boosted tree models.
    */
  var boosterType: js.UndefOr[SchemaStringHparamSearchSpace] = js.undefined
  
  /**
    * Subsample ratio of columns for each level for boosted tree models.
    */
  var colsampleBylevel: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Subsample ratio of columns for each node(split) for boosted tree models.
    */
  var colsampleBynode: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Subsample ratio of columns when constructing each tree for boosted tree models.
    */
  var colsampleBytree: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Dart normalization type for boosted tree models.
    */
  var dartNormalizeType: js.UndefOr[SchemaStringHparamSearchSpace] = js.undefined
  
  /**
    * Dropout probability for dnn model training and boosted tree models using dart booster.
    */
  var dropout: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Hidden units for neural network models.
    */
  var hiddenUnits: js.UndefOr[SchemaIntArrayHparamSearchSpace] = js.undefined
  
  /**
    * L1 regularization coefficient.
    */
  var l1Reg: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * L2 regularization coefficient.
    */
  var l2Reg: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Learning rate of training jobs.
    */
  var learnRate: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Maximum depth of a tree for boosted tree models.
    */
  var maxTreeDepth: js.UndefOr[SchemaIntHparamSearchSpace] = js.undefined
  
  /**
    * Minimum split loss for boosted tree models.
    */
  var minSplitLoss: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Minimum sum of instance weight needed in a child for boosted tree models.
    */
  var minTreeChildWeight: js.UndefOr[SchemaIntHparamSearchSpace] = js.undefined
  
  /**
    * Number of clusters for k-means.
    */
  var numClusters: js.UndefOr[SchemaIntHparamSearchSpace] = js.undefined
  
  /**
    * Number of latent factors to train on.
    */
  var numFactors: js.UndefOr[SchemaIntHparamSearchSpace] = js.undefined
  
  /**
    * Number of parallel trees for boosted tree models.
    */
  var numParallelTree: js.UndefOr[SchemaIntHparamSearchSpace] = js.undefined
  
  /**
    * Optimizer of TF models.
    */
  var optimizer: js.UndefOr[SchemaStringHparamSearchSpace] = js.undefined
  
  /**
    * Subsample the training data to grow tree to prevent overfitting for boosted tree models.
    */
  var subsample: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
  
  /**
    * Tree construction algorithm for boosted tree models.
    */
  var treeMethod: js.UndefOr[SchemaStringHparamSearchSpace] = js.undefined
  
  /**
    * Hyperparameter for matrix factoration when implicit feedback type is specified.
    */
  var walsAlpha: js.UndefOr[SchemaDoubleHparamSearchSpace] = js.undefined
}
object SchemaHparamSearchSpaces {
  
  inline def apply(): SchemaHparamSearchSpaces = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHparamSearchSpaces]
  }
  
  extension [Self <: SchemaHparamSearchSpaces](x: Self) {
    
    inline def setActivationFn(value: SchemaStringHparamSearchSpace): Self = StObject.set(x, "activationFn", value.asInstanceOf[js.Any])
    
    inline def setActivationFnUndefined: Self = StObject.set(x, "activationFn", js.undefined)
    
    inline def setBatchSize(value: SchemaIntHparamSearchSpace): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setBoosterType(value: SchemaStringHparamSearchSpace): Self = StObject.set(x, "boosterType", value.asInstanceOf[js.Any])
    
    inline def setBoosterTypeUndefined: Self = StObject.set(x, "boosterType", js.undefined)
    
    inline def setColsampleBylevel(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "colsampleBylevel", value.asInstanceOf[js.Any])
    
    inline def setColsampleBylevelUndefined: Self = StObject.set(x, "colsampleBylevel", js.undefined)
    
    inline def setColsampleBynode(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "colsampleBynode", value.asInstanceOf[js.Any])
    
    inline def setColsampleBynodeUndefined: Self = StObject.set(x, "colsampleBynode", js.undefined)
    
    inline def setColsampleBytree(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "colsampleBytree", value.asInstanceOf[js.Any])
    
    inline def setColsampleBytreeUndefined: Self = StObject.set(x, "colsampleBytree", js.undefined)
    
    inline def setDartNormalizeType(value: SchemaStringHparamSearchSpace): Self = StObject.set(x, "dartNormalizeType", value.asInstanceOf[js.Any])
    
    inline def setDartNormalizeTypeUndefined: Self = StObject.set(x, "dartNormalizeType", js.undefined)
    
    inline def setDropout(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "dropout", value.asInstanceOf[js.Any])
    
    inline def setDropoutUndefined: Self = StObject.set(x, "dropout", js.undefined)
    
    inline def setHiddenUnits(value: SchemaIntArrayHparamSearchSpace): Self = StObject.set(x, "hiddenUnits", value.asInstanceOf[js.Any])
    
    inline def setHiddenUnitsUndefined: Self = StObject.set(x, "hiddenUnits", js.undefined)
    
    inline def setL1Reg(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "l1Reg", value.asInstanceOf[js.Any])
    
    inline def setL1RegUndefined: Self = StObject.set(x, "l1Reg", js.undefined)
    
    inline def setL2Reg(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "l2Reg", value.asInstanceOf[js.Any])
    
    inline def setL2RegUndefined: Self = StObject.set(x, "l2Reg", js.undefined)
    
    inline def setLearnRate(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "learnRate", value.asInstanceOf[js.Any])
    
    inline def setLearnRateUndefined: Self = StObject.set(x, "learnRate", js.undefined)
    
    inline def setMaxTreeDepth(value: SchemaIntHparamSearchSpace): Self = StObject.set(x, "maxTreeDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxTreeDepthUndefined: Self = StObject.set(x, "maxTreeDepth", js.undefined)
    
    inline def setMinSplitLoss(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "minSplitLoss", value.asInstanceOf[js.Any])
    
    inline def setMinSplitLossUndefined: Self = StObject.set(x, "minSplitLoss", js.undefined)
    
    inline def setMinTreeChildWeight(value: SchemaIntHparamSearchSpace): Self = StObject.set(x, "minTreeChildWeight", value.asInstanceOf[js.Any])
    
    inline def setMinTreeChildWeightUndefined: Self = StObject.set(x, "minTreeChildWeight", js.undefined)
    
    inline def setNumClusters(value: SchemaIntHparamSearchSpace): Self = StObject.set(x, "numClusters", value.asInstanceOf[js.Any])
    
    inline def setNumClustersUndefined: Self = StObject.set(x, "numClusters", js.undefined)
    
    inline def setNumFactors(value: SchemaIntHparamSearchSpace): Self = StObject.set(x, "numFactors", value.asInstanceOf[js.Any])
    
    inline def setNumFactorsUndefined: Self = StObject.set(x, "numFactors", js.undefined)
    
    inline def setNumParallelTree(value: SchemaIntHparamSearchSpace): Self = StObject.set(x, "numParallelTree", value.asInstanceOf[js.Any])
    
    inline def setNumParallelTreeUndefined: Self = StObject.set(x, "numParallelTree", js.undefined)
    
    inline def setOptimizer(value: SchemaStringHparamSearchSpace): Self = StObject.set(x, "optimizer", value.asInstanceOf[js.Any])
    
    inline def setOptimizerUndefined: Self = StObject.set(x, "optimizer", js.undefined)
    
    inline def setSubsample(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "subsample", value.asInstanceOf[js.Any])
    
    inline def setSubsampleUndefined: Self = StObject.set(x, "subsample", js.undefined)
    
    inline def setTreeMethod(value: SchemaStringHparamSearchSpace): Self = StObject.set(x, "treeMethod", value.asInstanceOf[js.Any])
    
    inline def setTreeMethodUndefined: Self = StObject.set(x, "treeMethod", js.undefined)
    
    inline def setWalsAlpha(value: SchemaDoubleHparamSearchSpace): Self = StObject.set(x, "walsAlpha", value.asInstanceOf[js.Any])
    
    inline def setWalsAlphaUndefined: Self = StObject.set(x, "walsAlpha", js.undefined)
  }
}
