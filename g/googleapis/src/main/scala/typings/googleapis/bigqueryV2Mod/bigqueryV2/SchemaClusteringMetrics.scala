package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Evaluation metrics for clustering models.
  */
@js.native
trait SchemaClusteringMetrics extends StObject {
  
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
  implicit class SchemaClusteringMetricsMutableBuilder[Self <: SchemaClusteringMetrics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDaviesBouldinIndex(value: Double): Self = StObject.set(x, "daviesBouldinIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDaviesBouldinIndexUndefined: Self = StObject.set(x, "daviesBouldinIndex", js.undefined)
    
    @scala.inline
    def setMeanSquaredDistance(value: Double): Self = StObject.set(x, "meanSquaredDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeanSquaredDistanceUndefined: Self = StObject.set(x, "meanSquaredDistance", js.undefined)
  }
}
