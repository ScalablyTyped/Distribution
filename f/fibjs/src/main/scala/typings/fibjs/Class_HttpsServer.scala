package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_HttpsServer")
@js.native
class Class_HttpsServer protected () extends Class_HttpServer {
  /**
  	 * 
  	 * @brief HttpsServer 构造函数，在所有本机地址侦听
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
  	 * @param port 指定 http 服务器侦听端口
  	 * @param hdlr http 内置消息处理器，处理函数，链式处理数组，路由对象，详见
  	 * 
  	 * 
  	 * 
  	 */
  def this(certs: js.Array[_], port: Double, hdlr: Class_Handler) = this()
  /**
  	 * 
  	 * @brief HttpsServer 构造函数
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
  	 * @param addr 指定 http 服务器侦听地址，为 "" 则在本机所有地址侦听
  	 * @param port 指定 http 服务器侦听端口
  	 * @param hdlr http 内置消息处理器，处理函数，链式处理数组，路由对象，详见
  	 * 
  	 * 
  	 * 
  	 */
  def this(certs: js.Array[_], addr: String, port: Double, hdlr: Class_Handler) = this()
  /**
  	 * 
  	 * @brief HttpsServer 构造函数，在所有本机地址侦听
  	 * @param crt X509Cert 证书，用于客户端验证服务器
  	 * @param key PKey 私钥，用于与客户端会话
  	 * @param port 指定 http 服务器侦听端口
  	 * @param hdlr http 内置消息处理器，处理函数，链式处理数组，路由对象，详见
  	 * 
  	 * 
  	 * 
  	 */
  def this(crt: Class_X509Cert, key: Class_PKey, port: Double, hdlr: Class_Handler) = this()
  /**
  	 * 
  	 * @brief HttpsServer 构造函数
  	 * @param crt X509Cert 证书，用于客户端验证服务器
  	 * @param key PKey 私钥，用于与客户端会话
  	 * @param addr 指定 http 服务器侦听地址，为 "" 则在本机所有地址侦听
  	 * @param port 指定 http 服务器侦听端口
  	 * @param hdlr http 内置消息处理器，处理函数，链式处理数组，路由对象，详见
  	 * 
  	 * 
  	 * 
  	 */
  def this(crt: Class_X509Cert, key: Class_PKey, addr: String, port: Double, hdlr: Class_Handler) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 客户端证书验证 ca
  	 * 
  	 * @readonly
  	 * @type X509Cert
  	 */
  var ca: Class_X509Cert = js.native
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

