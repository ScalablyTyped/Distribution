package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassWorker extends ClassEventEmitter {
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和绑定接受 postMessage 消息事件，相当于 on("message", func);
    * 
    * 
    * @type Function
    */
  var onmessage: js.Function = js.native
  
  /**
    * 
    * @brief 向 Master 或 Worker 发送消息，
    * @param data 指定发送的消息内容
    * 
    * 
    * 
    */
  def postMessage(data: js.Any): Unit = js.native
}
