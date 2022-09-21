package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketMirroringForwardingRuleInfo extends StObject {
  
  /**
    * [Output Only] Unique identifier for the forwarding rule; defined by the server.
    */
  var canonicalUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource URL to the forwarding rule representing the ILB configured as destination of the mirrored traffic.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaPacketMirroringForwardingRuleInfo {
  
  inline def apply(): SchemaPacketMirroringForwardingRuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketMirroringForwardingRuleInfo]
  }
  
  extension [Self <: SchemaPacketMirroringForwardingRuleInfo](x: Self) {
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlNull: Self = StObject.set(x, "canonicalUrl", null)
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
