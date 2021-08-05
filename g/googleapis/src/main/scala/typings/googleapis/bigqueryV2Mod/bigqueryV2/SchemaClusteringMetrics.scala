package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Evaluation metrics for clustering models.
  */
trait SchemaClusteringMetrics extends StObject {
  
  /**
    * Davies-Bouldin index.
    */
  var daviesBouldinIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Mean of squared distances between each sample to its cluster centroid.
    */
  var meanSquaredDistance: js.UndefOr[Double] = js.undefined
}
object SchemaClusteringMetrics {
  
  inline def apply(): SchemaClusteringMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusteringMetrics]
  }
  
  extension [Self <: SchemaClusteringMetrics](x: Self) {
    
    inline def setDaviesBouldinIndex(value: Double): Self = StObject.set(x, "daviesBouldinIndex", value.asInstanceOf[js.Any])
    
    inline def setDaviesBouldinIndexUndefined: Self = StObject.set(x, "daviesBouldinIndex", js.undefined)
    
    inline def setMeanSquaredDistance(value: Double): Self = StObject.set(x, "meanSquaredDistance", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredDistanceUndefined: Self = StObject.set(x, "meanSquaredDistance", js.undefined)
  }
}
