package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief 消息处理器接口
  * @detail 
  */
@js.native
trait ClassHandler extends ClassObject {
  
  /**
    * 
    * @brief 处理一个消息或对象
    * @param v 指定处理的消息或对象
    * @return 返回下一步的处理器
    * 
    * 
    * @async
    */
  def invoke(v: ClassObject): ClassHandler = js.native
}
