package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
  * @brief 对称加密算法对象
  * @detail Cipher 对象属于 crypto 模块，创建：,```JavaScript,var c = new crypto.Cipher(crypto.AES, crypto.ECB, ...);,```
  */
@js.native
trait ClassCipher extends ClassObject {
  /**
    * class prop 
    *
    * 
    * @brief 返回当前算法数据块长度，以字节为单位
    * 
    * @readonly
    * @type Integer
    */
  var blockSize: Double = js.native
  /**
    * class prop 
    *
    * 
    * @brief 返回当前算法初始向量长度，以字节为单位
    * 
    * @readonly
    * @type Integer
    */
  var ivSize: Double = js.native
  /**
    * class prop 
    *
    * 
    * @brief 返回当前算法密码长度，以位为单位
    * 
    * @readonly
    * @type Integer
    */
  var keySize: Double = js.native
  /**
    * class prop 
    *
    * 
    * @brief 返回当前算法名称
    * 
    * @readonly
    * @type String
    */
  var name: String = js.native
  /**
    * 
    * @brief 使用当前算法密码解密数据
    * @param data 指定要解密的数据
    * @return 返回解密后的数据
    * 
    * 
    * @async
    */
  def decrypt(data: ClassBuffer): ClassBuffer = js.native
  /**
    * 
    * @brief 使用当前算法密码加密数据
    * @param data 指定要加密的数据
    * @return 返回加密后的数据
    * 
    * 
    * @async
    */
  def encrypt(data: ClassBuffer): ClassBuffer = js.native
  /**
    * 
    * @brief 使用填充模式
    * @param mode 指定填充模式，缺省为 PADDING_PKCS7
    * 
    * 
    * 
    */
  def paddingMode(mode: Double): Unit = js.native
}

