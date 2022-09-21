package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVlanAttachment extends StObject {
  
  /**
    * The peer IP of the attachment.
    */
  var peerIp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The peer vlan ID of the attachment.
    */
  var peerVlanId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The router IP of the attachment.
    */
  var routerIp: js.UndefOr[String | Null] = js.undefined
}
object SchemaVlanAttachment {
  
  inline def apply(): SchemaVlanAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVlanAttachment]
  }
  
  extension [Self <: SchemaVlanAttachment](x: Self) {
    
    inline def setPeerIp(value: String): Self = StObject.set(x, "peerIp", value.asInstanceOf[js.Any])
    
    inline def setPeerIpNull: Self = StObject.set(x, "peerIp", null)
    
    inline def setPeerIpUndefined: Self = StObject.set(x, "peerIp", js.undefined)
    
    inline def setPeerVlanId(value: String): Self = StObject.set(x, "peerVlanId", value.asInstanceOf[js.Any])
    
    inline def setPeerVlanIdNull: Self = StObject.set(x, "peerVlanId", null)
    
    inline def setPeerVlanIdUndefined: Self = StObject.set(x, "peerVlanId", js.undefined)
    
    inline def setRouterIp(value: String): Self = StObject.set(x, "routerIp", value.asInstanceOf[js.Any])
    
    inline def setRouterIpNull: Self = StObject.set(x, "routerIp", null)
    
    inline def setRouterIpUndefined: Self = StObject.set(x, "routerIp", js.undefined)
  }
}
