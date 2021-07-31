package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a single cluster for clustering model.
  */
trait SchemaClusterInfo extends StObject {
  
  /**
    * Centroid id.
    */
  var centroidId: js.UndefOr[String] = js.undefined
  
  /**
    * Cluster radius, the average distance from centroid to each point assigned
    * to the cluster.
    */
  var clusterRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Cluster size, the total number of points assigned to the cluster.
    */
  var clusterSize: js.UndefOr[String] = js.undefined
}
object SchemaClusterInfo {
  
  @scala.inline
  def apply(): SchemaClusterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterInfo]
  }
  
  @scala.inline
  implicit class SchemaClusterInfoMutableBuilder[Self <: SchemaClusterInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCentroidId(value: String): Self = StObject.set(x, "centroidId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCentroidIdUndefined: Self = StObject.set(x, "centroidId", js.undefined)
    
    @scala.inline
    def setClusterRadius(value: Double): Self = StObject.set(x, "clusterRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterRadiusUndefined: Self = StObject.set(x, "clusterRadius", js.undefined)
    
    @scala.inline
    def setClusterSize(value: String): Self = StObject.set(x, "clusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSizeUndefined: Self = StObject.set(x, "clusterSize", js.undefined)
  }
}
