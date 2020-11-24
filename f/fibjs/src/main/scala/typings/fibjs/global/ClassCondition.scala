package typings.fibjs.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Class_Condition")
@js.native
/**
  * 
  * @brief 条件变量构造函数（条件变量所需的锁由fibjs内部构造）
  * 
  * 
  */
class ClassCondition ()
  extends typings.fibjs.ClassCondition {
  /**
    * 
    * @brief 条件变量构造函数
    * @param lock 使用自行构造的锁
    * 
    * 
    * 
    */
  def this(lock: typings.fibjs.ClassLock) = this()
}
