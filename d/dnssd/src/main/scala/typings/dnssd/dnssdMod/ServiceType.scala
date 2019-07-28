package typings.dnssd.dnssdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnssd", "ServiceType")
@js.native
class ServiceType protected () extends js.Object {
  def this(args: (String | js.Array[String])*) = this()
  def this(args: ServiceType) = this()
  var name: String = js.native
  var protocol: String = js.native
  var subtypes: js.Array[String] = js.native
}

/* static members */
@JSImport("dnssd", "ServiceType")
@js.native
object ServiceType extends js.Object {
  def all(): ServiceType = js.native
  def tcp(args: String*): ServiceType = js.native
  def udp(args: String*): ServiceType = js.native
}

