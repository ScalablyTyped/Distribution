package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief mongodb 数据库数据游标对象
	* @detail 
	*/
@JSGlobal("Class_MongoCursor")
@js.native
class Class_MongoCursor () extends Class__object {
  /**
  	 * 
  	 * @brief 查询游标的记录总数
  	 * @param applySkipLimit 指定是否查询 skip 和 limit 后的记录数，缺省为 false，查询全部记录数
  	 * @return 返回记录总数
  	 * 
  	 * 
  	 * 
  	 */
  def count(): scala.Double = js.native
  def count(applySkipLimit: scala.Boolean): scala.Double = js.native
  /**
  	 * 
  	 * @brief 遍历全部记录并回调处理函数
  	 * @param func 指定处理函数
  	 * 
  	 * 
  	 * 
  	 */
  def forEach(func: js.Function): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 查询当前游标是否有下一条记录
  	 * @return 有记录则返回 true
  	 * 
  	 * 
  	 * 
  	 */
  def hasNext(): scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 修改 mongodb 服务器缺省索引策略，使用指定的索引进行查询
  	 * @param opts 指定强制使用的索引
  	 * @return 返回游标对象本身便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def hint(opts: js.Object): Class_MongoCursor = js.native
  /**
  	 * 
  	 * @brief 指定返回结果的最大记录数
  	 * @param size 记录数
  	 * @return 返回游标对象本身便于链式调用
  	 * 
  	 * 
  	 * @async
  	 */
  def limit(size: scala.Double): Class_MongoCursor = js.native
  /**
  	 * 
  	 * @brief 遍历处理全部记录，并返回处理结果
  	 * @param func 指定处理函数
  	 * @return 返回处理结果数组
  	 * 
  	 * 
  	 * 
  	 */
  def map(func: js.Function): js.Array[_] = js.native
  /**
  	 * 
  	 * @brief 返回当前游标的下一条记录
  	 * @return 记录对象，无记录则返回 null
  	 * 
  	 * 
  	 * 
  	 */
  def next(): js.Object = js.native
  /**
  	 * 
  	 * @brief 查询游标的记录总数，相当于 count(true)
  	 * @return 返回记录总数
  	 * 
  	 * 
  	 * 
  	 */
  def size(): scala.Double = js.native
  /**
  	 * 
  	 * @brief 指定返回结果时跳过的记录数
  	 * @param num 记录数
  	 * @return 返回游标对象本身便于链式调用
  	 * 
  	 * 
  	 * @async
  	 */
  def skip(num: scala.Double): Class_MongoCursor = js.native
  /**
  	 * 
  	 * @brief 设定返回结果的排序
  	 * @param opts 指定排序条件
  	 * @return 返回游标对象本身便于链式调用
  	 * 
  	 * 
  	 * 
  	 */
  def sort(opts: js.Object): Class_MongoCursor = js.native
  /**
  	 * 
  	 * @brief 返回当前游标全部记录的数组
  	 * @return 返回包含全部数据的 Javascript 数组
  	 * 
  	 * 
  	 * 
  	 */
  def toArray(): js.Array[_] = js.native
}

