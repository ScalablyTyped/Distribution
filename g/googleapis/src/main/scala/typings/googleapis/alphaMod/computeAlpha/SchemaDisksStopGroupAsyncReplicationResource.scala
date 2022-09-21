package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDisksStopGroupAsyncReplicationResource extends StObject {
  
  /**
    * The URL of the DiskConsistencyGroupPolicy for the group of disks to stop. This may be a full or partial URL, such as: - https://www.googleapis.com/compute/v1/projects/project/regions/region /resourcePolicies/resourcePolicy - projects/project/regions/region/resourcePolicies/resourcePolicy - regions/region/resourcePolicies/resourcePolicy
    */
  var resourcePolicy: js.UndefOr[String | Null] = js.undefined
}
object SchemaDisksStopGroupAsyncReplicationResource {
  
  inline def apply(): SchemaDisksStopGroupAsyncReplicationResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDisksStopGroupAsyncReplicationResource]
  }
  
  extension [Self <: SchemaDisksStopGroupAsyncReplicationResource](x: Self) {
    
    inline def setResourcePolicy(value: String): Self = StObject.set(x, "resourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyNull: Self = StObject.set(x, "resourcePolicy", null)
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "resourcePolicy", js.undefined)
  }
}
