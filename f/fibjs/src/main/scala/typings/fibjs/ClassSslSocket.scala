package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSslSocket extends ClassStream {
  
  /**
    * 
    * @brief 在给定的连接上接收一个 ssl 连接，并生成一个新的 SslSocket
    * @param s 给定的底层连接
    * @return 返回新建立的 SslSocket 对象
    * 
    * 
    * @async
    */
  def accept(s: ClassStream): ClassSslSocket = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 证书链，客户端模式 connect 时自动引用 ssl.ca，服务器模式 accept 生成 SslSocket 自动引用当前 SslSocket 的 ca
    * 
    * @readonly
    * @type X509Cert
    */
  var ca: ClassX509Cert = js.native
  
  /**
    * 
    * @brief 在给定的连接上连接 ssl 连接，客户端模式
    * @param s 给定的底层连接
    * @param server_name 指定服务器名称，可缺省
    * @return 连接成功返回 0，证书可选验证时，验证不成功则返回非 0，详细错误见 ssl 模块
    * 
    * 
    * @async
    */
  def connect(s: ClassStream): Double = js.native
  def connect(s: ClassStream, server_name: String): Double = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 连接对方的证书
    * 
    * @readonly
    * @type X509Cert
    */
  var peerCert: ClassX509Cert = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询消息 ssl 建立时的下层流对象
    * 
    * @readonly
    * @type Stream
    */
  var stream: ClassStream = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 设定证书验证模式，缺省为 VERIFY_REQUIRED
    * 
    * 
    * @type Integer
    */
  var verification: Double = js.native
}
