package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 网络访问模块
  * @detail 基础模块。可用于创建和操作网络资源，引用方式：,```JavaScript,var net = require('net');,```
  */
object netMod {
  
  @JSImport("net", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  class Smtp ()
    extends StObject
       with ClassSmtp
  
  @JSImport("net", "Socket")
  @js.native
  class Socket ()
    extends StObject
       with ClassSocket
  
  @JSImport("net", "TcpServer")
  @js.native
  class TcpServer ()
    extends StObject
       with ClassTcpServer
  
  @JSImport("net", "Url")
  @js.native
  class Url ()
    extends StObject
       with ClassUrlObject
  
  @scala.inline
  def backend(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("backend")().asInstanceOf[String]
  
  @scala.inline
  def connect(url: String): ClassStream = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[ClassStream]
  @scala.inline
  def connect(url: String, timeout: Double): ClassStream = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[ClassStream]
  
  @scala.inline
  def info(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("info")().asInstanceOf[js.Object]
  
  @scala.inline
  def ip(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ip")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def ipv6(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ipv6")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def isIP(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")().asInstanceOf[Double]
  @scala.inline
  def isIP(ip: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("isIP")(ip.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def isIPv4(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")().asInstanceOf[Boolean]
  @scala.inline
  def isIPv4(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv4")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIPv6(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")().asInstanceOf[Boolean]
  @scala.inline
  def isIPv6(ip: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIPv6")(ip.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def openSmtp(url: String): ClassSmtp = ^.asInstanceOf[js.Dynamic].applyDynamic("openSmtp")(url.asInstanceOf[js.Any]).asInstanceOf[ClassSmtp]
  @scala.inline
  def openSmtp(url: String, timeout: Double): ClassSmtp = (^.asInstanceOf[js.Dynamic].applyDynamic("openSmtp")(url.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[ClassSmtp]
  
  @scala.inline
  def resolve(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def resolve(name: String, family: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(name.asInstanceOf[js.Any], family.asInstanceOf[js.Any])).asInstanceOf[String]
}
