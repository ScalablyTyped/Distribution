package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway extends StObject {
  
  /**
    * interface specifies the network interface of the gateway to connect to.
    */
  var interface: js.UndefOr[String | Null] = js.undefined
  
  /**
    * name is the name of an instance running a gateway. It is the unique ID for a gateway. All gateways under the same connection have the same prefix. It is derived from the gateway URL. For example, name=${instance\} assuming a gateway URL. https://www.googleapis.com/compute/${version\}/projects/${project\}/zones/${zone\}/instances/${instance\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * port specifies the port of the gateway for tunnel connections from the connectors.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * project is the tenant project the gateway belongs to. Different from the project in the connection, it is a BeyondCorpAPI internally created project to manage all the gateways. It is sharing the same network with the consumer project user owned. It is derived from the gateway URL. For example, project=${project\} assuming a gateway URL. https://www.googleapis.com/compute/${version\}/projects/${project\}/zones/${zone\}/instances/${instance\}
    */
  var project: js.UndefOr[String | Null] = js.undefined
  
  /**
    * self_link is the gateway URL in the form https://www.googleapis.com/compute/${version\}/projects/${project\}/zones/${zone\}/instances/${instance\}
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * zone represents the zone the instance belongs. It is derived from the gateway URL. For example, zone=${zone\} assuming a gateway URL. https://www.googleapis.com/compute/${version\}/projects/${project\}/zones/${zone\}/instances/${instance\}
    */
  var zone: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway {
  
  inline def apply(): SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway]
  }
  
  extension [Self <: SchemaCloudSecurityZerotrustApplinkAppConnectorProtoGateway](x: Self) {
    
    inline def setInterface(value: String): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
    
    inline def setInterfaceNull: Self = StObject.set(x, "interface", null)
    
    inline def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectNull: Self = StObject.set(x, "project", null)
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneNull: Self = StObject.set(x, "zone", null)
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
