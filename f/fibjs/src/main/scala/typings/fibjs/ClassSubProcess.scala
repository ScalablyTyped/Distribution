package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_SubProcess")
@js.native
class ClassSubProcess () extends ClassBufferedStream {
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 读取当前对象指向的进程的 id
  	 * 
  	 * 
  	 * @readonly
  	 * @type Integer
  	 */
  var pid: Double = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 读取当前对象指向的进程的标准输入对象
  	 * 
  	 * 
  	 * @readonly
  	 * @type BufferedStream
  	 */
  var stdin: ClassBufferedStream = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 读取当前对象指向的进程的标准输出对象
  	 * 
  	 * 
  	 * @readonly
  	 * @type BufferedStream
  	 */
  var stdout: ClassBufferedStream = js.native
  /**
  	 * 
  	 * @brief 查询当前对象所指向的进程是否存在指定名称的窗口，仅限 windows
  	 * @param name 窗口名称
  	 * @return 窗口存在则返回窗口的 rect，否则返回 undefined
  	 * 
  	 * 
  	 * 
  	 */
  def findWindow(name: String): js.Any = js.native
  /**
  	 * 
  	 * @brief 杀掉当前对象指向的进程，并传递信号
  	 * @param signal 传递的信号
  	 * 
  	 * 
  	 * 
  	 */
  def kill(signal: Double): Unit = js.native
}

