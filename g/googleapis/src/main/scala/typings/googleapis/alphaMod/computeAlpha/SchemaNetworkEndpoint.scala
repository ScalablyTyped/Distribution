package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEndpoint extends StObject {
  
  /**
    * Metadata defined as annotations on the network endpoint.
    */
  var annotations: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Optional fully qualified domain name of network endpoint. This can only be specified when NetworkEndpointGroup.network_endpoint_type is NON_GCP_FQDN_PORT.
    */
  var fqdn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name for a specific VM instance that the IP address belongs to. This is required for network endpoints of type GCE_VM_IP_PORT. The instance must be in the same zone of network endpoint group. The name must be 1-63 characters long, and comply with RFC1035.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional IPv4 address of network endpoint. The IP address must belong to a VM in Compute Engine (either the primary IP or as part of an aliased IP range). If the IP address is not specified, then the primary IP address for the VM instance in the network that the network endpoint group belongs to will be used.
    */
  var ipAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional port number of network endpoint. If not specified, the defaultPort for the network endpoint group will be used.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
}
object SchemaNetworkEndpoint {
  
  inline def apply(): SchemaNetworkEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEndpoint]
  }
  
  extension [Self <: SchemaNetworkEndpoint](x: Self) {
    
    inline def setAnnotations(value: StringDictionary[String]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsNull: Self = StObject.set(x, "annotations", null)
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setFqdn(value: String): Self = StObject.set(x, "fqdn", value.asInstanceOf[js.Any])
    
    inline def setFqdnNull: Self = StObject.set(x, "fqdn", null)
    
    inline def setFqdnUndefined: Self = StObject.set(x, "fqdn", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setIpAddress(value: String): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressNull: Self = StObject.set(x, "ipAddress", null)
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
