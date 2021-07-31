package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_SslServer")
@js.native
class ClassSslServer protected ()
  extends StObject
     with typings.fibjs.ClassSslServer {
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
  def this(certs: js.Array[js.Any], port: Double, listener: typings.fibjs.ClassHandler) = this()
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
  def this(certs: js.Array[js.Any], addr: String, port: Double, listener: typings.fibjs.ClassHandler) = this()
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
  def this(
    crt: typings.fibjs.ClassX509Cert,
    key: typings.fibjs.ClassPKey,
    port: Double,
    listener: typings.fibjs.ClassHandler
  ) = this()
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
  def this(
    crt: typings.fibjs.ClassX509Cert,
    key: typings.fibjs.ClassPKey,
    addr: String,
    port: Double,
    listener: typings.fibjs.ClassHandler
  ) = this()
}
