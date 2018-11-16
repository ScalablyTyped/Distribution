package typings
package dnssdLib.dnssdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", JSImport.Namespace)
@js.native
object dnssdModMembers extends js.Object {
  def all(): ServiceType = js.native
  def resolve(name: java.lang.String, `type`: java.lang.String, args: js.Object): stdLib.Promise[_] = js.native
  def resolve4(name: java.lang.String, `type`: java.lang.String, args: js.Object): stdLib.Promise[java.lang.String] = js.native
  def resolve6(name: java.lang.String, `type`: java.lang.String, args: js.Object): stdLib.Promise[java.lang.String] = js.native
  def resolveSRV(name: java.lang.String, args: js.Object): stdLib.Promise[_] = js.native
  def resolveService(name: java.lang.String, args: js.Object): stdLib.Promise[_] = js.native
  def resolveTXT(name: java.lang.String, args: js.Object): stdLib.Promise[_] = js.native
  def tcp(args: java.lang.String*): ServiceType = js.native
  def udp(args: java.lang.String*): ServiceType = js.native
}

