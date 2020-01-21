package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Service")
@js.native
class ClassService protected () extends ClassEventEmitter {
  /**
  	 * 
  	 * @brief 系统服务管理对象构造函数
  	 * @param name 服务名称
  	 * @param worker 服务运行函数
  	 * @param event 服务事件处理
  	 * 
  	 * 
  	 * 
  	 */
  def this(name: String, worker: js.Function) = this()
  def this(name: String, worker: js.Function, event: js.Object) = this()
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和设置服务名称
  	 * 
  	 * 
  	 * @type String
  	 */
  var name: String = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定服务恢复事件，相当于 on("continue", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var oncontinue: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定服务暂停事件，相当于 on("pause", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onpause: js.Function = js.native
  /**
  	 * class prop 
  	 *
  	 * 
  	 * @brief 查询和绑定服务停止事件，相当于 on("stop", func);
  	 * 
  	 * 
  	 * @type Function
  	 */
  var onstop: js.Function = js.native
  /**
  	 * 
  	 * @brief 开始运行服务实体
  	 * 
  	 * @async
  	 */
  def run(): Unit = js.native
}

/* static members */
@JSGlobal("Class_Service")
@js.native
object ClassService extends js.Object {
  /**
  	 * 
  	 * @brief 安装服务到系统
  	 * @param name 服务名称
  	 * @param cmd 服务命令行
  	 * @param displayName 服务显示名称
  	 * @param description 服务描述信息
  	 * 
  	 * 
  	 * 
  	 */
  def install(name: String, cmd: String): Unit = js.native
  def install(name: String, cmd: String, displayName: String): Unit = js.native
  def install(name: String, cmd: String, displayName: String, description: String): Unit = js.native
  /**
  	 * 
  	 * @brief 检测服务是否安装
  	 * @param name 服务名称
  	 * @return 服务安装返回 True
  	 * 
  	 * 
  	 * 
  	 */
  def isInstalled(name: String): Boolean = js.native
  /**
  	 * 
  	 * @brief 检测服务是否运行
  	 * @param name 服务名称
  	 * @return 服务运行返回 True
  	 * 
  	 * 
  	 * 
  	 */
  def isRunning(name: String): Boolean = js.native
  /**
  	 * 
  	 * @brief 从系统中卸载服务
  	 * @param name 服务名称
  	 * 
  	 * 
  	 * 
  	 */
  def remove(name: String): Unit = js.native
  /**
  	 * 
  	 * @brief 重启服务
  	 * @param name 服务名称
  	 * 
  	 * 
  	 * 
  	 */
  def restart(name: String): Unit = js.native
  /**
  	 * 
  	 * @brief 启动服务
  	 * @param name 服务名称
  	 * 
  	 * 
  	 * 
  	 */
  def start(name: String): Unit = js.native
  /**
  	 * 
  	 * @brief 停止服务
  	 * @param name 服务名称
  	 * 
  	 * 
  	 * 
  	 */
  def stop(name: String): Unit = js.native
}

