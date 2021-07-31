package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_SslSocket")
@js.native
/**
  * 
  * @brief SslSocket 构造函数，创建一个新的 SslSocket 对象
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
  * 
  * 
  * 
  */
class ClassSslSocket ()
  extends StObject
     with typings.fibjs.ClassSslSocket {
  def this(certs: js.Array[js.Any]) = this()
  /**
    * 
    * @brief SslSocket 构造函数，创建一个新的 SslSocket 对象
    * @param crt X509Cert 证书，用于客户端验证服务器
    * @param key PKey 私钥，用于与客户端会话
    * 
    * 
    * 
    */
  def this(crt: typings.fibjs.ClassX509Cert, key: typings.fibjs.ClassPKey) = this()
}
