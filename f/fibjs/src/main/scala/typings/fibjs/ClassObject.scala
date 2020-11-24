package typings.fibjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassObject extends js.Object {
  
  /**
    * 
    * @brief 返回对象的 JSON 格式表示，一般返回对象定义的可读属性集合
    * @param key 未使用
    * @return 返回包含可 JSON 序列化的值
    * 
    * 
    * 
    */
  def toJSON(): js.Any = js.native
  def toJSON(key: String): js.Any = js.native
}
