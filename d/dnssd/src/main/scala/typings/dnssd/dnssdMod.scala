package typings.dnssd

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", JSImport.Namespace)
@js.native
object dnssdMod extends js.Object {
  @js.native
  class Advertisement protected () extends EventEmitter {
    def this(`type`: String, port: Double, args: js.Any*) = this()
    def this(`type`: js.Array[String], port: Double, args: js.Any*) = this()
    def this(`type`: ServiceType, port: Double, args: js.Any*) = this()
    def start(): Advertisement = js.native
    def stop(): Unit = js.native
    def stop(forceImmediate: Boolean): Unit = js.native
    def stop(forceImmediate: Boolean, callback: js.Function0[_]): Unit = js.native
    def updateTXT(txtObj: js.Any): Unit = js.native
  }
  
  @js.native
  class Browser protected () extends EventEmitter {
    def this(`type`: String, args: js.Any*) = this()
    def this(`type`: js.Array[String], args: js.Any*) = this()
    def this(`type`: ServiceType, args: js.Any*) = this()
    def list(): js.Array[_] = js.native
    def start(): Browser = js.native
    def stop(): Unit = js.native
  }
  
  @js.native
  class Options () extends js.Object {
    var host: js.UndefOr[String] = js.native
    var interface: js.UndefOr[String] = js.native
    var name: js.UndefOr[String] = js.native
    var subtypes: js.UndefOr[js.Array[String]] = js.native
    var txt: js.UndefOr[js.Any] = js.native
  }
  
  @js.native
  class Service () extends js.Object {
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
  
  @js.native
  class ServiceType protected () extends js.Object {
    def this(args: (String | js.Array[String])*) = this()
    def this(args: ServiceType) = this()
    var name: String = js.native
    var protocol: String = js.native
    var subtypes: js.Array[String] = js.native
  }
  
  def all(): ServiceType = js.native
  def resolve(name: String, `type`: String, args: js.Object): js.Promise[_] = js.native
  def resolve4(name: String, `type`: String, args: js.Object): js.Promise[String] = js.native
  def resolve6(name: String, `type`: String, args: js.Object): js.Promise[String] = js.native
  def resolveSRV(name: String, args: js.Object): js.Promise[_] = js.native
  def resolveService(name: String, args: js.Object): js.Promise[_] = js.native
  def resolveTXT(name: String, args: js.Object): js.Promise[_] = js.native
  def tcp(args: String*): ServiceType = js.native
  def udp(args: String*): ServiceType = js.native
  /* static members */
  @js.native
  object ServiceType extends js.Object {
    def all(): ServiceType = js.native
    def tcp(args: String*): ServiceType = js.native
    def udp(args: String*): ServiceType = js.native
  }
  
}

