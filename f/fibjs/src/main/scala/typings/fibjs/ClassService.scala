package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassService extends ClassEventEmitter {
  
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
