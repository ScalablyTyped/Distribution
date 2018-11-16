package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 对称加密算法对象
	* @detail Cipher 对象属于 crypto 模块，创建：,```JavaScript,var c = new crypto.Cipher(crypto.AES, crypto.ECB, ...);,```
	*/

@JSGlobal("Class_Cipher")
@js.native
class Class_Cipher protected () extends Class__object {
  /**
  	 * 
  	 * @brief Cipher 构造函数，仅用于 ARC4 初始化
  	 * @param provider 指定加密算法
  	 * @param key 指定加密解密密码
  	 * 
  	 * 
  	 * 
  	 */
  def this(provider: scala.Double, key: Class_Buffer) = this()
  /**
  	 * 
  	 * @brief Cipher 构造函数
  	 * @param provider 指定加密算法
  	 * @param mode 指定分组密码工作模式
  	 * @param key 指定加密解密密码
  	 * 
  	 * 
  	 * 
  	 */
  def this(provider: scala.Double, mode: scala.Double, key: Class_Buffer) = this()
  /**
  	 * 
  	 * @brief Cipher 构造函数
  	 * @param provider 指定加密算法
  	 * @param mode 指定分组密码工作模式
  	 * @param key 指定加密解密密码
  	 * @param iv 指定初始向量
  	 * 
  	 * 
  	 * 
  	 */
  def this(provider: scala.Double, mode: scala.Double, key: Class_Buffer, iv: Class_Buffer) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 返回当前算法数据块长度，以字节为单位
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var blockSize: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 返回当前算法初始向量长度，以字节为单位
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var ivSize: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 返回当前算法密码长度，以位为单位
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var keySize: scala.Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 返回当前算法名称
  	 * 
  	 * @readonly
  	 * @type String
  	 */
  var name: java.lang.String = js.native
  /**
  	 * 
  	 * @brief 使用当前算法密码解密数据
  	 * @param data 指定要解密的数据
  	 * @return 返回解密后的数据
  	 * 
  	 * 
  	 * @async
  	 */
  def decrypt(data: Class_Buffer): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 使用当前算法密码加密数据
  	 * @param data 指定要加密的数据
  	 * @return 返回加密后的数据
  	 * 
  	 * 
  	 * @async
  	 */
  def encrypt(data: Class_Buffer): Class_Buffer = js.native
  /**
  	 * 
  	 * @brief 使用填充模式
  	 * @param mode 指定填充模式，缺省为 PADDING_PKCS7
  	 * 
  	 * 
  	 * 
  	 */
  def paddingMode(mode: scala.Double): scala.Unit = js.native
}

