package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectRemoteLocationConstraints extends StObject {
  
  /**
    * [Output Only] Port pair remote location constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_REMOTE_LOCATION, PORT_PAIR_MATCHING_REMOTE_LOCATION. GCP's API refers only to individual ports, but the UI uses this field when ordering a pair of ports, to prevent users from accidentally ordering something that is incompatible with their cloud provider. Specifically, when ordering a redundant pair of Cross-Cloud Interconnect ports, and one of them uses a remote location with portPairMatchingRemoteLocation set to matching, the UI will require that both ports use the same remote location.
    */
  var portPairRemoteLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Port pair VLAN constraints, which can take one of the following values: PORT_PAIR_UNCONSTRAINED_VLAN, PORT_PAIR_MATCHING_VLAN
    */
  var portPairVlan: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] [min-length, max-length] The minimum and maximum value (inclusive) for the IPv4 subnet length. For example, an interconnectRemoteLocation for Azure has {min: 30, max: 30\} because Azure requires /30 subnets. This range specifies the values supported by both cloud providers. Interconnect currently supports /29 and /30 IPv4 subnet lengths. If a remote cloud has no constraint on IPv4 subnet length, the range would thus be {min: 29, max: 30\}.
    */
  var subnetLengthRange: js.UndefOr[SchemaInterconnectRemoteLocationConstraintsSubnetLengthRange] = js.undefined
}
object SchemaInterconnectRemoteLocationConstraints {
  
  inline def apply(): SchemaInterconnectRemoteLocationConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectRemoteLocationConstraints]
  }
  
  extension [Self <: SchemaInterconnectRemoteLocationConstraints](x: Self) {
    
    inline def setPortPairRemoteLocation(value: String): Self = StObject.set(x, "portPairRemoteLocation", value.asInstanceOf[js.Any])
    
    inline def setPortPairRemoteLocationNull: Self = StObject.set(x, "portPairRemoteLocation", null)
    
    inline def setPortPairRemoteLocationUndefined: Self = StObject.set(x, "portPairRemoteLocation", js.undefined)
    
    inline def setPortPairVlan(value: String): Self = StObject.set(x, "portPairVlan", value.asInstanceOf[js.Any])
    
    inline def setPortPairVlanNull: Self = StObject.set(x, "portPairVlan", null)
    
    inline def setPortPairVlanUndefined: Self = StObject.set(x, "portPairVlan", js.undefined)
    
    inline def setSubnetLengthRange(value: SchemaInterconnectRemoteLocationConstraintsSubnetLengthRange): Self = StObject.set(x, "subnetLengthRange", value.asInstanceOf[js.Any])
    
    inline def setSubnetLengthRangeUndefined: Self = StObject.set(x, "subnetLengthRange", js.undefined)
  }
}
