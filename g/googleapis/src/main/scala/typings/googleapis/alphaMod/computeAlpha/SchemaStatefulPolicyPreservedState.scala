package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStatefulPolicyPreservedState extends StObject {
  
  /**
    * Disks created on the instances that will be preserved on instance delete, update, etc. This map is keyed with the device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice] | Null] = js.undefined
  
  /**
    * External network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
    */
  var externalIPs: js.UndefOr[StringDictionary[SchemaStatefulPolicyPreservedStateNetworkIp] | Null] = js.undefined
  
  /**
    * Internal network IPs assigned to the instances that will be preserved on instance delete, update, etc. This map is keyed with the network interface name.
    */
  var internalIPs: js.UndefOr[StringDictionary[SchemaStatefulPolicyPreservedStateNetworkIp] | Null] = js.undefined
}
object SchemaStatefulPolicyPreservedState {
  
  inline def apply(): SchemaStatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedState]
  }
  
  extension [Self <: SchemaStatefulPolicyPreservedState](x: Self) {
    
    inline def setDisks(value: StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice]): Self = StObject.set(x, "disks", value.asInstanceOf[js.Any])
    
    inline def setDisksNull: Self = StObject.set(x, "disks", null)
    
    inline def setDisksUndefined: Self = StObject.set(x, "disks", js.undefined)
    
    inline def setExternalIPs(value: StringDictionary[SchemaStatefulPolicyPreservedStateNetworkIp]): Self = StObject.set(x, "externalIPs", value.asInstanceOf[js.Any])
    
    inline def setExternalIPsNull: Self = StObject.set(x, "externalIPs", null)
    
    inline def setExternalIPsUndefined: Self = StObject.set(x, "externalIPs", js.undefined)
    
    inline def setInternalIPs(value: StringDictionary[SchemaStatefulPolicyPreservedStateNetworkIp]): Self = StObject.set(x, "internalIPs", value.asInstanceOf[js.Any])
    
    inline def setInternalIPsNull: Self = StObject.set(x, "internalIPs", null)
    
    inline def setInternalIPsUndefined: Self = StObject.set(x, "internalIPs", js.undefined)
  }
}
