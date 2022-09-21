package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPacketMirroringFilter extends StObject {
  
  /**
    * Protocols that apply as filter on mirrored traffic. If no protocols are specified, all traffic that matches the specified CIDR ranges is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
    */
  var IPProtocols: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * IP CIDR ranges that apply as filter on the source (ingress) or destination (egress) IP in the IP header. Only IPv4 is supported. If no ranges are specified, all traffic that matches the specified IPProtocols is mirrored. If neither cidrRanges nor IPProtocols is specified, all traffic is mirrored.
    */
  var cidrRanges: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Direction of traffic to mirror, either INGRESS, EGRESS, or BOTH. The default is BOTH.
    */
  var direction: js.UndefOr[String | Null] = js.undefined
}
object SchemaPacketMirroringFilter {
  
  inline def apply(): SchemaPacketMirroringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPacketMirroringFilter]
  }
  
  extension [Self <: SchemaPacketMirroringFilter](x: Self) {
    
    inline def setCidrRanges(value: js.Array[String]): Self = StObject.set(x, "cidrRanges", value.asInstanceOf[js.Any])
    
    inline def setCidrRangesNull: Self = StObject.set(x, "cidrRanges", null)
    
    inline def setCidrRangesUndefined: Self = StObject.set(x, "cidrRanges", js.undefined)
    
    inline def setCidrRangesVarargs(value: String*): Self = StObject.set(x, "cidrRanges", js.Array(value*))
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionNull: Self = StObject.set(x, "direction", null)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setIPProtocols(value: js.Array[String]): Self = StObject.set(x, "IPProtocols", value.asInstanceOf[js.Any])
    
    inline def setIPProtocolsNull: Self = StObject.set(x, "IPProtocols", null)
    
    inline def setIPProtocolsUndefined: Self = StObject.set(x, "IPProtocols", js.undefined)
    
    inline def setIPProtocolsVarargs(value: String*): Self = StObject.set(x, "IPProtocols", js.Array(value*))
  }
}
