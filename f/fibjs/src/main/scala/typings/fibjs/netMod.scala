package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 网络访问模块
  * @detail 基础模块。可用于创建和操作网络资源，引用方式：,```JavaScript,var net = require('net');,```
  */
object netMod {
  
  @JSImport("net", "AF_INET")
  @js.native
  val AF_INET: /* 2 */ Double = js.native
  
  @JSImport("net", "AF_INET6")
  @js.native
  val AF_INET6: /* 10 */ Double = js.native
  
  @JSImport("net", "SOCK_DGRAM")
  @js.native
  val SOCK_DGRAM: /* 2 */ Double = js.native
  
  @JSImport("net", "SOCK_STREAM")
  @js.native
  val SOCK_STREAM: /* 1 */ Double = js.native
  
  @JSImport("net", "Smtp")
  @js.native
  class Smtp () extends ClassSmtp
  
  @JSImport("net", "Socket")
  @js.native
  class Socket () extends ClassSocket
  
  @JSImport("net", "TcpServer")
  @js.native
  class TcpServer () extends ClassTcpServer
  
  @JSImport("net", "Url")
  @js.native
  class Url () extends ClassUrlObject
  
  @JSImport("net", "backend")
  @js.native
  def backend(): String = js.native
  
  @JSImport("net", "connect")
  @js.native
  def connect(url: String): ClassStream = js.native
  @JSImport("net", "connect")
  @js.native
  def connect(url: String, timeout: Double): ClassStream = js.native
  
  @JSImport("net", "info")
  @js.native
  def info(): js.Object = js.native
  
  @JSImport("net", "ip")
  @js.native
  def ip(name: String): String = js.native
  
  @JSImport("net", "ipv6")
  @js.native
  def ipv6(name: String): String = js.native
  
  @JSImport("net", "isIP")
  @js.native
  def isIP(): Double = js.native
  @JSImport("net", "isIP")
  @js.native
  def isIP(ip: String): Double = js.native
  
  @JSImport("net", "isIPv4")
  @js.native
  def isIPv4(): Boolean = js.native
  @JSImport("net", "isIPv4")
  @js.native
  def isIPv4(ip: String): Boolean = js.native
  
  @JSImport("net", "isIPv6")
  @js.native
  def isIPv6(): Boolean = js.native
  @JSImport("net", "isIPv6")
  @js.native
  def isIPv6(ip: String): Boolean = js.native
  
  @JSImport("net", "openSmtp")
  @js.native
  def openSmtp(url: String): ClassSmtp = js.native
  @JSImport("net", "openSmtp")
  @js.native
  def openSmtp(url: String, timeout: Double): ClassSmtp = js.native
  
  @JSImport("net", "resolve")
  @js.native
  def resolve(name: String): String = js.native
  @JSImport("net", "resolve")
  @js.native
  def resolve(name: String, family: Double): String = js.native
}
