package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkInterfaceSubInterface extends StObject {
  
  /**
    * An IPv4 internal IP address to assign to the instance for this subinterface. If specified, ip_allocation_mode should be set to ALLOCATE_IP.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  var ipAllocationMode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If specified, this subnetwork must belong to the same network as that of the network interface. If not specified the subnet of network interface will be used. If you specify this property, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork
    */
  var subnetwork: js.UndefOr[String | Null] = js.undefined
  
  /**
    * VLAN tag. Should match the VLAN(s) supported by the subnetwork to which this subinterface is connecting.
    */
  var vlan: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNetworkInterfaceSubInterface {
  
  inline def apply(): SchemaNetworkInterfaceSubInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInterfaceSubInterface]
  }
  
  extension [Self <: SchemaNetworkInterfaceSubInterface](x: Self) {
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setIpAllocationMode(value: String): Self = StObject.set(x, "ipAllocationMode", value.asInstanceOf[js.Any])
    
    inline def setIpAllocationModeNull: Self = StObject.set(x, "ipAllocationMode", null)
    
    inline def setIpAllocationModeUndefined: Self = StObject.set(x, "ipAllocationMode", js.undefined)
    
    inline def setSubnetwork(value: String): Self = StObject.set(x, "subnetwork", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNull: Self = StObject.set(x, "subnetwork", null)
    
    inline def setSubnetworkUndefined: Self = StObject.set(x, "subnetwork", js.undefined)
    
    inline def setVlan(value: Double): Self = StObject.set(x, "vlan", value.asInstanceOf[js.Any])
    
    inline def setVlanNull: Self = StObject.set(x, "vlan", null)
    
    inline def setVlanUndefined: Self = StObject.set(x, "vlan", js.undefined)
  }
}
