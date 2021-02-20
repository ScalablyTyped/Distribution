package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for BigtableInstanceAdmin.ListClusters.
  */
@js.native
trait SchemaListClustersResponse extends StObject {
  
  /**
    * The list of requested clusters.
    */
  var clusters: js.UndefOr[js.Array[SchemaCluster]] = js.native
  
  /**
    * Locations from which Cluster information could not be retrieved, due to
    * an outage or some other transient condition. Clusters from these
    * locations may be missing from `clusters`, or may only have partial
    * information returned. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListClustersResponse {
  
  @scala.inline
  def apply(): SchemaListClustersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListClustersResponse]
  }
  
  @scala.inline
  implicit class SchemaListClustersResponseMutableBuilder[Self <: SchemaListClustersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusters(value: js.Array[SchemaCluster]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    @scala.inline
    def setClustersVarargs(value: SchemaCluster*): Self = StObject.set(x, "clusters", js.Array(value :_*))
    
    @scala.inline
    def setFailedLocations(value: js.Array[String]): Self = StObject.set(x, "failedLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedLocationsUndefined: Self = StObject.set(x, "failedLocations", js.undefined)
    
    @scala.inline
    def setFailedLocationsVarargs(value: String*): Self = StObject.set(x, "failedLocations", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
