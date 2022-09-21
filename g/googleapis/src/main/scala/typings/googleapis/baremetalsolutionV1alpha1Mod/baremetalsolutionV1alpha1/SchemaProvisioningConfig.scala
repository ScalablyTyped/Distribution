package typings.googleapis.baremetalsolutionV1alpha1Mod.baremetalsolutionV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProvisioningConfig extends StObject {
  
  /**
    * Instances to be created.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceConfig]] = js.undefined
  
  /**
    * Networks to be created.
    */
  var networks: js.UndefOr[js.Array[SchemaNetworkConfig]] = js.undefined
  
  /**
    * A reference to track the request.
    */
  var ticketId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Volumes to be created.
    */
  var volumes: js.UndefOr[js.Array[SchemaVolumeConfig]] = js.undefined
}
object SchemaProvisioningConfig {
  
  inline def apply(): SchemaProvisioningConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProvisioningConfig]
  }
  
  extension [Self <: SchemaProvisioningConfig](x: Self) {
    
    inline def setInstances(value: js.Array[SchemaInstanceConfig]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: SchemaInstanceConfig*): Self = StObject.set(x, "instances", js.Array(value*))
    
    inline def setNetworks(value: js.Array[SchemaNetworkConfig]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaNetworkConfig*): Self = StObject.set(x, "networks", js.Array(value*))
    
    inline def setTicketId(value: String): Self = StObject.set(x, "ticketId", value.asInstanceOf[js.Any])
    
    inline def setTicketIdNull: Self = StObject.set(x, "ticketId", null)
    
    inline def setTicketIdUndefined: Self = StObject.set(x, "ticketId", js.undefined)
    
    inline def setVolumes(value: js.Array[SchemaVolumeConfig]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    inline def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    inline def setVolumesVarargs(value: SchemaVolumeConfig*): Self = StObject.set(x, "volumes", js.Array(value*))
  }
}
