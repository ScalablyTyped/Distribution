package typings.dnssd

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dnssd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dnssd", "Advertisement")
  @js.native
  class Advertisement protected () extends EventEmitter {
    def this(`type`: String, port: Double, args: js.Any*) = this()
    def this(`type`: js.Array[String], port: Double, args: js.Any*) = this()
    def this(`type`: ServiceType, port: Double, args: js.Any*) = this()
    
    def start(): Advertisement = js.native
    
    def stop(): Unit = js.native
    def stop(forceImmediate: Boolean): Unit = js.native
    def stop(forceImmediate: Boolean, callback: js.Function0[js.Any]): Unit = js.native
    def stop(forceImmediate: Unit, callback: js.Function0[js.Any]): Unit = js.native
    
    def updateTXT(txtObj: js.Any): Unit = js.native
  }
  
  @JSImport("dnssd", "Browser")
  @js.native
  class Browser protected () extends EventEmitter {
    def this(`type`: String, args: js.Any*) = this()
    def this(`type`: js.Array[String], args: js.Any*) = this()
    def this(`type`: ServiceType, args: js.Any*) = this()
    
    def list(): js.Array[js.Any] = js.native
    
    def start(): Browser = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("dnssd", "Options")
  @js.native
  class Options () extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var interface: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var subtypes: js.UndefOr[js.Array[String]] = js.native
    
    var txt: js.UndefOr[js.Any] = js.native
  }
  
  @JSImport("dnssd", "Service")
  @js.native
  class Service () extends StObject {
    
    // 8009
    var addresses: js.Array[String] = js.native
    
    // { name: 'googlecast'; protocol: 'tcp' }
    var domain: String = js.native
    
    var fullname: String = js.native
    
    // 'local'
    var host: String = js.native
    
    // 'InstanceName._googlecast._tcp.local.'
    var name: String = js.native
    
    // 'Hostname.local.'
    var port: Double = js.native
    
    // ['192.168.1.15']
    var txt: js.Any = js.native
    
    // { id: 'strings' }
    var txtRaw: js.Any = js.native
    
    // 'InstanceName'
    var `type`: ServiceType = js.native
  }
  
  @JSImport("dnssd", "ServiceType")
  @js.native
  class ServiceType protected () extends StObject {
    def this(args: (String | js.Array[String])*) = this()
    def this(args: ServiceType) = this()
    
    var name: String = js.native
    
    var protocol: String = js.native
    
    var subtypes: js.Array[String] = js.native
  }
  /* static members */
  object ServiceType {
    
    @JSImport("dnssd", "ServiceType")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def all(): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[ServiceType]
    
    @scala.inline
    def tcp(args: String*): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp")(args.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
    
    @scala.inline
    def udp(args: String*): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("udp")(args.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
  }
  
  @scala.inline
  def all(): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("all")().asInstanceOf[ServiceType]
  
  @scala.inline
  def resolve(name: String, `type`: String, args: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def resolve4(name: String, `type`: String, args: js.Object): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve4")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def resolve6(name: String, `type`: String, args: js.Object): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve6")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def resolveSRV(name: String, args: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveSRV")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def resolveService(name: String, args: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveService")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def resolveTXT(name: String, args: js.Object): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveTXT")(name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @scala.inline
  def tcp(args: String*): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("tcp")(args.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
  
  @scala.inline
  def udp(args: String*): ServiceType = ^.asInstanceOf[js.Dynamic].applyDynamic("udp")(args.asInstanceOf[js.Any]).asInstanceOf[ServiceType]
}
