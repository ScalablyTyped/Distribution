package typings.dns2

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.dns2.anon.Doh
import typings.dns2.anon.Id
import typings.dns2.anon.PartialDnsClientOptions
import typings.dns2.anon.Tcp
import typings.dns2.anon.TypeofPacket
import typings.dns2.anon.Udp
import typings.dns2.dns2Strings.TCP
import typings.dns2.dns2Strings.UDP
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
       with DNS {
    def this(options: PartialDnsClientOptions) = this()
  }
  @JSImport("dns2", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Packet extends StObject {
    
    def toBuffer(): Buffer
  }
  object Packet extends Shortcut {
    
    inline def apply(toBuffer: () => Buffer): Packet = {
      val __obj = js.Dynamic.literal(toBuffer = js.Any.fromFunction0(toBuffer))
      __obj.asInstanceOf[Packet]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("dns2", "Packet")
    @js.native
    open class ^ ()
      extends StObject
         with Packet {
      
      /* CompleteClass */
      override def toBuffer(): Buffer = js.native
    }
    
    @JSImport("dns2", "Packet")
    @js.native
    val ^ : TypeofPacket & Instantiable0[Packet] = js.native
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Packet] (val x: Self) extends AnyVal {
      
      inline def setToBuffer(value: () => Buffer): Self = StObject.set(x, "toBuffer", js.Any.fromFunction0(value))
    }
    
    type _To = TypeofPacket & Instantiable0[Packet]
    
    /* This means you don't have to write `^`, but can instead just say `Packet.foo` */
    override def _to: TypeofPacket & Instantiable0[Packet] = ^
  }
  
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
  inline def createServer(options: Doh): DnsServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createServer")(options.asInstanceOf[js.Any]).asInstanceOf[DnsServer]
  
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
    
    def query(name: String, `type`: PacketQuestion): js.Promise[DnsResponse] = js.native
    def query(name: String, `type`: PacketQuestion, cls: Unit, clientIp: String): js.Promise[DnsResponse] = js.native
    def query(name: String, `type`: PacketQuestion, cls: PacketClass): js.Promise[DnsResponse] = js.native
    def query(name: String, `type`: PacketQuestion, cls: PacketClass, clientIp: String): js.Promise[DnsResponse] = js.native
    
    def resolve(domain: String): js.Promise[DnsResponse] = js.native
    def resolve(domain: String, `type`: Unit, cls: Unit, clientIp: String): js.Promise[DnsResponse] = js.native
    def resolve(domain: String, `type`: Unit, cls: PacketClass): js.Promise[DnsResponse] = js.native
    def resolve(domain: String, `type`: Unit, cls: PacketClass, clientIp: String): js.Promise[DnsResponse] = js.native
    def resolve(domain: String, `type`: PacketQuestion): js.Promise[DnsResponse] = js.native
    def resolve(domain: String, `type`: PacketQuestion, cls: Unit, clientIp: String): js.Promise[DnsResponse] = js.native
    def resolve(domain: String, `type`: PacketQuestion, cls: PacketClass): js.Promise[DnsResponse] = js.native
    def resolve(domain: String, `type`: PacketQuestion, cls: PacketClass, clientIp: String): js.Promise[DnsResponse] = js.native
    
    def resolveA(domain: String): js.Promise[DnsResponse] = js.native
    def resolveA(domain: String, clientIp: String): js.Promise[DnsResponse] = js.native
    
    def resolveAAAA(domain: String): js.Promise[DnsResponse] = js.native
    
    def resolveCNAME(domain: String): js.Promise[DnsResponse] = js.native
    
    def resolveMX(domain: String): js.Promise[DnsResponse] = js.native
  }
  
  trait DnsAnswer extends StObject {
    
    var address: js.UndefOr[String] = js.undefined
    
    var `class`: Double
    
    var data: js.UndefOr[String] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnsAnswer] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
      
      inline def setClass(value: Double): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DnsClientOptions extends StObject {
    
    var nameServers: js.Array[String]
    
    var port: Double
    
    var recursive: Boolean
    
    var resolverProtocol: UDP | TCP
    
    var retries: Double
    
    var rootServers: js.Array[String]
    
    var timeout: Double
  }
  object DnsClientOptions {
    
    inline def apply(
      nameServers: js.Array[String],
      port: Double,
      recursive: Boolean,
      resolverProtocol: UDP | TCP,
      retries: Double,
      rootServers: js.Array[String],
      timeout: Double
    ): DnsClientOptions = {
      val __obj = js.Dynamic.literal(nameServers = nameServers.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], recursive = recursive.asInstanceOf[js.Any], resolverProtocol = resolverProtocol.asInstanceOf[js.Any], retries = retries.asInstanceOf[js.Any], rootServers = rootServers.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[DnsClientOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnsClientOptions] (val x: Self) extends AnyVal {
      
      inline def setNameServers(value: js.Array[String]): Self = StObject.set(x, "nameServers", value.asInstanceOf[js.Any])
      
      inline def setNameServersVarargs(value: String*): Self = StObject.set(x, "nameServers", js.Array(value*))
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setResolverProtocol(value: UDP | TCP): Self = StObject.set(x, "resolverProtocol", value.asInstanceOf[js.Any])
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRootServers(value: js.Array[String]): Self = StObject.set(x, "rootServers", value.asInstanceOf[js.Any])
      
      inline def setRootServersVarargs(value: String*): Self = StObject.set(x, "rootServers", js.Array(value*))
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnsQuestion] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnsRequest] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DnsResponse] (val x: Self) extends AnyVal {
      
      inline def setAnswers(value: js.Array[DnsAnswer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
      
      inline def setAnswersVarargs(value: DnsAnswer*): Self = StObject.set(x, "answers", js.Array(value*))
    }
  }
  
  @js.native
  trait DnsServer extends EventEmitter {
    
    def addresses(): Tcp = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def listen(ports: Udp): js.Promise[Unit] = js.native
  }
  
  /* Inlined {  IN :0x01,   CS :0x02,   CH :0x03,   HS :0x04,   ANY :0xff}[keyof {  IN :0x01,   CS :0x02,   CH :0x03,   HS :0x04,   ANY :0xff}] */
  /* Rewritten from type alias, can be one of: 
    - typings.dns2.dns2Ints.`0x03`
    - typings.dns2.dns2Ints.`0xff`
    - typings.dns2.dns2Ints.`0x02`
    - typings.dns2.dns2Ints.`0x04`
    - typings.dns2.dns2Ints.`0x01`
  */
  trait PacketClass extends StObject
  object PacketClass {
    
    inline def `0x01`: typings.dns2.dns2Ints.`0x01` = 0x01.asInstanceOf[typings.dns2.dns2Ints.`0x01`]
    
    inline def `0x02`: typings.dns2.dns2Ints.`0x02` = 0x02.asInstanceOf[typings.dns2.dns2Ints.`0x02`]
    
    inline def `0x03`: typings.dns2.dns2Ints.`0x03` = 0x03.asInstanceOf[typings.dns2.dns2Ints.`0x03`]
    
    inline def `0x04`: typings.dns2.dns2Ints.`0x04` = 0x04.asInstanceOf[typings.dns2.dns2Ints.`0x04`]
    
    inline def `0xff`: typings.dns2.dns2Ints.`0xff` = 0xff.asInstanceOf[typings.dns2.dns2Ints.`0xff`]
  }
  
  /* keyof dns2.anon.A */ /* Rewritten from type alias, can be one of: 
    - typings.dns2.dns2Strings.A
    - typings.dns2.dns2Strings.NS
    - typings.dns2.dns2Strings.MD
    - typings.dns2.dns2Strings.MF
    - typings.dns2.dns2Strings.CNAME
    - typings.dns2.dns2Strings.SOA
    - typings.dns2.dns2Strings.MB
    - typings.dns2.dns2Strings.MG
    - typings.dns2.dns2Strings.MR
    - typings.dns2.dns2Strings.NULL
    - typings.dns2.dns2Strings.WKS
    - typings.dns2.dns2Strings.PTR
    - typings.dns2.dns2Strings.HINFO
    - typings.dns2.dns2Strings.MINFO
    - typings.dns2.dns2Strings.MX
    - typings.dns2.dns2Strings.TXT
    - typings.dns2.dns2Strings.AAAA
    - typings.dns2.dns2Strings.SRV
    - typings.dns2.dns2Strings.EDNS
    - typings.dns2.dns2Strings.SPF
    - typings.dns2.dns2Strings.AXFR
    - typings.dns2.dns2Strings.MAILB
    - typings.dns2.dns2Strings.MAILA
    - typings.dns2.dns2Strings.ANY
    - typings.dns2.dns2Strings.CAA
  */
  trait PacketQuestion extends StObject
  
  type TcpDnsServer = Server
  
  @js.native
  trait UdpDnsServer extends Socket {
    
    def listen(port: Double, address: String): js.Promise[Unit] = js.native
  }
}
