package typings.dns2

import typings.dns2.mod.DnsHandler
import typings.dns2.mod.DnsRequest
import typings.dns2.mod.DnsResponse
import typings.node.dgramMod.RemoteInfo
import typings.node.netMod.AddressInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Doh extends StObject {
    
    var doh: js.UndefOr[AddressInfo] = js.undefined
    
    var tcp: js.UndefOr[AddressInfo] = js.undefined
    
    var udp: js.UndefOr[AddressInfo] = js.undefined
  }
  object Doh {
    
    inline def apply(): Doh = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Doh]
    }
    
    extension [Self <: Doh](x: Self) {
      
      inline def setDoh(value: AddressInfo): Self = StObject.set(x, "doh", value.asInstanceOf[js.Any])
      
      inline def setDohUndefined: Self = StObject.set(x, "doh", js.undefined)
      
      inline def setTcp(value: AddressInfo): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
      
      inline def setUdp(value: AddressInfo): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
      
      inline def setUdpUndefined: Self = StObject.set(x, "udp", js.undefined)
    }
  }
  
  trait Handle extends StObject {
    
    var doh: js.UndefOr[Boolean] = js.undefined
    
    def handle(
      request: DnsRequest,
      sendResponse: js.Function1[/* response */ DnsResponse, Unit],
      remoteInfo: RemoteInfo
    ): Unit
    @JSName("handle")
    var handle_Original: DnsHandler
    
    var tcp: js.UndefOr[Boolean] = js.undefined
    
    var udp: js.UndefOr[Boolean] = js.undefined
  }
  object Handle {
    
    inline def apply(
      handle: (/* request */ DnsRequest, /* sendResponse */ js.Function1[/* response */ DnsResponse, Unit], /* remoteInfo */ RemoteInfo) => Unit
    ): Handle = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction3(handle))
      __obj.asInstanceOf[Handle]
    }
    
    extension [Self <: Handle](x: Self) {
      
      inline def setDoh(value: Boolean): Self = StObject.set(x, "doh", value.asInstanceOf[js.Any])
      
      inline def setDohUndefined: Self = StObject.set(x, "doh", js.undefined)
      
      inline def setHandle(
        value: (/* request */ DnsRequest, /* sendResponse */ js.Function1[/* response */ DnsResponse, Unit], /* remoteInfo */ RemoteInfo) => Unit
      ): Self = StObject.set(x, "handle", js.Any.fromFunction3(value))
      
      inline def setTcp(value: Boolean): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
      
      inline def setUdp(value: Boolean): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
      
      inline def setUdpUndefined: Self = StObject.set(x, "udp", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: String
  }
  object Id {
    
    inline def apply(id: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tcp extends StObject {
    
    var doh: js.UndefOr[Double] = js.undefined
    
    var tcp: js.UndefOr[Double] = js.undefined
    
    var udp: js.UndefOr[Double] = js.undefined
  }
  object Tcp {
    
    inline def apply(): Tcp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tcp]
    }
    
    extension [Self <: Tcp](x: Self) {
      
      inline def setDoh(value: Double): Self = StObject.set(x, "doh", value.asInstanceOf[js.Any])
      
      inline def setDohUndefined: Self = StObject.set(x, "doh", js.undefined)
      
      inline def setTcp(value: Double): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
      
      inline def setUdp(value: Double): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
      
      inline def setUdpUndefined: Self = StObject.set(x, "udp", js.undefined)
    }
  }
}
