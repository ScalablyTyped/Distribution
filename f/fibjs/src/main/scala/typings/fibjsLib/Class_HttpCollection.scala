package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief http 容器对象，用于 http header，cookie，query，form，等数据的存储与组织
	* @detail 
	*/
@JSGlobal("Class_HttpCollection")
@js.native
class Class_HttpCollection () extends Class__object {
  /**
  	 * 
  	 * @brief 添加一个键值数据，添加数据并不修改已存在的键值的数据
  	 * @param map 指定要添加的键值数据字典
  	 * 
  	 * 
  	 * 
  	 */
  def add(map: js.Object): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 添加一个键值数据，添加数据并不修改已存在的键值的数据
  	 * @param name 指定要添加的键值
  	 * @param value 指定要添加的数据
  	 * 
  	 * 
  	 * 
  	 */
  def add(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 查询指定键值的全部值
  	 * @param name 指定要查询的键值
  	 * @return 返回键值所对应全部值的数组，若数据不存在，则返回 null
  	 * 
  	 * 
  	 * 
  	 */
  def all(name: java.lang.String): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 清除容器数据
  	 * 
  	 * 
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 查询指定键值的第一个值
  	 * @param name 指定要查询的键值
  	 * @return 返回键值所对应的值，若不存在，则返回 undefined
  	 * 
  	 * 
  	 * 
  	 */
  def first(name: java.lang.String): js.Any = js.native
  /**
  	 * 
  	 * @brief 检查容器内是否存在指定键值的数据
  	 * @param name 指定要检查的键值
  	 * @return 返回键值是否存在
  	 * 
  	 * 
  	 * 
  	 */
  def has(name: java.lang.String): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 删除指定键值的全部值
  	 * @param name 指定要删除的键值
  	 * 
  	 * 
  	 * 
  	 */
  def remove(name: java.lang.String): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设定一个键值数据，设定数据将修改键值所对应的第一个数值，并清除相同键值的其余数据
  	 * @param map 指定要设定的键值数据字典
  	 * 
  	 * 
  	 * 
  	 */
  def set(map: js.Object): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 设定一个键值数据，设定数据将修改键值所对应的第一个数值，并清除相同键值的其余数据
  	 * @param name 指定要设定的键值
  	 * @param value 指定要设定的数据
  	 * 
  	 * 
  	 * 
  	 */
  def set(name: java.lang.String, value: js.Any): scala.Unit = js.native
}

