package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaAppConnectionGateway extends StObject {
  
  /**
    * Required. AppGateway name in following format: `projects/{project_id\}/locations/{location_id\}/appgateways/{gateway_id\}`
    */
  var appGateway: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Ingress port reserved on the gateways for this AppConnection, if not specified or zero, the default port is 19443.
    */
  var ingressPort: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Output only. L7 private service connection for this resource.
    */
  var l7psc: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of hosting used by the gateway.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Server-defined URI for this resource.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaAppConnectionGateway {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaAppConnectionGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaAppConnectionGateway]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectionsV1alphaAppConnectionGateway](x: Self) {
    
    inline def setAppGateway(value: String): Self = StObject.set(x, "appGateway", value.asInstanceOf[js.Any])
    
    inline def setAppGatewayNull: Self = StObject.set(x, "appGateway", null)
    
    inline def setAppGatewayUndefined: Self = StObject.set(x, "appGateway", js.undefined)
    
    inline def setIngressPort(value: Double): Self = StObject.set(x, "ingressPort", value.asInstanceOf[js.Any])
    
    inline def setIngressPortNull: Self = StObject.set(x, "ingressPort", null)
    
    inline def setIngressPortUndefined: Self = StObject.set(x, "ingressPort", js.undefined)
    
    inline def setL7psc(value: String): Self = StObject.set(x, "l7psc", value.asInstanceOf[js.Any])
    
    inline def setL7pscNull: Self = StObject.set(x, "l7psc", null)
    
    inline def setL7pscUndefined: Self = StObject.set(x, "l7psc", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
