package typings.freedom.freedom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PortControl {
  
  // A collection of Mappings
  type ActiveMappings = StringDictionary[Mapping]
  
  trait Mapping extends StObject {
    
    var errInfo: js.UndefOr[String] = js.undefined
    
    var externalIp: js.UndefOr[String] = js.undefined
    
    var externalPort: Double
    
    var internalIp: String
    
    var internalPort: Double
    
    var lifetime: Double
    
    var nonce: js.UndefOr[js.Array[Double]] = js.undefined
    
    var protocol: String
    
    var timeoutId: js.UndefOr[Double] = js.undefined
  }
  object Mapping {
    
    inline def apply(externalPort: Double, internalIp: String, internalPort: Double, lifetime: Double, protocol: String): Mapping = {
      val __obj = js.Dynamic.literal(externalPort = externalPort.asInstanceOf[js.Any], internalIp = internalIp.asInstanceOf[js.Any], internalPort = internalPort.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mapping]
    }
    
    extension [Self <: Mapping](x: Self) {
      
      inline def setErrInfo(value: String): Self = StObject.set(x, "errInfo", value.asInstanceOf[js.Any])
      
      inline def setErrInfoUndefined: Self = StObject.set(x, "errInfo", js.undefined)
      
      inline def setExternalIp(value: String): Self = StObject.set(x, "externalIp", value.asInstanceOf[js.Any])
      
      inline def setExternalIpUndefined: Self = StObject.set(x, "externalIp", js.undefined)
      
      inline def setExternalPort(value: Double): Self = StObject.set(x, "externalPort", value.asInstanceOf[js.Any])
      
      inline def setInternalIp(value: String): Self = StObject.set(x, "internalIp", value.asInstanceOf[js.Any])
      
      inline def setInternalPort(value: Double): Self = StObject.set(x, "internalPort", value.asInstanceOf[js.Any])
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: js.Array[Double]): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setNonceVarargs(value: Double*): Self = StObject.set(x, "nonce", js.Array(value*))
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setTimeoutId(value: Double): Self = StObject.set(x, "timeoutId", value.asInstanceOf[js.Any])
      
      inline def setTimeoutIdUndefined: Self = StObject.set(x, "timeoutId", js.undefined)
    }
  }
  
  // Main interface for the module
  @js.native
  trait PortControl extends StObject {
    
    def addMapping(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
    
    def addMappingPcp(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
    
    def addMappingPmp(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
    
    def addMappingUpnp(intPort: Double, extPort: Double, lifetime: Double): js.Promise[Mapping] = js.native
    def addMappingUpnp(intPort: Double, extPort: Double, lifetime: Double, controlUrl: String): js.Promise[Mapping] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def deleteMapping(extPort: Double): js.Promise[Boolean] = js.native
    
    def deleteMappingPcp(extPort: Double): js.Promise[Boolean] = js.native
    
    def deleteMappingPmp(extPort: Double): js.Promise[Boolean] = js.native
    
    def deleteMappingUpnp(extPort: Double): js.Promise[Boolean] = js.native
    
    def getActiveMappings(): js.Promise[ActiveMappings] = js.native
    
    def getPrivateIps(): js.Promise[js.Array[String]] = js.native
    
    def probePcpSupport(): js.Promise[Boolean] = js.native
    
    def probePmpSupport(): js.Promise[Boolean] = js.native
    
    def probeProtocolSupport(): js.Promise[ProtocolSupport] = js.native
    
    def probeUpnpSupport(): js.Promise[Boolean] = js.native
  }
  
  // An object returned by probeProtocolSupport()
  trait ProtocolSupport extends StObject {
    
    var natPmp: Boolean
    
    var pcp: Boolean
    
    var upnp: Boolean
  }
  object ProtocolSupport {
    
    inline def apply(natPmp: Boolean, pcp: Boolean, upnp: Boolean): ProtocolSupport = {
      val __obj = js.Dynamic.literal(natPmp = natPmp.asInstanceOf[js.Any], pcp = pcp.asInstanceOf[js.Any], upnp = upnp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtocolSupport]
    }
    
    extension [Self <: ProtocolSupport](x: Self) {
      
      inline def setNatPmp(value: Boolean): Self = StObject.set(x, "natPmp", value.asInstanceOf[js.Any])
      
      inline def setPcp(value: Boolean): Self = StObject.set(x, "pcp", value.asInstanceOf[js.Any])
      
      inline def setUpnp(value: Boolean): Self = StObject.set(x, "upnp", value.asInstanceOf[js.Any])
    }
  }
}
