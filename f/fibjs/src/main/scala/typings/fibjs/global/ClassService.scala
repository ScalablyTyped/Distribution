package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_Service")
@js.native
class ClassService protected ()
  extends typings.fibjs.ClassService {
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
}
object ClassService {
  
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
  /* static member */
  @JSGlobal("Class_Service.install")
  @js.native
  def install(name: String, cmd: String): Unit = js.native
  @JSGlobal("Class_Service.install")
  @js.native
  def install(name: String, cmd: String, displayName: js.UndefOr[scala.Nothing], description: String): Unit = js.native
  @JSGlobal("Class_Service.install")
  @js.native
  def install(name: String, cmd: String, displayName: String): Unit = js.native
  @JSGlobal("Class_Service.install")
  @js.native
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
  /* static member */
  @JSGlobal("Class_Service.isInstalled")
  @js.native
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
  /* static member */
  @JSGlobal("Class_Service.isRunning")
  @js.native
  def isRunning(name: String): Boolean = js.native
  
  /**
    * 
    * @brief 从系统中卸载服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Service.remove")
  @js.native
  def remove(name: String): Unit = js.native
  
  /**
    * 
    * @brief 重启服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Service.restart")
  @js.native
  def restart(name: String): Unit = js.native
  
  /**
    * 
    * @brief 启动服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Service.start")
  @js.native
  def start(name: String): Unit = js.native
  
  /**
    * 
    * @brief 停止服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  @JSGlobal("Class_Service.stop")
  @js.native
  def stop(name: String): Unit = js.native
}
