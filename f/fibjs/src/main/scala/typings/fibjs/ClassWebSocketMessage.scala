package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassWebSocketMessage extends ClassMessage {
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和读取 websocket 压缩状态，缺省为 false
    * 
    * 
    * @type Boolean
    */
  var compress: Boolean = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和读取 websocket 掩码标记，缺省为 true
    * 
    * 
    * @type Boolean
    */
  var masked: Boolean = js.native
  
  /**
    * class prop 
    *
    * 
    * @brief 查询和设置最大包尺寸，以字节为单位，缺省为 67108864(64M)
    * 
    * 
    * @type Integer
    */
  var maxSize: Double = js.native
}
