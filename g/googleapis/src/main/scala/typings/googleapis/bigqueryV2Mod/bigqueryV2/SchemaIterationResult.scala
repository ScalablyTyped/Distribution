package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a single iteration of the training run.
  */
@js.native
trait SchemaIterationResult extends js.Object {
  
  /**
    * [Beta] Information about top clusters for clustering models.
    */
  var clusterInfos: js.UndefOr[js.Array[SchemaClusterInfo]] = js.native
  
  /**
    * Time taken to run the iteration in milliseconds.
    */
  var durationMs: js.UndefOr[String] = js.native
  
  /**
    * Loss computed on the eval data at the end of iteration.
    */
  var evalLoss: js.UndefOr[Double] = js.native
  
  /**
    * Index of the iteration, 0 based.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Learn rate used for this iteration.
    */
  var learnRate: js.UndefOr[Double] = js.native
  
  /**
    * Loss computed on the training data at the end of iteration.
    */
  var trainingLoss: js.UndefOr[Double] = js.native
}
object SchemaIterationResult {
  
  @scala.inline
  def apply(): SchemaIterationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIterationResult]
  }
  
  @scala.inline
  implicit class SchemaIterationResultOps[Self <: SchemaIterationResult] (val x: Self) extends AnyVal {
    
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
    def setClusterInfosVarargs(value: SchemaClusterInfo*): Self = this.set("clusterInfos", js.Array(value :_*))
    
    @scala.inline
    def setClusterInfos(value: js.Array[SchemaClusterInfo]): Self = this.set("clusterInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterInfos: Self = this.set("clusterInfos", js.undefined)
    
    @scala.inline
    def setDurationMs(value: String): Self = this.set("durationMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDurationMs: Self = this.set("durationMs", js.undefined)
    
    @scala.inline
    def setEvalLoss(value: Double): Self = this.set("evalLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvalLoss: Self = this.set("evalLoss", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setLearnRate(value: Double): Self = this.set("learnRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLearnRate: Self = this.set("learnRate", js.undefined)
    
    @scala.inline
    def setTrainingLoss(value: Double): Self = this.set("trainingLoss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingLoss: Self = this.set("trainingLoss", js.undefined)
  }
}
