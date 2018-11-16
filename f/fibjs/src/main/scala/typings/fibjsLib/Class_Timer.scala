package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** module Or Internal Object */
/**
	* @brief 定时器处理器对象
	* @detail 
	*/

@JSGlobal("Class_Timer")
@js.native
class Class_Timer () extends Class__object {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询当前定时器是否已经终止
  	 * 
  	 * @readonly
  	 * @type Boolean
  	 */
  var stopped: scala.Boolean = js.native
  /**
  	 * 
  	 * @brief 取消当前定时器
  	 * 
  	 * 
  	 */
  def clear(): scala.Unit = js.native
  /**
  	 * 
  	 * @brief 维持 fibjs 进程不退出，在定时器等待期间阻止 fibjs 进程退出
  	 * @return 返回定时器对象
  	 * 
  	 * 
  	 * 
  	 */
  def ref(): Class_Timer = js.native
  /**
  	 * 
  	 * @brief 允许 fibjs 进程退出，在定时器等待期间允许 fibjs 进程退出
  	 * @return 返回定时器对象
  	 * 
  	 * 
  	 * 
  	 */
  def unref(): Class_Timer = js.native
}

