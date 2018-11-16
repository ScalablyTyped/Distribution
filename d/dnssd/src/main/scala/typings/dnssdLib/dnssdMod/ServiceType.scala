package typings
package dnssdLib.dnssdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", "ServiceType")
@js.native
class ServiceType protected () extends js.Object {
  def this(args: (java.lang.String | js.Array[java.lang.String])*) = this()
  def this(args: ServiceType) = this()
  var name: java.lang.String = js.native
  var protocol: java.lang.String = js.native
  var subtypes: js.Array[java.lang.String] = js.native
}

@JSImport("dnssd", "ServiceType")
@js.native
object ServiceType extends js.Object {
  def all(): dnssdLib.dnssdMod.ServiceType = js.native
  def tcp(args: java.lang.String*): dnssdLib.dnssdMod.ServiceType = js.native
  def udp(args: java.lang.String*): dnssdLib.dnssdMod.ServiceType = js.native
}

