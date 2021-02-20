package typings.dnssd

import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dnssd", "Advertisement")
  @js.native
  class Advertisement protected () extends EventEmitter {
    def this(`type`: String, port: Double, args: js.Any*) = this()
    def this(`type`: js.Array[String], port: Double, args: js.Any*) = this()
    def this(`type`: ServiceType, port: Double, args: js.Any*) = this()
    
    def start(): Advertisement = js.native
    
    def stop(): Unit = js.native
    def stop(forceImmediate: js.UndefOr[scala.Nothing], callback: js.Function0[_]): Unit = js.native
    def stop(forceImmediate: Boolean): Unit = js.native
    def stop(forceImmediate: Boolean, callback: js.Function0[_]): Unit = js.native
    
    def updateTXT(txtObj: js.Any): Unit = js.native
  }
  
  @JSImport("dnssd", "Browser")
  @js.native
  class Browser protected () extends EventEmitter {
    def this(`type`: String, args: js.Any*) = this()
    def this(`type`: js.Array[String], args: js.Any*) = this()
    def this(`type`: ServiceType, args: js.Any*) = this()
    
    def list(): js.Array[_] = js.native
    
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
    
    @JSImport("dnssd", "ServiceType.all")
    @js.native
    def all(): ServiceType = js.native
    
    @JSImport("dnssd", "ServiceType.tcp")
    @js.native
    def tcp(args: String*): ServiceType = js.native
    
    @JSImport("dnssd", "ServiceType.udp")
    @js.native
    def udp(args: String*): ServiceType = js.native
  }
  
  @JSImport("dnssd", "all")
  @js.native
  def all(): ServiceType = js.native
  
  @JSImport("dnssd", "resolve")
  @js.native
  def resolve(name: String, `type`: String, args: js.Object): js.Promise[_] = js.native
  
  @JSImport("dnssd", "resolve4")
  @js.native
  def resolve4(name: String, `type`: String, args: js.Object): js.Promise[String] = js.native
  
  @JSImport("dnssd", "resolve6")
  @js.native
  def resolve6(name: String, `type`: String, args: js.Object): js.Promise[String] = js.native
  
  @JSImport("dnssd", "resolveSRV")
  @js.native
  def resolveSRV(name: String, args: js.Object): js.Promise[_] = js.native
  
  @JSImport("dnssd", "resolveService")
  @js.native
  def resolveService(name: String, args: js.Object): js.Promise[_] = js.native
  
  @JSImport("dnssd", "resolveTXT")
  @js.native
  def resolveTXT(name: String, args: js.Object): js.Promise[_] = js.native
  
  @JSImport("dnssd", "tcp")
  @js.native
  def tcp(args: String*): ServiceType = js.native
  
  @JSImport("dnssd", "udp")
  @js.native
  def udp(args: String*): ServiceType = js.native
}
