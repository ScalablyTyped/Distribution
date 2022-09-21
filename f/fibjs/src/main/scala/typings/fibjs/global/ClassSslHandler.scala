package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_SslHandler")
@js.native
open class ClassSslHandler protected ()
  extends StObject
     with typings.fibjs.ClassSslHandler {
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
  def this(certs: js.Array[Any], hdlr: typings.fibjs.ClassHandler) = this()
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
  def this(crt: typings.fibjs.ClassX509Cert, key: typings.fibjs.ClassPKey, hdlr: typings.fibjs.ClassHandler) = this()
}
