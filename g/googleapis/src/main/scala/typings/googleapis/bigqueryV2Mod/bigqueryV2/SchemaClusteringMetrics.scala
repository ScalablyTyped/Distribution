package typings.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Evaluation metrics for clustering models.
  */
@js.native
trait SchemaClusteringMetrics extends js.Object {
  
  /**
    * Davies-Bouldin index.
    */
  var daviesBouldinIndex: js.UndefOr[Double] = js.native
  
  /**
    * Mean of squared distances between each sample to its cluster centroid.
    */
  var meanSquaredDistance: js.UndefOr[Double] = js.native
}
object SchemaClusteringMetrics {
  
  @scala.inline
  def apply(): SchemaClusteringMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusteringMetrics]
  }
  
  @scala.inline
  implicit class SchemaClusteringMetricsOps[Self <: SchemaClusteringMetrics] (val x: Self) extends AnyVal {
    
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
    def setDaviesBouldinIndex(value: Double): Self = this.set("daviesBouldinIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDaviesBouldinIndex: Self = this.set("daviesBouldinIndex", js.undefined)
    
    @scala.inline
    def setMeanSquaredDistance(value: Double): Self = this.set("meanSquaredDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeanSquaredDistance: Self = this.set("meanSquaredDistance", js.undefined)
  }
}
