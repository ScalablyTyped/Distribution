package typings.fibjs.netMod

import typings.fibjs.Class_Smtp
import typings.fibjs.Class_Stream
import typings.fibjs.fibjsNumbers.`10`
import typings.fibjs.fibjsNumbers.`1`
import typings.fibjs.fibjsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("net", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val AF_INET: `2` = js.native
  val AF_INET6: `10` = js.native
  val SOCK_DGRAM: `2` = js.native
  val SOCK_STREAM: `1` = js.native
  def backend(): String = js.native
  def connect(url: String): Class_Stream = js.native
  def connect(url: String, timeout: Double): Class_Stream = js.native
  def info(): js.Object = js.native
  def ip(name: String): String = js.native
  def ipv6(name: String): String = js.native
  def isIP(): Double = js.native
  def isIP(ip: String): Double = js.native
  def isIPv4(): Boolean = js.native
  def isIPv4(ip: String): Boolean = js.native
  def isIPv6(): Boolean = js.native
  def isIPv6(ip: String): Boolean = js.native
  def openSmtp(url: String): Class_Smtp = js.native
  def openSmtp(url: String, timeout: Double): Class_Smtp = js.native
  def resolve(name: String): String = js.native
  def resolve(name: String, family: Double): String = js.native
}

