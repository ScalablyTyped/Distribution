package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusteringMetrics extends StObject {
  
  /**
    * Information for all clusters.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.undefined
  
  /**
    * Davies-Bouldin index.
    */
  var daviesBouldinIndex: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Mean of squared distances between each sample to its cluster centroid.
    */
  var meanSquaredDistance: js.UndefOr[Double | Null] = js.undefined
}
object SchemaClusteringMetrics {
  
  inline def apply(): SchemaClusteringMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusteringMetrics]
  }
  
  extension [Self <: SchemaClusteringMetrics](x: Self) {
    
    inline def setClusters(value: js.Array[SchemaCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setClustersVarargs(value: SchemaCluster*): Self = StObject.set(x, "clusters", js.Array(value*))
    
    inline def setDaviesBouldinIndex(value: Double): Self = StObject.set(x, "daviesBouldinIndex", value.asInstanceOf[js.Any])
    
    inline def setDaviesBouldinIndexNull: Self = StObject.set(x, "daviesBouldinIndex", null)
    
    inline def setDaviesBouldinIndexUndefined: Self = StObject.set(x, "daviesBouldinIndex", js.undefined)
    
    inline def setMeanSquaredDistance(value: Double): Self = StObject.set(x, "meanSquaredDistance", value.asInstanceOf[js.Any])
    
    inline def setMeanSquaredDistanceNull: Self = StObject.set(x, "meanSquaredDistance", null)
    
    inline def setMeanSquaredDistanceUndefined: Self = StObject.set(x, "meanSquaredDistance", js.undefined)
  }
}
