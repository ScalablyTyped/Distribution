package typings.fibjs.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_Service")
@js.native
open class ClassService protected ()
  extends StObject
     with typings.fibjs.ClassService {
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
  
  @JSGlobal("Class_Service")
  @js.native
  val ^ : js.Any = js.native
  
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
  inline def install(name: String, cmd: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(name.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def install(name: String, cmd: String, displayName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(name.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def install(name: String, cmd: String, displayName: String, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(name.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def install(name: String, cmd: String, displayName: Unit, description: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(name.asInstanceOf[js.Any], cmd.asInstanceOf[js.Any], displayName.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  inline def isInstalled(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstalled")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
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
  inline def isRunning(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRunning")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * 
    * @brief 从系统中卸载服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  inline def remove(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * 
    * @brief 重启服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  inline def restart(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restart")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * 
    * @brief 启动服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  inline def start(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * 
    * @brief 停止服务
    * @param name 服务名称
    * 
    * 
    * 
    */
  /* static member */
  inline def stop(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
