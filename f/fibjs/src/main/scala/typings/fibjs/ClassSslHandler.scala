package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_SslHandler")
@js.native
class ClassSslHandler protected () extends ClassHandler {
  /**
  	 * 
  	 * @brief SslHandler 构造函数，创建一个新的 SslHandler 对象
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
  	 * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(certs: js.Array[_], hdlr: ClassHandler) = this()
  /**
  	 * 
  	 * @brief SslHandler 构造函数，创建一个新的 SslHandler 对象
  	 * @param crt X509Cert 证书，用于客户端验证服务器
  	 * @param key PKey 私钥，用于与客户端会话
  	 * @param hdlr 内置消息处理器，处理函数，链式处理数组，路由对象，详见 mq.Handler
  	 * 
  	 * 
  	 * 
  	 */
  def this(crt: ClassX509Cert, key: ClassPKey, hdlr: ClassHandler) = this()
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
  	 * @brief ssl 协议转换处理器当前事件处理接口对象
  	 * 
  	 * 
  	 * @type Handler
  	 */
  var handler: ClassHandler = js.native
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

