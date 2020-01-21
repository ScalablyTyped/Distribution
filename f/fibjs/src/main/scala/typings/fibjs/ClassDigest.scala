package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 信息摘要对象
	* @detail 
	*/
@JSGlobal("Class_Digest")
@js.native
class ClassDigest () extends ClassObject {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前信息摘要算法的摘要字节数
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var size: Double = js.native
  /**
  	 * 
  	 * @brief 计算并返回摘要
  	 * @param codec 指定编码格式，允许值为："buffer", "hex", "base64", "utf8", 或者系统支持的字符集
  	 * @return 返回指定编码的摘要表示
  	 * 
  	 * 
  	 * 
  	 */
  def digest(): js.Any = js.native
  def digest(codec: String): js.Any = js.native
  /**
  	 * 
  	 * @brief 更新二进制摘要信息
  	 * @param data 二进制数据块
  	 * @return 返回信息摘要对象本身
  	 * 
  	 * 
  	 * 
  	 */
  def update(data: ClassBuffer): ClassDigest = js.native
}

