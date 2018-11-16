package typings
package fibjsLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", JSImport.Namespace)
@js.native
object netModMembers extends js.Object {
  val AF_INET: /* 2 */ scala.Double = js.native
  val AF_INET6: /* 10 */ scala.Double = js.native
  val SOCK_DGRAM: /* 2 */ scala.Double = js.native
  val SOCK_STREAM: /* 1 */ scala.Double = js.native
  def backend(): java.lang.String = js.native
  def connect(url: java.lang.String): fibjsLib.Class_Stream = js.native
  def connect(url: java.lang.String, timeout: scala.Double): fibjsLib.Class_Stream = js.native
  def info(): js.Object = js.native
  def ip(name: java.lang.String): java.lang.String = js.native
  def ipv6(name: java.lang.String): java.lang.String = js.native
  def isIP(): scala.Double = js.native
  def isIP(ip: java.lang.String): scala.Double = js.native
  def isIPv4(): scala.Boolean = js.native
  def isIPv4(ip: java.lang.String): scala.Boolean = js.native
  def isIPv6(): scala.Boolean = js.native
  def isIPv6(ip: java.lang.String): scala.Boolean = js.native
  def openSmtp(url: java.lang.String): fibjsLib.Class_Smtp = js.native
  def openSmtp(url: java.lang.String, timeout: scala.Double): fibjsLib.Class_Smtp = js.native
  def resolve(name: java.lang.String): java.lang.String = js.native
  def resolve(name: java.lang.String, family: scala.Double): java.lang.String = js.native
}

