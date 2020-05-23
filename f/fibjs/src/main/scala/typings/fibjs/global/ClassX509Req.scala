package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief x509 证书请求对象
  * @detail X509Req 对象属于 crypto 模块，创建：,```JavaScript,var k = new crypto.X509Req();,```
  */
@JSGlobal("Class_X509Req")
@js.native
/**
  * 
  * @brief X509Req 构造函数
  * 
  * 
  */
class ClassX509Req ()
  extends typings.fibjs.ClassX509Req {
  /**
    * 
    * @brief X509Req 构造函数，根据给定的信息创建一个证书请求
    * 
    * @param subject 证书的主题可分辨名称
    * @param key 证书的公钥
    * @param hash 证书摘要算法，缺省为 hash.SHA1
    * 
    * 
    * 
    */
  def this(subject: String, key: typings.fibjs.ClassPKey) = this()
  def this(subject: String, key: typings.fibjs.ClassPKey, hash: Double) = this()
}

