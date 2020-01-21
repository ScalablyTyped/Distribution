package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_SslServer")
@js.native
class ClassSslServer protected () extends ClassTcpServer {
  /**
  	 * 
  	 * @brief SslServer 构造函数，在所有本机地址侦听
  	 * 
  	 * certs 格式为：
  	 * ```JavaScript
  	 * [
  	 * {
  	 * crt: [X509Cert object],
  	 * key: [PKey object]
  	 * },
  	 * {
  	 * crt: [X509Cert object],
  	 * key: [PKey object]
  	 * }
  	 * ]
  	 * ```
  	 * @param certs 服务器证书列表
  	 * @param port 指定 ssl 服务器侦听端口
  	 * @param listener 指定 ssl 接收到的内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(certs: js.Array[_], port: Double, listener: ClassHandler) = this()
  /**
  	 * 
  	 * @brief SslServer 构造函数
  	 * 
  	 * certs 格式为：
  	 * ```JavaScript
  	 * [
  	 * {
  	 * crt: [X509Cert object],
  	 * key: [PKey object]
  	 * },
  	 * {
  	 * crt: [X509Cert object],
  	 * key: [PKey object]
  	 * }
  	 * ]
  	 * ```
  	 * @param certs 服务器证书列表
  	 * @param addr 指定 ssl 服务器侦听地址，为 "" 则在本机所有地址侦听
  	 * @param port 指定 ssl 服务器侦听端口
  	 * @param listener 指定 ssl 接收到的连接的内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(certs: js.Array[_], addr: String, port: Double, listener: ClassHandler) = this()
  /**
  	 * 
  	 * @brief SslServer 构造函数，在所有本机地址侦听
  	 * @param crt X509Cert 证书，用于客户端验证服务器
  	 * @param key PKey 私钥，用于与客户端会话
  	 * @param port 指定 ssl 服务器侦听端口
  	 * @param listener 指定 ssl 接收到的内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(crt: ClassX509Cert, key: ClassPKey, port: Double, listener: ClassHandler) = this()
  /**
  	 * 
  	 * @brief SslServer 构造函数
  	 * @param crt X509Cert 证书，用于客户端验证服务器
  	 * @param key PKey 私钥，用于与客户端会话
  	 * @param addr 指定 ssl 服务器侦听地址，为 "" 则在本机所有地址侦听
  	 * @param port 指定 ssl 服务器侦听端口
  	 * @param listener 指定 ssl 接收到的连接的内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(crt: ClassX509Cert, key: ClassPKey, addr: String, port: Double, listener: ClassHandler) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 客户端证书验证证书链
  	 * 
  	 * @readonly
  	 * @type X509Cert
  	 */
  var ca: ClassX509Cert = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 设定证书验证模式，缺省为 VERIFY_NONE
  	 * 
  	 * 
  	 * @type Integer
  	 */
  var verification: Double = js.native
}

