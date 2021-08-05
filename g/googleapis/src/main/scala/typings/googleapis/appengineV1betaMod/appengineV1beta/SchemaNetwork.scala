package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extra network settings. Only applicable in the App Engine flexible
  * environment.
  */
trait SchemaNetwork extends StObject {
  
  /**
    * List of ports, or port pairs, to forward from the virtual machine to the
    * application container. Only applicable in the App Engine flexible
    * environment.
    */
  var forwardedPorts: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Tag to apply to the instance during creation. Only applicable in the App
    * Engine flexible environment.
    */
  var instanceTag: js.UndefOr[String] = js.undefined
  
  /**
    * Google Compute Engine network where the virtual machines are created.
    * Specify the short name, not the resource path.Defaults to default.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Enable session affinity. Only applicable in the App Engine flexible
    * environment.
    */
  var sessionAffinity: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Google Cloud Platform sub-network where the virtual machines are created.
    * Specify the short name, not the resource path.If a subnetwork name is
    * specified, a network name will also be required unless it is for the
    * default network. If the network that the instance is being created in is
    * a Legacy network, then the IP address is allocated from the IPv4Range. If
    * the network that the instance is being created in is an auto Subnet Mode
    * Network, then only network name should be specified (not the
    * subnetwork_name) and the IP address is created from the IPCidrRange of
    * the subnetwork that exists in that zone for that network. If the network
    * that the instance is being created in is a custom Subnet Mode Network,
    * then the subnetwork_name must be specified and the IP address is created
    * from the IPCidrRange of the subnetwork.If specified, the subnetwork must
    * exist in the same region as the App Engine flexible environment
    * application.
    */
  var subnetworkName: js.UndefOr[String] = js.undefined
}
object SchemaNetwork {
  
  inline def apply(): SchemaNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetwork]
  }
  
  extension [Self <: SchemaNetwork](x: Self) {
    
    inline def setForwardedPorts(value: js.Array[String]): Self = StObject.set(x, "forwardedPorts", value.asInstanceOf[js.Any])
    
    inline def setForwardedPortsUndefined: Self = StObject.set(x, "forwardedPorts", js.undefined)
    
    inline def setForwardedPortsVarargs(value: String*): Self = StObject.set(x, "forwardedPorts", js.Array(value :_*))
    
    inline def setInstanceTag(value: String): Self = StObject.set(x, "instanceTag", value.asInstanceOf[js.Any])
    
    inline def setInstanceTagUndefined: Self = StObject.set(x, "instanceTag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSessionAffinity(value: Boolean): Self = StObject.set(x, "sessionAffinity", value.asInstanceOf[js.Any])
    
    inline def setSessionAffinityUndefined: Self = StObject.set(x, "sessionAffinity", js.undefined)
    
    inline def setSubnetworkName(value: String): Self = StObject.set(x, "subnetworkName", value.asInstanceOf[js.Any])
    
    inline def setSubnetworkNameUndefined: Self = StObject.set(x, "subnetworkName", js.undefined)
  }
}
