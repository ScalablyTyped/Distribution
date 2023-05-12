package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief x509 证书请求对象
  * @detail X509Req 对象属于 crypto 模块，创建：,```JavaScript,var k = new crypto.X509Req();,```
  */
@js.native
trait ClassX509Req
  extends StObject
     with ClassObject {
  
  /**
    *
    * @brief 返回当前证书请求的 DER 格式编码
    * @return 当前证书请求的 DER 格式编码
    *
    *
    *
    */
  def exportDer(): ClassBuffer = js.native
  
  /**
    *
    * @brief 返回当前证书请求的 PEM 格式编码
    * @return 当前证书请求的 PEM 格式编码
    *
    *
    *
    */
  def exportPem(): String = js.native
  
  /**
    *
    * @brief 加载一个 DER 格式的证书请求
    * @param derReq DER 格式的证书请求
    *
    *
    *
    */
  def load(derReq: ClassBuffer): Unit = js.native
  /**
    *
    * @brief 加载一个 PEM 格式的证书请求
    * @param pemReq PEM 格式的证书请求
    *
    *
    *
    */
  def load(pemReq: String): Unit = js.native
  
  /**
    *
    * @brief 加载一个 PEM/DER 格式的证书请求，可多次调用
    * @param filename 证书请求文件名
    *
    *
    *
    */
  def loadFile(filename: String): Unit = js.native
  
  /**
    * class prop
    *
    *
    * @brief 获取证书的公钥
    *
    * @readonly
    * @type PKey
    */
  var publicKey: ClassPKey = js.native
  
  /**
    *
    * @brief 签名当前证书请求为正式证书
    *
    * opts 接收的字段如下：
    * ```JavaScript
    * {
    * ca: false,      // 证书为 ca，缺省为 false
    * pathlen: -1,    // 证书深度，缺省为 -1
    * notBefore: "",  // 证书生效时间，缺省为当前时间
    * notAfter: "",   // 证书失效时间，缺省为 notBefore 后一年
    * usage: "",      // 证书使用范围，接收：digitalSignature, nonRepudiation, keyEncipherment, dataEncipherment, keyAgreement, keyCertSign, cRLSign
    * type: ""        // 证书 Netscape 证书类型，接收：client, server, email, objsign, reserved, sslCA, emailCA, objCA
    * }
    * ```
    * @param issuer 签名机构的可分辨名称
    * @param key 签名机构的私钥
    * @param opts 其他可选参数
    * @return 返回签名后的正式证书
    *
    *
    * @async
    */
  def sign(issuer: String, key: ClassPKey): ClassX509Cert = js.native
  def sign(issuer: String, key: ClassPKey, opts: js.Object): ClassX509Cert = js.native
  
  /**
    * class prop
    *
    *
    * @brief 获取证书的主题可分辨名称
    *
    * @readonly
    *
    */
  var subject: String = js.native
}
