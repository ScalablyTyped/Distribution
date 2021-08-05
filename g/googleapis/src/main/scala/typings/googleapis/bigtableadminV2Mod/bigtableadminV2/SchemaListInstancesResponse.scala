package typings.googleapis.bigtableadminV2Mod.bigtableadminV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for BigtableInstanceAdmin.ListInstances.
  */
trait SchemaListInstancesResponse extends StObject {
  
  /**
    * Locations from which Instance information could not be retrieved, due to
    * an outage or some other transient condition. Instances whose Clusters are
    * all in one of the failed locations may be missing from `instances`, and
    * Instances with at least one Cluster in a failed location may only have
    * partial information returned. Values are of the form
    * `projects/&lt;project&gt;/locations/&lt;zone_id&gt;`
    */
  var failedLocations: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of requested instances.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.undefined
  
  /**
    * DEPRECATED: This field is unused and ignored.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListInstancesResponse {
  
  inline def apply(): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
  
  extension [Self <: SchemaListInstancesResponse](x: Self) {
    
    inline def setFailedLocations(value: js.Array[String]): Self = StObject.set(x, "failedLocations", value.asInstanceOf[js.Any])
    
    inline def setFailedLocationsUndefined: Self = StObject.set(x, "failedLocations", js.undefined)
    
    inline def setFailedLocationsVarargs(value: String*): Self = StObject.set(x, "failedLocations", js.Array(value :_*))
    
    inline def setInstances(value: js.Array[SchemaInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
