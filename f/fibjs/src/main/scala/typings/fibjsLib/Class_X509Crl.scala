package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief x509 撤销证书对象
	* @detail X509Crl 对象属于 crypto 模块，创建：,```JavaScript,var k = new crypto.X509Crl();,```
	*/
@JSGlobal("Class_X509Crl")
@js.native
/**
	 * 
	 * @brief X509Crl 构造函数
	 * 
	 * 
	 */
class Class_X509Crl () extends Class__object {
  /**
  	 * 
  	 * @brief 清空已经加载的撤销证书
  	 * 
  	 * 
  	 * 
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 导出已经加载的撤销证书
  	 * @return 以数组方式导出撤销证书链
  	 * 
  	 * 
  	 * 
  	 */
  def dump(): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 加载一个 DER 格式的撤销证书，可多次调用
  	 * @param derCrl DER 格式的撤销证书
  	 * 
  	 * 
  	 * 
  	 */
  def load(derCrl: Class_Buffer): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 加载一个 PEM 格式的撤销证书，可多次调用
  	 * @param pemCrl PEM 格式的撤销证书
  	 * 
  	 * 
  	 * 
  	 */
  def load(pemCrl: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 加载一个 PEM/DER 格式的撤销证书，可多次调用
  	 * @param filename 撤销证书文件名
  	 * 
  	 * 
  	 * 
  	 */
  def loadFile(filename: java.lang.String): scala.Unit = js.native
}

