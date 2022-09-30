package typings.dns2

import typings.dns2.dns2Ints.`0x01`
import typings.dns2.dns2Ints.`0x02`
import typings.dns2.dns2Ints.`0x03`
import typings.dns2.dns2Ints.`0x04`
import typings.dns2.dns2Ints.`0x05`
import typings.dns2.dns2Ints.`0x06`
import typings.dns2.dns2Ints.`0x07`
import typings.dns2.dns2Ints.`0x08`
import typings.dns2.dns2Ints.`0x09`
import typings.dns2.dns2Ints.`0x0a`
import typings.dns2.dns2Ints.`0x0b`
import typings.dns2.dns2Ints.`0x0c`
import typings.dns2.dns2Ints.`0x0d`
import typings.dns2.dns2Ints.`0x0e`
import typings.dns2.dns2Ints.`0x0f`
import typings.dns2.dns2Ints.`0x101`
import typings.dns2.dns2Ints.`0x10`
import typings.dns2.dns2Ints.`0x1c`
import typings.dns2.dns2Ints.`0x21`
import typings.dns2.dns2Ints.`0x29`
import typings.dns2.dns2Ints.`0x63`
import typings.dns2.dns2Ints.`0xfc`
import typings.dns2.dns2Ints.`0xfd`
import typings.dns2.dns2Ints.`0xfe`
import typings.dns2.dns2Ints.`0xff`
import typings.dns2.mod.DnsHandler
import typings.dns2.mod.DnsRequest
import typings.dns2.mod.DnsResponse
import typings.node.dgramMod.RemoteInfo
import typings.node.netMod.AddressInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var A: `0x01`
    
    var AAAA: `0x1c`
    
    var ANY: `0xff`
    
    var AXFR: `0xfc`
    
    var CAA: `0x101`
    
    var CNAME: `0x05`
    
    var EDNS: `0x29`
    
    var HINFO: `0x0d`
    
    var MAILA: `0xfe`
    
    var MAILB: `0xfd`
    
    var MB: `0x07`
    
    var MD: `0x03`
    
    var MF: `0x04`
    
    var MG: `0x08`
    
    var MINFO: `0x0e`
    
    var MR: `0x09`
    
    var MX: `0x0f`
    
    var NS: `0x02`
    
    var NULL: `0x0a`
    
    var PTR: `0x0c`
    
    var SOA: `0x06`
    
    var SPF: `0x63`
    
    var SRV: `0x21`
    
    var TXT: `0x10`
    
    var WKS: `0x0b`
  }
  object A {
    
    inline def apply(): A = {
      val __obj = js.Dynamic.literal(A = 0x01, AAAA = 0x1c, ANY = 0xff, AXFR = 0xfc, CAA = 0x101, CNAME = 0x05, EDNS = 0x29, HINFO = 0x0d, MAILA = 0xfe, MAILB = 0xfd, MB = 0x07, MD = 0x03, MF = 0x04, MG = 0x08, MINFO = 0x0e, MR = 0x09, MX = 0x0f, NS = 0x02, NULL = 0x0a, PTR = 0x0c, SOA = 0x06, SPF = 0x63, SRV = 0x21, TXT = 0x10, WKS = 0x0b)
      __obj.asInstanceOf[A]
    }
    
    extension [Self <: A](x: Self) {
      
      inline def setA(value: `0x01`): Self = StObject.set(x, "A", value.asInstanceOf[js.Any])
      
      inline def setAAAA(value: `0x1c`): Self = StObject.set(x, "AAAA", value.asInstanceOf[js.Any])
      
      inline def setANY(value: `0xff`): Self = StObject.set(x, "ANY", value.asInstanceOf[js.Any])
      
      inline def setAXFR(value: `0xfc`): Self = StObject.set(x, "AXFR", value.asInstanceOf[js.Any])
      
      inline def setCAA(value: `0x101`): Self = StObject.set(x, "CAA", value.asInstanceOf[js.Any])
      
      inline def setCNAME(value: `0x05`): Self = StObject.set(x, "CNAME", value.asInstanceOf[js.Any])
      
      inline def setEDNS(value: `0x29`): Self = StObject.set(x, "EDNS", value.asInstanceOf[js.Any])
      
      inline def setHINFO(value: `0x0d`): Self = StObject.set(x, "HINFO", value.asInstanceOf[js.Any])
      
      inline def setMAILA(value: `0xfe`): Self = StObject.set(x, "MAILA", value.asInstanceOf[js.Any])
      
      inline def setMAILB(value: `0xfd`): Self = StObject.set(x, "MAILB", value.asInstanceOf[js.Any])
      
      inline def setMB(value: `0x07`): Self = StObject.set(x, "MB", value.asInstanceOf[js.Any])
      
      inline def setMD(value: `0x03`): Self = StObject.set(x, "MD", value.asInstanceOf[js.Any])
      
      inline def setMF(value: `0x04`): Self = StObject.set(x, "MF", value.asInstanceOf[js.Any])
      
      inline def setMG(value: `0x08`): Self = StObject.set(x, "MG", value.asInstanceOf[js.Any])
      
      inline def setMINFO(value: `0x0e`): Self = StObject.set(x, "MINFO", value.asInstanceOf[js.Any])
      
      inline def setMR(value: `0x09`): Self = StObject.set(x, "MR", value.asInstanceOf[js.Any])
      
      inline def setMX(value: `0x0f`): Self = StObject.set(x, "MX", value.asInstanceOf[js.Any])
      
      inline def setNS(value: `0x02`): Self = StObject.set(x, "NS", value.asInstanceOf[js.Any])
      
      inline def setNULL(value: `0x0a`): Self = StObject.set(x, "NULL", value.asInstanceOf[js.Any])
      
      inline def setPTR(value: `0x0c`): Self = StObject.set(x, "PTR", value.asInstanceOf[js.Any])
      
      inline def setSOA(value: `0x06`): Self = StObject.set(x, "SOA", value.asInstanceOf[js.Any])
      
      inline def setSPF(value: `0x63`): Self = StObject.set(x, "SPF", value.asInstanceOf[js.Any])
      
      inline def setSRV(value: `0x21`): Self = StObject.set(x, "SRV", value.asInstanceOf[js.Any])
      
      inline def setTXT(value: `0x10`): Self = StObject.set(x, "TXT", value.asInstanceOf[js.Any])
      
      inline def setWKS(value: `0x0b`): Self = StObject.set(x, "WKS", value.asInstanceOf[js.Any])
    }
  }
  
  trait ANY extends StObject {
    
    var ANY: `0xff`
    
    var CH: `0x03`
    
    var CS: `0x02`
    
    var HS: `0x04`
    
    var IN: `0x01`
  }
  object ANY {
    
    inline def apply(): ANY = {
      val __obj = js.Dynamic.literal(ANY = 0xff, CH = 0x03, CS = 0x02, HS = 0x04, IN = 0x01)
      __obj.asInstanceOf[ANY]
    }
    
    extension [Self <: ANY](x: Self) {
      
      inline def setANY(value: `0xff`): Self = StObject.set(x, "ANY", value.asInstanceOf[js.Any])
      
      inline def setCH(value: `0x03`): Self = StObject.set(x, "CH", value.asInstanceOf[js.Any])
      
      inline def setCS(value: `0x02`): Self = StObject.set(x, "CS", value.asInstanceOf[js.Any])
      
      inline def setHS(value: `0x04`): Self = StObject.set(x, "HS", value.asInstanceOf[js.Any])
      
      inline def setIN(value: `0x01`): Self = StObject.set(x, "IN", value.asInstanceOf[js.Any])
    }
  }
  
  trait Doh extends StObject {
    
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
  object Doh {
    
    inline def apply(
      handle: (/* request */ DnsRequest, /* sendResponse */ js.Function1[/* response */ DnsResponse, Unit], /* remoteInfo */ RemoteInfo) => Unit
    ): Doh = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction3(handle))
      __obj.asInstanceOf[Doh]
    }
    
    extension [Self <: Doh](x: Self) {
      
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
    
    var doh: js.UndefOr[AddressInfo] = js.undefined
    
    var tcp: js.UndefOr[AddressInfo] = js.undefined
    
    var udp: js.UndefOr[AddressInfo] = js.undefined
  }
  object Tcp {
    
    inline def apply(): Tcp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tcp]
    }
    
    extension [Self <: Tcp](x: Self) {
      
      inline def setDoh(value: AddressInfo): Self = StObject.set(x, "doh", value.asInstanceOf[js.Any])
      
      inline def setDohUndefined: Self = StObject.set(x, "doh", js.undefined)
      
      inline def setTcp(value: AddressInfo): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
      
      inline def setUdp(value: AddressInfo): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
      
      inline def setUdpUndefined: Self = StObject.set(x, "udp", js.undefined)
    }
  }
  
  trait TypeofPacket extends StObject {
    
    /* static member */
    var CLASS: ANY
    
    /* static member */
    var TYPE: A
    
    /* static member */
    def createResponseFromRequest(request: DnsRequest): DnsResponse
  }
  object TypeofPacket {
    
    inline def apply(CLASS: ANY, TYPE: A, createResponseFromRequest: DnsRequest => DnsResponse): TypeofPacket = {
      val __obj = js.Dynamic.literal(CLASS = CLASS.asInstanceOf[js.Any], TYPE = TYPE.asInstanceOf[js.Any], createResponseFromRequest = js.Any.fromFunction1(createResponseFromRequest))
      __obj.asInstanceOf[TypeofPacket]
    }
    
    extension [Self <: TypeofPacket](x: Self) {
      
      inline def setCLASS(value: ANY): Self = StObject.set(x, "CLASS", value.asInstanceOf[js.Any])
      
      inline def setCreateResponseFromRequest(value: DnsRequest => DnsResponse): Self = StObject.set(x, "createResponseFromRequest", js.Any.fromFunction1(value))
      
      inline def setTYPE(value: A): Self = StObject.set(x, "TYPE", value.asInstanceOf[js.Any])
    }
  }
  
  trait Udp extends StObject {
    
    var doh: js.UndefOr[Double] = js.undefined
    
    var tcp: js.UndefOr[Double] = js.undefined
    
    var udp: js.UndefOr[Double] = js.undefined
  }
  object Udp {
    
    inline def apply(): Udp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Udp]
    }
    
    extension [Self <: Udp](x: Self) {
      
      inline def setDoh(value: Double): Self = StObject.set(x, "doh", value.asInstanceOf[js.Any])
      
      inline def setDohUndefined: Self = StObject.set(x, "doh", js.undefined)
      
      inline def setTcp(value: Double): Self = StObject.set(x, "tcp", value.asInstanceOf[js.Any])
      
      inline def setTcpUndefined: Self = StObject.set(x, "tcp", js.undefined)
      
      inline def setUdp(value: Double): Self = StObject.set(x, "udp", value.asInstanceOf[js.Any])
      
      inline def setUdpUndefined: Self = StObject.set(x, "udp", js.undefined)
    }
  }
}
