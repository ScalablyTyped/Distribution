package typings.dns2

import org.scalablytyped.runtime.Instantiable1
import typings.dns2.anon.Doh
import typings.dns2.anon.Handle
import typings.dns2.anon.Id
import typings.dns2.anon.Tcp
import typings.node.bufferMod.global.Buffer
import typings.node.dgramMod.RemoteInfo
import typings.node.dgramMod.Socket
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Server
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dns2", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DNS
  @JSImport("dns2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dns2", "TCPServer")
  @js.native
  open class TCPServer () extends Server {
    def this(callback: DnsHandler) = this()
  }
  /* static member */
  @JSImport("dns2", "TCPServer")
  @js.native
  def TCPServer: Instantiable1[/* callback */ js.UndefOr[DnsHandler], TcpDnsServer] = js.native
  inline def TCPServer_=(x: Instantiable1[/* callback */ js.UndefOr[DnsHandler], TcpDnsServer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TCPServer")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("dns2", "UDPServer")
  @js.native
  open class UDPServer () extends UdpDnsServer {
    def this(callback: DnsHandler) = this()
  }
  /* static member */
  @JSImport("dns2", "UDPServer")
  @js.native
  def UDPServer: Instantiable1[/* callback */ js.UndefOr[DnsHandler], UdpDnsServer] = js.native
  inline def UDPServer_=(x: Instantiable1[/* callback */ js.UndefOr[DnsHandler], UdpDnsServer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UDPServer")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def createServer(options: Handle): DnsServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[DnsServer]
  
  /* static member */
  @JSImport("dns2", "createTCPServer")
  @js.native
  def createTCPServer: js.Function1[
    /* options */ ConstructorParameters[Instantiable1[/* callback */ js.UndefOr[DnsHandler], TcpDnsServer]], 
    TcpDnsServer
  ] = js.native
  inline def createTCPServer_=(
    x: js.Function1[
      /* options */ ConstructorParameters[Instantiable1[/* callback */ js.UndefOr[DnsHandler], TcpDnsServer]], 
      TcpDnsServer
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTCPServer")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("dns2", "createUDPServer")
  @js.native
  def createUDPServer: js.Function1[
    /* options */ ConstructorParameters[Instantiable1[/* callback */ js.UndefOr[DnsHandler], UdpDnsServer]], 
    UdpDnsServer
  ] = js.native
  inline def createUDPServer_=(
    x: js.Function1[
      /* options */ ConstructorParameters[Instantiable1[/* callback */ js.UndefOr[DnsHandler], UdpDnsServer]], 
      UdpDnsServer
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createUDPServer")(x.asInstanceOf[js.Any])
  
  @js.native
  trait DNS extends StObject {
    
    def resolveA(domain: String): js.Promise[DnsResponse] = js.native
    def resolveA(domain: String, clientIp: String): js.Promise[DnsResponse] = js.native
    
    def resolveAAAA(domain: String): js.Promise[DnsResponse] = js.native
    
    def resolveCNAME(domain: String): js.Promise[DnsResponse] = js.native
    
    def resolveMX(domain: String): js.Promise[DnsResponse] = js.native
  }
  
  trait DnsAnswer extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var `class`: Double
    
    var domain: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var ttl: Double
    
    var `type`: Double
  }
  object DnsAnswer {
    
    inline def apply(`class`: Double, name: String, ttl: Double, `type`: Double): DnsAnswer = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsAnswer]
    }
    
    extension [Self <: DnsAnswer](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setClass(value: Double): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type DnsHandler = js.Function3[
    /* request */ DnsRequest, 
    /* sendResponse */ js.Function1[/* response */ DnsResponse, Unit], 
    /* remoteInfo */ RemoteInfo, 
    Unit
  ]
  
  trait DnsQuestion extends StObject {
    
    var name: String
  }
  object DnsQuestion {
    
    inline def apply(name: String): DnsQuestion = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsQuestion]
    }
    
    extension [Self <: DnsQuestion](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait DnsRequest extends StObject {
    
    var header: Id
    
    var questions: js.Array[DnsQuestion]
  }
  object DnsRequest {
    
    inline def apply(header: Id, questions: js.Array[DnsQuestion]): DnsRequest = {
      val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsRequest]
    }
    
    extension [Self <: DnsRequest](x: Self) {
      
      inline def setHeader(value: Id): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setQuestions(value: js.Array[DnsQuestion]): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      inline def setQuestionsVarargs(value: DnsQuestion*): Self = StObject.set(x, "questions", js.Array(value*))
    }
  }
  
  trait DnsResponse extends StObject {
    
    var answers: js.Array[DnsAnswer]
  }
  object DnsResponse {
    
    inline def apply(answers: js.Array[DnsAnswer]): DnsResponse = {
      val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsResponse]
    }
    
    extension [Self <: DnsResponse](x: Self) {
      
      inline def setAnswers(value: js.Array[DnsAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
      
      inline def setAnswersVarargs(value: DnsAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
    }
  }
  
  @js.native
  trait DnsServer extends EventEmitter {
    
    def addresses(): Doh = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def listen(ports: Tcp): js.Promise[Unit] = js.native
  }
  
  trait Packet extends StObject {
    
    def toBuffer(): Buffer
  }
  object Packet {
    
    inline def apply(toBuffer: () => Buffer): Packet = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[Packet]
    }
    
    extension [Self <: Packet](x: Self) {
      
      inline def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
  }
  
  type TcpDnsServer = Server
  
  @js.native
  trait UdpDnsServer extends Socket {
    
    def listen(port: Double, address: String): js.Promise[Unit] = js.native
  }
}
