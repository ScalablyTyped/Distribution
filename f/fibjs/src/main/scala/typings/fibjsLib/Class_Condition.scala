package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Class_Condition")
@js.native
/**
	 * 
	 * @brief 条件变量构造函数（条件变量所需的锁由fibjs内部构造）
	 * 
	 * 
	 */
class Class_Condition () extends Class_Lock {
  /**
  	 * 
  	 * @brief 条件变量构造函数
  	 * @param lock 使用自行构造的锁
  	 * 
  	 * 
  	 * 
  	 */
  def this(lock: Class_Lock) = this()
}

