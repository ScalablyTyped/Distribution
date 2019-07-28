package typings.dnssd.dnssdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def all(): ServiceType = js.native
  def resolve(name: String, `type`: String, args: js.Object): js.Promise[_] = js.native
  def resolve4(name: String, `type`: String, args: js.Object): js.Promise[String] = js.native
  def resolve6(name: String, `type`: String, args: js.Object): js.Promise[String] = js.native
  def resolveSRV(name: String, args: js.Object): js.Promise[_] = js.native
  def resolveService(name: String, args: js.Object): js.Promise[_] = js.native
  def resolveTXT(name: String, args: js.Object): js.Promise[_] = js.native
  def tcp(args: String*): ServiceType = js.native
  def udp(args: String*): ServiceType = js.native
}

